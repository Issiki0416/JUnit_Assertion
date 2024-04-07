package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testAdd() {
		// オブジェクトを作成
		Calculator cal = new Calculator();
		// 期待値
		int expected = 5;
		// 実測値
		int actual = cal.add(3, 2);
		// 期待値と実測値の比較
		assertEquals(expected, actual);
	}

	@Test
	public void testSub() {
		Calculator cal = new Calculator();
		// 期待値
		int expected = 2;
		// 実測値
		int actual = cal.sub(5, 3);
		// 期待値と実測値の比較
		assertEquals(expected, actual);
	}

	@Test
	public void testMul() {
		Calculator cal = new Calculator();
		int expected = 2;
		int actual = cal.mul(2, 1);
		assertEquals(expected, actual);
	}

	@Test
	public void testDiv() {
		// インスタンス化
		Calculator cal = new Calculator();
		// 期待値 fをつけないとdouble型になるので注意
		float expected = 1.5f;
		// 実測値
		float actual = cal.div(3, 2);
		// 期待値と実測値の比較
		assertEquals(expected, actual);
	}

	@Test
	public void testDivException() {
		// インスタンス化
		Calculator cal = new Calculator();

		// assertThrowsはラムダ式で記述する
		assertThrows(IllegalArgumentException.class, () -> cal.div(3, 0));
	}

	@Test
	public void testDivException2() {
		// インスタンス化
		Calculator cal = new Calculator();
		try {
			cal.div(3, 0);
			fail();
		} catch (IllegalArgumentException e) {			
		}
	}

}
