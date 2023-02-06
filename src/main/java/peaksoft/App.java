package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import peaksoft.classes.GlobalCenter;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        ProductsMarket productsMarket = applicationContext.getBean("productsMarket", ProductsMarket.class);
//        productsMarket.getProducts();
//        Market sweetsMarket = applicationContext.getBean("sweetsMarket2", SweetsMarket.class);
//        sweetsMarket.getProducts();
//
//        GlobalCenter globalCenter = new GlobalCenter(sweetsMarket);
//        System.out.println(globalCenter);

        GlobalCenter globalCenter = applicationContext.getBean("globalCenter", GlobalCenter.class);
        globalCenter.getMarkets();
        System.out.println(globalCenter);
        System.out.println(globalCenter.getClass().getSimpleName());


        applicationContext.close();
    }
}
