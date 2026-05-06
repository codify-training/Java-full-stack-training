package org.example.corejavasamples.Javanewfeatures;


import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface ProductLamChecker{
    public boolean test(ProductL p);
}

class ProductL{
    public String name;
    public int price;

    ProductL(String name, int price){
        this.name = name;
        this.price = price;
    }
}
public class LambdaExprDemo {

    public static void main(String[] args) {
        List<ProductL> products = Arrays.asList(
                new ProductL("pant", 600),
                new ProductL("Shirt", 1000),
                new ProductL("Kerchief", 20),
                new ProductL("Suite", 4000)
        );
        ProductLamChecker productCheck = (p) -> p.price <=600;
        ProductLamChecker productThCheck = (p) -> p.price <=1000;
        for(ProductL p : products){
            if(productCheck.test(p)){
                System.out.println(p.name + "    --- "+ p.price);
            }
        }


    }
}
