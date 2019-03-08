import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

//PrintWriter 클래스를 사용하면 [출력형식 정의]
//친척 : 뇨내, String.format()
public class Ex11_PrintWriter {
	public static void main(String[] args) {
		String pa = "C:\\Temp\\homework.txt";
		try { //파일이 없다면 생성하고, 
			//있다면? 덮어써버린다
			/*
			PrintWriter pw =new PrintWriter(pa);
			pw.println(")_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)");
			pw.println(")_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)");
			pw.println(")_)_)_)_)_)_)_)_)_)HOMEWORKWOWO_)_)_)_)_)_)_)_)_)_)_)");
			pw.println(")_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)");
			pw.println(")_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)");
			pw.printf("%3s : %5d  %5d  %df  %5.1f\n", "아무게", 10, 60 , 50, (float)((10+60+50)/3));
			pw.println(")_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)");	
			pw.println();
			pw.close();
			*/
			//read 라인단위로다가
			FileReader fr = new FileReader(pa);
			BufferedReader br = new BufferedReader(fr);
			String s = "";
			while((s=br.readLine()) != null) {
				System.out.println(s);
			}
			
			br.close();
			fr.close();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	
		
		String path = "C://Temp";
		File f = new File(path);
		f.getAbsoluteFile();
	}
}
