package com;

import java.util.Scanner;

public class Test1 {
/*
 * Team 1:
Team name:
DAV Jawahar Vidhya Mandir
Score:
150
Overs played:
20
Team 2:
Team name:
Kendriya School
Score:
110
Overs played:
18
Match Details:
Team 1:
Name : DAV Jawahar Vidhya Mandir 
Score : 150
Overs played : 20
Team 2:
Name : Kendriya School 
Score : 110 
Overs played : 18 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Team 1:");
		System.out.println("Team name:");
		String s = sc.nextLine();
		System.out.println("Score:");
		int score = sc.nextInt();
		System.out.println("Overs played:");
		int over = sc.nextInt();
		
		System.out.println("Team 2:");
		System.out.println("Team name:");
		String s1 = sc.nextLine();
		System.out.println("Score:");
		int score1 = sc.nextInt();
		System.out.println("Overs played:");
		int over1 = sc.nextInt();
		
		System.out.println("Match Details:");
		System.out.println("Team 1:");
		System.out.println("Name : "+s);
		System.out.println("Score : "+score);
		System.out.println("Overs played : "+over);
		
		System.out.println("Team 2:");
		System.out.println("Name : "+s1);
		System.out.println("Score : "+score1);
		System.out.println("Overs played : "+over1);
		
	}
}
