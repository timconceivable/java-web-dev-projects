import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuizRunner {
    public static void main(String[] args) {
        // CREATE & RUN QUIZ
        List<Question> questions = new ArrayList<>();

        questions.add(new TrueFalse("Is Earth flat?", false));
        questions.add(new Choice("What is your favorite color?", Arrays.asList("yellow", "blue", "purple"), "purple"));
        questions.add(new Checkbox("Which colors are not red?", Arrays.asList("yellow", "blue", "purple"), Arrays.asList("yellow", "blue", "purple") ));

        Quiz theQuiz = new Quiz("Pop Quiz!",questions);

        theQuiz.printQuiz();
        // theQuiz.runQuiz();
    }
}
