import java.util.HashMap;
class Solution2 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> dic = new HashMap<>();
        dic.put('I', 1);
        dic.put('V', 5);
        dic.put('X', 10);
        dic.put('L', 50);
        dic.put('C', 100);
        dic.put('D', 500);
        dic.put('M', 1000);

        int result = 0;
        int max = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            int current = dic.get(s.charAt(i));
            if(current >= max){
                max = current;
                result += current;
            } else {
                result -= current;
            }
        }

        return result;
    }
}