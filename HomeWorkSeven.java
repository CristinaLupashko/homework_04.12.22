import java.util.Scanner;

public class HomeWorkSeven {
    public static void main(String[] args) {

        // Scanner n = new Scanner(System.in);
        //int number = n.nextInt();
        //System.out.println(number % 10);
       // System.out.println(number / 10 % 10);
       // System.out.println( number / 100);
     int n = Scanner();
     int firstNumber = firstNumber(n);
        System.out.println(firstNumber);
        int secondNumber = secondNumber(n);
        System.out.println(secondNumber);
        int thirdNumber = thirdNumber(n);
        System.out.println(thirdNumber);

    }
    public static int Scanner()
    {Scanner scanner = new Scanner(System.in);

    return scanner.nextInt();

    }
public static int firstNumber(int a){
    return a % 10;
}
public static int secondNumber(int b){
        return b /10 % 10;
}
public static int thirdNumber(int c){
        return c / 100;
}
}
