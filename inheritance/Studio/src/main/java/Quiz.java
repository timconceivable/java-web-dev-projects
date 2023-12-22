import java.util.List;
import java.util.Scanner;

public class Quiz {
    private final String title;
    private final List<Question> questionList;

    public Quiz(String title, List<Question> questionList) {
        this.title = title;
        this.questionList = questionList;
    }

    // ADD QUESTIONS
    public void addQuestion() {
    // why though?
    }

    // PRINT QUIZ
    public void printQuiz() {
        System.out.println(this.title);
        for (Question question : questionList) {
            question.printQuestion();
        }
    }

    // GRADE QUIZ
    public void gradeQuiz() {
    // compare user input to correct answers, return point value
    }

    static Scanner input = new Scanner(System.in);
    // RUN QUIZ
    public void runQuiz() {
    // print questions, get user input, grade questions
    }

}
