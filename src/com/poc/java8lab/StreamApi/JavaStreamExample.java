package com.poc.java8lab.StreamApi;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String productName;
    float productPrice;

    Product(int id, String productName, float productPrice){
        this.id = id;
        this.productName=productName;
        this.productPrice = productPrice;
    }
}
public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        List<Float> filteredList = productsList.stream()
                                    .filter(a -> a.productPrice > 10000)
                                    .map(b -> b.productPrice)
                                    .collect(Collectors.toList());
        System.out.println(filteredList);
        productsList.stream()
                .filter(a -> a.productPrice > 25000)
                .map(b -> b.productPrice)
                .forEach(System.out::println);

    }

}
