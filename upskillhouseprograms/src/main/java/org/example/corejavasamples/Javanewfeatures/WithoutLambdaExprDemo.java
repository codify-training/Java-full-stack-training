package org.example.corejavasamples.Javanewfeatures;


import java.util.Arrays;
import java.util.List;

interface ProductChecker{
    public boolean test(Product p);
}

class Product{
    public String name;
    public int price;

    Product(String name, int price){
        this.name = name;
        this.price = price;
    }
}

class ProctChectImpl implements ProductChecker{
    public boolean test(Product p){
        return p.price <=600;
    }
}

class ProctChecThousandFiltertImpl implements ProductChecker{
    public boolean test(Product p){
        return p.price <=1000;
    }
}

public class WithoutLambdaExprDemo {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("pant", 600),
                new Product("Shirt", 1000),
                new Product("Kerchief", 20),
                new Product("Suite", 4000)
        );
        ProctChectImpl productCheckImpl = new ProctChectImpl();
        ProctChecThousandFiltertImpl productCheckThImpl = new ProctChecThousandFiltertImpl();
        for(Product p : products){
            if(productCheckThImpl.test(p)){
                System.out.println(p.name + "    --- "+ p.price);
            }


        }


    }
}
