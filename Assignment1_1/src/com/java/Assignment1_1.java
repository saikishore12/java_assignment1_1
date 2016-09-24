package com.java;

import java.math.BigInteger;

public class Assignment1_1 {

	public static void main(String[] args) {
		int a = 9;
		int b = 25;
		BigInteger c = new BigInteger(new Integer(a).toString());
		BigInteger d = new BigInteger(new Integer(b).toString());
		BigInteger sum = c.add(d);
		System.out.println(sum);
	}

}
