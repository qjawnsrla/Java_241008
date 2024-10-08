package ArrayList응용예제풀이;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Order {
    private ArrayList<Product> products = null;
    private BigDecimal total;

    public Order() {
        this.products = new ArrayList<>();
        this.total = BigDecimal.ZERO;
    }

    public void addItem(Product product) {
        products.add(product);
        total = total.add(product.getPrice());
    }

    public Product getItem(String name) {
        for (Product e : products) {
            if (e.getName().equals(name)) {
                return e;
            }
        }
        return null;
    }

    public boolean removeItem(String name) {
        for (Product e : products) {
            if (e.getName().equals(name)) {
                products.remove(e);     // 해당 요소를 삭제
                total = total.subtract(e.getPrice());
                return true;
            }
        }
        return false;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public BigDecimal calculateFinalPrice(BigDecimal taxRate) {
        // 주문금액에 세금을 곱해서 세액을 만들어
        BigDecimal taxAmount = total.multiply(taxRate);
        BigDecimal finalPrice = total.add(taxAmount);
        return finalPrice.setScale(2, RoundingMode.HALF_UP);
    }
}
