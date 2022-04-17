package bookPractice;

import advanceJavaPractice.collectorsPractice.Book;

public class Test {
    public static void main(String[] args) {
        Box b = new Box();
        b.x = 1;
        b.y = 2;
        b.z = 3;
        Box b2 = new Box();
        b2 = b;
        System.out.println(b2.y);
        int k = 9;
        if(k==9){
            int k = 8;
        }
    }


}
class Super{
    private void foo(){
        System.out.println("super");
    }
}
class SubClass extends Super{
    public void foo(){
        System.out.println("");
    }
}