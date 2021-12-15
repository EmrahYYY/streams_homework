package be.intecbrussel;

import java.util.Objects;

public class Person {

    private String name;
    private String lastname;
    private Gender gender;
    private int age;
    private float weight;
    private float length;

    public Person(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", weight=" + weight +
                ", length=" + length +
                '}';
    }


    public enum Gender {

        MALE, FEMALE, OTHER;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Float.compare(person.weight, weight) == 0 && Float.compare(person.length, length) == 0 && Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, gender, age, weight, length);
    }
}
