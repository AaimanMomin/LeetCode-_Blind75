import java.util.HashMap;
import java.util.Map;

public class LongestSubStringLength {

    public static void main(String args[]){
        String s = "abcabcbb";
        System.out.println(longestSubstringLen(s));
    }

    public static int longestSubstringLen(String s){
        int maxlen = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            if(map.containsKey(c) && map.get(c) >= left){
                left = map.get(c) + 1;
            }
            maxlen = Math.max(maxlen, right-left +1);
            map.put(c, right);
        }
        return maxlen;
    }
}
