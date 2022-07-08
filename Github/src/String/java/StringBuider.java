package String.java;

public class StringBuider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startingTime=System.currentTimeMillis();
		StringBuffer sbuffer = new StringBuffer("Hello");
		for(int i=0;i<1000;i++) {
		sbuffer.append("java");
		}
		System.out.println("Time consumed by StringBuffer:"+(System.currentTimeMillis()-
				startingTime)+"milliseconds");
		
		 startingTime=System.currentTimeMillis();
		StringBuider sbuilder = new StringBuider("Hello");
		for(int i=0;i<1000;i++) {
		sbuilder.append("java");
		}
		System.out.println("Time consumed by StringBuilder:"+(System.currentTimeMillis()-
				startingTime)+"milliseconds");
		
	}

}
