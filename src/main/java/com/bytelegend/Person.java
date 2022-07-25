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
        // null check
        if (obj == null) {
            return false;
        }

        // this instance check
        if (this == obj) {
            return true;
        }

        // instanceof Check and actual value check
        if (obj instanceof Person) {
            Person otherPerson = (Person) obj;
            return this.firstName.equals(otherPerson.firstName) && this.lastName.equals(otherPerson.lastName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(firstName+lastName);
    }
}
