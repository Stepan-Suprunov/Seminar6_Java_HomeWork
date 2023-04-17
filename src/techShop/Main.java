// Домашнее задание к семинару №6 JAVA API Супрунов Степан

package techShop;

import java.util.*;

import static techShop.Brand.*;
import static techShop.Color.*;

public class Main {
    public static void main(String[] args) {
        Laptop apple = new Laptop(Brand.APPLE, Color.GRAY);
        Laptop hp = new Laptop(Brand.HP, Color.BLACK);
        Laptop lenovo = new Laptop(Brand.LENOVO, Color.WHITE);
        Laptop asus = new Laptop(Brand.ASUS, Color.BLUE);
        Laptop apple2 = new Laptop(Brand.APPLE, Color.WHITE);
        Laptop hp2 = new Laptop(Brand.HP, Color.GRAY);
        Laptop lenovo2 = new Laptop(Brand.LENOVO, Color.BLUE);
        Laptop asus2 = new Laptop(Brand.ASUS, Color.BLACK);
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(apple);
        laptops.add(hp);
        laptops.add(lenovo);
        laptops.add(asus);
        laptops.add(apple2);
        laptops.add(hp2);
        laptops.add(lenovo2);
        laptops.add(asus2);
        Map<Integer, Laptop> assortment = new HashMap<>();
        int count = 0;
        for (Laptop laptop : laptops) {
            assortment.put(count, laptop);
            count++;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую нужному критерию сортировки:\n1 - по бренду\n2 - по цвету");
        String sortSign = scanner.next();
        if (sortSign.equals("1")) {
            System.out.println("""
                    Введите цифру, соответствующую требуемому бренду:
                    1 - Apple
                    2 - HP
                    3 - Lenovo
                    4 - ASUS""");
            String brand = scanner.next();
            if (brand.equals("1")) {
                for (int i = 0; i < assortment.size(); i++) {
                    if (assortment.get(i).brand.equals(APPLE)) {
                        System.out.println(assortment.get(i));
                    }
                }
            } else if (brand.equals("2")) {
                for (int i = 0; i < assortment.size(); i++) {
                    if (assortment.get(i).brand.equals(HP)) {
                        System.out.println(assortment.get(i));
                    }
                }
            } else if (brand.equals("3")) {
                for (int i = 0; i < assortment.size(); i++) {
                    if (assortment.get(i).brand.equals(LENOVO)) {
                        System.out.println(assortment.get(i));
                    }
                }
            } else if (brand.equals("4")) {
                for (int i = 0; i < assortment.size(); i++) {
                    if (assortment.get(i).brand.equals(ASUS)) {
                        System.out.println(assortment.get(i));
                    }
                }
            } else {
                System.out.println("ОШИБКА ВВОДА!");
            }
        } else if (sortSign.equals("2")) {
            System.out.println("""
                    Введите цифру,соответствующую требуемому цвету:
                    1 - Grey
                    2 - Black
                    3 - White
                    4 - Blue""");
            String color = scanner.next();
            if (color.equals("1")) {
                for (int i = 0; i < assortment.size(); i++) {
                    if (assortment.get(i).color.equals(GRAY)) {
                        System.out.println(assortment.get(i));
                    }
                }
            } else if (color.equals("2")) {
                for (int i = 0; i < assortment.size(); i++) {
                    if (assortment.get(i).color.equals(BLACK)) {
                        System.out.println(assortment.get(i));
                    }
                }
            } else if (color.equals("3")) {
                for (int i = 0; i < assortment.size(); i++) {
                    if (assortment.get(i).color.equals(WHITE)) {
                        System.out.println(assortment.get(i));
                    }
                }
            } else if (color.equals("4")) {
                for (int i = 0; i < assortment.size(); i++) {
                    if (assortment.get(i).color.equals(BLUE)) {
                        System.out.println(assortment.get(i));
                    }
                }
            } else {
                System.out.println("ОШИБКА ВВОДА!");
            }
        } else {
            System.out.println("ОШИБКА ВВОДА!");
        }
    }
}
