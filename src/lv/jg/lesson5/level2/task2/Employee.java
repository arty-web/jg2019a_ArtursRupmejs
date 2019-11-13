package lv.jg.lesson5.level2.task2;

//trūkst equals
//lietojam "ctrl + alt + l"
public class Employee {

    private String contractNumber;
    private double salary;
    private Department department;

    @Override
    public String toString() {
        return "Employee: {"
                + "Contract number='" + contractNumber + "', "
                + "Salary='$" + salary + "', "
                + department;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

}