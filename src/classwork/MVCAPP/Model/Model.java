package classwork.MVCAPP.Model;

import java.util.List;

import classwork.MVCAPP.Controller.iGetModel;
import classwork.MVCAPP.Model.Domen.Student;


public class Model implements iGetModel {
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
