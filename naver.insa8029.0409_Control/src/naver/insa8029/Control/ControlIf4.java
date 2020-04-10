package naver.insa8029.Control;
//Test
import java.util.Scanner;

public class ControlIf4 {

	public static void main(String[] args) {
		// if ~ else if ~ else ����
		// Test 4
		// ������ �Է� �޾Ƽ� 80 ~100 �̸� ���, 60~79 �̸� ����, 0~59 �̸� ���, �������� �߸��� ���� �Է�
		
		//push Test
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�(0~100) : ");
		int score = sc.nextInt();
		
		if(score <= 100 && score >= 80) {
			System.out.println("���!");
		}else if(score < 80 && score >= 60) {
			System.out.println("����!");
		}else if(score < 60 && score >= 0) {
			System.out.println("���!");
		}else {
			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�!");
		}
		
		sc.close();
	}

}
