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
public class Unit3Marks{
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new FileReader("unit3-marks.csv"));

			ArrayList<DStudent> students = new ArrayList<DStudent>();
			while(br.ready()){
				String temp = br.readLine();
				String[] data = temp.split(",");
				students.add(new DStudent(data[0],data[1],data[2],Integer.parseInt(data[3])));
			}
			System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
			Collections.sort(students,new MarkComparator());


			Iterator<DStudent> itr = students.iterator();
			while(itr.hasNext()){
				DStudent temp = itr.next();
				System.out.println(temp.batchNo+" # "+temp.name + " got "+ temp.marks);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

class MarkComparator implements Comparator<DStudent>{

	public int compare(DStudent stu1,DStudent stu2){
		if(stu1.marks>=stu2.marks){
			return -1;
		}
		else{
			return 1;
		}

	}

}