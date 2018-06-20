package fr.gtm.tp.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exo1 implements Runnable {

	private static final Logger LOGGER = LoggerFactory.getLogger(Exo1.class);

	private final String username;
	Scanner sc = new Scanner(System.in);

	public Exo1(final String[] args) {
		if (args.length > 0)
			this.username = args[0];
		else {
			this.username = null;
			LOGGER.error("" + "Impossible d'executer l'application, veuillez démarrer le programme avec un argument");
			this.usage();
			System.exit(1);
		}
	}

	private void usage() {
		LOGGER.info("USAGE : exo1 <username>");
		LOGGER.info("\t- username : Votre pseudo");
	}

	@Override
	public void run() {
		LOGGER.info("Bienvenu {} !", this.username);

		boolean condition = false;
		while (!condition) {
			System.out.println("Veuillez Introduire votre chiffire");
			int number;
			try {
				number = sc.nextInt();
			} catch (InputMismatchException e) {
				if (sc.next().equals("exit")) {   // l'information reste coincée dans le buffer jusqu'a ce que je fasse next() ou nextLine()
					condition = true;
				} else {
					System.err.println("La valeur saisie est invalide, veuillez recommencer.");
				}
				continue;
			}
			
			if (number == 0) {
				System.out.println("Le nombre saisi est nul");
			} else if (number % 2 == 0 ) {
				System.out.println("Le nombre saisi est pair");
			} else {
				System.out.println("Le nombre saisi est impaire");
			}
			
			
			
			
		}

	}

	

	public static void main(String[] args) {

		new Exo1(args).run();

	}

}
