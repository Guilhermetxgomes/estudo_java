package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o primeiro salário: ");
    String salario1_s = input.nextLine().replace(",", ".");
    double salario1 = Double.parseDouble(salario1_s);

    System.out.print("Digite o segundo salário: ");
    String salario2_s = input.nextLine().replace(",", ".");;
    double salario2 = Double.parseDouble(salario2_s);

    System.out.print("Digite o terceiro salário: ");
    String salario3_s = input.nextLine().replace(",", ".");
    double salario3 = Double.parseDouble(salario3_s);

    var media_salario = (salario1 + salario2 + salario3)/3;

    System.out.printf("A média de salario é de %.2f%n ", media_salario);

    input.close();
  }
}
