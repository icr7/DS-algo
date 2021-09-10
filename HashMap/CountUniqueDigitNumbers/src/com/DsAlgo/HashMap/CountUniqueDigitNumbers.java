package com.DsAlgo.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountUniqueDigitNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer count = 0;
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		for (int i = n1; i <= n2; i++) {
			if (isOk(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean isOk(int a) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; a != 0; i++) {
			if (map.containsKey(a % 10)) {
				map.put(a % 10, map.get(a % 10) + 1);
			} else {
				map.put(a % 10, 1);
			}
			a = a / 10;
		}

		for (Map.Entry entry : map.entrySet()) {
			if (Integer.parseInt(entry.getValue().toString()) > 1)
				return false;
		}

		return true;
	}

}
