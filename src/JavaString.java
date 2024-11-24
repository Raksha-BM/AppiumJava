
public class JavaString {

	public static void main(String[] args) {
	System.out.println(reverseString("HELLO"));

	}

	public static String reverseString(String s)
	{
//		OLLEH
		StringBuilder sb = new StringBuilder();
		for(int i=s.length()-1;i>=0;i--)
		{
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}
