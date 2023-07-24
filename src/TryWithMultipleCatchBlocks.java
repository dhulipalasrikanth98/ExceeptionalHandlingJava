public class TryWithMultipleCatchBlocks {
    public static void main(String[] args) {
        /*
        Always order the catch block with more specific exeption to general exception
        * */
        try{
            String s = "srikanth";
            System.out.println(s.length());
            int[] arr = new int[5];
            System.out.println(arr[10]);
        }
        catch (NullPointerException nullPointerException){
            System.out.println("null pointer");
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("array index out of bounds");
        }
        catch (Exception e){
            System.out.println("exception ");
        }
        System.out.println("rest of the code");

        /*
        * If more general exception catch block occurs before the
          specific exeption compile time error will come
        * */

       /* try{
            String s = "srikanth";
            System.out.println(s.length());
            int[] arr = new int[5];
            System.out.println(arr[10]);
        }

        catch (Exception e){
            System.out.println("exception ");
        }
        catch (NullPointerException nullPointerException){
            System.out.println("null pointer");
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("array index out of bounds");
        }
        System.out.println("rest of the code");*/

          /*
          If more specific exception is not present in catch block
          then catch block containg general if found will exceute that one directly
        * */
        try{
            String s = "srikanth";
            System.out.println(s.length());
            int[] arr = new int[5];
            System.out.println(arr[10]);
        }
        catch (NullPointerException nullPointerException){
            System.out.println("null pointer");
        }

        catch (Exception e){
            System.out.println("exception ");
        }
        System.out.println("rest of the code");

    }
}
