package lessonExcption;

public class Person {
    private String name;
    private int age;


    public void setAge(int age) throws UnccurentAgeException {
        if(age < 0 || age > 150){
            throw new UnccurentAgeException("Возраст не может быть меньше 0 или больше 150");
        }
        this.age = age;

    }
}
