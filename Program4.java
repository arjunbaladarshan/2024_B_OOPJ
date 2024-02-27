import java.util.Scanner;
class Student{
	int id_no;
	int no_of_subjects_registed;
	int[] subject_code;
	int[] subject_credit;
	String[] grade_obtained;
	double spi;

	public Student(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID no");
		id_no = sc.nextInt();
		System.out.println("Enter no of subjects registed");
		no_of_subjects_registed = sc.nextInt();
		subject_code = new int[no_of_subjects_registed];
		subject_credit = new int[no_of_subjects_registed];
		grade_obtained = new String[no_of_subjects_registed];

		for(int i=0;i<no_of_subjects_registed;i++){
			System.out.println("Enter Subject Code for subject no "+(i+1));
			subject_code[i] = sc.nextInt();
			System.out.println("Enter Subject Credit for subject no "+(i+1));
			subject_credit[i] = sc.nextInt();
			System.out.println("Enter Grade Obtained for subject no "+(i+1));
			grade_obtained[i] = sc.next();
		}
	}

	public void calculate_spi(){
		// logic to calculate spi;
		double totalCredit = 0;
		int temp=0;
		for(int i=0;i<grade_obtained.length;i++){
			totalCredit += subject_credit[i];
			int gradeW = 0;
			if(grade_obtained[i].equals("A")){
				gradeW = 10;
			}else if(grade_obtained[i].equals("B")){
				gradeW = 9;
			}
			temp = temp + (subject_credit[i]*gradeW);
		}
		spi = temp/totalCredit;
	}
}
public class Program4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of students");
		int n = sc.nextInt();

		Student[] students = new Student[n];

		for(int i=0;i<n;i++){
			students[i] = new Student();
		}

		for(int i=0;i<n;i++){
			students[i].calculate_spi();
		}

		for(int i=0;i<n;i++){
			System.out.println("SPI of student with ID "+students[i].id_no +" = "+students[i].spi);
		}
	}
}