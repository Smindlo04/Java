import java.util.*;

public class testStudent{
    public static void main(String[] args){
    System.out.print("\f");
    Student [] arrStudents = new Student[10];
    arrStudents = fillArray(arrStudents);
    int numStudents = Student.getStudentObjCount();
    displayArr(arrStudents, numStudents);
    int best = findBestStudent(arrStudents, numStudents);
    System.out.println("The best mark is " + arrStudents[best].calcFinalMark() + " with number " +
    arrStudents[best].getStNumber());
    }

    public static Student [] fillArray(Student [] arrStudents){
    Scanner inputText = new Scanner(System.in);
    Scanner inputNum = new Scanner(System.in);
    System.out.println("Enter a student number (X to quit input)" );
    String stNumber = inputText.nextLine();
    int count = 0;
    while (!(stNumber.equalsIgnoreCase("X"))){
        System.out.print("Enter participation mark: " );
        int pmark = inputNum.nextInt();
        System.out.print("Enter exam mark: " );
        int emark = inputNum.nextInt();
        arrStudents[count] = new Student(stNumber, pmark, emark);
        count++;
        System.out.println("Enter a student number (X to quit input)" );
        stNumber = inputText.nextLine();
    }
    
    return arrStudents;
    }

    public static void displayArr(Student [] arrStudents, int numStudents){
        System.out.println("List of students");
        System.out.printf("%-20s%-10s%-10s%s\n","Student number", "Part mark","Exam mark","Final mark");
        
        for (int k = 0; k < numStudents; k++){
            System.out.println(arrStudents[k].toString() + arrStudents[k].calcFinalMark());
        }
    }
    
    public static int findBestStudent(Student [] arrStudents, int numStudents){
        int bestStudent = 0;
        double bestMark = 0;
        for (int k = 0; k < numStudents; k++){
            double mark = arrStudents[k].calcFinalMark();
            if(mark > bestMark){
                bestMark = mark;
                bestStudent = k;
            }
        } 
        
        return bestStudent;
    }
}
