/*
 *  James Contreras
 *  CS 3560
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//simulates number of students and their answers
public class SimulationDriver {

    public static void main(String[] args) {

        String questionType = getRandomQuestionType();

        //Checks answer type
        List<String> studentAnswers;
        if (questionType.equalsIgnoreCase("multiple-choice")) {
            studentAnswers = Arrays.asList("A", "B", "C", "D");
        } else {
            studentAnswers = Arrays.asList("Right", "Wrong");
        }

        //Generates students and answers
        VotingService votingService = new VotingService(questionType, studentAnswers);
        int numStudents = generateRandomNumberOfStudents();
        List<String> studentIDs = generateStudentIDs(numStudents);
        List<String> studentChoice = generateRandomAnswers(studentAnswers, numStudents);

        //send answers to voter
        for (int i = 0; i < numStudents; i++) {
            votingService.enterAnswer(studentIDs.get(i), studentChoice.get(i));
        }

        System.out.println("NUMBER OF STUDENTS: " + numStudents);
        votingService.printResults();
        System.out.println("INDIVIDUAL STUDENT ANSWERS: ");

        //Displays student answer choice
        for (int i = 0; i < numStudents; i++) {
            System.out.println(studentIDs.get(i) + " answered "  + studentChoice.get(i));
        }
        
    }

    private static int generateRandomNumberOfStudents() {
        Random random = new Random();
        return random.nextInt(25) + 1;
    }

    //Student IDS are generated in 6 digit numbers
    private static List<String> generateStudentIDs(int numStudents) {
        List<String> studentIDs = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= numStudents; i++) {
            int randomID = 100000 + random.nextInt(900000);
            studentIDs.add("ID: " + String.valueOf(randomID));
        }
        return studentIDs;
    }

    private static String getRandomQuestionType() {
        Random random = new Random();
        return random.nextBoolean() ? "multiple-choice" : "single-choice";
    }

    private static List<String> generateRandomAnswers(List<String> studentAnswers, int numStudents) {
        List<String> studentChoice = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numStudents; i++) {
            int randomIndex = random.nextInt(studentAnswers.size());
            studentChoice.add(studentAnswers.get(randomIndex));
        }

        return studentChoice;
    }
}