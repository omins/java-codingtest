/** 프로그래머스 Level 1 '수박수박수박수박수박수?' */
public class repeatationalString {
	public String solution(int n) {
		String answer = "";

		if (n % 2 == 0) {
			for (int i = 0; i < (n / 2); i++) {
				answer += "수박";
			}
		}

		else if (n > 0 && n % 2 == 1) {
			answer += "수";
			for (int i = 0; i < Math.floorDiv(n, 2); i++) {
				answer += "박수";
			}
		}
		return answer;
	}
}
