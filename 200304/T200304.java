public class T200304 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = s1 + "def"; //通过反编译知道，此处使用StringBuilder.append()实现
		System.out.println(s2);//abcdef

		String s3 = "abcdef";
		String s4 = s2;
		System.out.println(s4);//abcdef
		
		System.out.println(s2 == s3);
		System.out.println(s4 == s3);
		System.out.println(s4 == s2);
	}

	public static void main1(String[] args) {
		int i = 3;
		switch(i) {
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuseday");
			break;
			case 3:
			System.out.println("Wednesday");
			break;
			case 4:
			System.out.println("Thursday");
			break;
			case 5:
			System.out.println("Friday");
			break;
			case 6:
			System.out.println("Saturday");
			break;
			case 7:
			System.out.println("Sunday");
			break;
		}
	}
}

