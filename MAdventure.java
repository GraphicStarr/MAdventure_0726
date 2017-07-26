package MAdventure;

import java.util.Scanner;

public class MAdventure {
	public static void main(String[] args){
		String answer;
		System.out.println("Would you like to go 'kitchen' or into the 'upstairs'?  k/u");
		Scanner answer1 = new Scanner (System.in);
		answer = answer1.nextLine();
		
		
		if (answer.equalsIgnoreCase("k")){
			System.out.println("Would you like to open the 'refrigerator' or look in a 'cabinet'?  r/c" );
			Scanner answer2 = new Scanner (System.in);
			answer = answer2.nextLine();
			
		}else{
			System.out.println("Would you like to go to the 'master bedroom' or to the 'bathroom'? m/b");
			Scanner answer3 = new Scanner (System.in);
			answer = answer3.nextLine();
		}
		if (answer.equalsIgnoreCase("m")){
			System.out.println("The closet door is left ajar. Would you go and open the closet door? y/n");
			Scanner answer4 = new Scanner (System.in);
			answer = answer4.nextLine();
		}
		if(answer.equalsIgnoreCase("b")){
			System.out.println("There is a leaky water tap in the bathroom. Will you fix it? y/n");
			Scanner answer5 = new Scanner (System.in);
			answer = answer5.nextLine();
		}
		if(answer.equalsIgnoreCase("y")||answer.equalsIgnoreCase("n")) {
			System.out.println("Tap is fixed and you leave the bathroom");
			Scanner answer6 = new Scanner (System.in);
			answer = answer6.nextLine();
		}
		if (answer.equalsIgnoreCase("r")){
			System.out.println("Would you like to eat the food?  y/n" );
			Scanner answer7 = new Scanner (System.in);
			answer = answer7.nextLine();
		}
		
		if (answer.equalsIgnoreCase("c")){
			System.out.println("Would you like to use the cup in the cabinet?  y/n" );
			Scanner answer8 = new Scanner (System.in);
			answer = answer8.nextLine();
		}
		if(answer.equalsIgnoreCase("y")){
			System.out.println("You get food poisoning!");
			Scanner answer9 = new Scanner (System.in);
			answer = answer9.nextLine();
		}
		
		
		if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")){
			System.out.println("You will starve to death" );
			Scanner answer10 = new Scanner (System.in);
			answer = answer10.nextLine();
		}
		
		}
		
	}



