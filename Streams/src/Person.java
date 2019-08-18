public class Person {
    private String name;
    private String state;
    private String gender;
    private int age;

    public Person(String name, String state, String gender, int age) {
        this.name = name;
        this.state = state;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }
}
