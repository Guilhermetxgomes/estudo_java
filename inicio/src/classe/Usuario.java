package classe;

public class Usuario {
  String nome;
  String email;

  @Override
  public boolean equals(Object obj) {
    Usuario outro = (Usuario) obj;


    boolean nomeIgual = outro.nome == this.nome;
    boolean emailIgual = outro.email == this.email;

    return nomeIgual && emailIgual;
  }
}
