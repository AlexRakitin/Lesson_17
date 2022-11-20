import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson_17_Service {
    public static boolean isValid(String inputIP) {

        Pattern pt = Pattern.compile("([01]?\\d?\\d|2[0-4]\\d?|25[0-5])\\.([01]?\\d?\\d|2[0-4]\\d?|25[0-5])\\.([01]?\\d?\\d|2[0-4]\\d?|25[0-5])\\.([01]?\\d?\\d|2[0-4]\\d?|25[0-5])");
        Matcher mt = pt.matcher(inputIP);
//        System.out.println(mt.matches());
        return mt.matches();
    }
}
