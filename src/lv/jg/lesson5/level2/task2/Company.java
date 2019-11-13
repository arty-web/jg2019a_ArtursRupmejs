package lv.jg.lesson5.level2.task2;

//trūkst equals
//lietojam "ctrl + alt + l"
public class Company {

    private String name;
    private String registrationNumber;

    @Override
    public String toString() {
        return "Company: {"
                + "Name='" + name + "', "
                + "Registration number='" + registrationNumber + "'}}}";
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

}