package ex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
public class Sample5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br=new BufferedReader(new FileReader("test1.txt"));
			String str1=br.readLine();
			String str2=br.readLine();
			System.out.println("輸入到檔案中的兩個字串是");
			System.out.println(str1);
			System.out.println(str2);
		}
		catch(IOException e) {
			System.out.println("輸出入有錯誤");
		}
		
		
	}

}
