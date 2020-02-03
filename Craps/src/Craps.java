import java.util.Scanner;

public class Craps

	{

		public static String name;

		static int rollSum;

		static int roll;

		static int roll2;

		static boolean feelingLucky;

		static int roll3;

		static int roll4;

		public static void main(String[] args)

			{

				greetuser();

				roll();

				evaluate();

				// redemption();

			}

		private static void greetuser()

			{

				Scanner userStringInput1 = new Scanner(System.in);

				System.out.println("What is your name?");

				name = userStringInput1.nextLine();

			}

		private static void roll()

			{

				roll = (int) (Math.random() * 6) + 1;

				roll2 = (int) (Math.random() * 6) + 1;

				rollSum = roll + roll2;

			}

		private static void evaluate()

			{

				switch (rollSum)

					{

					case 2:

					case 12:

						{

							System.out.println("You rolled a " + roll + " and a " + roll2 + ", for a total of "
									+ rollSum + ", you loose " + name + ".");

							feelingLucky = false;

							break;

						}

					case 7:

					case 11:

						{

							System.out.println("You rolled a " + roll + " and a " + roll2 + ", for a total of "
									+ rollSum + ", you win " + name + ".");

							feelingLucky = false;

							break;

						}

					case 1:

					case 3:

					case 4:

					case 5:

					case 6:

					case 8:

					case 9:

					case 10:

						{

							redemption();

							break;

						}

					}

			}

		private static void redemption()

			{

				System.out.println(
						"You rolled a " + roll + " and a " + roll2 + ", your point is " + rollSum + " " + name + ".");

				feelingLucky = true;

				while (feelingLucky)

					{

						roll3 = (int) (Math.random() * 6) + 1;

						roll4 = (int) (Math.random() * 6) + 1;

						int reRollSum = roll3 + roll4;

						if (reRollSum == 7)

							{

								System.out.println("You rolled a " + roll3 + " and a " + roll4 + ", for a total of "
										+ reRollSum + ", you loose " + name + ".");

								feelingLucky = false;

							}

						else if (rollSum == reRollSum)

							{

								System.out.println("You rolled a " + roll3 + " and a " + roll4 + ", for a total of "
										+ reRollSum + ", you win " + name + ".");

								feelingLucky = false;

							}

						else

							{

								System.out.println("You rolled a " + roll3 + " and a " + roll4 + ", for a total of "
										+ reRollSum + ", but your point is " + rollSum + ".");

							}

					}

			}

	}
