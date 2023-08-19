package classwork.MVCAPP.View;

import java.util.List;


import classwork.MVCAPP.Controller.iGetController;
import classwork.MVCAPP.Controller.iGetView;
import classwork.MVCAPP.Model.Domen.Student;


public class View implements iGetView {

    iGetController contr;

    public void setController(iGetController contr)
    {
        this.contr = contr;
    }

    public void printAllStudent(List<Student> students)
    {
        for(Student s:students)
        {
            System.out.println(s);
        }
    }
}
