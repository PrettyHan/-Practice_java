import java.util.Arrays;

class Ex5_2 {
	public static void main(String[] args) {
		int   sum = 0;      // ������ �����ϱ� ���� ����
		float average = 0f; // ����� �����ϱ� ���� ����
		String str = "ABCD";
		char[] str2 = str.toCharArray();
		System.out.printf("%s%n%s%n", str, Arrays.toString(str1));
		
		int[] score = {100, 88, 100, 100, 90};

		for (int i=0; i < score.length ; i++ ) {
			sum += score[i];
		}
		average = sum / (float)score.length ; // ������� float�� ��� ���ؼ� ����ȯ

		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
	}
}