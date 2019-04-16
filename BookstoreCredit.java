
// BookstoreCredit.java
// Written by Noah
// Created on 04/12/2019

import java.util.Scanner;

public class BookstoreCredit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the students name and grade point average");
        String StudentName;
        StudentName = input.next();
        double GradePointaverage;
        GradePointaverage = input.nextDouble();
        double Credit;
        Credit = GradePointaverage * 10;
        calculateStudentValue(StudentName, GradePointaverage, Credit);
    }

    static void calculateStudentValue(String StuentName, double GradePointaverage, double Credit) {
        System.out.println("The student " + StuentName + " grade point average is " + GradePointaverage
                + " and they have $ " + Credit + " in credits ");

    }

}
