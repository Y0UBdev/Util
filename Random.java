package util;

public class Random {
	public static int Random(int min, int max) {
		return (int)(Math.random() * (1 + max - min)) + min;
	}
}