/** 프로그래머스 Level 1 '두 정수 사이의 합' */
public class sumBetweenTwoInt {
	public long solution(int a, int b) {
		long answer = 0;

		if (a < b) {
			for (long i = a; i <= b; i++) {
				answer += i;
			}
		}

		if (b < a) {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
		}

		if (a == b) {
			answer = a;
		}

		return answer;
	}

}
