package textFilePkg;

import java.io.*;
import java.util.*;
 
// Program for removing duplicate data and copy to new file with unique data
// Problem: Input file has Face Book Users data like U1, U2 and U3,U4 that mean U1 is friend of U2 and U3 is friend of
// U4 that means U1,U2 and U2,U1 are same. We need to remove duplicate data from file 1 and copy unique data to file2

public class RemoveDupData {

	public static void main(String[] args) throws Exception {
		String fpath1 = "E:\\Webdriverwork\\inputFile.txt";
		String fpath2 = "E:\\Webdriverwork\\outputFile.txt";
		File ipFile = new File(fpath1);
		File opFile = new File(fpath2);
		BufferedReader br = new BufferedReader(new FileReader(ipFile));		
		ArrayList<String> al = new ArrayList<String>();		
		String iline;		
		while ((iline=br.readLine())!=null) {
			System.out.println("Input line from file is: "+iline);
			if (al.size()==0) {
				al.add(iline);				
			}
			else {
				boolean flag = false;
				for (int i=0; i<al.size(); i++) {				
					String[] users = iline.split(",");
					if((al.get(i).contains(users[0]) && (al.get(i).contains(users[1])))) {
						flag = false;
						break;						
					}
					else {
						flag= true;
					}
				}
				
				if (flag) {					
					al.add(iline);					
				}
			}			
		}
		br.close();
		System.out.println("List of Elements to add to output file: "+al);
		BufferedWriter bw = new BufferedWriter(new FileWriter(opFile));
		for (int i=0; i<al.size(); i++) {
			bw.write(al.get(i));
			bw.newLine();
		}
		bw.close();
	}

}
