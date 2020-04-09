package naver.insa8029.Control;

import java.util.Scanner;

public class ControlIf4 {

	public static void main(String[] args) {
		// if ~ else if ~ else 구문
		// Test 4
		// 점수를 입력 받아서 80 ~100 이면 우수, 60~79 이면 보통, 0~59 이면 노력, 나머지는 잘못된 점수 입력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오(0~100) : ");
		int score = sc.nextInt();
		
		if(score <= 100 && score >= 80) {
			System.out.println("우수!");
		}else if(score < 80 && score >= 60) {
			System.out.println("보통!");
		}else if(score < 60 && score >= 0) {
			System.out.println("노력!");
		}else {
			System.out.println("잘못된 값을 입력하였습니다!");
		}
		
		sc.close();
	}

}
