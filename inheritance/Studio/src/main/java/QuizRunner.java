import java.util.ArrayList;
import java.util.Scanner;

public class QuizRunner {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // RUN QUIZ
        ArrayList<Question> questions = new ArrayList<>();
        Quiz theQuiz = new Quiz("Pop Quiz!",questions);
        theQuiz.printQuiz();
    }
}
