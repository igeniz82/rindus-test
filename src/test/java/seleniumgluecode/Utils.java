package seleniumgluecode;

public class Utils {

    public double getPriceFormat(String price){
        price = price.replaceAll("([a-zA-Z$():])", "");
        String trimmedPrice = price.trim();
        double formattedPrice = Double.parseDouble(trimmedPrice);
        return formattedPrice;
    }
    public int getQuantityFormat(String qty){
        qty = qty.replaceAll("([a-zA-Z$():])", "");
        String trimmedQty = qty.trim();
        int formattedQty = Integer.parseInt(trimmedQty);
        return formattedQty;
    }
}
