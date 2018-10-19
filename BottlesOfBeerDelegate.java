
public class BottlesOfBeerDelegate {

	public void determineBottlesOfBeerLeft(int qty) {

		int bottle = 99;

		System.out.println(bottle + " bottles of beer on the wall. " + bottle
				+ " bottles of beer. Take one down and pass it around " + (bottle - 1)
				+ " bottles of beer on the wall.\n");

		while (bottle >= 1) {
			System.out.println(bottle + " bottles of beer on the wall. " + bottle
					+ " bottles of beer. Take one down and pass it around " + (bottle - 1)
					+ " bottles of beer on the wall.\n");
			bottle = bottle - 1;

			if (bottle == 1) {
				System.out.println(bottle + " bottles of beer on the wall. " + bottle
						+ " bottles of beer. Take one down and pass it around. No more bottles of beer on the wall.\n");
			} else

			if (bottle == 0)
				System.out.println(
						"No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall.");
		}

	}

}
