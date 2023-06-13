package org.example.View;

import org.example.Controller.iGetView;
import org.example.Model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * View на английском языке
 */
public class ViewEng implements iGetView {
    @Override
    public void printAllStudents(List<Student> students) {
        System.out.println("-----Printing a list of students-----");
        for(Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("-----End of the list of students-----");
    }

    @Override
    public void printAllHashMapStudents(HashMap<Long, Student> studentsHashMap) {
        System.out.println("-----Printing a list of students-----");
        System.out.println("Total students in the list " + studentsHashMap.size() + ":");
        for(Student stud: studentsHashMap.values())
        {
            System.out.println(stud);
        }
        System.out.println("-----End of the list of students-----");
    }

    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
