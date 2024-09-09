package fundamentos.operadores;

public class Logicos {
  public static void main(String[] args) {
    System.out.println("Tabela Verdade E");
    System.out.println(true && true);
    System.out.println(true && false);
    // System.out.println(false && true);
    // System.out.println(false && false);

    System.out.println("Tabela verdade OU");
    // System.out.println(true || true);
    // System.out.println(true || false);
    System.out.println(false || true);
    System.out.println(false || false);

    System.out.println("Tabela verdade OU Exclusivo (XOR)");
    System.out.println(true ^ true);
    System.out.println(true ^ false);
    System.out.println(false ^ true);
    System.out.println(false ^ false);



  }
}
