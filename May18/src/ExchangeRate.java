import java.util.Scanner;

public class ExchangeRate extends Calcul {
	
	@Override
	public void cal() {
		System.out.println("<<<환율계산기>>");
		System.out.println("1.미국환율");
		System.out.println("2.일본환율");
		System.out.println("3.중국환율");

		Scanner input = new Scanner(System.in);

		int usd, jpy, cny;
		int choice = input.nextInt();
		final double rateDollar = 1122.20;
		final double rateYen = 10.10;
		final double rateYuan = 163.06;

		switch (choice) {
		case 1:
			System.out.print("달러금액을 입력하시오. : ");
			usd = input.nextInt();
			System.out.println(+usd + "달러는" + usd * rateDollar + "원입니다.");
			break;
		case 2:
			System.out.print("엔화금액을 입력하시오. : ");
			jpy = input.nextInt();
			System.out.println(+jpy + "엔은" + jpy * rateYen + "원입니다.");
			break;
		case 3:
			System.out.print("위안금액을 입력하시오. : ");
			cny = input.nextInt();
			System.out.println(+cny + "위안은" + cny * rateYuan + "원입니다.");
			break;
		default:
			return;
		}
	}
}