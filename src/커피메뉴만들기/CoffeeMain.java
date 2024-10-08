package 커피메뉴만들기;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMain {
    static Map<String, MenuInfo> map = new HashMap<>();

    public static void main(String[] args) {
        makeMenu();
        selectMenu();
    }

    static void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 2000, "Coffee", "기본커피"));
        map.put("Espresso", new MenuInfo("Espresso", 2000, "Coffee", "진한커피"));
        map.put("Latte", new MenuInfo("Latte", 4000, "Coffee", "우유포함"));
    }

    static void selectMenu() {
        Scanner sc = new Scanner(System.in);
        String key;
        while (true) {
            System.out.println("메뉴를 선택하세요 : ");
            System.out.print("[1]메뉴보기 [2]메뉴조회 [3]메뉴추가 [4]메뉴삭제 [5]메뉴수정 [6]종료 : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("====== 메뉴 리스트 보기 ======");
                    // keySet() 반복 순회
                    for (String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).getName());
                        System.out.println("가격 : " + map.get(e).getPrice());
                        System.out.println("분류 : " + map.get(e).getCategory());
                        System.out.println("설명: " + map.get(e).getDesc());
                    }
                    break;
                case 2:
                    System.out.print("조회할 메뉴 이름 입력 : ");
                    key = sc.next();
                    // containsKey(키) 해당 키가 map내에 존재하는지 확인
                    if(map.containsKey(key)) {
                        System.out.println("메뉴 : " + map.get(key).getName());
                        System.out.println("가격 : " + map.get(key).getPrice());
                        System.out.println("분류 : " + map.get(key).getCategory());
                        System.out.println("설명: " + map.get(key).getDesc());
                    } else {
                        System.out.println("해당 메뉴가 존재하지 않습니다.");
                    }
                    break;
                    /*
                    for (String key2 : map.keySet()) {
                        if (key2.equals(name)) {
                            System.out.println(key2 + " : " + map.get(key2));
                            break;
                        } else {
                            System.out.println("해당 메뉴가 없습니다. 다시 입력하세요.");
                            break;
                        }
                    }*/
                case 3:
                    System.out.print("추가할 메뉴 입력 : ");
                    key = sc.next();
                    // containsKey(키) 확인 후 해당 메뉴가 없으면, put()
                    if(!map.containsKey(key)) {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String grp = sc.next();
                        System.out.print("설명 입력 : ");
                        String desc = sc.next();
                        map.put(key, new MenuInfo(key, price, grp, desc));
                    } else {
                        System.out.println("해당 메뉴가 이미 존재합니다.");
                    }
                    break;
                    /*
                    for (String key3 : map.keySet()) {
                        if (key3.equals(addname)) {
                            System.out.println("이미 해당 메뉴가 있습니다.");
                            break;
                        } else {
                            System.out.println("추가할 메뉴의 가격 입력 : ");
                            int price = sc.nextInt();
                            sc.nextLine();
                            System.out.println("추가할 메뉴의 카테고리 입력 : ");
                            String category = sc.nextLine();
                            System.out.println("추가할 메뉴의 상태 입력 : ");
                            String description = sc.nextLine();
                            map.put(addname, new MenuInfo(addname, price, category, description));
                        }
                    }*/
                case 4:
                    System.out.print("삭제할 메뉴 입력 : ");
                    key = sc.next();
                    // containsKey(키) 해당 키 존재 여부 확인하고 있으면, remove(key)
                    if(!map.containsKey(key)) {
                        map.remove(key);
                        System.out.println(key + " 메뉴를 삭제 하였습니다.");
                    } else {
                        System.out.println("삭제할 메뉴가 없습니다.");
                    }
                    break;
                    /*
                    for (String key4 : map.keySet()) {
                        if (key4.equals(delname)) {
                            map.remove(delname);
                            System.out.println("해당 메뉴가 삭제되었습니다.");
                        } else {
                            System.out.println("해당 메뉴가 존재하지 않습니다. 다시 입력하세요.");
                            break;
                        }
                    }*/
                case 5:
                    System.out.print("수정할 메뉴 입력 :");
                    key = sc.next();
                    // containsKey(키)로 키를 찾아서 값 변경 후 put()
                    if(map.containsKey(key)) {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String grp = sc.next();
                        System.out.print("설명 입력 : ");
                        String desc = sc.next();
                        map.put(key, new MenuInfo(key, price, grp, desc));
                    } else {
                        System.out.println("수정 할 메뉴가 없습니다.");
                    }
                    break;
                    /*
                    for (String key5 : map.keySet()) {
                        if (key5.equals(corname)) {
                            map.remove(corname);
                            System.out.println("변경할 메뉴의 가격 입력 : ");
                            int price = sc.nextInt();
                            sc.nextLine();
                            System.out.println("변경할 메뉴의 카테고리 입력 : ");
                            String category = sc.nextLine();
                            System.out.println("변경할 메뉴의 상태 입력 : ");
                            String description = sc.nextLine();
                            map.put(corname, new MenuInfo(corname, price, category, description));
                        } else {
                            System.out.println("해당 메뉴가 존재하지 않습니다. 다시 입력하세요.");
                            break;
                        }
                    }*/

                case 6:
                    System.out.println("메뉴를 종료 합니다.");
                    return;
                default:
                    System.out.println("선택된 메뉴가 없습니다.");
            }
        }
    }


}
