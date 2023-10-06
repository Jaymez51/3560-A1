import java.util.List;

//Question class and checker for single and multi-choice questions
public class Question {
    
    private String questionType;
    private String questionText;
    private List<String> studentAnswers;

    //Question object initializaiton 
    public Question(String questionType, String questionText, List<String> studentAnswers) {
        this.questionType = questionType;
        this.questionText = questionText;
        this.studentAnswers = studentAnswers;
    }

    public String getQuestionType() {
        return questionType;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getStudentAnswers() {
        return studentAnswers;
    }

    //Question type checker
    public boolean isMultipleChoice() {
        return questionType.equalsIgnoreCase("multiple-choice");
    }

    public boolean isSingleChoice() {
        return questionType.equalsIgnoreCase("single-choice");
    }
}