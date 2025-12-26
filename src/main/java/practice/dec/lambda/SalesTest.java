package practice.dec.lambda;

import java.util.List;

public class SalesTest {

    public static void main(String[] args) {

        // create products
        Product p1 = new Product(101, 9999L, "ProductA");
        Product p2 = new Product(102, 19999L, "ProductB");
        Product p3 = new Product(103, 29999L, "ProductC");
        Product p4 = new Product(104, 39999L, "ProductD");
        Product p5 = new Product(105, 49999L, "ProductE");
        Product p6 = new Product(105, 49999L, "ProductF");
        Product p7 = new Product(105, 49999L, "ProductG");

        // create categories (each with one product for brevity)
        Category c1 = new Category(1, "CategoryA", List.of(p1,p6,p7));
        Category c2 = new Category(2, "CategoryB", List.of(p2));
        Category c3 = new Category(3, "CategoryC", List.of(p3));
        Category c4 = new Category(4, "CategoryD", List.of(p4));
        Category c5 = new Category(5, "CategoryE", List.of(p5));
        Category c6 = new Category(5, "CategoryE", List.of(p5,p1,p5));
        Category c7 = new Category(5, "CategoryE", List.of(p5,p1,p3,p5));

        // create 5 Sales objects using the all-args constructor
        Sales s1 = new Sales(1, List.of(c1));
        Sales s2 = new Sales(2, List.of(c2));
        Sales s3 = new Sales(3, List.of(c3));
        Sales s4 = new Sales(4, List.of(c4));
        Sales s5 = new Sales(5, List.of(c5));

        List<Sales> salesList = List.of(s1,s2,s3,s4,s5);

        //Find total value of categorE from


    }
}
