import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void wait(int ms)
  {
      try
      {
          Thread.sleep(ms);
      }
      catch(InterruptedException ex)
      {
          Thread.currentThread().interrupt();
      }
  }
  public static void print(String text)
  {
    System.out.println(text);
  }
  public static void main(String[] args)
    throws IOException
  {
    int time = 20;
    if (time < 18) {
      print("Good day.");
      print("Please enter your name below:");
    } else {
      print("Good evening.");
      wait(500);
      print("Please enter your name below:");
    } 
    BufferedReader reader = new BufferedReader(
      new InputStreamReader(System.in));
    String name = reader.readLine();
    if (name.isEmpty()) {
      System.out.println("Please input a name!");
      wait(200);
      return;
    } else {
      System.out.println("Hello, " + name);
      wait(500);
      System.out.println("What would you like to do?");
      print("This is coming soooooooon (probably not)");
      wait(500);
      BufferedReader numlin = new BufferedReader(
      new InputStreamReader(System.in));
        String number = numlin.readLine();
      return;
    if(number == "") {
      System.out.println("Please input a option!");
      wait(500);
      return;
      }
    }
  }
}
