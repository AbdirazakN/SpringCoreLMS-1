package peaksoft.classes;

import lombok.Getter;
import lombok.Setter;



public class ProductsMarket implements Market{
    @Override
    public void getProducts() {
        System.out.println("""
                <<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                                      The Products
                Egg,Bread,Milk,Carrot,Potato,Fish,Sweets,Water
                """);
    }
}
