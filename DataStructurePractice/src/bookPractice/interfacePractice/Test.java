package bookPractice.interfacePractice;

public interface Test {
    int getNumber();
    default String print(){
        return "default method";
    }
    default void read(){
        System.out.println("reading default method");
    }

}
