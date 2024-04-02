import java.io.*;
import java.util.*;
public class FileDemo{
	public static void main(String[] args) {
		File firstFile = new File("D:\\Darshan University\\Data\\BTech\\Sem-2\\2023-24\\Codes\\B\\tempDelete");
		
		String[] allFiles = firstFile.list();

		for(int i=0;i<allFiles.length;i++){
			File tmp = new File(firstFile,allFiles[i]);
			tmp.delete();
		}
	}
}