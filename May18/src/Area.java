import java.util.Scanner;

public class Area extends Calcul {
	
	@Override
	public void cal() {
		System.out.println("<<<��������>>");
		System.out.println("1.����� �������ϱ�");
		System.out.println("2.�������� ������ϱ�");

		Scanner scan_cal = new Scanner(System.in);
		int cal = scan_cal.nextInt();

		switch (cal) {
		case 1:
			System.out.println("1.����� �������ϱ�");
			final double PY = 3.3058;
			Scanner scan = new Scanner(System.in);
			System.out.print("�Է�(��): ");
			double d = scan.nextDouble();
			System.out.println("��������: " + (d * PY));
			break;

		case 2:
			System.out.println("2.�������� ������ϱ�");
			final double d1 = 0.3;
			Scanner scan1 = new Scanner(System.in);
			System.out.print("�Է�(��������): ");
			double PY1 = scan1.nextDouble();
			System.out.println("��: " + (d1 * PY1));
			break;
		default:
			return;
		}
	}
}