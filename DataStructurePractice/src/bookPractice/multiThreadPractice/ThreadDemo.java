package bookPractice.multiThreadPractice;

public class ThreadDemo {
    public static void main(String[] args) {
        NewThread t= null;
        try {
             new NewThread().t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        NewThread2 t2= new NewThread2();
        try{
            for(int i = 5; i> 0 ; i--){
                System.out.println("Main thread: "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Exiting main thread");

        System.out.println("Waiting threads");
        try {
           // t.t.join();
            t2.join();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
