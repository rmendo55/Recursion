import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsPhoneNumber {
    public static void main(String[] args) {
        System.out.println(letterCombinations("2345"));
    }
    public static List<String> letterCombinations(String digits) {
        HashMap<Integer, String> map = getMap();
        List<String> list = new ArrayList<String>();
        return computeCombinations(digits, map, list, 0, "");
    }

    public static List<String> computeCombinations(String digits, HashMap<Integer, String> map, List<String> list, int index, String s) {
        if (digits.length() == 0) {
            return list;
        }
        else if (digits.length() == 1) {
            String value = map.get(Integer.parseInt(digits.charAt(0) + ""));
            if (value.length() == 3) {
                list.add(s + value.charAt(0));
                list.add(s + value.charAt(1));
                list.add(s + value.charAt(2));
            }
            else {
                list.add(s + value.charAt(0));
                list.add(s + value.charAt(1));
                list.add(s + value.charAt(2));
                list.add(s + value.charAt(3));
            }
        }
        else if (index == 0) {
            String value = map.get(Integer.parseInt(digits.charAt(0) + ""));
            for (int i = 0; i < value.length(); i++) {
                computeCombinations(digits, map, list, index = index + 1, s + value.charAt(i));
                index = 0;
            }
        }
        else if (index <  digits.length() - 1) {
            String value2 = map.get(Integer.parseInt(digits.charAt(index) + ""));
            for (int i = 0; i < value2.length(); i++) {
                computeCombinations(digits, map, list, index = index + 1, s + value2.charAt(i));
                index = index - 1;
            }
        }
        else if (index == digits.length() - 1){
            String value3 = map.get(Integer.parseInt(digits.charAt(index)+ ""));
            if (value3.length() == 3) {
                list.add(s + value3.charAt(0));
                list.add(s + value3.charAt(1));
                list.add(s + value3.charAt(2));
                return list;
            }
            else {
                list.add(s + value3.charAt(0));
                list.add(s + value3.charAt(1));
                list.add(s + value3.charAt(2));
                list.add(s + value3.charAt(3));
                return list;
            }
        }
        return list;
    }
    public static HashMap<Integer, String> getMap() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(2, "abc");
        map.put(3,"def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        return map;
    }
}
