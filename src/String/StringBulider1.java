package String;

public class StringBulider1 {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("java");
		sb.append("program12");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
//		System.out.println(sb.toString());
		System.out.println(sb.charAt(0));
		System.out.println(sb.substring(0, 3));
	}
	
}
