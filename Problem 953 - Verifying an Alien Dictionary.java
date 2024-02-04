import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        List<Character> orderList = new ArrayList<>();
        for (int i = 0; i < order.length(); i++) {
            orderList.add(order.charAt(i)); // adds the characters in "order" string to orderList
        }

        for (int i = 0; i < words.length - 1; i++) { // iterating through each word
            for (int j = 0; j < words[i].length(); j++) { // iterating through each letter in a word
                if (j >= words[i + 1].length()) { // if the second word is shorter than first (to handle prefix comparison)
                    return false;
                }
                int previous = orderList.indexOf(words[i].charAt(j)); // ex: word 1, letter 1
                int next = orderList.indexOf(words[i+1].charAt(j)); // ex: word 2, letter 1
                if(next < previous){
                    return false;
                }
                else if (next > previous){
                    break;
                }
            }
        }

        return true;
    }
}