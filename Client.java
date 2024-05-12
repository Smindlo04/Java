import java.util.*;

public class Client
{
   private String name;
    private String emailAddr;
    private String password;

    public Client(String name, String emailAddr) {
        this.name = name;
        this.emailAddr = emailAddr;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword() {
        String reversedName = new StringBuilder(name.toLowerCase()).reverse().toString();
        Random random = new Random();
        int randomNumber = random.nextInt(90) + 10; 
        String constructedPassword = reversedName + "_" + randomNumber;

        if (constructedPassword.length() < 10) {
            int remainingLength = 10 - constructedPassword.length();
            String emailSubstring = emailAddr.substring(0, remainingLength);
            constructedPassword += emailSubstring;
        }

        this.password = constructedPassword;
    }

    @Override
    public String toString() {
        return name + "   " + emailAddr + "   " + password;
    }
}
