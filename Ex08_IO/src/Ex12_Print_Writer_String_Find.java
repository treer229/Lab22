import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//특정 폴더에서 검색할 단어가 주어지면
//그 단어가 포함된 파일 목록 출력하기

public class Ex12_Print_Writer_String_Find {
	String baseDir = "C:\\Temp"; //폴더가 있는
	String word = "hellow"; //내가 찾을 단어
	String save = "result.txt"; //검색결과에 대한 출력
	
	void Find() throws IOException {
		File dir = new File(baseDir);
		
		if(!dir.isDirectory()) {
			System.out.println("baseDir :" + "is not directory or exist");
			System.exit(0);
		}
		
		PrintWriter writer = new PrintWriter(new FileWriter(save));
		BufferedReader br = null;
		
		File[] files = dir.listFiles();//리스트 파일은 다가져오겠다라는 뜻 temp아래있는것
		for(int i = 0 ; i <files.length; i++ ) {
			if(!files[i].isFile()) {//파일이 아니라면
				continue;//이후 구문은 스킵스킵예~
			} 
			br = new BufferedReader(new FileReader(files[i]));
			//a.txt ,b.txt 파일 read을 준비(buffer 통해서 line() 단위)
			String line ="";
			while((line = br.readLine())!= null) {
				if(line.indexOf(word) != -1) {
					//기록 (result.txt) 파일명
					writer.write(word +" = " + files[i].getAbsolutePath());
				}
			}
			writer.flush();
			
		}
		br.close();
		writer.close();
		
	}
	public static void main(String[] args) {
		
		try {
			Ex12_Print_Writer_String_Find StringFind = new Ex12_Print_Writer_String_Find();
			StringFind.Find();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
		
		
	}
}
