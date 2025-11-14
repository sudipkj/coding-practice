package practice.nov.java8;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Employee {
    @NonNull
    private String fName;
    @NonNull
    private String lName;
    @NonNull
    private Address address;
    @NonNull
    private String deptName;
    @NonNull
    private Integer salary;
}
