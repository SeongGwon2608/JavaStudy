import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		//정수를 입력 받아서 돈을 넣고, 음료수를 구매하는 자판기 제작
		Scanner sc = new Scanner(System.in);
		
		int userMoney = 0;
		String tempMoney = "";
		String userChoice = "";
		
		final String cola = "1";
		final String cida = "2";
		final String pocali = "3";
		
		System.out.println("자판기의 판매를 시작합니다.");
		
		while(true) {
			System.out.println("=============================================");
			System.out.println("현재 보유금 : " + userMoney);
			System.out.println("돈을 넣으시겠습니까? (1.yes  2.no)");
			
			//예외처리를 위해 String 형으로 입력 받음
			userChoice = sc.nextLine();
			
			//입금 절차
			switch (userChoice) {
			case "1":
				System.out.println("입금할 액수를 선택하시오 : ");
				tempMoney = sc.nextLine();
				userMoney += Integer.parseInt(tempMoney);
				System.out.println("잔액 : " + userMoney);
				break;
			case "2":
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			
			System.out.println("구매할 음료를 선택하세요!(1.콜라 - 800원  2.사이다 - 600원  3.포카리스웨트 - 1000원) : ");
			userChoice = sc.nextLine();
			
			//잔액 부족
			if(userChoice.equals("1") && userMoney < 800 || userChoice.equals("2") && userMoney < 600 || userChoice.equals("3") && userMoney < 1000) {
				System.out.println("돈이 없다! 그만 집에 가라!");
				break;
			}
			
			//음료 구매
			switch (userChoice) {
			case cola:
				System.out.println("콜라를 구매합니다.");
				userMoney -= 800;
				System.out.println("잔액 : " + userMoney);
				break;
			case cida:
				System.out.println("사이다를 구매합니다.");
				userMoney -= 600;
				System.out.println("잔액 : " + userMoney);
				break;
			case pocali:
				System.out.println("포카리스웨트를 구매합니다.");
				userMoney -= 1000;
				System.out.println("잔액 : " + userMoney);
				break;
			default:
				System.out.println("잘못된 입력입니다!");
				break;
			}
		}
		sc.close();
	}
}
