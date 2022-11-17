package com.bytelegend;

public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals(Person person1, Person person2)
    {
        if (null == person1 || null == person2)
            return false;
        return person1.firstName.equals(person2.firstName) && person1.lastName.equals(person2.lastName);
    }
}
