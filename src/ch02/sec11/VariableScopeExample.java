package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 0;				//원래는 없는 부분
		if(v1>10)
			v2 = v1 -10;		//원래는 v2에 int 선언
		int v3 = v1+v2+5;		//v2 변수를 사용할 수 없기 때문에 컴파일 여러 발생
	}

}
