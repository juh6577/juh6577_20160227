import java.util.Scanner;

public class ExchangeRate extends Calcul {
	
	@Override
	public void cal() {
		System.out.println("<<<ȯ������>>");
		System.out.println("1.�̱�ȯ��");
		System.out.println("2.�Ϻ�ȯ��");
		System.out.println("3.�߱�ȯ��");

		Scanner input = new Scanner(System.in);

		int usd, jpy, cny;
		int choice = input.nextInt();
		final double rateDollar = 1122.20;
		final double rateYen = 10.10;
		final double rateYuan = 163.06;

		switch (choice) {
		case 1:
			System.out.print("�޷��ݾ��� �Է��Ͻÿ�. : ");
			usd = input.nextInt();
			System.out.println(+usd + "�޷���" + usd * rateDollar + "���Դϴ�.");
			break;
		case 2:
			System.out.print("��ȭ�ݾ��� �Է��Ͻÿ�. : ");
			jpy = input.nextInt();
			System.out.println(+jpy + "����" + jpy * rateYen + "���Դϴ�.");
			break;
		case 3:
			System.out.print("���ȱݾ��� �Է��Ͻÿ�. : ");
			cny = input.nextInt();
			System.out.println(+cny + "������" + cny * rateYuan + "���Դϴ�.");
			break;
		default:
			return;
		}
	}
}