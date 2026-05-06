package io.training.jinterviews;

public class ProductPrice {

    public static final double EXPRESSTAX = 10.0;

    public enum CustomerType {
        GOLD(0.8),
        SILVER(0.9),
        NORMAL(1.0);

        private final double discount;

        CustomerType(double discount) {
            this.discount = discount;
        }

        public double discount() {
            return discount;
        }

    }

    public double calculatePrice(double basePrice, CustomerType customerType, boolean isExpress) {
        double price = basePrice * customerType.discount();

        if (isExpress) {
            price += EXPRESSTAX;
        }

        return price;
    }
}
