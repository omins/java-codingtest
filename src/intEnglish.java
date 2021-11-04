/** 영단어 숫자와, 숫자가 포함된 문자열을 문자열 숫자로 변환, 정수형 숫자로 return */
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