package advanceJavaPractice;

public class ScopeExample {
    int x = 0;
    public void print(){
        int x = 1;
        System.out.println(x);
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        ScopeExample se = new ScopeExample();
        se.print();
    }
}
