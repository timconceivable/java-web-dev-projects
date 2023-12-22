import java.util.List;

public class Checkbox extends Question{
    public Checkbox(String questionText, List<String> possibleAnswers, List<String> correctAnswers) {
        super(questionText, possibleAnswers, correctAnswers.toString());
    }
// how to make points = correctAnswers.size() ?

}
