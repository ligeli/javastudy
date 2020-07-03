package ch04;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		//점수를 입력 받아서 총점과 평균을 구하는 프로그램을 만들어보자.
		int kor=0,eng=0,math=0,soc=0,sic=0;
		int total = 0;
		double avg = 0.0;

		boolean run = true; //프로그램 종료
		Scanner scan = new Scanner(System.in);
		while(run) {//반복문이 끝나는 조건? 메뉴의 3번 선택 => run이 false로 바뀌면서 빠져나감.
			//메뉴
			System.out.println("┌─성적 프로그램────┐");
			System.out.println("│  1.성적입력         │ ");
			System.out.println("│  2.성적출력         │");
			System.out.println("│  3.프로그램 종료  │");
			System.out.println("└─────────────┘");
			System.out.println("선택>");
			int selNum = scan.nextInt();

			switch(selNum) {
			case 1 : 
				//성적 입력
				System.out.print("국어 점수를 입력하세요>");
				kor = scan.nextInt();
				System.out.print("영어 점수를 입력하세요>");
				eng = scan.nextInt();
				System.out.print("수학 점수를 입력하세요>");
				math = scan.nextInt();
				System.out.print("사회 점수를 입력하세요>");
				soc = scan.nextInt();
				System.out.print("과학 점수를 입력하세요>");
				sic = scan.nextInt();
				break;
			case 2 : 
				//성적 출력
				total = kor+eng+math+soc+sic;
				avg = total/5.0;
				System.out.println("국어점수 : "+kor);
				System.out.println("영어점수 : "+eng);
				System.out.println("수학점수 : "+math);
				System.out.println("사회점수 : "+soc);
				System.out.println("과학점수 : "+sic);
				System.out.println("총점점수 : "+total);
				System.out.println("평균점수 : "+avg);
				break;
			case 3 : //프로그램 종료
				System.out.println("프로그램을 종료합니다");
				run = false;
				break;
			default :
				System.out.println("잘못선택하셨습니다");
				System.out.println("1~3번중 선택해주세요.");
			}
		}








	}

}
