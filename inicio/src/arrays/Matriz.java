package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Quantos alunos? ");
    int qtdAlunos = entrada.nextInt();

    System.out.print("Quantas nostas por aluno? ");
    int qtdNotas = entrada.nextInt();

    double[][] notasTurma = new double[qtdAlunos][qtdNotas];

    double total = 0;
    for (int i= 0; i < qtdAlunos; i ++){
      for (int j = 0; j < qtdNotas; j ++){
        System.out.printf("Informe a nota %d do aluno %d: ", j + 1, i + 1 );
        notasTurma[i][j] = entrada.nextDouble();
        total += notasTurma[i][j];
      }
    }

    double media = total / (qtdAlunos * qtdNotas);

    System.out.println("A média da turma é: " + media);

    for (double[] notasDoAluno : notasTurma){
      System.out.println(Arrays.toString(notasDoAluno));
    }


    entrada.close();
  }
}
