import java.awt.*;
import java.util.Scanner;

public class Inputs {
    public static String InputString(){
//        System.out.printf("Type String->");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;
    }
    public static int InputInt(){
//        System.out.printf("Type Number->");
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();
        return inputInt;
    }
}
