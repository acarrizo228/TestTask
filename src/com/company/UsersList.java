package com.company;

import java.util.*;
import java.util.stream.Collectors;

class UsersList {
    private List<User> userList = new ArrayList();

    UsersList() {
    }

    List<User> createListOfUsers() {
        this.userList.add(new User("Vladyslav", 20, "male", true));
        this.userList.add(new User("Max", 42, "male", false));
        this.userList.add(new User("Alina", 18, "female", true));
        this.userList.add(new User("Margo", 24, "female", true));
        this.userList.add(new User("Rosa", 13, "female", true));
        return this.userList;
    }

    static void viewList(List<?> userList) {
        userList.forEach(System.out::println);
    }

    List<User> reverseListOfUsers() {
        return this.userList.stream()
                .sorted(Comparator.comparing(User::getName).reversed())
                .collect(Collectors.toList());
    }

    List<User> filterListOfUsersByStudentsAndAges() {
        return this.userList.stream()
                .filter(User::isStudent)
                .filter((user) -> user.getAge() < 25)
                .collect(Collectors.toList());
    }

    Integer countStudents() {
        return (int)this.userList.stream()
                .filter((user) -> user.getAge() > 15)
                .count();
    }

    Map<String, List<User>> createMapWithGenderKey() {
        return this.userList.stream()
                .collect(Collectors.groupingBy(User::getGender));
    }

    static void viewMapWithList(Map<String, List<User>> map) {
        map.forEach((key, value) -> {
            System.out.println(key + ":");
            value.forEach(System.out::println);
        });
    }

    Map<Boolean, Map<String, List<User>>> createMapWithTwoKeys() {
        return this.userList.stream()
                .collect(Collectors.groupingBy(User::isStudent, Collectors.groupingBy(User::getGender)));
    }

    static void viewMapWithMap(Map<Boolean, Map<String, List<User>>> map) {
        map.forEach((key, value) -> {
            System.out.println(key + ":");
            viewMapWithList(value);
        });
    }

    String viewSeparatedComma() {
        return this.userList.stream()
                .map(User::toString)
                .collect(Collectors.joining(", "));
    }

    List<User> setUserNameGenderUppercase() {
        return this.userList.stream()
                .peek((user) -> {
                    user.setName(user.getName().toUpperCase());
                    user.setGender(user.getGender().toUpperCase());
                }).collect(Collectors.toList());
    }
}
