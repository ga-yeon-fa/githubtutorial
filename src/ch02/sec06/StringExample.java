package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		// '\' 이스케이프 문자 ", ' \ 등의 문자를 쓸 때 앞에 추가
		// \+u16 진수 : 16진수 유니코드에 해당하는 문자 포함 
		// \t, \n. \r : tap 공간, new line, 캐리지 리턴
		
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업 ";
		System.out.println(str);
		
		System.out.println("나는 \n");
		System.out.println("자바를 \n");
		System.out.println("배웁니다.");
	}

}
