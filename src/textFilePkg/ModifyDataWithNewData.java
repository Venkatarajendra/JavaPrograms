package textFilePkg;
import java.io.*;

public class ModifyDataWithNewData {
	
	static void modifyFile(String filePath, String oldData, String newData) throws IOException {
		File file = new File (filePath);
		BufferedReader reader = null;
		Writer writer = null;
		String oldContent = "";
		
		reader = new BufferedReader(new FileReader(file));
		String line = reader.readLine();
		while (line!=null) {
			oldContent = oldContent+line+System.lineSeparator();
			line = reader.readLine();
		}
		
		String newContent = oldContent.replaceAll(oldData, newData);
		writer = new BufferedWriter(new FileWriter(file));
		writer.write(newContent);
		
		reader.close();
		writer.close();
	}
	
	public static void main(String[] args) throws IOException {
		modifyFile("E:\\Selenium\\MarksFile.txt", "85", "95");

	}

}
