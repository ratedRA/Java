import java.util.Date;

public class Employee {
    private int id;
    private int salary;
    private String joiningDate;
    private Person person;

    public Employee(int id, int salary, String joiningDate, Person person) {
        this.id = id;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public String getPersonName() {
        return person.getName();
    }

    public Person getPerson() {
        return person;
    }
    public boolean isMale(){
        return this.getPerson().getGender()=="Male";
    }
    public boolean isFemale(){
        return this.getPerson().getGender()=="Female";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + person.getName() +
                ", age="+person.getAge()+
                ", joiningDate='" + joiningDate + '\'' +
                '}';
    }
}
