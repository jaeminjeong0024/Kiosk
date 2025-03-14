package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("0. 종료      | 종료");

        List<MenuItem> menuItems = new ArrayList<>();

        MenuItem menuItem1 = new MenuItem(" ShackBurger"," W 6.9,토마토"," 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem menuItem2 = new MenuItem(" SmokeShack"," W 8.9,베이컨", "체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem menuItem3 = new MenuItem(" Cheeseburger","  W 6.9", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem menuItem4 = new MenuItem(" Hamburger", "W 5.4", "비프패티를 기반으로 야채가 들어간 기본버거");

        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);
        menuItems.add(menuItem4);

        Scanner scanner = new Scanner(System.in);



        while (true) {
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("프로그램 종료");
                break;
            } else if (choice == 1){
                System.out.println("메뉴명: " + menuItem1.menuName + " | 가격: " + menuItem1.price + " | 설명: " + menuItem1.explanation);
            } else if (choice == 2) {
                System.out.println("메뉴명: " + menuItem2.menuName + " | 가격: " + menuItem2.price + " | 설명: " + menuItem2.explanation);
            } else if (choice == 3) {
                System.out.println("메뉴명: " + menuItem3.menuName + " | 가격: " + menuItem3.price + " | 설명: " + menuItem3.explanation);
            } else if (choice == 4) {
                System.out.println("메뉴명: " + menuItem4.menuName + " | 가격: " + menuItem4.price + " | 설명: " + menuItem4.explanation);
            }
        }
    }
}



