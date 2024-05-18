package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> shopMap = new HashMap<>();
        shopMap.put("Uniqlo", "3F-2");
        shopMap.put("DAISO", "2F-5");
        shopMap.put("McDonald’s", "1F-3");
        shopMap.put("Supermarket", "1F-1");

        System.out.println(shopMap.get("Uniqlo"));
        System.out.println(shopMap.get("DAISO"));
        System.out.println(shopMap.get("McDonald’s"));
        System.out.println(shopMap.get("Supermarket"));

        shopMap.remove("McDonald’s");
        System.out.println(shopMap.get("McDonald’s"));

        if (shopMap.containsKey("DAISO")) {
            System.out.println("There is a DAISO.");
        } else {
            System.out.println("No DAISO");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the shop name: ");
        String shopName = scanner.nextLine();
        try {
            if (shopMap.containsKey(shopName)) {
                System.out.println(shopMap.get(shopName));
            } else {
                throw new ShopNotFoundException("Shop not found.");
            }
        } catch (ShopNotFoundException e) {
            System.out.println("Not found.");
        }
    }
}
