public class Exc{
	public static void main(String args[]){
		try {
			throw new Exception("hello");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}