package classe.desafio;

public class Pessoa {
  String nome;
  double peso;

  Pessoa(String nome, double peso) {
    this.nome = nome;
    this.peso = peso;
  }

  void comer(Comida c){
    System.out.printf("%s comeu %s%n", nome, c.nome);
    peso = peso + c.peso;
  }
}
