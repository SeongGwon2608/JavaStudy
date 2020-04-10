
public class While {

	public static void main(String[] args) {

		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");

		System.out.println("======================");

		// �����
		int idx = 0;
		while (idx < 3) {
			System.out.println("Java");
			idx += 1;
		}
		System.out.println(idx);

		// Image1, Image2, Image3�� ������� ��� - while �̿�
		String name = "Image";
		idx = 1;

		while (idx <= 3) {
			System.out.println(name + idx);
			idx += 1;
		}
		System.out.println("=====================");

		// Image2, Image4, Image6�� ������� ��� - while�̿�
		idx = 1;
		while (idx <= 3) {
			System.out.println(name + (idx * 2));
			idx += 1;
		}
		System.out.println("=====================");

		// �������� 1
		// image1.png, image2.png, image3.png, image4.png�� ������� ����ϵ��� while�ۼ�
		idx = 1;
		while (idx <= 4) {
			System.out.println(name + idx + ".png");
			idx += 1;
		}
		System.out.println("=====================");

		// �������� 2
		// image1.png, image2.png, image3.png, image4.png, image1.png,
		// image2.png, image3.png, image4.png�� ������� ����ϵ��� while�ۼ�
		// ���� while
		System.out.println("�������� 1");
		idx = 1;
		while (idx <= 4) {
			System.out.println(name + idx + ".png");
			idx += 1;
		}
		idx += 1;
		while (idx <= 4) {
			System.out.println(name + idx + ".png");
			idx += 1;
		}
		System.out.println("=====================");

		// ���� while - ���� ������ �ڵ�;;; �ð����⵵ n�� ����
		System.out.println("�������� 2");
		idx = 1;
		int idx2 = 1;

		while (idx2 <= 2) {
			while (idx <= 4) {
				System.out.println(name + idx + ".png");
				idx += 1;
			}
			idx = 1;
			idx2 += 1;
		}
		System.out.println("=====================");

		//�����ϰ� ���� ���� �ҽ�
		//%�� �̿��Ͽ� ��� ����
		//�� ������� ��ó ����
		System.out.println("�������� 3");
		idx = 0;

		while (idx < 8) {
			System.out.println(name + (idx%4 +1) + ".png");
			idx += 1;
		}
		
		//�Ѱܷ� �Ź��弭 ��������� �˻��� ��� �ּ�
		//0~9������������ �ּҸ� �ݺ����� �̿��ؼ� ����غ��ÿ�
		idx = 0;
		while(idx <10) {
			System.out.println("http://search.hani.co.kr/Search?command=query&keyword="
					+ "%EA%B3%A0%EB%AF%BC%EC%A0%95&media=news&submedia=&sort"
					+ "=d&period=all&datefrom=2000.01.01&dateto=2020.04.10&pageseq=" + idx);
			idx += 1;
		}
		System.out.println("=====================");
		
		//image1.png, image2.png, image3.png �� ������ ���� 3���� ���
		idx = 0;
		while(idx< 9) {
			System.out.println(name + (idx%3 + 1) + ".png");
			idx += 1;
		}
		System.out.println("=====================");
		
		//Image1.png, Image3.png, Image5.png �� ������ ���鼭 4�� ���
		idx = 0;
		while(idx < 12) {
			System.out.println(name + (idx%3 * 2 + 1) + ".png");
			idx += 1;
		}
		System.out.println("=====================");
		
		//Image3.png, Image2.png, Image1.png�� ������ ���鼭 4�� ���
		idx = 0;
		while(idx <12) {
			System.out.println(name + (4-(idx %3 +1)) + ".png");
			idx += 1;
			//idxwfwfwfwfawf
		}
	}
}
