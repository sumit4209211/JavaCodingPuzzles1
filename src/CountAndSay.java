/*The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

        countAndSay(1) = "1"
        countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
        To determine how you "say" a digit string, split it into the minimal number of groups so that each group is a contiguous section all of the same character. Then for each group, say the number of characters, then say the character. To convert the saying into a digit string, replace the counts with a number and concatenate every saying.

        For example, the saying and conversion for digit string "3322251":


        Given a positive integer n, return the nth term of the count-and-say sequence.*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CountAndSay {
    public String countAndSay(int n) {
        String currSeq = "1";

        // Pattern to match the repetitive digits
        String regexPattern = "(.)\\1*";
        Pattern pattern = Pattern.compile(regexPattern);

        for (int i = 1; i < n; ++i) {
            Matcher m = pattern.matcher(currSeq);
            StringBuffer nextSeq = new StringBuffer();

            // each group contains identical and adjacent digits
            while (m.find()) {
                nextSeq.append(m.group().length() + String.valueOf(m.group().charAt(0)));
            }
            // prepare for the next iteration
            currSeq = nextSeq.toString();
        }

        return currSeq;
    }
}

