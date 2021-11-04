/** 프로그래머스 Level 1 '서울에서 김서방 찾기' */
import java.util.Arrays;

public class findIndexOfKim {
	public String solution(String[] seoul) {

		int location = Arrays.asList(seoul).indexOf("Kim");
		String answer = "김서방은 " + Integer.toString(location) + "에 있다";
		return answer;
	}
}
