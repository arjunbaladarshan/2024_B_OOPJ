import java.io.*;
public class RansomWare{
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("CEAVB.jpg");
			FileOutputStream fos = new FileOutputStream("CEAVB-ransom.avb");
			int temp = fis.read();
			int counter = 0;
			while(temp>-1){
				temp = temp/2;
				fos.write(temp);
				temp = fis.read();
			}
			fos.close();
			fis.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}