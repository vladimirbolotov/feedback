package ru.lois.feedback.account;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserTest {

	@Test
	public void test() {
		User user = new User("bvg");
		assertEquals("bvg", user.getLogname());
	}

}
