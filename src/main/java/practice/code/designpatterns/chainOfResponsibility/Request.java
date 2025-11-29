package practice.code.designpatterns.chainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

public class Request {
    @Getter
    @Setter
    private String priority;
    Request(String priority){
        this.priority= priority;
    }

}
