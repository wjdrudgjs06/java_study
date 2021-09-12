package jeff;
import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("[메뉴선택]\n1.회원 관리\n2.과목 관리\n3.수강 관리\n4.결제 관리\n5.종료");
			System.out.print("메뉴 선택 :");
			int selection = scanner.nextInt();
			if (selection == 1) {
				System.out.println("회원 관리 메뉴를 선택했습니다.");
			} else if (selection == 2) {
				System.out.println("과목 관리 메뉴를 선택했습니다.");
			} else if (selection == 3) {
				System.out.println("수강 관리 메뉴를 선택했습니다.");
			} else if (selection == 4) {
				System.out.println("결제 관리 메뉴를 선택했습니다.");
			} else if (selection == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 고르셨습니다.");
			}
		}

	}

}
