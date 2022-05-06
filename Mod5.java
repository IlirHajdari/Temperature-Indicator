import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mod5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList <String> day = new ArrayList(Arrays.asList(
				"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
		
		ArrayList <Integer> temperature = new ArrayList(Arrays.asList(72, 76, 78, 83, 87, 85, 81));
		
		System.out.println("Enter any day of the week to get the temperature for that day. \nYou can also type in 'week' to get the temperatures for each day of the week. ");
		Scanner sc = new Scanner(System.in);
		String dayInput = sc.next();
		
		if(dayInput.equalsIgnoreCase("week") || dayInput.equalsIgnoreCase("Week")) {
			
			int average = 0;
			
			System.out.println("The days of the week and their recorded temperatures are below: ");
			for (int i =0; i < day.size(); i++) {
				average = average + (Integer)temperature.get(i);
				System.out.println(day.get(i) + " " + temperature.get(i));
			}
			
			System.out.println("The average temperature of the entire week is: " + (average/7.0));
		} else {
			System.out.println("The day of the week and the recorded temperature for that day is displayed below: ");
			System.out.println();
			for (int i = 0; i < day.size(); i++) {
				if (day.get(i).equalsIgnoreCase(dayInput))
					System.out.println(day.get(i) + " " + temperature.get(i));
			}
		}
		
				
	}
}
