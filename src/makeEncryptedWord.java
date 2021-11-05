
public class makeEncryptedWord {
	public String solution(String s, int n) {

		StringBuilder sb = new StringBuilder();
		char tmp;

		for (int i = 0; i < s.length(); i++) {
			tmp = s.charAt(i);
			if (tmp >= 65 && tmp <= 90) { // 대문자 이면
				if (tmp + n > 90) { // 더했을 때 z가 넘어가면
					tmp = (char) (65 + ((int) tmp + n - 91));
				} else {
					tmp = (char) (tmp + n);
				}
				sb.append(tmp);
			} else if (tmp >= 97 && tmp <= 122) { // 소문자 이면

				if (tmp + n > 122) { // 더했을 때 z가 넘어가면

					tmp = (char) (97 + ((int) tmp + n - 123));
				} else {
					tmp = (char) (tmp + n);
				}
				sb.append(tmp);
			} else {
				sb.append(tmp);
			}
		}
		return sb.toString();
	}
}
