import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		//������ �Է� �޾Ƽ� ���� �ְ�, ������� �����ϴ� ���Ǳ� ����
		Scanner sc = new Scanner(System.in);
		
		int userMoney = 0;
		String tempMoney = "";
		String userChoice = "";
		
		final String cola = "1";
		final String cida = "2";
		final String pocali = "3";
		
		System.out.println("���Ǳ��� �ǸŸ� �����մϴ�.");
		
		while(true) {
			System.out.println("=============================================");
			System.out.println("���� ������ : " + userMoney);
			System.out.println("���� �����ðڽ��ϱ�? (1.yes  2.no)");
			
			//����ó���� ���� String ������ �Է� ����
			userChoice = sc.nextLine();
			
			//�Ա� ����
			switch (userChoice) {
			case "1":
				System.out.println("�Ա��� �׼��� �����Ͻÿ� : ");
				tempMoney = sc.nextLine();
				userMoney += Integer.parseInt(tempMoney);
				System.out.println("�ܾ� : " + userMoney);
				break;
			case "2":
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
			
			System.out.println("������ ���Ḧ �����ϼ���!(1.�ݶ� - 800��  2.���̴� - 600��  3.��ī������Ʈ - 1000��) : ");
			userChoice = sc.nextLine();
			
			//�ܾ� ����
			if(userChoice.equals("1") && userMoney < 800 || userChoice.equals("2") && userMoney < 600 || userChoice.equals("3") && userMoney < 1000) {
				System.out.println("���� ����! �׸� ���� ����!");
				break;
			}
			
			//���� ����
			switch (userChoice) {
			case cola:
				System.out.println("�ݶ� �����մϴ�.");
				userMoney -= 800;
				System.out.println("�ܾ� : " + userMoney);
				break;
			case cida:
				System.out.println("���̴ٸ� �����մϴ�.");
				userMoney -= 600;
				System.out.println("�ܾ� : " + userMoney);
				break;
			case pocali:
				System.out.println("��ī������Ʈ�� �����մϴ�.");
				userMoney -= 1000;
				System.out.println("�ܾ� : " + userMoney);
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�!");
				break;
			}
		}
		sc.close();
	}
}
