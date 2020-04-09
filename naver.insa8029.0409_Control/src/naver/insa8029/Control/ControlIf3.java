package naver.insa8029.Control;

import java.util.Scanner;

public class ControlIf3 {

	public static void main(String[] args) {
		// if else 구문
		// Test3
		// 아이디와 비밀번호를 입력받고, 아이디가 root이고, 비밀번호가 system이면 로그인 성공!
		// 그렇지 않으면 없는 아이디이거나 잘못된 비밀번호라고 출력하기
		Scanner sc = new Scanner(System.in);
		
		//id, pw 데이터
		final String id = "root";
		final String pw = "system";
		
		int maxLogin = 0;
		
		boolean accessCode = true;
		
		while(true) {
			System.out.print("ID : ");
			String inputId = sc.nextLine();
			System.out.print("PassWord : ");
			String inputPw = sc.nextLine();
			
			// 5회까지 반복하여 물어보고 성공시 시스템 메시지 출력
			// 로그인 연속 5회 실패시 재인증 메시지 출력
			if(!id.equals(inputId)) {
				maxLogin++;
				System.out.println("없는 아이디입니다!");
				System.out.println("로그인에 " + maxLogin + "번 실패하였습니다!");
			}else if(pw.equals(inputPw)){
				System.out.println("로그인 성공!");
				accessCode = true;
				break;
			}else{
				maxLogin++;
				System.out.println("잘못된 비밀번호입니다!");
				System.out.println("로그인에 " + maxLogin + "번 실패하였습니다!");
			}
			
			if(maxLogin >= 5) {
				accessCode = false;
				break;
			}
		}
		
		if(accessCode == true) {
			System.out.println("시스템 메뉴를 불러옵니다!");
		}else {
			System.out.println("로그인 원하시면 재인증하세요!");
		}
		
		sc.close();
	}
}
