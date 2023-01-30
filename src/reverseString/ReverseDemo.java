package reverseString;

public class ReverseDemo {

	public static void main(String[] args) {
	
	String s = "cdbhosle";
	
	//String revString = "";
	
	StringBuffer sb = new StringBuffer(s);
	StringBuffer reverse = sb.reverse();
	System.out.println(reverse);
	
	}

}
