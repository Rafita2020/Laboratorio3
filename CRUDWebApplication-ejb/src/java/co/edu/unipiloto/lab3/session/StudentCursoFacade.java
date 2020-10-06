/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.lab3.session;

import co.edu.unipiloto.lab3.entity.StudentCurso;
import co.edu.unipiloto.lab3.entity.StudentCursoPK;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rafae
 */
@Stateless
public class StudentCursoFacade extends AbstractFacade<StudentCurso> implements StudentCursoFacadeLocal {

    @PersistenceContext(unitName = "CRUDWebApplication-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentCursoFacade() {
        super(StudentCurso.class);
    }

    @Override
    public boolean insertarStudentCurso(Integer studentid, Integer codigo_curso, Integer estudiantes_tomando_curso) {
        StudentCursoPK PK= new StudentCursoPK(codigo_curso,studentid);
        if(consultaStudentCurso(PK)==null){
            return false;
        }else{
            StudentCurso sc= new StudentCurso(PK,estudiantes_tomando_curso);
            return true;
        }
    }

    @Override
    public StudentCurso consultaStudentCurso(StudentCursoPK pk) {
        return em.find(StudentCurso.class, pk);
    }
    
}
