import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    
    int a = in.nextInt();
    out.println(a/10 + " " + a%10);
    
    out.flush();
  }
}
