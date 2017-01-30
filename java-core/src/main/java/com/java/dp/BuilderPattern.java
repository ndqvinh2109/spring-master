package com.java.dp;

/**
 * Created by Quang on 01/04/2017.
 */
public class BuilderPattern {
    private final String firstName;
    private final String lastName;
    private final int age;

    public static void main(String[] args) {
        BuilderPattern builder = new Builder("Vinh", "Nguyen").age(50).build();
        System.out.println(builder.age);

    }
    public static class Builder {
        private final String firstName;
        private final String lastName;

        private int age = 20;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }

    public BuilderPattern(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
    }
}
