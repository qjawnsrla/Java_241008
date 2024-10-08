package 커피메뉴만들기;

public class MenuInfo {
    private String name;
    private int price;
    private String category;
    private String desc;    // 상세설명

    public MenuInfo(String name, int price, String category, String desc) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getDesc() {
        return desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
