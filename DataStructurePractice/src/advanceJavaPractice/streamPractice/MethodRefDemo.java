package advanceJavaPractice.streamPractice;

import java.util.function.Function;

public class MethodRefDemo {
    public static void check(String str, Function<String,Boolean> func){
        Boolean ret = func.apply(str);
        System.out.println(ret);
    }

}
