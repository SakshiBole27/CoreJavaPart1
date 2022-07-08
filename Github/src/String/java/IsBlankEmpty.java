package String.java;

public class IsBlankEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ABC".isBlank());	
		
	    System.out.println("".isBlank());
	    
	    
	    
	    // isEmpty
	    System.out.println("ABC".isEmpty());	
		
	    System.out.println("".isEmpty());
	    
	    
	    //CompareTo
	    String mystr1="Hello";
	    String mystr2="Sakshi";
	    System.out.println(mystr1.compareTo(mystr2));
	    
	    
	    //trim strip repeat
	    String str1=" java ";
	    System.out.println(str1.trim());
	    
	    System.out.println(str1.strip());
	    System.out.println("leading"+str1.stripLeading());
	    System.out.println("trailing"+str1.stripTrailing());
	    
	    System.out.println("repeat"+str1.repeat(4));
	    
	    
	    
	    //ToCharArray
	    String s ="JAVA";
	    s.toCharArray();
	    System.out.println("ToCharArray" +s.toCharArray());
	    
	    
	}
}
