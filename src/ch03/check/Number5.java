package ch03.check;

public class Number5 {

	public static void main(String[] args) {
		// 윗변 lengthTop, 아랫변 lengthBottom, 높이 height인 사다리꼴 넓이 구하기
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double)(lengthTop+lengthBottom)*height/2;
		System.out.println(area);

	}

}
