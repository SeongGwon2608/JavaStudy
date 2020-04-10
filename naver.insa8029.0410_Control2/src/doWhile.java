
public class doWhile {

	public static void main(String[] args) {
		// 연습 1부터 10까지의 합계
		int idx = 1;
		int sum = 0;

		do {
			sum += idx;
			idx += 1;
		} while (idx < 11);

		System.out.println("문제 1 - 1부터 10까지의 합계");
		System.out.println("합계 : " + sum);
		System.out.println("=======================================");

		// 연습2
		// 아래 배열의 합계와 평균을 소수 2째자리에서 반올림해서 소수 1째 자리까지 출력하시오
		System.out.println("문제 2 - 아래 배열의 합계와 평균을 소수 2째 자리에서 반올림하여 소수 1째 자리까지 출력하시오");
		int[] ar = { 30, 40, 20, 17, 76, 65, 97, 233, 242, 1, 4, 77 };
		idx = 0;
		sum = 0;

		do {
			sum += ar[idx];
			idx += 1;
		} while (idx < ar.length);

		System.out.println("합계 : " + sum);

		// 나누는 수를 실수로 해서 소수가 나오도록 계산
		double avg = sum / (double) ar.length;
		System.out.println("평균 : " + avg);

		avg = (int) ((avg * 10) + 0.5) / 10.0;
		System.out.println("소수점 1째 반올림 평균 : " + avg);
		System.out.println("=======================================");

		// 연습3
		// 아래 배열의 합계와 평균을 십의 자리에서 반올림하여 출력하시오.
		System.out.println("문제 3 - 아래 배열의 합계와 평균을 십의 자리에서 반올림하여 출력하시오.");
		// Test코드
		// int[] ar2 = {700, 600, 500, 430, 333, 251, 11, 13, 17}; //십의 자리가 1
		int[] ar2 = { 700, 600, 500, 430 }; // 십의 자리가 5
		// int[] ar2 = {700, 600, 500, 430, 1199}; //십의 자리가 8
		idx = 0;
		sum = 0;
		avg = 0;

		do {
			sum += ar2[idx];
			idx += 1;
		} while (idx < ar2.length);
		System.out.println("합계 : " + sum);

		avg = sum / (double) ar2.length;
		System.out.println("평균 : " + avg);

		avg = (int) ((avg / 100.0) + 0.5) * 100;
		System.out.println("십의 자리 반올림 평균 : " + avg);
		System.out.println("=======================================");

	}
}
