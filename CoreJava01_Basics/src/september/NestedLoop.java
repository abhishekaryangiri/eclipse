package september;

public class NestedLoop {
	
	public static void main(String[] args) {
		
		for( int i=1; i<=5;) {
			for(int j=10; j>=5;) {
				System.out.println(i+ "  "+ j);
				j--;
			}
			i++;
		}
	}
}
