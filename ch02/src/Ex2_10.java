import java.util.Scanner;    // Scanner�� ����ϱ� ���� �߰�

class Ex2_10 { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);

		System.out.print("입력해주세요>");
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		int num2 = Integer.parseInt(input2); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ

		System.out.println("입력된 값:"+input);
		System.out.printf("num=%d%nnum2=%d", num, num2);
	} 
}