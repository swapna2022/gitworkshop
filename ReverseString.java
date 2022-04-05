package TestingInMaven.MavenAssignments;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseString {

	public String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		String reverse = "";
		for (int i = sb.length() - 1; i >= 0; i--) {
			reverse = reverse + sb.charAt(i);

		}
		System.out.println(reverse);
		return reverse;
	}

	@Test
	public void test1() {
		Assert.assertEquals(reverseString("apple"), "elppa");
	}

	@Test
	public void test2() {
		Assert.assertEquals(reverseString("racecar"), "racecar");
	}

}
