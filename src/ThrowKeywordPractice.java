
/*
while extending runtime exception,Error it is not neccessary write throws
while extending Exception,Throwable etc define throws in the method
 */

public class ThrowKeywordPractice extends RuntimeException { /* extends Exception,Throwable*/

    public static void main(String[] args) throws InterruptedException {
      long start = System.currentTimeMillis();
        System.out.println(start);
        doStuff();
        long end = System.();
        System.out.println(end);
        System.out.print(end - start);


    }

    private static void doStuff() {
        try {
            doMoreStuff();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private static void doMoreStuff() throws InterruptedException {
        Thread.sleep(1000);
    }
}
