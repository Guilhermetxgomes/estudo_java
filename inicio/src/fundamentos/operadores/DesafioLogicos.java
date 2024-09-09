package fundamentos.operadores;

public class DesafioLogicos {
  public static void main(String[] args) {
    boolean trabalho1 = true;
    boolean trabalho2 = true;

    boolean comprouTV50 = trabalho1 && trabalho2;
    boolean comprouTV30 = !comprouTV50 && (trabalho1 || trabalho2);
    boolean comprouSorvete = !comprouTV30 || comprouTV50;
    boolean maisSaudavel = !comprouSorvete;

    System.out.println("Comprou TV \"50\"? " + comprouTV50);
    System.out.println("Comprou TV \"30\"? " + comprouTV30);
    System.out.println("Comprou Sorvete? " + comprouSorvete);
    System.out.println("Ficou mais saudável? " + maisSaudavel);


  }
}
