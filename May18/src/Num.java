import java.util.Scanner;

public class Num extends Calcul {
	
	@Override
	public void cal() {
		Scanner n = new Scanner(System.in);
		System.out.println("<<<공학용 계산기 실행>>>");
		System.out.println("1. 두 수를 계산하겠습니다.");
		System.out.println("2. 두 수 이상 계산하겠습니다.");
		System.out.println("3. 근의 공식을 계산하겠습니다.");
		int sel = n.nextInt();

		switch (sel) {
		case 1:
			System.out.println("두수를 입력하세요.");

			int num1 = n.nextInt();
			int num2 = n.nextInt();

			System.out.println("<<연산자 선택>>");
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
			System.out.println("숫자를 입력하세요(최대 4개의 수 입력 가능)");
			int n1 = n.nextInt();
			int n2 = n.nextInt();
			int n3 = n.nextInt();
			int n4 = n.nextInt();

			System.out.println("<<연산자 선택>>\n ");
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

			// 근의 공식
			dis = (b * b) - (4 * a * c);
			root1 = ((-1 * b) + Math.sqrt(dis)) / (2 * a);
			root2 = ((-1 * b) - Math.sqrt(dis)) / (2 * a);

			// 출력
			System.out.println("Root #1: " + root1);
			System.out.println("Root #2: " + root2);
			break;
		default:
			return;
		}
	}
}
