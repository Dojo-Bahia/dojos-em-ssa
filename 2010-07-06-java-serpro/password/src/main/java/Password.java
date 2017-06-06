import java.util.Scanner;

public class Password {
	private String secret;

	public Password(String secret) {
		this.secret = secret;
	}

	public Password() {
	}

	public String guess(String pwd) {
		if (pwd.equals(secret))
			return "CCCCC";
		else {
			String c = "";
			String e = "";
			for (int i = 0; i < pwd.length(); i++)
				if (pwd.charAt(i) == secret.charAt(i))
					c += "C";
				else if (secret.contains(pwd.substring(i, i + 1)))
					e += "E";

			return c + e;
		}
	}

	public void generateSecret() {
		secret = "";
		do {
			String color = new Integer((int) (Math.random() * 10)).toString();
			if (!secret.contains(color))
				secret += color;
		} while (secret.length() < 5);
	}

	public String getSecret() {
		return secret;
	}

	public static void main(String args[]) {
		System.out.println("PASSWORD GAME");
		System.out.println("Inform 5 digits (0 to 9). END to quit.");
		System.out.println("You have 10 tentatives\n");
		Password pwd = new Password();
		pwd.generateSecret();
		boolean guessed = false;
		int tries = 0;
		Scanner in = new Scanner(System.in);
		while (tries++ < 10 && guessed == false) {
			System.out.print(tries + ":");
			String theSecret = in.nextLine();
			if (theSecret.equalsIgnoreCase(("END")))
				break;
			String result = pwd.guess(theSecret);
			if (result.equals("CCCCC"))
				guessed = true;
			else
				System.out.println("       " + result);
		}
		if (guessed == true)
			System.out.println("GONGRATULATIONS, YOU'RE A GENIUS!");
		else
			System.out.println("TOO BAD! " + pwd.getSecret());
	}
}
