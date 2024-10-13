package org.example;

public class Main {
    public static void main(String[] args) {
        University university1 = new University("Medicine University of Kazan", "101", StudyProfile.MEDICINE, "MUK", 1996);
        University university2 = new University("Mechanical Engineering University", "441", StudyProfile.MECHANICS, "MEU", 2001);
        University university3 = new University("University of International Construction", "268", StudyProfile.CONSTRUCTION, "UIC", 1990);
        University university4 = new University("University of Astrology and Space", "800", StudyProfile.ASTROLOGY, "UAS", 1987);
        University university5 = new University("Federal University of High Technologies", "210", StudyProfile.PROGRAMMING, "FUHT", 2003);
        Student student = new Student(4.1F, 2, "Salix Salahov", "101");
        Student student1 = new Student(5F, 2, "Andrey Petrov", "101");
        Student student2 = new Student(3.3F, 2, "Amir Suxov", "101");
        Student student3 = new Student(2.9F, 2, "Ivan Ivanov", "101");
        Student student4 = new Student(3.9F, 2, "Sergey Alekseev", "101");
        Student student5 = new Student(4F, 2, "Ekaterina Normikova", "101");
        Student student6 = new Student(4.5F, 2, "Daria Palova", "101");
        Student student7 = new Student(4.87F, 2, "Polina Orlova", "101");
        System.out.println(university1);
        System.out.println(university2);
        System.out.println(university3);
        System.out.println(university4);
        System.out.println(university5);
        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);
    }
}