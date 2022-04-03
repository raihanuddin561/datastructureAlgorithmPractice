package advanceJavaPractice.genericsPractice;

public class Holder <T>{
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
