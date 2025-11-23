package stream_api;
	

public class VarArgsExample {
	public static void main(String[] args) {
		VarArgsExample va = new VarArgsExample();
		
		
		System.out.println(va.sum(1,2,3,4,4,4,4,2,90));
		
	}
	public int sum(int... numbers) {
		int total = 0;
		for(int n : numbers) {
			total += n;
		}
		return total;
	}

}
