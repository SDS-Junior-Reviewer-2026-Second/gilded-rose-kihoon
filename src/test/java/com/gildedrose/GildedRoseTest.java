package com.gildedrose;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {

	public static final String NONAME = "noname";
	public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

	@Test
	public void GildedRoseTest(){
		Item[] items = new Item[]{};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(0, items.length);
	}

	@Test
	public void noname_sellin_0_quality_0 (){
		Item[] items = new Item[]{new Item(NONAME, 0, 0)};
		GildedRose gildedRose = new GildedRose(items);

		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}
	@Test
	public void sulfuras_sellin_0_quality_80 (){
		Item[] items = new Item[]{new Item(SULFURAS, 0, 80)};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(0, items[0].sellIn);
		assertEquals(80, items[0].quality);
	}



}
