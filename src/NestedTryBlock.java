public class NestedTryBlock {
    public static void main(String[] args) {
        /*Nested try block*/
//        try{
//            try{
//                int data = 100/0;
//            }
//            catch (ArithmeticException arithmeticException){
//                System.out.println(arithmeticException.getLocalizedMessage());
//            }
//        }
//        catch (Exception e){
//            System.out.println(e.getLocalizedMessage());
//        }

        /*Nested try block if exception is not found in the child then very until last parent if not found
        * then jvm will give localized exception
        * */


        try{
            int d = 10/0;

            try{
                String s = null;
                System.out.println(s.length());
                try{
                    String t = null;
                    System.out.println(t.length());
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
                    System.out.println("arthematic zero");
                }
            }
            catch (NullPointerException nullPointerException){
                System.out.println("null pointer");
            }
        }
        catch (ArithmeticException e){
            System.out.print("divide by zero");
        }

    }
}
