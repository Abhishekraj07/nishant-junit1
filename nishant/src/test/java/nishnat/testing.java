package nishnat;

import static org.junit.Assert.*;

import org.junit.Test;

public class testing {

	@Test
	public void test() {
		System.out.println("add");
        Integer a = 15;
        Integer b = 15;
        Integer expResult = 30;
        Integer result = test.add(a, b);
        assertEquals(expResult, result);
       	}

}
