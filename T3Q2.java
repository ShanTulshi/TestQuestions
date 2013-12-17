public class T3Q2
{
	public static void run()
	{
		String s1 = "new year";
		String s2 = new String("new year");
		String s3 = s1;
		System.out.print("\ns1 == s2 returns " + (s1 == s2) + "\n");
		System.out.print("s1.equals(s2) returns " + (s1.equals(s2)) + "\n");
		System.out.print("s3.equals(s2) returns " + (s3.equals(s2)) + "\n");
	}
}
