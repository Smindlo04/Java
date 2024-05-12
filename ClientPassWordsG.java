import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.ArrayList;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class ClientPassWordsG extends Application
{
    Button addClientsButton = new Button("Add Clients");
    Label nameLabel = new Label("Enter name: ");
    TextField nameTextField = new TextField();
    Label emailLabel = new Label("Enter email address: ");
    TextField emailTextField = new TextField();
    Button savePasswordButton = new Button("Save Password");
    TextArea clientInfoTextArea = new TextArea();
    Label lookupLabel = new Label("Enter name to find: ");
    TextField lookupNameTextField = new TextField();
    Button lookupPasswordButton = new Button("Lookup Password");
    Button exitButton = new Button("Exit");
        
    int counter = 0;

    private ArrayList<Client> clients = new ArrayList<>();
    
     public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage)
    {
        clientInfoTextArea.setEditable(false);
        clientInfoTextArea.setText("List Of Clients\n");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameTextField, 1, 0);
        gridPane.add(emailLabel, 0, 1);
        gridPane.add(emailTextField, 1, 1);
        gridPane.add(addClientsButton, 0, 2);
        gridPane.add(savePasswordButton, 1, 2);
        gridPane.add(clientInfoTextArea, 0, 3, 2, 1);
        gridPane.add(lookupLabel, 0, 4);
        gridPane.add(lookupNameTextField, 1, 4);
        gridPane.add(lookupPasswordButton, 0, 5);
        gridPane.add(exitButton, 1, 5);

        addClientsButton.setOnAction(this::addClientsButtonClick);
        savePasswordButton.setOnAction(this::savePasswordButtonClick);
        lookupPasswordButton.setOnAction(this::lookupPasswordButtonClick);
        exitButton.setOnAction(event -> exitApplication());

        Scene scene = new Scene(gridPane, 500, 400);
        primaryStage.setTitle("Client Passwords GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addClientsButtonClick(ActionEvent event) {
        String name = nameTextField.getText();
        String email = emailTextField.getText();
        

        if (!name.isEmpty() && !email.isEmpty()) {
            counter++;
            Client client = new Client(name, email);
            client.setPassword();
            clients.add(client);
            
            clientInfoTextArea.appendText(counter + ". " + client.toString() + "\n");
            
            nameTextField.clear();
            emailTextField.clear();
            nameTextField.requestFocus();
        }
    }

    private void savePasswordButtonClick(ActionEvent event) {
         try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("passwords.ser"))) {
            for(int i=0;i<clients.size();i++){
                outputStream.writeObject(clients.get(i).getName()+" "+clients.get(i).getPassword());
            }
            clientInfoTextArea.setText(" ");
            clientInfoTextArea.appendText("Data has been written to the file.\n");
            
        } catch (IOException e) {
            clientInfoTextArea.appendText("Error occurred while writing data to the file.\n");
            e.printStackTrace();
        }
    }

       private void lookupPasswordButtonClick(ActionEvent event) {
        boolean found = false;
        for (Client client : clients) {
            if (client.getName().equals(lookupNameTextField.getText())) {
                    found = true;
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Password Lookup");
                    alert.setHeaderText("Client: " + client.getName());
                    alert.setContentText("Password: " + client.getPassword());
                    alert.showAndWait();
                    break;
            }
        }

        if (!found) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Password Lookup");
            alert.setHeaderText(null);
            alert.setContentText("Client not found!");
            alert.showAndWait();
            }
        }
        
        private void exitApplication() {
        System.exit(0);
    }
}

