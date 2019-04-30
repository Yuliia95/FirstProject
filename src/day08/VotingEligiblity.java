package day08;

import java.util.Scanner;

public class VotingEligiblity {
	public static void main(String[] args) {
		//program to tell if you are eligible to vote.
		//votingAge = 18
		//yourAge = take from scanner
		//if you are eligible to vote: you are eligible to vote.
		//you have been eligible for 3 years
		//else
		//you are not eligible to vote
		//you still have 3 more years to go
		
		Scanner input = new Scanner(System.in);
		int votingAge = 18;
		System.out.println("How old are you?");
		
		 int yourAge = input.nextInt();
		 int years = yourAge - votingAge;
		if(yourAge >= votingAge) {
			
			
			System.out.println("You are eligible to vote.");
			System.out.println("you have been eligible for "+years+ "years");
		}else {
			System.out.println("You are not eligible to vote ");
			//System.out.println("you still have" +(-years)+"moreYears to go");
			
			System.out.println("you still have "+ (votingAge-yourAge) +" more years to go");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
