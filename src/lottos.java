/** 프로그래머스 Level 1 '로또의 최고 순위와 최저 순위' */
public class lottos {

	public int grade(int grade) {
		switch (grade) {
		case 6:
			return 1;
		case 5:
			return 2;
		case 4:
			return 3;
		case 3:
			return 4;
		case 2:
			return 5;
		default:
			return 6;
		}
	}

	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];

		int correctHigh = 0;
		int correctLow = 0;

		// 최고 순위
		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == 0)
				correctHigh += 1;
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					correctHigh += 1;
				}
			}
		}
		answer[0] = grade(correctHigh);

		// 최저 순위
		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					correctLow += 1;
				}
			}
		}
		answer[1] = grade(correctLow);

		return answer;
	}
}