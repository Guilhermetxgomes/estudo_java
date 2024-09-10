package controle;

public class Switch {
  public static void main(String[] args) {
    String faixa = "vermelha";

    switch (faixa.toLowerCase()) {
      case "preta":
        System.out.println("Sei o Bassai-Dai");
      case "marrom":
        System.out.println("Sei o Tekki Shodan");
      case "roxa":
        System.out.println("Sei o Heian Godan");
      default:
        System.out.println("Não sei nada");
    }
    // "Não ter o break faz eu executar todos os cases abaixo do meu case"
  }
}
