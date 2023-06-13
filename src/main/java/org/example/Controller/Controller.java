package org.example.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.example.Model.Student;
import org.example.View.ViewEng;

/**
 * Класс, управляющий поведением View и model
 */
public class Controller {
    private iGetView view;
    private iGetModel model;
    private List<Student> students;
    private HashMap<Long,Student> studentsHashMap;
    Scanner scanner = new Scanner(System.in);


    /**
     * Конструктор класса Controller
     * @param view принимает View
     * @param model принимает Model
     */
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    /**
     * Метод получения списка всех студентов
     */
    public void getAllStudents() {
        students = model.getAllStudents();
    }
    public void getAllHashMapStudents() {
        studentsHashMap = model.getAllHashMapStudents();
    }

    /**
     * Метод проверки нулевой ли список студентов
     * @return истину если не нулевой и ложь если нулевой
     */
    public boolean testData() {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Метод update получает список всех студентов и в случае их наличия выводих их, в противном случае выводит текстовое сообщение.
     */
    public void update() {
        //MVP
        getAllStudents();
        if(testData())
        {
            view.printAllStudents(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }

        //MVC
        //view.printAllStudents(model.getAllStudents());
    }

    /**
     * Метод run реализует бесконечный цикл вывода меню в консоль
     */
    public void run()
    {
        System.out.println("Список доступных команд:\nEXIT - выход\nLISTHASHMAP - вывести список студентов\nDELETE - удалить студента");
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду:");
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    getAllStudents();
                    view.printAllStudents(students);
                    break;
                case LISTHASHMAP:
                    getAllHashMapStudents();
                    view.printAllHashMapStudents(studentsHashMap);
                    break;
                case DELETE:
                    getAllHashMapStudents();
                    System.out.println("Введите номер студента на удаление");
                    Long num = scanner.nextLong();
                    if(num > studentsHashMap.size() || num <=0) {
                        System.out.println("Такого номера не существует в списке студентов");
                    } else model.removeStudent(num);
                    break;
            }

        }
    }

    /**
     * Метод run реализует бесконечный цикл вывода меню на Eng в консоль
     */
    public void runEng()
    {
        System.out.println("List of available commands:\nEXIT - exit\nLISTHASHMAP - output a list of students\nDELETE - delete a student");
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Enter the command:");
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Exiting the program!");
                    break;
                case LIST:
                    getAllStudents();
                    view.printAllStudents(students);
                    break;
                case LISTHASHMAP:
                    getAllHashMapStudents();
                    view.printAllHashMapStudents(studentsHashMap);
                    break;
                case DELETE:
                    getAllHashMapStudents();
                    System.out.println("Enter the student's number to delete");
                    Long num = scanner.nextLong();
                    if(num > studentsHashMap.size() || num <=0) {
                        System.out.println("Such a number does not exist in the list of students");
                    } else model.removeStudent(num);
                    break;
            }

        }
    }

}
