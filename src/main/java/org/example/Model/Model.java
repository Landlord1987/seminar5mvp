package org.example.Model;

import java.util.HashMap;
import java.util.List;
import org.example.Controller.iGetModel;

public class Model implements iGetModel {
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents()
    {
        return students;
    }

    @Override
    public HashMap<Long, Student> getAllHashMapStudents() {
        return null;
    }

    @Override
    public void removeStudent(Long num) {

    }
}
