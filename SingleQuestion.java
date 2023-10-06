import java.util.List;

//single-choice question for simulation
public class SingleQuestion {
    private String questionText;
    private List<String> studentAnswer;

    public SingleQuestion(String questionText, List<String> studentAnswer) {
        this.questionText = questionText;
        this.studentAnswer = studentAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getStudentAnswer() {
        return studentAnswer;
    }
}