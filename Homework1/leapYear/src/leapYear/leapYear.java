package leapYear;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		boolean flag = false;
		
		if(year % 4 == 0) {
			if(year % 400 == 0) {
				if(year % 100 == 0) {
					flag = true;
				}
				else flag = false;
			}
			
			else flag = true;
		}
		else flag = false;
		
		
        if(flag)
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");

	}

}
