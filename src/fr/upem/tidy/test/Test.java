package fr.upem.tidy.test;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

import fr.upem.tidy.Accessory;
import fr.upem.tidy.ClothingItem;
import fr.upem.tidy.Dresser;
import fr.upem.tidy.Item;
import fr.upem.tidy.Material;
import fr.upem.tidy.Size;

public class Test {

	private static long numberOfItemOfMaterial(List<Item> list, Material silk) {
		return list.stream().filter((i) -> i.getMaterial() == silk).count();
	}

	public static Predicate<Item> isSLik() {
		return p -> p.getMaterial() == Material.SILK;
	}

	public static Predicate<Item> checkTTL() {
		return p -> p.timeToLive() <= 1000;
	}

	private static long numberOfItemFilteredFrom(List<Item> list, Predicate<Item> predicate) {
		return list.stream().filter((i) -> predicate.test(i)).count();
	}

	public static void main(String[] args) {
		ClothingItem whiteShirt = new ClothingItem("chemise blanche", Size.XL, Material.SILK, 700);
		ClothingItem stripedSocks = new ClothingItem("chaussettes rayées", Size.M, Material.SYNTHETIC, 500);
		ClothingItem blueTrousers = new ClothingItem("Jeans bleu", Size.XXL, Material.COTTON);

		System.out.println(whiteShirt.getName());
		// chemise blanche

		System.out.println(stripedSocks.getSize());
		// M

		System.out.println(blueTrousers.getMaterial());
		// COTTON

		System.out.println(blueTrousers.timeToLive());
		// 1000

		System.out.println(blueTrousers);
		// [VETEMENT] - XXL - Jeans bleu (COTTON) - {1000}

		Item i1 = whiteShirt;
		System.out.println(i1.getName());
		// chemise blanche

		Item i2 = stripedSocks;
		System.out.println(i2.getMaterial());
		// SYNTHETIC

		Item i3 = blueTrousers;
		System.out.println(i3.timeToLive());
		// 1000

		Accessory tie = new Accessory(" cravate à pois", false, Material.SILK, 2000);
		Accessory belt = new Accessory("ceinture en croco", true, Material.LEATHER);

		System.out.println(tie.isUseful());
		// false

		Item i4 = tie;
		System.out.println(i4);
		// [ACCESSOIRE] - inutile - cravate à pois (SILK) - {2000}

		Item i5 = belt;
		System.out.println(i5);
		// [ACCESSOIRE] - utile - ceinture en croco (LEATHER) - {1000}

		List<Item> list = new LinkedList<>();
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		list.add(i5);

		System.out.println(numberOfItemOfMaterial(list, Material.SILK));

		System.out.println(list.contains(i3));
		// true

		System.out.println(list.contains(new ClothingItem("Jeans bleu", Size.XXL, Material.COTTON)));
		// true

		System.out.println(list);
		// [[VETEMENT] - XL - chemise blanche (SILK) - {700},
		// [VETEMENT] - M - chaussettes rayées (SYNTHETIC) - {500},
		// [VETEMENT] - XXL - Jeans bleu (COTTON) - {1000},
		// [ACCESSOIRE] - inutile - cravate à pois (SILK) - {2000},
		// [ACCESSOIRE] - utile - ceinture en croco (LEATHER) - {1000}]

		list.sort((a, b) -> a.timeToLive() - b.timeToLive());

		System.out.println(list);
		// [[VETEMENT] - M - chaussettes rayées (SYNTHETIC) - {500},
		// [VETEMENT] - XL - chemise blanche (SILK) - {700},
		// [VETEMENT] - XXL - Jeans bleu (COTTON) - {1000},
		// [ACCESSOIRE] - utile - ceinture en croco (LEATHER) - {1000},
		// [ACCESSOIRE] - inutile - cravate à pois (SILK) - {2000}]

		System.out.println(numberOfItemFilteredFrom(list, (p) -> p.getMaterial() == Material.SILK));
		// 2

		System.out.println(numberOfItemFilteredFrom(list, (p) -> p.timeToLive() <= 1000));
		// 4

		Dresser d = new Dresser(10);
		d.store(2, i2); // (stripedSocks)
		d.store(4, i4); // (tie)
		d.store(5, i5); // (belt)

		 System.out.println(d.remove(4));
		// [ACCESSOIRE] - inutile - cravate à pois (SILK) - {2000}

		System.out.println(d.remove("chaussettes rayées"));
		// [VETEMENT] - M - chaussettes rayées (SYNTHETIC) - {500}

		System.out.println(d.remove(" cravate à pois"));
		// null
	}
}
