import java.util.Scanner;

public class TestDrive {

	public static void main(String[] args) {

		while (true) {

			Calcul x = new Calcul();
			x.cal();

			Scanner sc = new Scanner(System.in);
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				Num a = new Num();
				a.cal();
				break;
			case 2:
				Area b = new Area();
				b.cal();
				break;
			case 3:
				ExchangeRate c = new ExchangeRate();
				c.cal();
				break;
			default:
				return;
			}
			System.out.print("다시하시겠습니까? (Y/N) >> ");

			while (true) {
				String c = sc.nextLine();

				if (c.equals("Y")) {
					break;
				} else if (c.equals("N")) {
					System.out.println("계산을 종료합니다.");
				}
			}
		}
	}
}