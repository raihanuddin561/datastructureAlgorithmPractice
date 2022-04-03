package advanceJavaPractice.streamPractice;

public class StringUtils {
    public boolean isNotEmpty(String value){
        return value != null && value.length()>0;
    }
    public boolean isEmpty(String value){
        return !isNotEmpty(value);
    }
    public boolean hasNotSpecialCharacter(String value){
        return value.chars().map(op->(char)op).allMatch(Character::isAlphabetic);
    }
}
