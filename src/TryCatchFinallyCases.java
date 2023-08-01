public class TryCatchFinallyCases {
    public static void main(String[] args) {
        try{
            System.out.println("statement 1");

            System.out.println("statement 2");
            System.out.println(10/0);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println(10/0);
        }
    }
}
