package naver.insa8029.Control;

import java.util.Scanner;

public class ControlIf2 {

	public static void main(String[] args) {
		// if 구문
		// if Test2
		// 정수를 1개 입력받아서 입력받은 정수가 짝수이면 짝수, 그렇지 않으면 홀수라고 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오 : ");

		int num = 0;
		int count = 0;
		int odd = 0, even = 0;

		while (count < 9) {
			count++;
			
			num = sc.nextInt();
			
			// 짝수면 짝수!, 홀수면 홀수! 라고 출력
			if (num % 2 == 0) {
				System.out.println("짝수!");
				even++;
			} else {
				System.out.println("홀수!");
				odd++;
			}
			
			if(count == 9) {
				System.out.println("홀수 선택 횟수 : " + odd + " 짝수 선택 횟수 : " + even);
				if(odd < even) {
					System.out.println("짝수를 더 많이 선택 하셨습니다!");
				}else {
					System.out.println("홀수를 더 많이 선택 하셨습니다!");
				}
			}
		}
		// 입력 객체 닫기
		sc.close();
	}
}
