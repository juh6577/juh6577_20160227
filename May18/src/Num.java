import java.util.Scanner;

public class Num extends Calcul {
	
	@Override
	public void cal() {
		Scanner n = new Scanner(System.in);
		System.out.println("<<<���п� ���� ����>>>");
		System.out.println("1. �� ���� ����ϰڽ��ϴ�.");
		System.out.println("2. �� �� �̻� ����ϰڽ��ϴ�.");
		System.out.println("3. ���� ������ ����ϰڽ��ϴ�.");
		int sel = n.nextInt();

		switch (sel) {
		case 1:
			System.out.println("�μ��� �Է��ϼ���.");

			int num1 = n.nextInt();
			int num2 = n.nextInt();

			System.out.println("<<������ ����>>");
			System.out.println("1.+\n2.-\n3.x\n4./");
			int dns = n.nextInt();

			switch (dns) {
			case 1:
				System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
				break;
			case 2:
				System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
				break;
			case 3:
				System.out.println(num1 + "X" + num2 + "=" + (num1 * num2));
				break;
			case 4:
				System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
				break;
			default:
				return;
			}
			break;

		case 2:
			System.out.println("���ڸ� �Է��ϼ���(�ִ� 4���� �� �Է� ����)");
			int n1 = n.nextInt();
			int n2 = n.nextInt();
			int n3 = n.nextInt();
			int n4 = n.nextInt();

			System.out.println("<<������ ����>>\n ");
			System.out.println("1.+\n2.-\n3.x\n4./");
			int dn = n.nextInt();

			switch (dn) {
			case 1:
				System.out.println(n1 + "+" + n2 + "+" + n3 + "+" + n4 + "=" + (n1 + n2 + n3 + n4));
				break;
			case 2:
				System.out.println(n1 + "-" + n2 + "-" + n3 + "-" + n4 + "=" + (n1 - n2 - n3 - n4));
				break;
			case 3:
				System.out.println(n1 + "X" + n2 + "X" + n3 + "X" + n4 + "=" + (n1 * n2 * n3 * n4));
				break;
			case 4:
				System.out.println(n1 + "/" + n2 + "/" + n3 + "/" + n4 + "=" + (n1 / n2 / n3 / n4));
				break;
			default:
				return;
			}
			break;

		case 3:
			int a, b, c;
			double dis, root1, root2;

			Scanner scan = new Scanner(System.in);
			System.out.println("ax^2 + bx + c = 0");
			System.out.print("a: ");
			a = scan.nextInt();

			System.out.print("b: ");
			b = scan.nextInt();

			System.out.print("c: ");
			c = scan.nextInt();

			// ���� ����
			dis = (b * b) - (4 * a * c);
			root1 = ((-1 * b) + Math.sqrt(dis)) / (2 * a);
			root2 = ((-1 * b) - Math.sqrt(dis)) / (2 * a);

			// ���
			System.out.println("Root #1: " + root1);
			System.out.println("Root #2: " + root2);
			break;
		default:
			return;
		}
	}
}
