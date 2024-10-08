package ArrayList응용예제;

import java.math.BigDecimal;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        while (true) {
            System.out.println("\n==== 주문 관리 시스템 ====");
            System.out.println("1. 제품 추가");
            System.out.println("2. 제품 제거");
            System.out.println("3. 제품 목록 보기");
            System.out.println("4. 제품 보기");
            System.out.println("5. 최종 가격 계산 (세금 포함)");
            System.out.println("6. 종료");
            System.out.print("원하는 작업을 선택하세요: ");
            int choice = sc.nextInt();
            sc.nextLine();  // 버퍼 비우기

            switch (choice) {
                case 1:
                    String name;
                    BigDecimal price;
                    System.out.println("추가할 제품 이름 입력 : ");
                    name = sc.nextLine();
                    System.out.println("추가할 제품 가격 입력 : ");
                    price = sc.nextBigDecimal();
                    Product product = new Product(name, price);
                    order.addItem(product);
                    System.out.println("제품이 추가되었습니다.");
                    break;
                case 2:
                    String name2;
                    System.out.println("제거할 제품 이름 입력 : ");
                    name2 = sc.nextLine();
                    order.removeItem(name2);
                    System.out.println("제품이 삭제되었습니다.");
                    break;
                case 3:
                    for (Product product1 : order.products) {
                        System.out.println(product1.name + " " + product1.price);
                    }
                    break;
                case 4:
                    for (Product product2 : order.products) {
                        System.out.println(product2.name);
                    }
                    break;
                case 5:
                    BigDecimal tax;
                    System.out.println("세율 입력 : ");
                    tax = sc.nextBigDecimal();
                    System.out.println("세금 포함한 최종 가격은 : " + order.calculateFinalPrice(tax).setScale(2, BigDecimal.ROUND_HALF_UP));
                    break;
                case 6:
                    System.out.println("프로그램 종료");
                    System.exit(0);
                    break;
            }
        }
    }
}
