package io.training.jinterviews;

import org.junit.jupiter.api.Test;

import static io.training.jinterviews.ProductPrice.CustomerType.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductPriceTest {
    ProductPrice productPrice = new ProductPrice();

    @Test
    public void testCalculatePrice() throws Exception {
        assertEquals(80.0, productPrice.calculatePrice(100.0, GOLD, false));

        assertEquals(90.0, productPrice.calculatePrice(100.0, GOLD, true));

        assertEquals(90.0, productPrice.calculatePrice(100.0, SILVER, false));

        assertEquals(100.0, productPrice.calculatePrice(100.0, SILVER, true));

        assertEquals(100.0, productPrice.calculatePrice(100.0, NORMAL, false));

        assertEquals(110.0, productPrice.calculatePrice(100.0, NORMAL, true));
    }
}
