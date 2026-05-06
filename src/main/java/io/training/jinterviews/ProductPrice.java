package io.training.jinterviews;

public class ProductPrice {

    public static final double GOLD_RABATT = 0.80;
    public static final double SILVER_RABATT = 0.90;
    public static final double EXPRESSTAX = 10.0;

    public enum CustomerType {
        GOLD,
        SILVER,
        NORMAL
    }

    public double calculatePrice(double basePrice, CustomerType customerType, boolean isExpress) {
         double price = switch (customerType){
            case GOLD -> basePrice * GOLD_RABATT;
            case SILVER -> basePrice * SILVER_RABATT;
            default -> basePrice;
        };

        if (isExpress) {
            price += EXPRESSTAX;
        }

        return price;
    }
}
