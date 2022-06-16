package com.greatlearning.paymoney;

public class Transcation {
	public static int achievableTarget(long tragetValue, int[] transcationArray) {
		long sum = 0;

		for (int i = 0; i < transcationArray.length; i++) {
			sum += transcationArray[i];
			if (sum >= tragetValue) {

				return i + 1;
			}

		}

		return -1;
	}
}
