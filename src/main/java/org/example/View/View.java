package org.example.View;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.example.Controller.iGetView;
import org.example.Model.Student;

/**
 * Класс реализует вывод списка студентов в консоль
 */
public class View implements iGetView {
    /**
     * Метод вывода списка студентов в консоль
     * @param students список студентов
     */
    public void printAllStudents(List<Student> students)
    {
        System.out.println("-----Вывод списка студентов-----");
        for(Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("-----Конец списка-----");
    }

    @Override
    public void printAllHashMapStudents(HashMap<Long, Student> studentsHashMap) {
        System.out.println("-----Вывод списка студентов-----");
        System.out.println("Всего студентов в списке " + studentsHashMap.size() + ":");
        for(Student stud: studentsHashMap.values())
        {
            System.out.println(stud);
        }
        System.out.println("-----Конец списка-----");
    }


    /**
     * Метод вывода сообщения в консоль и возврата сообщения
     * @param message сообщение
     * @return сообщение
     */
    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
