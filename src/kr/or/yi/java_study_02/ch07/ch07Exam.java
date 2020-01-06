package kr.or.yi.java_study_02.ch07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ch07Exam {

	public static void main(String[] args) {
		HashMap<String, Double> scoreMap = new HashMap<String, Double>();
		Scanner sc = new Scanner(System.in);

		System.out.println("미래 장학금시스템입니다");

		for (int i = 0; i < 5; i++) {
			System.out.println("이름과 학점");
			String name = sc.next();
			Double score = sc.nextDouble();
			scoreMap.put(name, score);
		}
		System.out.println("기준학점입력>>");
		Double cutLine = sc.nextDouble();

		Set<String> names = scoreMap.keySet();
		Iterator<String> it = names.iterator();

		while (it.hasNext()) {
			String name = it.next();
			Double score = scoreMap.get(name);
			if (score > cutLine) {
				System.out.println(name);
			}
		}

	}
}
