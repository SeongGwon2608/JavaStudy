
public class While {

	public static void main(String[] args) {

		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");

		System.out.println("======================");

		// 출발점
		int idx = 0;
		while (idx < 3) {
			System.out.println("Java");
			idx += 1;
		}
		System.out.println(idx);

		// Image1, Image2, Image3을 순서대로 출력 - while 이용
		String name = "Image";
		idx = 1;

		while (idx <= 3) {
			System.out.println(name + idx);
			idx += 1;
		}
		System.out.println("=====================");

		// Image2, Image4, Image6을 순서대로 출력 - while이용
		idx = 1;
		while (idx <= 3) {
			System.out.println(name + (idx * 2));
			idx += 1;
		}
		System.out.println("=====================");

		// 연습문제 1
		// image1.png, image2.png, image3.png, image4.png를 순서대로 출력하도록 while작성
		idx = 1;
		while (idx <= 4) {
			System.out.println(name + idx + ".png");
			idx += 1;
		}
		System.out.println("=====================");

		// 연습문제 2
		// image1.png, image2.png, image3.png, image4.png, image1.png,
		// image2.png, image3.png, image4.png를 순서대로 출력하도록 while작성
		// 단일 while
		System.out.println("연습문제 1");
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

		// 이중 while - 아주 안좋은 코드;;; 시간복잡도 n배 증가
		System.out.println("연습문제 2");
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

		//간편하고 보기 좋은 소스
		//%를 이용하여 결과 도출
		//더 길어져도 대처 가능
		System.out.println("연습문제 3");
		idx = 0;

		while (idx < 8) {
			System.out.println(name + (idx%4 +1) + ".png");
			idx += 1;
		}
		
		//한겨레 신문장서 고민정으로 검색한 결과 주소
		//0~9페이지까지의 주소를 반복문을 이용해서 출력해보시오
		idx = 0;
		while(idx <10) {
			System.out.println("http://search.hani.co.kr/Search?command=query&keyword="
					+ "%EA%B3%A0%EB%AF%BC%EC%A0%95&media=news&submedia=&sort"
					+ "=d&period=all&datefrom=2000.01.01&dateto=2020.04.10&pageseq=" + idx);
			idx += 1;
		}
		System.out.println("=====================");
		
		//image1.png, image2.png, image3.png 를 번갈아 가며 3번씩 출력
		idx = 0;
		while(idx< 9) {
			System.out.println(name + (idx%3 + 1) + ".png");
			idx += 1;
		}
		System.out.println("=====================");
		
		//Image1.png, Image3.png, Image5.png 를 번갈아 가면서 4번 출력
		idx = 0;
		while(idx < 12) {
			System.out.println(name + (idx%3 * 2 + 1) + ".png");
			idx += 1;
		}
		System.out.println("=====================");
		
		//Image3.png, Image2.png, Image1.png를 번갈아 가면서 4번 출력
		idx = 0;
		while(idx <12) {
			System.out.println(name + (4-(idx %3 +1)) + ".png");
			idx += 1;
		}
	}
}
