package 커피메뉴만들기;

import java.util.HashMap;
import java.util.Map;

public class CoffeeMain {
    static Map<String, MenuInfo> map = new HashMap<>();
    public static void main(String[] args) {

    }

    static void makeMenu(){
        map.put("Americano", new MenuInfo("Americano",2000,"Coffee", "기본커피"));
        map.put("Espresso", new MenuInfo("Espresso",2000,"Coffee", "진한커피"));
        map.put("Latte", new MenuInfo("Latte",4000,"Coffee", "우유포함"));
    }

}
