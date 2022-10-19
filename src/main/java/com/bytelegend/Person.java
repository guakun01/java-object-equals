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
        if (obj == null) {
            return false;
        }
        if (obj instanceof Person) {
            Person another = (Person) obj;
            return this.firstName.equals(another.firstName) && this.lastName.equals(another.lastName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.firstName) + Objects.hashCode(this.lastName);
    }
}
