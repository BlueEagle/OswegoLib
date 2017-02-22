import java.util.*;
import java.math.*;
public class Main extends Encrypt
{
  public static void main(String[] arguments)
  {
      Encrypt encrypt = new Encrypt();
      BigInteger encryption = encrypt.encrypt(new BigInteger("5123456789"));
	  System.out.println("Encrypted to: " + encryption);
  }
}
