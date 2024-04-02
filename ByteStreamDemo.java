import java.io.*;
public class ByteStreamDemo{
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("CEAVB.jpg");
			FileOutputStream fos = new FileOutputStream("CEAVB-enc.jpg");
			int temp = fis.read();
			int counter = 0;
			while(temp>-1){
				counter++;
				if(counter==5000){
					String msg = "koi ne no keto";
					byte[] msgBytes = msg.getBytes();
					fos.write((byte)msg.length());
					fos.write(msgBytes);
				}
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