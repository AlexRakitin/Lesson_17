import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson_17 {


    public static void main(String[] args) {

// IP адреса находятся в диапазоне 0.0.0.0 - 255.255.255.255

        System.out.println("***** Задание 1 *****");
        System.out.println("Введите IP адрес: ");
        Scanner scan = new Scanner(System.in);
        String inputIP = scan.nextLine();
        String equalIP;
        if (Lesson_17_Service.isValid(inputIP)) {
            equalIP = "IP адрес веден правильно!";
        } else {
            equalIP = "!!!IP адрес веден не правильно!!!";
        }
        System.out.println(equalIP);
        scan.close();
    }
}

