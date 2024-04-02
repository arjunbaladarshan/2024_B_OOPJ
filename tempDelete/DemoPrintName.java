class Student{
	String name;
	int rollNo;
	public Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	@Override
	public String toString(){
		return this.rollNo+"#"+this.name;
	}
}
public class DemoPrintName{
	public static void main(String[] args) {
		Student s1 = new Student("deep",101);
		Student s2 = new Student("pujan",102);
		Student s3 = new Student("yash",103);

		System.out.println(s3);
	}
}