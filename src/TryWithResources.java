import java.io.*;

public class TryWithResources {
    /*
      new feature in try with resources
     */
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("abc.txt")); PrintWriter printWriter = new PrintWriter("abc.txt")){

            System.out.println("statement");
        }
        catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
