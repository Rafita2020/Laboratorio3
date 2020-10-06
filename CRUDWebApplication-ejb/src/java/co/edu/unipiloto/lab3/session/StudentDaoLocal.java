/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.lab3.session;

import co.edu.unipiloto.lab3.entity.Student;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author rafae
 */
@Local
public interface StudentDaoLocal {

    void addStudent(Student student);

    void editStudent(Student student);

    void deleteStudent(Integer studentId);

    Student getStudent(Integer StudentId);

    List<Student> getAllStudents();
    
}
