package fundamentos;

public class Wrapper {
  public static void main(String[] args) {

    // byte
    Byte b = 100;
    // short
    Short s = 1000;
    // int
    Integer i = Integer.parseInt("10000");
    // long
    Long l = 100000L;

    System.out.println(b.byteValue());
    System.out.println(s.toString());
    System.out.println(i * 3);
    System.out.println(l / 3);

    // float
    Float f = 123.0F;
    System.out.println(f);

    // double
    Double d = 1234.567;
    System.out.println(d);


    // boolean
    Boolean bo = Boolean.parseBoolean("true");
    System.out.println(bo);
    System.out.println(bo.toString().toUpperCase());

    // char
    Character c = '#';
    System.out.println(c.toString() + "...");




  }
}
