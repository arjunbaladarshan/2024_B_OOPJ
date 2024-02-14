import java.util.Scanner;
public class Rectangle{
	int width;
	int height;

	public Rectangle(){
		Scanner sc = new Scanner(System.in);
		width = sc.nextInt();
		height =  sc.nextInt();
	}

	public void print(){
		for(int i=0;i<height;i++){
			for(int j=0;j<width;j++){
				System.out.print("* ");
			}
			System.out.println(" ");
		}	
		System.out.println("##################################");
	}

}
