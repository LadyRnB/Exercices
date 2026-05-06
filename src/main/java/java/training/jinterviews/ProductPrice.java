package java.training.jinterviews;

public class ProductPrice {

    public double calculatePrice(double basePrice, String customerType, boolean isExpress) {
        double price = 0;
        if (customerType.equals("GOLD")) {
            price = basePrice * 0.80;
        } else if (customerType.equals("SILVER")) {
            price = basePrice * 0.90;
        } else {
            price = basePrice;
        }

        if (isExpress) {
            price = price + 10.0;
        }

        return price;
    }
}
