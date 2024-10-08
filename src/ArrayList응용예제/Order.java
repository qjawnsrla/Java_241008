package ArrayList응용예제;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Order {
    ArrayList<Product> products;
    BigDecimal total;

    public Order(){
        this.products=new ArrayList<>();
        this.total=new BigDecimal(0);
    }

    public void addItem(Product product){
        products.add(product);
        total=total.add(product.getPrice());
    }

    public Product getItem(String name){
        for(Product product:products){
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    public boolean removeItem(String name){
        for(Product product:products){
            if(product.getName().equals(name)){
                products.remove(product);
                total=total.subtract(product.getPrice());
                return true;
            }
        }
        return false;
    }

    public BigDecimal calculateFinalPrice(BigDecimal i){
        total = total.add(total.multiply(i));
        return total;
    }
}
