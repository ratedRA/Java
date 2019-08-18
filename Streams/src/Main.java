import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ParseException {
        Employee john = new Employee(1,20000,"30/11/2011", new Person("John", "anyway", "Male",22));
        Employee marry = new Employee(2,40000,"30/11/2010", new Person("Marry", "portu", "Female",21));
        Employee harry = new Employee(3,10000,"30/11/2014", new Person("Harry", "newplace", "Male",30));
        Employee samantha = new Employee(4,50000,"30/11/2013", new Person("Samantha", "Karnataka", "Female",28));
        Employee herald = new Employee(5,20000,"30/11/2018", new Person("Herald", "Kerala", "Male",31));

        List<Employee> employees = Arrays.asList(john, marry, harry, samantha, herald);

        System.out.println("4.3. List of employee earning more than 10000 and have joined more than 3 years ago");
        System.out.println("====================================================================================");
        employees.stream()
                .filter(s-> {
                    if(s.getSalary()>10000){
                        try {

                            if(checkYear(s.getJoiningDate())){
                                return true;
                            }
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                    return false;
                })
                .map(s->s.getPersonName())
                .forEach(s->System.out.println(s));

        System.out.println("4.4. Max salary of an employee");
        System.out.println("==============================");
        Employee  maxSal = employees.stream()
                .collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)))
                .get();
        System.out.println(maxSal.getSalary());

        /*Employee minSal = employees.stream()
                .min(Comparator.comparingInt(Employee::getSalary))
                .get();
        System.out.println(minSal.getSalary());*/

        // Reversing name of each employee.
        System.out.println("4.5. For each employee reverse name");
        System.out.println("====================================");
        employees.stream()
                .map(s->new StringBuilder(s.getPersonName()).reverse())
                .sorted()
                .forEach(s->System.out.println(s));

        System.out.println("4.6 create a new field called randomeString and generated it by combining name, age, date of joining - with only alpha numerics (no spaces).");
        System.out.println("=========================================================================");
        String randomeString  = employees.stream()
                 .map(s->s.toString())
                 .collect(Collectors.joining(""));

        System.out.println(randomeString);
        System.out.println(" ");
        // sorting the employees according to the age.
        System.out.println("Sorting Employee according to age.");
        System.out.println("==================================");
        employees.stream()
                .map(s->s.getPerson())
                .sorted((s1,s2)-> s1.getAge().compareTo(s2.getAge()))
                .forEach(s-> System.out.println(s.getName()));




//
//        Predicate<Person> maleEmp = e->e.getGender()=="Male";
//        employees.stream()
//                .filter(Employee::isMale)
//                .sorted()
//                .forEach(s->System.out.println(s));

        ;

    }

    public static boolean checkYear(String joinDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date currDate = new Date();
        String now = (String) formatter.format(currDate);
        String[] nowDate = now.split(" ");
        currDate = formatter.parse(nowDate[0]);
        Date joiningDate;
        joiningDate = formatter.parse(joinDate);

        long diffInMillies = Math.abs(currDate.getTime() - joiningDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        if(diff/365>3)
            return true;
        else{
            return false;
        }
    }
}
