package ch03.check;

public class Number1 {

	public static void main(String[] args) {
		int x =10;
		int y = 20;
		int z = (++x) + (y--);
		// x=11 z=31 y=19
		System.out.println(z);
	}

}
