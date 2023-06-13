package org.example.Controller;

import java.util.HashMap;
import java.util.List;
import org.example.Model.Student;

/**
 * Интерфейс вывода списка студентов и сообщения
 */
public interface iGetView {
    void printAllStudents(List<Student> students);
    void printAllHashMapStudents(HashMap<Long,Student> studentsHashMap);
    String prompt(String message);
}
