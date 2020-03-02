package com.dyson.calculator;

import com.dyson.calculator.services.Calculate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DivisionTests {

	@Autowired
	private Calculate calculate;

	@Test
	public void simple() {
		// Arrange
		Integer dividend = 50,
				divisor = 2,
				expected = 25;

		// Act
		Integer answer = calculate.divide(dividend, divisor);

		// Assert
		assertThat(answer, is(expected));
	}

	@Test
	public void byZero() {
		// Arrange
		Integer dividend = 50,
				divisor = 0,
				expected = 0;

		// Act
		Integer answer = calculate.divide(dividend, divisor);

		// Assert
		assertThat(answer, is(expected));
	}
}
