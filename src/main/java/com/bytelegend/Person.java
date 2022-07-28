package com.bytelegend;

public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj instanceof Person) {
            Person person = (Person) obj;
            return person.firstName.equals(firstName) && person.lastName.equals(lastName);
        }
        return false;
    }
}
