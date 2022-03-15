package bookPractice.multiThreadPractice;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: "+t);
        t.setName("Main Thread");
        System.out.println("after name changed: "+t);
        try {
            for(int n=5;n>0;n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("main thread");
        }
    }
}
