package jeff;

public class exam01 {
	public static void main(String[] args) {

		char startValue = Character.MIN_VALUE;
		char endValue = Character.MAX_VALUE;
		char name01[] = { '조', '광', '조' };
		String name02[] = { "uC815", "ACBD", "D5CC" };

		for (int i = 1; i < endValue; i++) {
			if (startValue == (int) name01[i - 1]) {
				System.out.print("0x" + name02[i - 1]);

				startValue = 0; // 찾았으면 다시 처음부터 돌아가도록 초기화
				if (i == 3) {
					break;

				} else {
					System.out.print(",");
					continue;
				}
			}

			else {
				i--;
			}
			startValue++;
		}

	}
}
