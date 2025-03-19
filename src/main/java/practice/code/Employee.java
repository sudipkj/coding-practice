package practice.code;

public class Employee {
    private int empId;
    private long salary;
    private String name;

    private String dept;

    public Employee(int empId, long salary, String name, String dept) {
        this.empId = empId;
        this.salary = salary;
        this.name = name;
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
