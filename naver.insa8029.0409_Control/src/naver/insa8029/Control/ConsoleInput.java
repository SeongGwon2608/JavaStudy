package naver.insa8029.Control;

public class ConsoleInput {

	public static void main(String[] args) {
		//Ű���� �Է� ��ü �����
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//�̸��� ���� �Է� �ޱ�(����->���ڽ� ���� �߻��Ҽ� ����)
		System.out.println("���� �Է� : ");
		int score = sc.nextInt();					//���ڸ� �о���Ƿ� ����Ű�� ���ۿ� ���� -> ������ ���� ������ �ٷ� �о�帲(���۸� �������)
		sc.nextLine();
		System.out.println("�̸� �Է� : ");
		String name = sc.nextLine();				//���ڿ� ����Ű���� �о��

		System.out.println("�̸� : " + name);
		System.out.println("���� : " + score);
		//������� - ��������
		sc.close();
	}
}
