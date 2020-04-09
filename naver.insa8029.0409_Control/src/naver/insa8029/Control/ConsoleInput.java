package naver.insa8029.Control;

public class ConsoleInput {

	public static void main(String[] args) {
		//키보드 입력 객체 만들기
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//이름과 정수 입력 받기(숫자->문자시 문제 발생할수 있음)
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();					//숫자만 읽어오므로 엔터키가 버퍼에 남음 -> 다음에 버퍼 내용을 바로 읽어드림(버퍼를 비워야함)
		sc.nextLine();
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();				//문자와 엔터키까지 읽어옴

		System.out.println("이름 : " + name);
		System.out.println("점수 : " + score);
		//사용종료 - 연결해제
		sc.close();
	}
}
