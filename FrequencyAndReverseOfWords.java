package dailyTasks;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FrequencyAndReverseOfWords {

	private static String reverseWords(String str) {
		String[] words = str.split(" ");
		StringBuilder sb = new StringBuilder();
		String str2;
		for (int i = words.length - 1; i > 0; i--) {
			sb.append(words[i] + " ");
		}
		str2 = sb.toString().trim();
		System.out.println(str2);
		return str2;

	}

	private static HashMap<String, Integer> frequencyCount(String str) {
		String[] words = str.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			if (hm.containsKey(words[i])) {
				hm.put(words[i], hm.get(words[i]) + 1);
			} else {
				hm.put(words[i], 1);
			}
		}
		for (Map.Entry<String, Integer> e : hm.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		return hm;

	}

	@Test
	public void test1() {
		String str = "My note book is My friends note book";
		Assert.assertEquals(reverseWords(str), "book note friends My is book note");
		Assert.assertNotNull(frequencyCount(str));

	}

}
