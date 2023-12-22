import java.util.ArrayList;

public abstract class Question {
    private String questionText;
    private ArrayList<String> possibleAnswers;
    private String correctAnswer;

    public Question(String questionText, ArrayList<String> possibleAnswers, String correctAnswer) {
        this.questionText = questionText;
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }

    public void printQuestion() {
        System.out.println(this.questionText);
        for (int i = 0; i < this.possibleAnswers.size(); i++) {
            System.out.println(i +") "+ this.possibleAnswers.get(i));
        }
    }

    public String getQuestionText() {
        return questionText;
    }

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}