package co.edu.unipiloto.lab3.entity;

import co.edu.unipiloto.lab3.entity.StudentCurso;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-06T14:35:55")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, Integer> studentId;
    public static volatile SingularAttribute<Student, String> firstname;
    public static volatile SingularAttribute<Student, Integer> yearLevel;
    public static volatile ListAttribute<Student, StudentCurso> studentCursoList;
    public static volatile SingularAttribute<Student, String> lastname;

}