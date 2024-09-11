package arrays;

import java.util.Scanner;

public class DesafioNotas {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.err.print("Digite a quantidade de notas que deseja inserir: ");
    int tamanho_array = entrada.nextInt();

    double[] notas = new double[tamanho_array];

    for (int i = 0; i < notas.length; i++){
      System.out.printf("Insira a nota %d: ", i + 1);
      notas[i] = entrada.nextDouble();
    }

    double soma_notas = 0;
    for (double nota : notas){
      soma_notas += nota;
    }

    System.out.printf("A média do aluno é %.2f\n", soma_notas/tamanho_array);


    entrada.close();
  }
}
