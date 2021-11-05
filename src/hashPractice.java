import java.util.HashMap;
import java.util.Map;

public class hashPractice {
	public String solution(String[] participant, String[] completion) {

		String failed = "";

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String player : participant) {
			map.put(player, map.getOrDefault(player, 0) + 1);
		}

		for (String player : completion) {
			map.put(player, map.get(player) - 1);
		}

		for (int i = 0; i < participant.length; i++) {
			if (map.get(participant[i]) == 1) {
				failed = participant[i];
				break;
			}
		}
		return failed;
	}
}
