package com.bytelegend;

public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object p) {
        if (this == p) {
            return true;
        }
        if (p instanceof Person) {
            return this.firstName.equals(((Person) p).firstName) && this.lastName.equals(((Person) p).lastName);
        }
        return false;
    }
}
