package practice.dec.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Category {
    private int categoryid;
    private String categoryName;
    private List<Product> productList;
}
