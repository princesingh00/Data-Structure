package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class Calendar_Queue {

	public static void main(String args[]) {

		int num_of_days = 0;
		int count = 1;

		System.out.print("Enter the month : ");
		int month = Utility.getInteger();

		System.out.print("Enter the year : ");
		int year = Utility.getInteger();

		int day = Get_Day(month, 1, year);

		if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
			if (month == 2) {
				num_of_days = 29;
			} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 12
					|| month == 10) {
				num_of_days = 31;
			}

			else if (month == 4 || month == 6 || month == 9 || month == 11) {
				num_of_days = 30;
			}
		}

		else {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 12 || month == 10) {
				num_of_days = 31;
			}

			else if (month == 4 || month == 6 || month == 9 || month == 11) {
				num_of_days = 30;
			}

			else if (month == 2) {
				num_of_days = 28;
			}
		}

		Queue<Integer> queue = new Queue<>();

		int total = day;

		while (day != 0) {
			queue.enqueue(0);
			day--;
		}
		while (num_of_days != 0) {
			queue.enqueue(count);
			num_of_days--;
			count++;
		}
		total += count;
		int num = 1;

		System.out.println();
		System.out.println(
				"Sun" + "\t" + "Mon" + "\t" + "Tues" + "\t" + "Wed" + "\t" + "Thurs" + "\t" + "Fri" + "\t" + "Sat");
		System.out.println();
		while (num != total) {
			int d0 = queue.dequeue();
			System.out.print(d0 + "\t");
			if (num % 7 == 0) {
				System.out.println();
			}
			num++;
		}

	}

	public static int Get_Day(int m, int d, int y) {
		int year = (y - (14 - m) / 12);
		int z = (year + (year / 4) - (year / 100) + (year / 400));
		int month = m + 12 * ((14 - m) / 12) - 2;
		int day = (d + z + (31 * month) / 12) % 7;
		return day;
	}
}
