public class T3Q7{
	public static void run(){
		String m = new String("I am\nso ready\nfor my\nFinal Exam(s)");
		String p = new String("\n");
		int i = m.indexOf(p);
		while(i>=0){
			m=m.substring(0,i) + " " + m.substring(i+p.length());
			i = m.indexOf(p);
		}
		System.out.println(m);
	}
}
