package com.ajit.rnd.shop;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.ajit.rnd.shop.util.OfferCalculation;
import com.ajit.rnd.shop.util.PrintingBill;
import com.ajit.rnd.shop.util.ProductEnum;

public class ShopApplication {
	
	public static void main(String[] args) {
		double cost = 0;
		Map<String, Integer> fruitMap = new HashMap<>();

		try (Scanner scanner = new Scanner(System.in)) {
			//Loop thru product
			for(ProductEnum product: ProductEnum.values()) {
				int count = readInt("How many "+product.getKey()+" ?", scanner);
				cost = cost + OfferCalculation.offerDetail(product.getKey(),count);
				fruitMap.put(product.getKey(), count);
			}
			
			//Print bill
			PrintingBill.printBill(fruitMap);
			
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}

	}
	
	private static int readInt(String msg, Scanner scanner) {
		int count = 0;
		System.out.print(msg);
        while (true) {
        	try {
                count = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Try again: ");
            }
        }
        return count;
	}
}
