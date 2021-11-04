/** 프로그래머스 Level 1 '숫자 문자열과 영단어' */
class intEnglish {
	public int solution(String s) {

		String[] engNums = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] nums = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		for (int i = 0; i < engNums.length; i++) {
			if (s.contains(engNums[i])) {
				s = s.replace(engNums[i], nums[i]);
			}
		}
		int answer = Integer.parseInt(s);
		return answer;
	}
}