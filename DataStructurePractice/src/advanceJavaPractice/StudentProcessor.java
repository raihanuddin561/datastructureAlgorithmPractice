package advanceJavaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StudentProcessor {
    public List<String> process(List<Student> studentList, Function<Student, String> func){
        ArrayList<String> list = new ArrayList<>();
        for(Student student:studentList){
            String name = func.apply(student);
            list.add(name);
        }
        return  null;
    }
}
