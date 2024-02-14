public class StudentArrayDemo{
	public static void main(String[] args) {
		Rectangle rec[] = new Rectangle[5];

		for(int i=0;i<5;i++){
			rec[i] = new Rectangle();
		}

		for(int i=0;i<5;i++){
			rec[i].print();
		}
	}
}