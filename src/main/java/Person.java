import java.awt.*;
import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Point> points = new ArrayList<>();

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        points.add(new Point(0,0));
        points.add(new Point(0,2));
        points.add(new Point(3,3));
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
