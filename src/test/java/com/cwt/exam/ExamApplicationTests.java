package com.cwt.exam;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ExamApplicationTests {

	@Test
	void contextLoads() {
		int num = 1;

		assertTrue(819 > num);
	}

}
