import java.util.Arrays;

public class TrueFalse extends Question {
    public TrueFalse(String questionText, boolean correctAnswer) {
        super(questionText, Arrays.asList("true", "false"), Boolean.toString(correctAnswer));
    }

}
