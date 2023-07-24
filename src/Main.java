import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        /*Unchecked Exception */
        try{
            int data = 100/0;

        }
        catch(ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();
        }
        System.out.print("rest of the code");

        /*Checked Exception*/
        PrintWriter printWriter;
        try{
          printWriter = new PrintWriter("abc.txt");
        }
        catch(FileNotFoundException fileNotFoundException){
            System.out.print("file not found");
        }
        System.out.println("rest of the code");

    }
}