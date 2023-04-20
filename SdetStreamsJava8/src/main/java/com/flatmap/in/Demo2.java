package com.flatmap.in;

import java.util.Arrays;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {

		List<String> teamA = Arrays.asList("Scott", "David", "Jhon");
		List<String> teamB = Arrays.asList("Mary", "Luna", "Tom");
		List<String> teamC = Arrays.asList("Ken", "Jony", "Kitty");

		List<List<String>> players = Arrays.asList(teamA, teamB, teamC);

		// without streams

		for (List<String> list : players) {
			for (String player : list) {
				System.out.println(player);
			}
		}
		System.out.println("****************************");
		
		// with streams flatMap
		players.stream().flatMap(c->c.stream()).forEach(System.out::println);

	}
}
