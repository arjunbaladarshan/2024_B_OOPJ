import java.util.Scanner;

public class Box{
	int length;
	int breadth;
	int height;
	public Box(int l, int b, int h){	
		length = l;
		breadth = b;
		height = h;
	}
	public void printVolume(){
		int vol = height * breadth * length;
		System.out.println("Volume = "+vol);
	}
	public void printVolume(){
		System.out.println("Just test");	
	}
}