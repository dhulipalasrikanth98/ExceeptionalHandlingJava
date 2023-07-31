import java.io.IOException;

public class ThrowsKeyWord {
    /*
      for unchecked exception throws declaration or try catch is not compulsary for the calling method
    * */
    public static void main(String[] args) throws ItIsNullPointerException {
        /*if a exception is expected but donot know then we have to use throws exception at the starting*/
            /*method used anywhere throws either custom
            exception or checked exception we can mention the same class or parent class of the exception i.e Exception or Throwable it is accepted
            */
    //
            /*try {
                m1();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }*/
        //mention the exception in throws or try catch block
        m1();
   // if m1 throws any exception then further code is not executed in case of throws
        //for try catch it will  throw exception and executes the code further line
            System.out.print("read the futhewr lines");

    }
    public static void m1() throws ItIsNullPointerException{
        throw new ItIsNullPointerException("exception occured");

    }

}
/*
* Custom Exception
* */
class ItIsNullPointerException extends Exception{

   ItIsNullPointerException(String str){
       super(str);
   }
}
