package classe.desafio;

public class Jantar {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa("Guilherme", 50.30);
    Comida c1 = new Comida("Arroz", 0.2);
    Comida c2 = new Comida("Feijão", 0.5);

    System.out.printf("Peso antes de comer %.2f%n", p1.peso);
    p1.comer(c1);
    p1.comer(c2);
    System.out.printf("Peso depois de comer %.2f%n", p1.peso);
  }
}
