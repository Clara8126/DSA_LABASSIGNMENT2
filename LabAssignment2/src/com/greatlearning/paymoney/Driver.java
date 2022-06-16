package com.greatlearning.paymoney;

import java.util.Scanner;

import com.greatlearning.paymoney.Transcation;

public class Driver {
	public static void main(String[] agrs) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Transcation Array ");
		int size = sc.nextInt();
		int array[] = new int[size];

		System.out.println("Enter the Values of the Array");
		for (int i = 0; i < size; i++) {

			array[i] = sc.nextInt();

			System.out.println("Enter the Total Number of targets that needs to be Achieved");
			int targetNumber = sc.nextInt();

			Transcation transcation = new Transcation();

			while (targetNumber-- != 0) {
				int flag = 0;
				long targetValue;

				System.out.println(" Enter the value of the target");
				targetValue = sc.nextInt();

				int res = Transcation.achievableTarget(targetValue, array);
				if (res > 0) {

					System.out.println(" Target is acheived after " + res + " Transcations");

				}

				else {

					System.out.println(" Given Traget is not Achieved");

				}

			}

		}

	}
}
