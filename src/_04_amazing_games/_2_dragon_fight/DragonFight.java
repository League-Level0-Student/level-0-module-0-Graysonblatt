package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		int playerhealth = 100;
			// playerHealth to store your health - set it equal to 100
		int dragonHealth = 100;
			// dragonHealth to store the dragon's health - set it equal to 100

		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
		int playerAttack =0;
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
		int dragonAttack =0;

			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.

		
		//  This while statement will cause the game to repeat until the player or dragon run out of health
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON

				// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
	String answer = JOptionPane.showInputDialog("Do you want to kick or yell or use mind powers at the dragon?");
				// 4. If they typed in "yell":
	if (answer .equalsIgnoreCase ("yell")) {
		  playerAttack = ran.nextInt(10);
		 dragonHealth -=playerAttack;
		 JOptionPane.showMessageDialog(null, "the dragon lost " +playerAttack+ " health! Great job! He now has " +dragonHealth+ " health.");
	}
	int run = ran.nextInt(4);
	if(run==1) {
		JOptionPane.showMessageDialog(null, "You ran away. you didn't get any treasure though" );
	}
					// -- Find a random number between 0 and 10 and store it in playerAttack. Use
					
		
					// -- Subtract the player attack value from the dragon's health
	
				// 5. If they typed in "kick":

	if (answer .equalsIgnoreCase ("kick")) {
		 playerAttack = ran.nextInt(25);
		 dragonHealth-=playerAttack;
		 JOptionPane.showMessageDialog(null, "the dragon lost " +playerAttack+ " health! Great job! He now has " +dragonHealth+ "health.");
	}
	if (answer .equalsIgnoreCase ("use mind powers")) {
		 JOptionPane.showMessageDialog(null, "you don't have mind powers");
	}
	
					// -- Find a random number between 0 and 25 and store it in playerAttack.
		
					// -- Subtract the player attack value from the dragon's health

			// THE DRAGON RETALIATES

				// 6. Find a random number between 0 and 35 and store it in dragonAttack
	 dragonAttack = ran.nextInt(35);
	 playerhealth -=dragonAttack;
	
	 JOptionPane.showMessageDialog(null, "The Dragon attacked you! you lost " +dragonAttack+ " health. Uh-oh. You only have " +playerhealth+ " health left.");
				// 7. Subtract the dragon attack value from the player's health

			// ASSESS THE DAMAGE CAUSED 

				// 8. If the player's health is less than or equal to 0
				// call the playerLost() method
	if (playerhealth<= 0 ) {
		playerLost();
	}
			
				// 9. Else if the dragon's health is less than or equal to 0
				// call the dragonLost() method
	if (dragonHealth<= 0 ) {
		dragonLost();
	}}
			
			// 10.  Pop up a message that tells the player the health levels of player and
			// 		dragon.

			
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)

		}

	

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure
JOptionPane.showMessageDialog(null, "You have been defeated by the dragon. You got no treasure.");

		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!
		JOptionPane.showMessageDialog(null, "You have defeated the dragon! You got a lot of treasure!");

		System.exit(0);   //This code ends the program
	}

}
