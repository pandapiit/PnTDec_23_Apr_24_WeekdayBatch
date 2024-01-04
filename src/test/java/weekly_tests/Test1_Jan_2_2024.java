package weekly_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1_Jan_2_2024 {

	public static void main(String[] args) {
		question5();
		question6();
		question7();
		question8();
		question9();
		question10();

	}

	public static void question1() {
		// Steps
	}

	public static void question2() {
		// selenium-java
	}

	public static void question3() {
        
	}

	public static void question4() {
		// cursor - same line
		// cursor - new line
	}

	public static void question5() {
		int a = 10;
		int b = 20;
		String s1 = "Hello";
		String s2 = "World";
		System.out.println(a + b + s1 + s2);
		System.out.println(s1 + s2 + a + b);

	}

	public static void question6() {
		int a = 10;
		int b = 20;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a <= b);
		System.out.println(a >= b);

	}

	public static void question7() {
		int a = 10;
		int b = 20;
		System.out.println("The individual value of a is : " + a);
		System.out.println("The individual value of b is : " + b);
		System.out.println("The sum of a and b is : " + (a + b));
	}

	public static void question8() {
		int a = 100;
		int b = a++;
		int c = ++a + a++ + b++;
		int d = c++ + a++ + ++b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

	public static void question9() {
		int a = 1;
		int b = a--;
		int c = --a + a-- + b--;
		int d = c-- - a-- + --b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

	public static void question10() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");

		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://amazon.com");
	}
}
