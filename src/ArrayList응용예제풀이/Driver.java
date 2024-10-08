package ArrayList응용예제풀이;

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
                    System.out.print("제품 추가 : ");
                    String name = sc.nextLine();
                    System.out.print("제품 가격 : ");
                    BigDecimal price = sc.nextBigDecimal();
                    order.addItem(new Product(name, price));
                    System.out.print(name + "제품이 추가되었습니다.");
                    break;
                case 2:
                    System.out.print("삭제할 제품 입력 : ");
                    String remove = sc.nextLine();
                    if(order.removeItem(remove)){
                        System.out.print(remove + "제품이 제거되었습니다.");
                    } else{
                        System.out.print("해당 제품을 제거할 수 없습니다.");
                    }
                case 3:
                    System.out.println("===== 현재 제품 목록 =====");
                    for(Product e : order.getProducts()){
                        System.out.println(e.getName() + " : " + e.getPrice());
                    }
                    break;
                case 4:
                    System.out.println("===== 제품 보기 =====");
                    String find = sc.nextLine();
                    Product product = order.getItem(find);
                    System.out.println(product.getName() + " : " + product.getPrice());
                    break;
                case 5:
                    System.out.print("세율 입력 ( ex. 3 % = 0.03 으로 입력) : ");
                    BigDecimal taxRate = new BigDecimal(sc.nextLine());
                    BigDecimal finalPrice = order.calculateFinalPrice(taxRate);
                    System.out.println("세금 포함된 최종 가격 : " + finalPrice);
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.print("잘못된 입력입니다.");
            }
        }

    }
}
