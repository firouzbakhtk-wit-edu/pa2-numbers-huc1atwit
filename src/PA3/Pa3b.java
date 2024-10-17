package PA3;
import java.util.Scanner;
public class Pa3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String sign = "x";
		System.out.printf("Enter your birth month (1-12): ");
		int month = input.nextInt();
		System.out.printf("Enter your birth day (1-31): ");
		int day = input.nextInt();
		String horoscope = "x";
		if (month == 1) {
			if (day>19) {
				sign = "Aquarius";
				horoscope = "Think outside the box today, and collaborate with others to bring innovative ideas to life.";
			} else {
				sign = "Capricorn";
				horoscope = "Your hard work is paying off, but make time to relax and connect with loved ones.";
			}
		} else if (month == 2) {
			if (day>18) {
				sign = "Pisces";
				horoscope = "Your creativity is at its peak, so trust your intuition while staying connected to reality.";
			} else {
				sign = "Aquarius";
				horoscope = "Think outside the box today, and collaborate with others to bring innovative ideas to life.";
			}
		} else if (month == 3) {
			if (day>20) {
				sign = "Aries";
				horoscope = "Take charge today, but remember to think before you act to avoid impulsive decisions.";
			} else {
				sign = "Pisces";
				horoscope = "Your creativity is at its peak, so trust your intuition while staying connected to reality.";
			}
		} else if (month == 4) {
			if (day>19) {
				sign = "Taurus";
				horoscope = "Focus on financial matters and indulge in simple pleasures, but don’t forget your long-term goals.";
			} else {
				sign = "Aries";
				horoscope = "Take charge today, but remember to think before you act to avoid impulsive decisions.";
			}
		} else if (month == 5) {
			if (day>20) {
				sign = "Gemini";
				horoscope = "Your social energy is high, making it a great day for networking and learning something new.";
			} else {
				sign = "Taurus";
				horoscope = "Focus on financial matters and indulge in simple pleasures, but don’t forget your long-term goals.";
			}
		} else if (month == 6) {
			if (day>21) {
				sign = "Cancer";
				horoscope = "Embrace your sensitive side and nurture close relationships while prioritizing self-care.";
			} else {
				sign = "Gemini";
				horoscope = "Your social energy is high, making it a great day for networking and learning something new.";
			}
		} else if (month == 7) {
			if (day>22) {
				sign = "Leo";
				horoscope = "Your natural charisma shines today—use it to inspire others, but also listen to their input.";
			} else {
				sign = "Cancer";
				horoscope = "Embrace your sensitive side and nurture close relationships while prioritizing self-care.";
			}
		} else if (month == 8) {
			if (day>22) {
				sign = "Virgo";
				horoscope = "You’re in full problem-solving mode, but be gentle with yourself and others as you strive for perfection.";
			} else {
				sign = "Leo";
				horoscope = "Your natural charisma shines today—use it to inspire others, but also listen to their input.";
			}
		} else if (month == 9) {
			if (day>22) {
				sign = "Libra";
				horoscope = "Balance is key, and today offers opportunities to create harmony in your relationships.";
			} else {
				sign = "Virgo";
				horoscope = "You’re in full problem-solving mode, but be gentle with yourself and others as you strive for perfection.";
			}
		} else if (month == 10) {
			if (day>22) {
				sign = "Scorpio";
				horoscope = "Embrace transformation and trust your instincts as hidden truths come to light.";
			} else {
				sign = "Libra";
				horoscope = "Balance is key, and today offers opportunities to create harmony in your relationships.";
			}
		} else if (month == 11) {
			if (day>21) {
				sign = "Sagittarius";
				horoscope = "Adventure is calling—explore new ideas or experiences, but stay grounded in your bigger goals.";
			} else {
				sign = "Scorpio";
				horoscope = "Embrace transformation and trust your instincts as hidden truths come to light.";
			}
		} else if (month == 12) {
			if (day>21) {
				sign = "Capricorn";
				horoscope = "Your hard work is paying off, but make time to relax and connect with loved ones.";
			} else {
				sign = "Sagittarius";
				horoscope = "Adventure is calling—explore new ideas or experiences, but stay grounded in your bigger goals.";
			}
		}
		System.out.println("You are a " + sign + "!");
		System.out.printf(horoscope);
	}

}
