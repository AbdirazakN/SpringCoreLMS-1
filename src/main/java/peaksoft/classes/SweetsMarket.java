package peaksoft.classes;

import lombok.Getter;
import lombok.Setter;


public class SweetsMarket implements Market{

    @Override
    public void getProducts() {
        System.out.println("""
                <<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                                      The Sweets
                Ice-cream,Snickers,Waffles,Albeni,Twix,Sugar,Alpen-gold,Chocolate
                """);
    }
}
