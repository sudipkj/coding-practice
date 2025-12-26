package practice.dec.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Sales {
    private int salesId;
    private List<Category> categoryList;

}
