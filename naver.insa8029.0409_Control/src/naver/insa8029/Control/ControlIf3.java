package naver.insa8029.Control;

import java.util.Scanner;

public class ControlIf3 {

	public static void main(String[] args) {
		// if else ����
		// Test3
		// ���̵�� ��й�ȣ�� �Է¹ް�, ���̵� root�̰�, ��й�ȣ�� system�̸� �α��� ����!
		// �׷��� ������ ���� ���̵��̰ų� �߸��� ��й�ȣ��� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		//id, pw ������
		final String id = "root";
		final String pw = "system";
		
		int maxLogin = 0;
		
		boolean accessCode = true;
		
		while(true) {
			System.out.print("ID : ");
			String inputId = sc.nextLine();
			System.out.print("PassWord : ");
			String inputPw = sc.nextLine();
			
			// 5ȸ���� �ݺ��Ͽ� ����� ������ �ý��� �޽��� ���
			// �α��� ���� 5ȸ ���н� ������ �޽��� ���
			if(!id.equals(inputId)) {
				maxLogin++;
				System.out.println("���� ���̵��Դϴ�!");
				System.out.println("�α��ο� " + maxLogin + "�� �����Ͽ����ϴ�!");
			}else if(pw.equals(inputPw)){
				System.out.println("�α��� ����!");
				accessCode = true;
				break;
			}else{
				maxLogin++;
				System.out.println("�߸��� ��й�ȣ�Դϴ�!");
				System.out.println("�α��ο� " + maxLogin + "�� �����Ͽ����ϴ�!");
			}
			
			if(maxLogin >= 5) {
				accessCode = false;
				break;
			}
		}
		
		if(accessCode == true) {
			System.out.println("�ý��� �޴��� �ҷ��ɴϴ�!");
		}else {
			System.out.println("�α��� ���Ͻø� �������ϼ���!");
		}
		
		sc.close();
	}
}
