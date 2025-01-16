package org.example;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person() {}

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person {\n" +
                "  \"name\": \"" + name + "\",\n" +
                "  \"age\": " + age + ",\n" +
                "  \"email\": \"" + email + "\"\n" +
                "}";
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return email != null ? email.equals(person.email) : person.email == null;
    }
}
