package ch03;

public class Oper02 {

	public static void main(String[] args) {
		// 대입(할당)연산자 = 
		// 션수이름 = 데이터;
		
		 
		//복합대입연산자
		int a = 10;
		a = a + 10;
		System.out.println("a : "+a);
		a +=10; //a안의 데이터를 10 증가 시켜라.
		System.out.println("a : "+a);
		a -=10; //a안의 데이터를 10 감소 시켜라.
		System.out.println("a : "+a);
		a *=10;
		System.out.println("a : "+a);
		a /=10;
		System.out.println("a : "+a);
		a %=3;
		System.out.println("a : "+a);
	}

}
