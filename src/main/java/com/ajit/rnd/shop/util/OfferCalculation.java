package com.ajit.rnd.shop.util;

import java.util.HashMap;
import java.util.Map;

public class OfferCalculation {

	//public static Map<String, Double> prizeMap = new HashMap<>();
	public static Map<String, String> offerMap = new HashMap<>();
	
	static {
		/*prizeMap.put(ProductEnum.APPLE.getKey(), 0.20);
		prizeMap.put(ProductEnum.ORANGE.getKey(), 0.50);
		prizeMap.put(ProductEnum.WATERMELON.getKey(), 0.80);
		*/
		offerMap.put(ProductEnum.APPLE.getKey(), "Buy1Get1Free");
		offerMap.put(ProductEnum.ORANGE.getKey(), "");
		offerMap.put(ProductEnum.WATERMELON.getKey(), "Buy3For2");
	}
	
	
	public static double offerDetail(String fruit, int count) {
		double cost = 0;
		if(fruit.equals(ProductEnum.APPLE.getKey())) {
			//apple buy one get one free
			if(count % 2 == 0) {
				count = count / 2;
			}else {
				count = (count / 2)+1;
			}
		}else if(fruit.equals(ProductEnum.WATERMELON.getKey())) {
			//watermelon three for prize of two
			if(count % 3 == 0) {
				count = (count / 3) * 2;
			}else {
				count = ((count / 3) * 2)+(count % 3);
			}
		}
		cost = count * ProductEnum.get(fruit);
		return cost;
	}
}
