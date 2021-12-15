package be.intecbrussel;

import java.util.stream.Stream;

public class app {

    public static void main(String[] args) {

        System.out.println("*******************************************************************");

        Person[] person = new Person[]{
                new Person("jean-jaques"),
                new Person("yavuz emrah"),
                new Person("jean zuhur"),
                new Person("jean-jaques"),
                new Person("jean bart"),

        };

        Stream.of(person)
                .distinct()
                .filter(persons -> persons.getName().startsWith("j"))
                .filter(persons -> persons.getName().contains("a"))
                .filter(persons -> persons.getName().length() > 5)
                .limit(3)
                .skip(0)
                .forEach(System.out::println);


        System.out.println("*******************************************************************");


        int limit = 0;//for limit
        int skip = 0;

        //    for (Person luckyperson : person)


        if (person[0].getName().startsWith("j") && person[0].getName().contains("a") && person[0].getName().length() > 5 && limit < 3 && skip < 1) {
            System.out.println(person[0].getName());
            limit++;
        }


        if (!person[1].equals(person[0]) && person[1].getName().startsWith("j") && person[1].getName().contains("a") && person[0].getName().length() > 5 && limit < 3 && skip < 2) {
            System.out.println(person[1].getName());
            limit++;

        }


        if (!person[2].equals(person[0]) && !person[2].equals(person[1]) && person[2].getName().startsWith("j") && person[2].getName().contains("a") && person[0].getName().length() > 5 && limit < 3 && skip < 3) {
            System.out.println(person[2].getName());
            limit++;
        }


        if (!person[3].equals(person[0]) && !person[3].equals(person[1]) && !person[3].equals(person[0]) && person[3].getName().startsWith("j") && person[3].getName().contains("a") && person[0].getName().length() > 5 && limit < 3 && skip < 4) {
            System.out.println(person[3].getName());
            limit++;
        }


        if (!person[4].equals(person[0]) && !person[4].equals(person[1]) && !person[4].equals(person[2]) && !person[4].equals(person[3]) && person[4].getName().startsWith("j") && person[4].getName().contains("a") && person[0].getName().length() > 5 && limit < 3 && skip < 5) {
            System.out.println(person[4].getName());
            limit++;
        }


        System.out.println("limit: " + limit);
    }
}

