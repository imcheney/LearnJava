package mytest.reflect;

import java.lang.reflect.Field;

/**
 * Created by Chen on 27/04/2017.
 */
public class MainTest_visitField {
    public static void main(String[] args) {

        try {
            Person person = new Person();
            Class myclass = person.getClass();

            //name
            Field nameField = myclass.getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(person, "LiuLing");
            //age
            Field ageField = myclass.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.setInt(person, 22);
            System.out.println(person);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
