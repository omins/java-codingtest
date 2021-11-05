/** 프로그래머스 Level 1 '자릿수 더하기' */
public class sumOfDigits {
	public int solution(int n) {
		int answer = 0;

		while (n > 0) {
			answer += (n % 10);
			n /= 10;
		}
		System.out.println(answer);

		return answer;
	}

}
