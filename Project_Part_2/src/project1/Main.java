package project1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

//main method
	public static void main(String[] args) {

		DecimalFormat f = new DecimalFormat("##.0");
//create new EndUser Object "endUser1" 
		EndUser endUser1 = new EndUser();

		Scanner scanner = new Scanner(System.in);

		getComputerSpecs(scanner, endUser1);

		System.out.println("firstName = " + endUser1.firstName);

		System.out.println("lastName = " + endUser1.lastName);

		System.out.println("age =  " + endUser1.age);

		System.out.println("userResolution = " + endUser1.userResolution);

		endUser1.performanceScore = calculatePerformanceScore(scanner, endUser1);

		System.out.println();
		System.out.println("Computer Hardware Graphics Quality Recommendation Tool \n");
		System.out.println();

		System.out.println("GPU Clock Speed: " + f.format(endUser1.gpuClockSpeed) + " MHz\n");
		System.out.println("CPU Clock Speed: " + f.format(endUser1.cpuClockSpeed) + " MHz\n");
		System.out.println("Number of cores: " + endUser1.numberOfCores + "\n");
		System.out.println("Monitor Resolution: " + endUser1.userResolution + "\n");
		System.out.println("Performance Score: " + endUser1.performanceScore + "\n");
		System.out.println("Recommended Graphics Quality: " + endUser1.recGraphicQuality + "\n");

		calculateRecGraphicQuality(endUser1);

		scanner.close();
	}

	public static String calculateRecGraphicQuality(EndUser endUser1) {

		if (endUser1.performanceScore > 17000) {
			endUser1.recGraphicQuality = "Ultra";
			System.out.println("---Ultra---");
		} else if (endUser1.performanceScore <= 17000 && endUser1.performanceScore > 15000) {
			endUser1.recGraphicQuality = "High";
			System.out.println("------");
		} else if (endUser1.performanceScore > 13000 && endUser1.performanceScore <= 15000) {
			endUser1.recGraphicQuality = "Medium";
			System.out.println("------");
		} else if (endUser1.performanceScore > 11000 && endUser1.performanceScore <= 13000) {
			endUser1.recGraphicQuality = "Low";
			System.out.println("------");
		} else {
			endUser1.recGraphicQuality = "Unable to play";
			System.out.println("weeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
			System.out.println("------");
		}

		return endUser1.recGraphicQuality;

	}

	public static EndUser getComputerSpecs(Scanner scanner, EndUser endUser1) {

		System.out.println("Enter first name:");

		endUser1.firstName = scanner.nextLine();

		System.out.println("Enter your last name:");

		endUser1.lastName = scanner.nextLine();

		System.out.println("Enter your age:");

		endUser1.age = scanner.nextInt();

		System.out.println("What is the clock speed (in Megahertz) of your graphics card (GPU)?");

		endUser1.gpuClockSpeed = scanner.nextFloat();

		System.out.println("Enter the clock speed (in Megahertz) of your processor (CPU)");

		endUser1.cpuClockSpeed = scanner.nextFloat();

		System.out.println("Enter the number of cores your computer has");

		endUser1.numberOfCores = scanner.nextInt();

		endUser1.userResolution = getUserResolution(scanner, endUser1);

		return endUser1;

	}

	public static String getUserResolution(Scanner scanner, EndUser endUser1) {
		try {
			System.out.println("Select the resolution of your monitor. Enter a number 1-4");

			ArrayList<String> resolutionSelection = new ArrayList<String>();

			resolutionSelection.add("1280 x 720");
			resolutionSelection.add("1920 x 1080");
			resolutionSelection.add("2560 x 1440");
			resolutionSelection.add("3840 x 2160");

			System.out.println("1. 1280 x 720");
			System.out.println("2. 1920 x 1080");
			System.out.println("3. 2560 x 1440");
			System.out.println("4. 3840 x 2160");

			int userResolutionSelection = scanner.nextInt();

			verifyInputA(userResolutionSelection);
			
			switch(userResolutionSelection) {
			case 0:
				endUser1.multiplier = 1f;
				break;
				
			case 1:
				endUser1.multiplier=0.75f;
				break;
			case 2:
				endUser1.multiplier=0.55f;
				break;
			case 3:
				endUser1.multiplier=0.35f;
				break;
				default:endUser1.multiplier = 1f}
		

			endUser1.userResolution = resolutionSelection.get(userResolutionSelection - 1);

		} catch (Exception e) {
			
		}
			System.out.println("Enter an integer number 1-4");

		}

	return endUser1.userResolution;

	}

	public static void verifyInputA(int userResolutionSelection) {
		if (userResolutionSelection > 4 || userResolutionSelection < 1) {

			System.out.println("Enter a number value 1-4");

		}

	}

	public static float calculatePerformanceScore(Scanner scanner, EndUser endUser1) {
		endUser1.performanceScore = ((5 * endUser1.gpuClockSpeed) +
				(endUser1.numberOfCores * 4200)) * 1;

		return endUser1.performanceScore;

	}

}
