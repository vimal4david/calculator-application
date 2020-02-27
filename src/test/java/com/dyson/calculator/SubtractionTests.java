package com.dyson.calculator;

import com.dyson.calculator.services.Calculate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubtractionTests {

	@Autowired
	private Calculate calculate;

	@Test
	public void simple() {
		// Arrange
		Integer number1 = 50,
				number2 = 2,
				expected = 48;

		// Act
		Integer answer = calculate.Subtract(number1, number2);

		// Assert
		assertThat(answer, is(expected));
	}

	@Test
	public void oneZero() {
		// Arrange
		Integer number1 = 50,
				number2 = 0,
				expected = 50;

		// Act
		Integer answer = calculate.Subtract(number1, number2);

		// Assert
		assertThat(answer, is(expected));
	}

	@Test
	public void oneZeroAlternative() {
		// Arrange
		Integer number1 = 0,
				number2 = 50,
				expected = -50;

		// Act
		Integer answer = calculate.Subtract(number1, number2);

		// Assert
		assertThat(answer, is(expected));
	}

	@Test
	public void allZeros() {
		// Arrange
		Integer number1 = 0,
				number2 = 0,
				expected = 0;

		// Act
		Integer answer = calculate.Subtract(number1, number2);

		// Assert
		assertThat(answer, is(expected));
	}

	@Test
	public void minusValues() {
		// Arrange
		Integer number1 = -10,
				number2 = -10,
				expected = 0;

		// Act
		Integer answer = calculate.Subtract(number1, number2);

		// Assert
		assertThat(answer, is(expected));
	}
}
