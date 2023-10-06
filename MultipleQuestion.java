import java.util.List;

//multi-choice question for simulation
public class MultipleQuestion {
    private String questionText;
    private List<String> studentAnswers;

    public MultipleQuestion(String questionText, List<String> studentAnswers) {
        this.questionText = questionText;
        this.studentAnswers = studentAnswers;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getStudentAnswers() {
        return studentAnswers;
    }
}