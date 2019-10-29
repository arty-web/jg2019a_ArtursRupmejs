package lv.jg.lesson5.level2.task2;

public class EmployeeTest {

    public static void main(String[] args) {

        Company deloitte = new Company();
        deloitte.setName("Deloitte");
        deloitte.setRegistrationNumber("LV00004007455655");

        Department accounting = new Department();
        accounting.setName("Accounting");
        accounting.setCompany(deloitte);

        Employee bobArmstrong = new Employee();
        bobArmstrong.setContractNumber("CN0012548");
        bobArmstrong.setSalary(4500);
        bobArmstrong.setDepartment(accounting);

        System.out.println(bobArmstrong);

    }

}