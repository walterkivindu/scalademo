package javacode;

import java.util.ArrayList;
import java.util.List;

public class Stu {
    public static List<Person> getPersons(){
        List<Person> personList = List.of(new Person("John", 3), new Person("John2", 34));
        return new ArrayList<>(personList);
    }

    public static void main(String[] args) {
        List<Person> persons = getPersons();
        System.out.println();
    }
}
