

public class Student{
    private String stNumber;
    private int partMark;
    private int examMark;
    private static int studentObjCount = 0;
    public Student(){
        studentObjCount++;
    }
    
    public Student(String stNumber, int part_mark, int examMark){
        this.stNumber = stNumber;
        this.partMark = part_mark;
        this.examMark = examMark;
        studentObjCount++;
    }
    
    public String getStNumber(){
        return stNumber;
    }
    
    public int getPartMark(){
        return partMark;
    }
    
    public int getExamMark(){
        return examMark;
    }
    
    public static int getStudentObjCount(){
        return studentObjCount;
    }
    
    public double calcFinalMark(){
        double average = (partMark + examMark)/ 2.0;
        return average;
    }
    
    @Override
    public String toString(){
        String str = String.format("%-20s%-10d%-10d",stNumber, partMark, examMark);
        return str;
    }
}
