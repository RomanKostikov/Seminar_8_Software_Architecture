package classwork.MVCAPP.Model.Domen;

public class Student extends Person {
    private int id;

    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Students [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
    }

}
