import java.util.ArrayList;

public class AllList {
    public static void main(String[] args) {
        Person p1 = new Person("Albert",15,1111);
        Person p2 = new Person("Kirill",52,89111);
        Person p3 = new Person("Egor",12,1231);
        Person p4 = new Person("Fedr",28,4241);
        Person p5 = new Person("Anna",19,1331);
        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        for (Person p:
             list) {
            p.sayHi();
        }
    }
}

class Person{
    String name;
    int age;
    int passport;
    Person(String name, int age, int passport){
        this.name = name;
        this.age = age;
        this.passport = passport;
    }
    void sayHi(){
        System.out.println("My name is " + name + " I'm " + age + " years old" + " My identity card " + passport);
    }
}
