package ch04.sec02;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		if(score>=90) {
			System.out.println("점수가 90점보다 큽니다.");
			System.out.println("등습은 A 입니다.");
		}
		if(score<90) 
			System.out.println("점수가 90점보다 작습니다.");
		System.out.println("등습은 B 입니다."); // if문 밖에 있으므로 조건과 상관 없이 항상 출력 

	}

}
