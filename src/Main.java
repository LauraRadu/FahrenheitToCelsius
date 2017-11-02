import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        double fahrenheit = number.nextInt();
        double celsius = (fahrenheit - 32) * (5.0/9);
        System.out.println(fahrenheit +  " grade Fahrenheit reprezinta " + celsius + " grade Celsius.");
    }
}
