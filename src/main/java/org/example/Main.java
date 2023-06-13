package org.example;

import org.example.Controller.Controller;
import org.example.Controller.iGetModel;
import org.example.Controller.iGetView;
import org.example.Model.FileModel;
import org.example.Model.HashModel;
import org.example.Model.Model;
import org.example.Model.Student;
import org.example.View.View;
import org.example.View.ViewEng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        HashMap<Long,Student> students = new HashMap<Long,Student>();
        Student s1 = new Student("Сергей", "Иванов", 21, 101);
        Student s2 = new Student("Андрей", "Сидоров", 22, 111);
        Student s3 = new Student("Иван", "Петров", 22, 121);
        Student s4 = new Student("Игорь", "Гуляев", 23, 301);
        Student s5 = new Student("Даша", "Цветкова", 25, 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, 104);
        students.put(1L,s1);
        students.put(2L,s2);
        students.put(3L,s3);
        students.put(4L,s4);
        students.put(5L,s5);
        students.put(6L,s6);

        FileModel fModel = new FileModel("StudentsDB.txt");
        //fModel.saveAllStudentToFile(students);

        iGetModel model = new HashModel(students);
        iGetModel newFModel = fModel;
/**
 * Выбор языка меня
 */
        while(true){
            System.out.print("1 - Rus\n2 - Eng\nВыберите язык:");
            int lang = scanner.nextInt();
            if (lang == 1){
                iGetView viewRus = new View();
                Controller controller = new Controller(viewRus, model);
                controller.run();
                break;
            } else if (lang == 2) {
                iGetView viewEng = new ViewEng();
                Controller controller = new Controller(viewEng, model);
                controller.runEng();
                break;
            } else System.out.println("Введены некорректные данные.");

        }

        //iGetView viewEng = new ViewEng();

        //Controller controller = new Controller(viewEng, model);
        //controller.update();


    }
}