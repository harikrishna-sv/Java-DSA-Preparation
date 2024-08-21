import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> findWordsContainingChar(String[] words, char ch) {
        List<String> result = new ArrayList<>();
        char lowerCh = Character.toLowerCase(ch);
        char upperCh = Character.toUpperCase(ch);

        for (String word : words) {
            if (word.indexOf(lowerCh) >= 0 || word.indexOf(upperCh) >= 0) {
                result.add(word);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        char ch = 'a';
        List<String> result = solution.findWordsContainingChar(words, ch);
        for (String word : result) {
            System.out.println(word);
        }
    }
}
