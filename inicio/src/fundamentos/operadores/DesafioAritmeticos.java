package fundamentos.operadores;

public class DesafioAritmeticos {
  public static void main(String[] args) {
    int num1 = (6 * (3 + 2));
    num1 = (int) Math.pow(num1,2);
    num1 = num1 / (3*2);

    int num2 = (1- 5) * (2 - 7);
    num2 = num2 / 2;
    num2 = (int) Math.pow(num2,2);

    int num = num1 - num2;

    int res = num / 10;

    res = (int) Math.pow(res,3);

    System.out.println(res);




  }
}
