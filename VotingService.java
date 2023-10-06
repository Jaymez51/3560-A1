import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VotingService {
    private String questionType;
    private List<String> answerList;
    private Map<String, String> studentAnswers;

    //VotingService object initializaiton 
    public VotingService(String questionType, List<String> answerList) {
        this.questionType = questionType;
        this.answerList = answerList;
        this.studentAnswers = new HashMap<>();
    }

    public void enterAnswer(String studentID, String answer) {
        studentAnswers.put(studentID, answer);
    }

    //Displays student voting results
    public void printResults() {
        System.out.println("QUESTION TYPE: " + questionType + "\nSTUDENT ANSWER CHOICE DATA:");

        Map<String, Integer> answerCounts = new HashMap<>();
        for (String answer : studentAnswers.values()) {
            if (answerList.contains(answer)) {
                answerCounts.put(answer, answerCounts.getOrDefault(answer, 0) + 1);
            }
        }
        
        //Displays sum of student answer choice
        for (String answer : answerList) {
            int count = answerCounts.getOrDefault(answer, 0);
            System.out.println(answer + ": " + count);
        }
    }
}