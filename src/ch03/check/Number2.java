package ch03.check;

public class Number2 {

	public static void main(String[] args) {
		int score = 85;
		String result = (!(score>90))?"가":"나";
		// 조건문 = false > !(조건문) = true > result = 가
		System.out.println(result);
	
	}

}
