package fundamentos.operadores;

public class Relacionais {
  public static void main(String[] args) {
    int a = 97;
    int b = 'a';

    System.out.println(a == b);

    System.out.println(3 > 4);
    System.out.println(3 >- 3);
    System.out.println(3 < 7);
    System.out.println(30 <=7);

    double nota = 7.3;
    boolean bomComportamento = false;
    boolean passouPorNota = nota >=7;
    boolean temDesconto = bomComportamento && passouPorNota;

    System.out.println("Tem descont? " + temDesconto);
  }
}
