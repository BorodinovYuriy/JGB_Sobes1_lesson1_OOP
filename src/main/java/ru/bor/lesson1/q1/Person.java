package ru.bor.lesson1.q1;

class TestBuilder {
    public static void main(String[] args) {

        Person testPerson = new Person.PersonBuilder()
                .addAge(11)
                .addAddress("Krasnodar")
                .addCountry("Russia")
                .addFirstName("Ivan")
                .addMiddleName("Ivanovich")
                .addLastName("Pupkin")
                .addPhone("2223322")
                .addAge(66)
                .addGender("NonBinarySuperHumanoid")
                .build();

        System.out.println(testPerson.getAddress());
        System.out.println(testPerson.getCountry());
        System.out.println(testPerson.getFirstName());
        System.out.println(testPerson.getMiddleName());
        System.out.println(testPerson.getLastName());
        System.out.println(testPerson.getAge());
        System.out.println(testPerson.getPhone());
        System.out.println(testPerson.getGender());
    }
}


public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;


    public Person(PersonBuilder personBuilder) {
        firstName = personBuilder.firstName;
        lastName = personBuilder.lastName;
        middleName = personBuilder.middleName;
        country = personBuilder.country;
        address = personBuilder.address;
        phone = personBuilder.phone;
        age = personBuilder.age;
        gender = personBuilder.gender;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getCountry() {
        return country;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;

        public PersonBuilder addFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public PersonBuilder addLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public PersonBuilder addMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }
        public PersonBuilder addCountry(String country) {
            this.country = country;
            return this;
        }
        public PersonBuilder addAddress(String address) {
            this.address = address;
            return this;
        }
        public PersonBuilder addPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public PersonBuilder addAge(int age) {
            this.age = age;
            return this;
        }
        public PersonBuilder addGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}