package String;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("java");
//		System.out.println(s);
//		s.append("program");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		s.insert(2, "of");
		System.out.println(s);
		s.replace(0, 2, "is");
		System.out.println(s);
		s.replace(0, 2, "isnfgj");
		System.out.println(s);
		s.delete(1, 3);
		System.out.println(s);
	}
}

//user deatils
//lastname
//firtname
//dob
//username : firstname lastname
//password: first_name date of birth