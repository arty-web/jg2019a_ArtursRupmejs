package lv.jg.lesson5.level2.task2;

//trūkst equals
//lietojam "ctrl + alt + l"
public class Department {

    private String name;
    private Company company;

    @Override
    public String toString() {
        return "Department: {"
                + "Name='" + name + "', " + company;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCompany(Company company) {
        this.company = company;
    }

}