package naver.insa8029.Control;

import java.util.Scanner;

public class ControlIf {

	public static void main(String[] args) {
		// if Test
		// 점수를 입력받아서 60점 이상이면 합격이라고 출력한후, 종료라고 출력
		// 그렇지 않은 경우는 종료라고만 출력
		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하시오 : ");
		int score = sc.nextInt();

		// score가 60이상인지 확인
		if (60 <= score) {
			System.out.println("합격");
		}

		System.out.println("종료");

		// Scanner의 사용이 끝났으므로 해제
		sc.close();
		
	}
}
