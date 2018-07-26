package com.ajit.rnd.shop;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.ajit.rnd.shop.util.OfferCalculation;
import com.ajit.rnd.shop.util.PrintingBill;
import com.ajit.rnd.shop.util.ProductEnum;

public class ShopApplicationTests {

	@Test
	public void testPrintingBill() {
		Map<String, Integer> fruitMap = new HashMap<>();
		fruitMap.put(ProductEnum.APPLE.getKey(), 4);
		fruitMap.put(ProductEnum.ORANGE.getKey(), 3);
		fruitMap.put(ProductEnum.WATERMELON.getKey(), 5);
		PrintingBill.printBill(fruitMap);
	}
	
	@Test
	public void testOfferCalculation() {
		assertEquals((int)0.4, (int)OfferCalculation.offerDetail(ProductEnum.APPLE.getKey(), 4));
		assertEquals((int)1.5, (int)OfferCalculation.offerDetail(ProductEnum.ORANGE.getKey(), 3));
		assertEquals((int)3.2, (int)OfferCalculation.offerDetail(ProductEnum.WATERMELON.getKey(), 5));
	}

}
