public class NestedTryBlock {
    public static void main(String[] args) {
        /*Nested try block*/
        try{
            try{
                int data = 100/0;
            }
            catch (ArithmeticException arithmeticException){
                System.out.println(arithmeticException.getLocalizedMessage());
            }
        }
        catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }

        /*Nested try block if exception is not found in the child then very until last parent if not found
        * then jvm will give localized exception
        * */


        try{
            try{
                try{
                    int[] data = new int[5];
                    data[6] =5;
                }
                catch (NullPointerException nullPointerException){
                    System.out.println(nullPointerException.getLocalizedMessage());
                }
            }
            catch (StackOverflowError stackOverflowError){
                System.out.println("stack overflow error");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
