import java.util.Scanner;

public class Area extends Calcul {
	
	@Override
	public void cal() {
		System.out.println("<<<면적계산기>>");
		System.out.println("1.평수로 면적구하기");
		System.out.println("2.면적으로 평수구하기");

		Scanner scan_cal = new Scanner(System.in);
		int cal = scan_cal.nextInt();

		switch (cal) {
		case 1:
			System.out.println("1.평수로 면적구하기");
			final double PY = 3.3058;
			Scanner scan = new Scanner(System.in);
			System.out.print("입력(평): ");
			double d = scan.nextDouble();
			System.out.println("제곱미터: " + (d * PY));
			break;

		case 2:
			System.out.println("2.면적으로 평수구하기");
			final double d1 = 0.3;
			Scanner scan1 = new Scanner(System.in);
			System.out.print("입력(제곱미터): ");
			double PY1 = scan1.nextDouble();
			System.out.println("평: " + (d1 * PY1));
			break;
		default:
			return;
		}
	}
}