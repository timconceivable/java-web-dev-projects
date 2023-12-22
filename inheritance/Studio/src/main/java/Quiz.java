import java.util.ArrayList;

public class Quiz {
    private String title;
    private ArrayList<Question> questionList;

    public Quiz(String title, ArrayList<Question> questionList) {
        this.title = title;
        this.questionList = questionList;
    }

    // ADD QUESTIONS
    public void addQuestion() {

    }
    // PRINT QUIZ
    public void printQuiz() {
        System.out.println(this.title);
        for (Question question : questionList) {
            question.printQuestion();
        }
    }

    // RUN QUIZ
    public void runQuiz() {

    }

    // GRADE QUIZ
    public void gradeQuiz() {

    }

}
