package io.training.jinterviews;

public class ProductPrice {

    public final double GOLD_RABATT = 0.80;
    public final double SILVER_RABATT = 0.90;
    public final double EXPRESSTAX = 10.0;

    public double calculatePrice(double basePrice, String customerType, boolean isExpress) {
        double price = 0;
        switch (customerType) {
            case "GOLD":
                price = basePrice * GOLD_RABATT;
                break;
            case "SILVER":
                price = basePrice * SILVER_RABATT;
                break;
            default:
                price = basePrice;
        }
        if (isExpress) {
            price += EXPRESSTAX;
        }

        return price;
    }
}
