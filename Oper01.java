package ch03;

public class Oper01 {

	public static void main(String[] args) {
		// 산술연산
		int a = 10;
		int b = 3;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(((double)a)/b)); //실수를 보고싶으면 double을 붙임
		System.out.println("a%b="+(a%b)); //나머지 연산자. 10을 3으로 나누면 1이 남는다.
		
		//단항 연산
		int c = 5;
		System.out.println("+c = "+(+c));
		System.out.println("-c = "+(-c));
		//++(1증가), --(1감소)
		int d = 7;
		System.out.println("d++ ="+d++);
		System.out.println("d-- ="+d--);
		//   d = 10;
		//   d++(선처리 후증가), ++d (선증가 후처리)
		
		int e = 10;
		System.out.println("e++ : "+(e++));
		System.out.println("e++ : "+(e++));
		System.out.println("e : "+e);
 
		e = 10;
		System.out.println("++e : "+(++e));
		System.out.println("++e : "+(++e));
		System.out.println("e : "+e);

		e=10;
		e++;
		System.out.println("e : "+e);
		
		e=10;
		++e;
		System.out.println("e : "+e);
		
		int f = 10;
		int g = 20;
		int result = f++ * ++g;
		// 1.         10    21
		// 2.    210
		// 3.         11     21
	    System.out.println("f : "+f);            // f : 11
	    System.out.println("g : "+g);            // g : 21
	    System.out.println("result : "+result);  // result : 210

	    f = 10;
		g = 20;
		result = f-- * --g;
		// 1.         10     19
		// 2. 190   
		// 3.         9      19    
	    System.out.println("f : "+f);            // f : 9
	    System.out.println("g : "+g);            // g : 19
	    System.out.println("result : "+result);  // result : 190
	}

}
