package bookPractice.multiThreadPractice;

public class NewThread2 extends Thread{
    NewThread2(){
        super("Demo Thread2");
        System.out.println("Child Thread: "+this);
        start();
    }

    @Override
    public void run() {
        try {
            for(int i=5;i>0;i--){
                System.out.println("Child Thread: "+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Chiled interrupted.");
        }
        System.out.println("Exiting child thread. ");
    }
}
