package org.example.Controller;

import java.util.HashMap;
import java.util.List;
import org.example.Model.Student;

/**
 * Интерфейс, прописывающий получение списка студентов
 */
public interface iGetModel {
    public List<Student> getAllStudents();

    public HashMap<Long,Student> getAllHashMapStudents();

    public void removeStudent(Long num);
}
