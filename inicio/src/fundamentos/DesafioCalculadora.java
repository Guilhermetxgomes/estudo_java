package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double num1 = entrada.nextDouble();
    entrada.nextLine();
    double num2 = entrada.nextDouble();
    entrada.nextLine();
    String op = entrada.nextLine();


    double res = op.equals("+") ? num1 + num2 : 0;
    res = op.equals("-") ? num1 - num2 : res;
    res = op.equals("*") ? num1 * num2 : res;
    res = op.equals("/") ? num1 / num2 : res;
    res = op.equals("%") ? num1 % num2 : res;

    System.out.println(res);

    entrada.close();
  }
}
