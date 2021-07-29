package com.bludots.vidhalhw;

import java.util.ArrayList;
import java.util.Random;

public class ApplicationHomeWork {
	
	public static void input(char x, int y) {
		for(int i = 0; i < y; i++) {
			System.out.print(x);
		}
	}
	
	public static void ListOutput(int x, int y) {
		ArrayList <Integer> list = new ArrayList<>();
		Random random = new Random();
		for(int i = 0; i < x; i++) {
			int z = random.nextInt(y);
			list.add(z);
		}
		
		System.out.println("\n" + list.toString());
		int p = random.nextInt(y);
		System.out.println("Random Searh Number: " + p);
		SearchList(list, p);
		
	}
	
	public static void SearchList(ArrayList <Integer> list, int q) {
			boolean contains = false;
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i) == q) {
					contains = true;
					System.out.println("Integer = " + q + " & Index = " + i);
				} 
			}
			 if(!contains) {
				 System.out.println(-1);
			 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		input('B', 7);
		ListOutput(5, 10);
	}

}
