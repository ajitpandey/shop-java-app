package com.ajit.rnd.shop.util;

import java.util.Map;
import java.util.Map.Entry;

public class PrintingBill {
	public static void printBill(Map<String, Integer> fruitMap) {
		double billCost = 0;
		double productCost = 0;
		System.out.println("Printing bill:");
		System.out.format("%32s%10s%10s%16s%16s", "Product", "Quantity", "Prize", "Offer","Cost");
		System.out.println("");
		
		for(Entry<String, Integer> e: fruitMap.entrySet()) {
			productCost = OfferCalculation.offerDetail(e.getKey(), e.getValue());
			System.out.format("%32s%10d%10s%16s%16s", e.getKey(), e.getValue(), ProductEnum.get(e.getKey()), OfferCalculation.offerMap.get(e.getKey()), productCost);
			System.out.println("");
			billCost = billCost + productCost;
		}
		System.out.println("Total Bill:"+ billCost);

	}
}
