import java.io.*;
import java.util.*;
public class WordCapitalization {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String input = br.readLine();
		String first = input.substring(0,1);
		first = first.toUpperCase();
		String second = input.substring(1);
		pw.println(first+second);
		pw.close();
	}

}
