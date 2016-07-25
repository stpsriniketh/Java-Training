package Medication;

import java.util.HashMap;
import java.util.Scanner;

public class Dosage {
	public static void main(String[] args) throws InterruptedException {

		HashMap<String, Integer> mapMedican = new HashMap<String, Integer>();
		boolean loopAgain = true;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("Enter Medican Name :");
			String medican =scan.nextLine();
			System.out.print("Enter Dosage :");
			Integer  dosage  = Integer.parseInt(scan.nextLine());
			Integer oldVal = mapMedican.put(medican, dosage);
			if (oldVal!=null) {
				System.out.println("Medican Name:" + medican + " is "
						+ oldVal + " and Dosage " + dosage);
			}
			System.out.print("Enter another Dosage (y/n)?");
			String answer = scan.nextLine();		
			if (answer.equals("y") || answer.equals("Y")) {
				continue;
			} else {
				break;
			}

		} while (loopAgain);
	    scan.close();

		
	}
}
