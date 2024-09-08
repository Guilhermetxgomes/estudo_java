package fundamentos;

import java.util.Scanner;

public class console {
public static void main(String[] args) {
  System.out.print("Bom");
  System.out.print(" dia");

  System.out.println("\nBom");
  System.out.println("dia");

  System.out.printf("Megasena: %d %d %d %d %d %n", 1, 2,3,4,5);

  System.out.printf("Salário : %.1f %n",1234.4564 );

  System.out.printf("Nome : %s %n", "Guilherme" );

  Scanner entrada = new Scanner(System.in);

  System.out.print("Digite o seu nome: ");
  String nome = entrada.nextLine();

  System.out.print("Digite o seu sobrenome: ");
  String sobrenome = entrada.nextLine();

  System.out.print("Digite a sua idade: ");
  int idade = entrada.nextInt();

  entrada.nextLine(); // lê o "\n" que a entrada.nextInt() deixa para trás.

  System.out.printf("%s %s tem %d anos. %n", nome, sobrenome, idade);


  entrada.close();


}
}
