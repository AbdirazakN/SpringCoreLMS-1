package peaksoft.classes;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GlobalCenter {

    //  With List
//    private List<Market> markets;

//    public GlobalCenter(List<Market> markets) {
//        this.markets = markets;
//    }

//    public void getMarkets(){
//        this.markets.forEach(market -> market.getProducts());
//    }

private Market market;
private String name;
private String location;
private String webSite;

    public void getMarkets(){
        this.market.getProducts();
    }

    @Override
    public String toString() {
        return "\nGlobalCenter{" +
                "\nmarket=" + market +
                "\nname='" + name + '\'' +
                "\nlocation='" + location + '\'' +
                "\nwebSite='" + webSite + '\'' +
                '}';
    }
}
