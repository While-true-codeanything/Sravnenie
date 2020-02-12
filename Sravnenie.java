import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Sravnenie {

	public static void main(String[] args) {
        FileReader f1=null;
        FileReader f2=null;
		try {
			f1 = new FileReader("C:\\Users\\Egor\\Desktop\\Files\\Text1.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			f2 = new FileReader("C:\\Users\\Egor\\Desktop\\Files\\Text2.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		int s1=0;
		int s2 = 0;
		try {
			s1 = f1.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			s2 = f2.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while ((s1!= -1)&&(s2!= -1)) {
			if(s1!=s2) System.out.print("\n"+(char)s1 +" не совпадает с "+(char)s2);
			try {
				s1 = f1.read();
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				s2 = f2.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
