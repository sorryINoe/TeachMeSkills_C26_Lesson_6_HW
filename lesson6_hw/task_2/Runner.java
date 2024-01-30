package com.teachmeskills.lesson6_hw.task_2;

public class Runner {
    public static void main(String[] args) {
        Student student1 = new Student("Pavel","Svinko","AA11",19);
        Student student2 = new Student("Pav","Svi","A11",20);
        Student student3 = new Student("El","Nko","AA1",21);

        Student[] students = {student1,student2,student3};
        for (Student student : students ) {
            System.out.print( student.name + " " + student.surname + " " + student.age + "\n" + "passportID "+ student.passportID + "\n" +
                    "groupName "+student.groupName + "\n");
        }
    }
}
