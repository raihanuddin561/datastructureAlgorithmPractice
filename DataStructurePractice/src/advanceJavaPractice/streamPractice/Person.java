package advanceJavaPractice.streamPractice;

public class Person {
    private int age;
    private String name;
    private Gender gender;
    private String email;

    public Person() {
    }

    public Person(int age, String name, Gender gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public Person(int age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }
   public void sendEmail(){
       System.out.println("Sending email to: "+email);
   }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
