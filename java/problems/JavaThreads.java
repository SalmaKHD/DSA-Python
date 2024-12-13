public class JavaThreads implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
        Thread thread = new Thread(new JavaThreads());
        thread.sleep(1000L);
        thread.start();
        
        System.out.print("End");
    }

    @Override
    public void run() {
        System.out.println("Hello");
        
    }
}
