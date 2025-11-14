package practice.nov.java8;

import lombok.Data;
import lombok.Getter;

@Data
public class Employee {
    private String fName;
    private String lName;
    private Address address;
    private String deptName;
    private Integer salary;
}
