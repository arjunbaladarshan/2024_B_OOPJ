import java.util.*;
import java.io.*;
class DStudent{
	String batchNo;
	String enrollmentNumber;
	String name;
	int marks;
	public DStudent(String batchNo,String enrollmentNumber,String name,int marks){
		this.batchNo=batchNo;
		this.enrollmentNumber=enrollmentNumber;
		this.name=name;
		this.marks=marks;
	}
}
public class MapDemo{
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new FileReader("unit3marks.csv"));

			HashMap<String,DStudent> students = new HashMap<String,DStudent>();
			while(br.ready()){
				String temp = br.readLine();
				String[] data = temp.split(",");
				students.put(data[1],new DStudent(data[0],data[1],data[2],Integer.parseInt(data[3])));
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter enrollmentNumber");
			String enno = sc.nextLine();
			DStudent tempStu = students.get(enno);
			System.out.println("name = "+tempStu.name+", marks = "+tempStu.marks);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}