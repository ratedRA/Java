import java.time.temporal.ChronoUnit;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("John");
        Employee e2 = new Employee("Ron");
        Employee e3 = new Employee("Harry");

        CustomList<Employee> customList = new MyList<>();
        customList.addItem(e1);
        customList.addItem(e2);
        customList.remove(0);
        customList.addItem(e3);
        System.out.println("the size of customList is "+customList.size());
        for(int i =0; i<customList.size(); i++){
            try {
                System.out.println("item at " + i + " index is: " + customList.getItem(i).getName());
            }
            catch (Exception e){
                System.out.printf("end of the list is reached");
                break;

            }
        }

    }
}
