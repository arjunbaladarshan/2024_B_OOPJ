import java.io.*;
import java.util.*;
class DStudent{
	int rollNo;
	String name;
	String batchNo;
	boolean isPresent;

	public DStudent(int rollNo, String name, String batchNo){
		this.rollNo = rollNo;
		this.name = name;
		this.batchNo = batchNo;
	}
}
public class NewAttendance{
	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader("mystudents.csv");
			BufferedReader br = new BufferedReader(fr);
			Scanner sc = new Scanner(System.in);
			LinkedList<DStudent> myStudents = new LinkedList<DStudent>();
			while(br.ready()){
				String temp = br.readLine();
				String data[] = temp.split(",");
				myStudents.add(new DStudent(Integer.parseInt(data[0]),data[1],data[2]));
			}
			
			// for(int i=0;i<myStudents.size();i++){
			// 	DStudent temp = myStudents.get(i);
			// 	System.out.println(temp.name);
			// }

			Iterator<DStudent> itr = myStudents.iterator();

			while(itr.hasNext()){
				DStudent temp = itr.next();
				System.out.println("Roll No. = "+temp.rollNo);
				int isPresent = sc.nextInt();
				if(isPresent==1){
					temp.isPresent = true;
				}
				else{
					temp.isPresent = false;
				}
			}
			itr = myStudents.iterator();
			while(itr.hasNext()){
				DStudent temp = itr.next();
				System.out.println("Is Present. = "+temp.isPresent);
				
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}