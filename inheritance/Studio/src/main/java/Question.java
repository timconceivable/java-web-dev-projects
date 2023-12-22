import java.util.List;

public abstract class Question {
    private final String questionText;
    private final List<String> possibleAnswers;
    private final String correctAnswer;
    private final int points;

    public Question(String questionText, List<String> possibleAnswers, String correctAnswer) {
        this.questionText = questionText;
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
        this.points = 1;
    }

    public void printQuestion() {
        System.out.println("\n"+ this.questionText);
        for (int i = 0; i < this.possibleAnswers.size(); i++) {
            System.out.println(i +") "+ this.possibleAnswers.get(i));
        }
        System.out.println("points: " + this.points);
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public int getPoints() { return points; }
}