package task2.logic;

/**
 * Created by Administrator on 2/9/2017.
 */
public class ArrayToString {
    public static String castArrayToString(String[] s) {
        String result = "";
        for (int i = 0; i < s.length; i++) {
            result += s[i] + " ";
        }
//        System.out.println(result.subSequence(0,(result.length()-1)).toString());
        return result.subSequence(0,(result.length()-1)).toString();
    }
}
