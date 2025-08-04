//Display the Zodiac Sign Based on Month and Date
//Enter month & day, print corresponding zodiac sign.

//switch statement

package greek;

import java.util.Scanner;

public class SwitchZodiacSign {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day");
		int  day = sc.nextInt();
		System.out.println("Enetr month:");
		int month = sc.nextInt();
		
		String   zodiac = "";
		
		switch(month)
		{
		case 1: zodiac = (day < 20) ? "Capricorn" : "Aquarius";
		break;
		
		case 2: zodiac = (day <19) ? "Aquarius" : "Pisces";
		break;
		
		case 3: zodiac = (day < 21) ? "Pisces" : "Aries";
		break;
		
		case 4: zodiac = (day < 20) ? "Aries" : "Taurus";
		break;

		case 5: zodiac = (day < 21) ? "Taurus" : "Gemini";
		break;

		case 6: zodiac = (day < 21) ? "Gemini" : "Cancer";
		break;

		case 7: zodiac = (day < 23) ? "Cancer" : "Leo";
		break;

		case 8: zodiac = (day < 23) ? "Leo" : "Virgo";
		break;

		case 9: zodiac = (day < 23) ? "Virgo" : "Libra";
		break;

		case 10: zodiac = (day < 23) ? "Libra" : "Scorpio";
		break;

		case 11: zodiac = (day < 22) ? "Scorpio" : "Sagittarius";
		break;

		case 12: zodiac = (day < 22) ? "Sagittarius" : "Capricorn";
		break;

		default: zodiac = "Invalid Month. Please try again...";
		}
		System.out.println("Zodiac Sign:" + zodiac);
		sc.close();
	}
}
