package classwork.MVCAPP;

import classwork.MVCAPP.Controller.Controller;
import classwork.MVCAPP.Controller.iGetController;
import classwork.MVCAPP.Controller.iGetModel;
import classwork.MVCAPP.Controller.iGetView;
import classwork.MVCAPP.Model.Domen.Student;
import classwork.MVCAPP.Model.Model;
import classwork.MVCAPP.View.View;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей", 21, 101);
        Student s2 = new Student("Андрей", 22, 111);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 301);
        Student s5 = new Student("Даша", 25, 171);
        Student s6 = new Student("Лена", 23, 104);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);


        iGetModel mod = new Model(students);
        iGetView viw = new View();

        iGetController control = new Controller(mod, viw);
        viw.setController(control);


        control.update();

    }
}
