package fundamentos;

public class ConversaoTipoPrimitivioNumerico {
  public static void main(String[] args) {
    double a = 1; // implicita
    System.out.println(a);

    float b = (float) 1.0; // explcita (CAST)
    System.out.println(b);

    int c = 4;
    byte d = (byte) c;
    System.out.println(d);


  }
}
