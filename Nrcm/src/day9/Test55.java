package day9;


import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class User {
    private int age;

    public User(int age) throws InvalidAgeException {
        if (age <= 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        } else if (age > 100) {
            throw new InvalidAgeException("Age cannot be greater than 100.");
        }
        this.age = age;
        System.out.println("Valid age.");
    }
}


