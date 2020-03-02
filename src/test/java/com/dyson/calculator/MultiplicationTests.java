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
public class MultiplicationTests {

	@Autowired
	private Calculate calculate;

	@Test
	public void simple() {
		// Arrange
		Integer number1 = 50,
				number2 = 2,
				expected = 100;

		// Act
		Integer answer = calculate.multiply(number1, number2);

		// Assert
		assertThat(answer, is(expected));
	}

	@Test
	public void oneZero() {
		// Arrange
		Integer number1 = 50,
				number2 = 0,
				expected = 0;

		// Act
		Integer answer = calculate.multiply(number1, number2);

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
		Integer answer = calculate.multiply(number1, number2);

		// Assert
		assertThat(answer, is(expected));
	}

	@Test
	public void minusValuesOne() {
		// Arrange
		Integer number1 = 1,
				number2 = -10,
				expected = -10;

		// Act
		Integer answer = calculate.multiply(number1, number2);

		// Assert
		assertThat(answer, is(expected));
	}

	@Test
	public void minusValuesOneAlternative() {
		// Arrange
		Integer number1 = -10,
				number2 = 2,
				expected = -20;

		// Act
		Integer answer = calculate.multiply(number1, number2);

		// Assert
		assertThat(answer, is(expected));
	}

	@Test
	public void minusValuesAll() {
		// Arrange
		Integer number1 = -10,
				number2 = -2,
				expected = 20;

		// Act
		Integer answer = calculate.multiply(number1, number2);

		// Assert
		assertThat(answer, is(expected));
	}
}
