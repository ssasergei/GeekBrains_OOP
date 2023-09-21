package Controller.Interfaces;

import java.util.List;

import Model.Core.Student;

public interface iGetModel {
     List<Student> getStudents();

    /**
     * Удаляет студента из списка
     * @param id индекс студента
     */
    public void removeStudents(int index);
    
  }
