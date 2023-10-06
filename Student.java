//"student" for simulation and their answer

public class Student {
    
    private String studentID;
    private String studentAnswer;

    public Student(String studentID, String studentAnswer) {
        this.studentID = studentID;
        this.studentAnswer = studentAnswer;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentAnswer() {
        return studentAnswer;
    }
}