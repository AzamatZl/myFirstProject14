package lessonExcption;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(-15);
        } catch (UnccurentAgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("плфпщлфщплфщплф");
    }
}
