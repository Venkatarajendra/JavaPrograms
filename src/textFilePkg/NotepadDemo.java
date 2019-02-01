package textFilePkg;

import java.io.*;

public class NotepadDemo {

	public static void main(String[] args) throws IOException {
		File txtFile = new File("E:\\Selenium\\sampleTxtFile.txt");
		//txtFile.createNewFile();
		//Write something to the above file
		FileWriter fw = new FileWriter(txtFile);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Username    Password");
		bw.newLine();
		bw.write("-------	    --------");
		bw.newLine();
		bw.write("venkat1    pwd1");
		bw.newLine();
		bw.write("venkat2    pwd2");
		bw.newLine();
		bw.write("venkat3    pwd3");
		
		bw.close();
		
		FileReader fr = new FileReader(txtFile);
		BufferedReader br = new BufferedReader(fr);
		String str;
		String search = "venkat1";
		int i=0;
		while((str = br.readLine())!= null) {
			i++;
			System.out.println(str);
			if(str.contains(search)){
			System.out.println("String "+search+" exists in the line number: "+i);
			}
			if (i>2) {
				String[] userDetails = str.split(" ");
				String uname = userDetails[0];
				String pwd = userDetails[(userDetails.length)-1];
				System.out.println("UserName is: "+uname+" and Password is: "+pwd);
			}
		}
		
		
		
		br.close();
		

	}

}
