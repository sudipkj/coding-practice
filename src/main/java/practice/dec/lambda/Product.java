package practice.dec.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    private int productId;
    private long productPrice;
    private String productName;

}
