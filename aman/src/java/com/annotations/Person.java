package com.annotations;

@JsonSerializable
public class Person {

    @JsonElement
    private String fName;

    @JsonElement
    private String lName;

    @JsonElement(key = "personAge")
    private String age;

    private String address;

    @Init
    private void initNames(){
        this.fName = this.fName.substring(0,1).toUpperCase()+this.fName.substring(1);
        this.lName = this.lName.substring(0,1).toUpperCase()+this.lName.substring(1);
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
