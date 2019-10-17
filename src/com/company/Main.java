package com.company;

public class Main {

    public static void main(String[] args) {
        UsersList listOfUser = new UsersList();
        UsersList.viewList(listOfUser.createListOfUsers());

        System.out.println("\n" + "1. A sorted List of Users by their names with ordering from Z to A:");
        UsersList.viewList(listOfUser.reverseListOfUsers());

        System.out.println("\n" + "2. A List of students with age < 25:");
        UsersList.viewList(listOfUser.filterListOfUsersByStudentsAndAges());

        System.out.println("\n" + "3. Count students with age > 15:\n" + listOfUser.countStudents());

        System.out.println("\n" + "4. A Map<String, List<User>>, where key = gender:");
        UsersList.viewMapWithList(listOfUser.createMapWithGenderKey());

        System.out.println("\n" + "5. A Map<Boolean, Map<String, List<User>>, where a key = student, second map key = gender:");
        UsersList.viewMapWithMap(listOfUser.createMapWithTwoKeys());

        System.out.println("\n" + "6. A String, each User should be separated by the comma:");
        System.out.println(listOfUser.viewSeparatedComma());

        System.out.println("\n" + "7. A List where name and gender are uppercase:");
        UsersList.viewList(listOfUser.setUserNameGenderUppercase());

        System.out.println("\n" + "That's all. Have a nice day :)");
    }
}
