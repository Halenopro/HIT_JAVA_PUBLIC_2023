import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final double pi = 3.14;
    System.out.println("Nhap ban kinh r: ");
    double r = sc.nextDouble();
    double C = pi * r * r;
    System.out.println("C = " + C);
    double S = pi * r * r * r;
    System.out.println("S = " + S);
    }
}