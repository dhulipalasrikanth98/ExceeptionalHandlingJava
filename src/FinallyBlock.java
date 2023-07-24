public class FinallyBlock {
    public static void main(String[] args) {
        try{
            int[] data = new int[10];
            data[5] = 10;
            System.exit(20);

        }
        catch (NullPointerException arrayIndexOutOfBoundsException){
            System.out.println(arrayIndexOutOfBoundsException);
        }
        finally {
            System.out.println("code exited with excepiton");
        }

    }
}
