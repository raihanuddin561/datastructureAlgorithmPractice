package advanceJavaPractice.genericsPractice;

import java.util.List;

public class WildCardPractice {
    public static void process(List<?> lists){
        System.out.println(lists);
    }
    public static double sum(List<? extends Number> lists){
        double sum =0;
        for(Number n:lists){
            sum +=n.doubleValue();
        }

        return sum;
    }
}
