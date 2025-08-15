package String;
//string is immutable
public class StringE {

	public static void main(String[] args) {
		
		
		String s=new String("Java Programs");
		System.out.println(s);
		System.out.println("charat="+s.charAt(0));
		System.out.println("length="+s.length());
		System.out.println("uppercase="+s.toUpperCase());
		System.out.println("lowercase="+s.toLowerCase());
		System.out.println("indexof="+s.indexOf("J"));
		System.out.println("indexof="+s.indexOf(" "));
		System.out.println("indexof="+s.indexOf("c"));
		System.out.println("last index"+s.lastIndexOf("s"));
		System.out.println("last index"+s.lastIndexOf("p"));
		System.out.println("start index="+s.startsWith("J"));
		System.out.println("start index="+s.startsWith("o"));
		System.out.println("last index="+s.endsWith("s"));
		System.out.println("replace="+s.replace('a', 'e'));
		
	}
}
