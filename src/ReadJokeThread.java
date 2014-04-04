import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReadJokeThread implements Runnable {

	private String ReadFile = null;
	
	private int rows_in_file = 0;

	// @param inFile file to have words counted
	public ReadJokeThread(String inFile) throws Exception {
		ReadFile = inFile;
	}

	public void run() {
		try {
			File file = new File(ReadFile);
			Scanner s = new Scanner(new FileInputStream(file));
			//for counting lines in joke file
			Scanner count = new Scanner(new FileInputStream(file));
			//get total number of jokes in file
			while(s.hasNextLine()){
				String line = s.nextLine();
				rows_in_file++;
				}
			System.out.println(rows_in_file);
			
			while(s.hasNextLine()){
			String line = s.nextLine();	wordCount += new StringTokenizer(line, ":").countTokens();
			    //show count .. prove threading is working.
			    System.out.println("Current word count on thread #");
			}
		    System.out.println("Final word count on thread #");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
