import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

//PrintWriter Ŭ������ ����ϸ� [������� ����]
//ģô : ����, String.format()
public class Ex11_PrintWriter {
	public static void main(String[] args) {
		String pa = "C:\\Temp\\homework.txt";
		try { //������ ���ٸ� �����ϰ�, 
			//�ִٸ�? ����������
			/*
			PrintWriter pw =new PrintWriter(pa);
			pw.println(")_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)");
			pw.println(")_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)");
			pw.println(")_)_)_)_)_)_)_)_)_)HOMEWORKWOWO_)_)_)_)_)_)_)_)_)_)_)");
			pw.println(")_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)");
			pw.println(")_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)");
			pw.printf("%3s : %5d  %5d  %df  %5.1f\n", "�ƹ���", 10, 60 , 50, (float)((10+60+50)/3));
			pw.println(")_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)_)");	
			pw.println();
			pw.close();
			*/
			//read ���δ����δٰ�
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
