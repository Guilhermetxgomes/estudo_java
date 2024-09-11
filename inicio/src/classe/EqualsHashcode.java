package classe;

public class EqualsHashcode {
  public static void main(String[] args) {
    Usuario u1 = new Usuario();

    u1.nome = "Guilherme";
    u1.email = "teste@emial.com";

    Usuario u2 = new Usuario();

    u2.nome = "Guilherme";
    u2.email = "teste@emial.com";

    System.out.println(u1 == u2);

    System.out.println(u1.equals(u2));
    System.out.println(u2.equals(u1));

  }
}
