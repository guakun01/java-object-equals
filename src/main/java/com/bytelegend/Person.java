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
        if (null == obj)
            return false;
        return this.firstName.equals(((Person)obj).firstName)
                && this.lastName.equals(((Person)obj).lastName) ;
    }
}
