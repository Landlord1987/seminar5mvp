package org.example.Model;

import org.example.Controller.iGetModel;

import java.util.HashMap;
import java.util.List;

/**
 * Класс взаимодействующий со списком студентов, хранящимся в HashMap
 */
public class HashModel implements iGetModel {

    private HashMap<Long,Student> students;

    /**
     * Конструктор класса
     * @param students список студентов
     */
    public HashModel(HashMap<Long,Student> students) {
        this.students = students;
    }
    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    /**
     * Метод получения списка студентов, хранящихся в HashMap
     * @return список студентов
     */
    @Override
    public HashMap<Long, Student> getAllHashMapStudents() {
        return students;
    }

    /**
     * Метод удаления студентов
     * @param num номер удаляемого студента
     */
    @Override
    public void removeStudent(Long num) {
        students.remove(num);
    }
}
