

import java.util.Scanner;

public class woooooooo



	{
		public static void main(String[] args)
			{
			
				greetPlayer1();
				generateRandomNumber();
				askForUserGuess();
				evaluateGuess();
			}
		
		public static void greetPlayer1()
			
			{
				Scanner sc = new Scanner (System.in);
				System.out.println("So what they call you on the streets?");
				String name = sc.nextLine();
				
				System.out.println("Well what's up " + name + "? ");
				System.out.println("Wanna play a little number guessing game?");
				System.out.println("Type 1 for Yes or 2 for No");
				String answer = sc.nextLine();
				
						if (answer.equals ("1"))
							{
								System.out.println("Good choice!");
							}
						
						
						else if (answer.equals("2"))
							{
								System.out.println("Too bad you're playing anyway");
							}
					}
			
		
		{
				
			
				
						
				boolean restart = true;
				while (restart)
					{
						System.out.println("Now pick a difficulty.");
						System.out.println("Type the number indicated in front of the you wanna make.");
						System.out.println("1. Easy (1-10)");
						System.out.println("2. Hard (1-50)");
						System.out.println("3. Crazy (1-100)");
						System.out.println("4. If you pick this you hate yourself");
						String difficultyChoice = sc.nextLine();
						int difficulty = 0;
						
						
						
								if (difficultyChoice.equals("1"))
									
									{
										System.out.println("Nice!");
										difficulty = 10;
										System.out.println("Now pick a number between 1 and " + difficulty);
									}
								
								else if (difficultyChoice.equals("2"))
									{
										System.out.println("Alright then tough guy...");
										difficulty = 50;
										System.out.println("Pick a number between 1 and " + difficulty);
									}
								
								else if (difficultyChoice.equals("3"))
									{
										System.out.println("Let's see if you can do this!");
										difficulty = 1000;
										System.out.println("Pick a number between 1 and " + difficulty);
									}
								
								else if (difficultyChoice.equals("4"))
									{
										System.out.println("I warned you...");
										difficulty = 999999999;
										System.out.println("Pick a number between 1 and " + difficulty);
									}
								
						
						int secretNumber = (int)(Math.random()*difficulty) + 1;
						int counter = 0;
						boolean isGuessing = true;
						while (isGuessing)
							{
							Scanner guess = new Scanner(System.in);
							int userGuess = guess.nextInt();
									
								if (userGuess == secretNumber)
									{
										counter++;
										System.out.println("CORRECTOMUNDO!! Only took you " + counter );
										if (counter == 1)
											{
												System.out.println("It only took you " + counter + " try! THAT'S CRAZYYYY");
											}
										else 
											{
												System.out.println("Eh, took you " + counter + " tries. That's 'GOOD' I GUESS...");
											}
										isGuessing = false;
									}
								
									
								else if (userGuess > secretNumber)
									{
										System.out.println("Too high!");
										counter++;
									}
								else if (userGuess < secretNumber)
									{
										System.out.println("Too low...");
										counter++;
									}
//								else if (userGuess.equals("end"));
//									{
//										isGuessing = false;
//									}
							}
						System.out.println("Want to play again by any chance?");
						System.out.println("Type 1 for Yes or 2 for No");
							
						String answer1 = sc.nextLine();
							
						if (answer1.equals ("1"))
							{
								System.out.println("Good choice!");	
								restart = true;
							}
							
						else if (answer1.equals("2"))
							{	
								
								System.out.println("Alright then I won't torture you any longer. Thanks and goodbye.");
								restart = false;
								
							}
					}
						
	
		
			}

		private static void evaluateGuess()
			{
				// TODO Auto-generated method stub
				
			}

		private static void askForUserGuess()
			{
				// TODO Auto-generated method stub
				
			}

		private static void generateRandomNumber()
			{
				// TODO Auto-generated method stub
				
			}

		private static void greetPlayer()
			{
				// TODO Auto-generated method stub
				
			}

	}
