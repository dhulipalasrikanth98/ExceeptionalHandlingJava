import java.io.IOException;

public class ThrowsKeyWord {
    public static void main(String[] args) {
        /*if a exception is expected but donot know when we will by throw exception before the method block*/
            /*method used anywhere throws either customer
            exception or checked exception we can mention the parent class of the exception of Either Exception or Throwable
            */

            /*try {
                m1();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }*/

            System.out.print("read the futhewr lines");

    }
    public static void m1() throws ItIsNullPointerException{
        throw new ItIsNullPointerException("exception occured");

    }

}
class ItIsNullPointerException extends Exception{

   ItIsNullPointerException(String str){
       super(str);
   }
}
