import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        double VND, USD;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD : ");
        USD = scanner.nextDouble();

        VND = USD * 23000;
        System.out.println(VND + "VND");
    }
}
