package naver.insa8029.Control;

import java.util.Scanner;

public class ControlIf2 {

	public static void main(String[] args) {
		// if ����
		// if Test2
		// ������ 1�� �Է¹޾Ƽ� �Է¹��� ������ ¦���̸� ¦��, �׷��� ������ Ȧ����� ���

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ� : ");

		int num = 0;
		int count = 0;
		int odd = 0, even = 0;

		while (count < 9) {
			count++;
			
			num = sc.nextInt();
			
			// ¦���� ¦��!, Ȧ���� Ȧ��! ��� ���
			if (num % 2 == 0) {
				System.out.println("¦��!");
				even++;
			} else {
				System.out.println("Ȧ��!");
				odd++;
			}
			
			if(count == 9) {
				System.out.println("Ȧ�� ���� Ƚ�� : " + odd + " ¦�� ���� Ƚ�� : " + even);
				if(odd < even) {
					System.out.println("¦���� �� ���� ���� �ϼ̽��ϴ�!");
				}else {
					System.out.println("Ȧ���� �� ���� ���� �ϼ̽��ϴ�!");
				}
			}
		}
		// �Է� ��ü �ݱ�
		sc.close();
	}
}
