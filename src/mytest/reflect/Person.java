package mytest.reflect;

/**
 * Created by Chen on 27/04/2017.
 */
public class Person {
    private String name;
    private String gender;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person() {
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " + name + ", " + "age: " + age;
    }
}
