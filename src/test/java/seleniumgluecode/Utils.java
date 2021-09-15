package seleniumgluecode;

public class Utils {

    public double getPriceFormat(String price){
        price = price.replaceAll("([a-zA-Z$])", "");
        price.trim();
        double formattedPrice = Double.parseDouble(price);
        return formattedPrice;
    }
}
