package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class PersonTest {
    @Test
    public void test() {
        int n = new Random().nextInt(100);
        Person p1 = new Person(new String("person_" + n), "person_" + (n + 1));
        Person p2 = new Person(new String("person_" + n), "person_" + (n + 1));
        Person p3 = new Person("person_" + n, "person_" + n);

        Assertions.assertEquals(p1, p2);
        Assertions.assertEquals(p2, p1);
        Assertions.assertNotEquals(p1, p3);
        Assertions.assertNotEquals(p3, p1);
        Assertions.assertNotEquals(p1, null);
    }
}
