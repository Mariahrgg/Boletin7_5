import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Dados 3 números que se supon distintos , indicar cal é o maior
         */

        System.out.println("Este programa indica que numero es mayor");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Introduce un numero: ");
        double num2 = sc.nextDouble();
        System.out.println("Introduce un numero: ");
        double num3 = sc.nextDouble();

        if (num1 > num2 && num1 > num3) System.out.println("el numero mayor es " + num1);
        if (num2 > num1 && num2 > num3) System.out.println("el numero mayor es " + num2);
        if (num3 > num2 && num3 > num1) System.out.println("el numero mayor es " + num3);
    }
}