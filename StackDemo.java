import java.util.*;
public class StackDemo{
	public static void main(String[] args) {
		Queue<String> names = new LinkedList<String>();

		names.offer("arjun");
		names.offer("bala");
		names.offer("INDIA");

		System.out.println("Queue Before = "+names);
		String temp = names.poll();

		System.out.println("PEEK = "+temp);


		System.out.println("Queue After = "+names);
	}
}