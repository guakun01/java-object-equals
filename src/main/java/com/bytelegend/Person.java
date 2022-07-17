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
        if (!(obj instanceof Person)) {
            return false;
        }
        return ((Person) obj).firstName.equals(firstName) && ((Person) obj).lastName.equals(lastName);
    }
}
