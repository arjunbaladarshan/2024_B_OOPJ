
public class DemoOuterClass{
	static class Abc{
		public static int count = 10;

		public void print(){
			System.out.println(count);
		}
	}
	public static void main(String[] args) {
		DemoOuterClass.Abc a = new DemoOuterClass.Abc();
		a.print();
	}
}