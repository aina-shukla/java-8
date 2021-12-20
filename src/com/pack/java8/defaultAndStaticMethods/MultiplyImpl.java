package com.pack.java8.defaultAndStaticMethods;

import java.util.List;

public class MultiplyImpl implements Multiply {

	@Override
	public int multiply(List<Integer> listInt) {
		listInt.stream().reduce(1, (x, y) -> x * y);
		return 0;
	}

}
