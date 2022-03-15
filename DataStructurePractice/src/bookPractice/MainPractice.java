package bookPractice;

import bookPractice.interfacePractice.Test;
import bookPractice.interfacePractice.TestPractice;
import bookPractice.interfacePractice.TestPractice2;

public class MainPractice {
    public static void main(String[] args) {
        TestPractice tp = new TestPractice();
        tp.getNumber();
        tp.print();
        TestPractice2 tp2 = new TestPractice2();
        tp2.getNumber();
        tp2.print();
        Test t = new Test() {
            @Override
            public int getNumber() {
                return 1;
            }
        };

        System.out.println(t.getNumber()+" "+t.print());
        t.read();
        System.out.println(tp.getNumber()+" "+tp.print());
        System.out.println(tp2.getNumber()+" "+tp2.print());
    }
}
