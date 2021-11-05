/** 프로그래머스 Level 1 '3진법 뒤집기' */
public class toTrinaryDigit {
	public int solution(int n) {

		StringBuilder sb = new StringBuilder();

		while (n > 0) {
			if (n % 3 < 10) {
				sb.append(n % 3);
			}
			n /= 3;
		}

		int answer = Integer.parseInt(sb.toString(), 3);

		return answer;
	}

}
