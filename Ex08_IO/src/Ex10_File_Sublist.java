import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex10_File_Sublist {
	static int totalFiles = 0; //객채간 공유 자원 아니고 스테틱 변수
	static int totaldirs= 0; //객채간 공유 자원 아니고 스테틱 변수
	
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("야이 자식아! 똑디 안하나!");
			System.out.println("java [파일명] [경로명] 이리하라 안카나");
			System.out.println("java Ex10_File_Sublist C:\\Temp 내 이까지 해주는걸 다행이 알아라");
			System.exit(0); // 프로세스 종료!
		}
		
		File f = new File(args[0]); // args[0] > C:\\Temp
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("으딜!");
			System.exit(0);
		}
		//폴더라고 판단되는 시점
		printFileList(f);
		System.out.println("총 파일 수 :" + totalFiles);
		System.out.println("총 폴더 수" + totaldirs);
	}
	
	static void printFileList(File dir) {
		System.out.println("[Full Path : " + dir.getAbsolutePath() + "]");
		//요 콜렉션의 의미는 무엇일까
		List<Integer> subDir = new ArrayList<Integer>();
		File[] files = dir.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			String filename = files[i].getName();
			if(files[i].isDirectory()) {
				filename = "<DIR> [" + filename +"]";
				//Point
				//에드의 의미는 무엇일까 폴더의 갯수를 누적시킨것
				subDir.add(i);
			} else {
				filename = filename + " / " + files[i].length() + "Byte";
			}
			System.out.println("   " + filename);
		}
		//질문
		int dirnum = subDir.size();
		int filenum = files.length - dirnum;
		
		//누적값
		totaldirs += dirnum; // 폴더 누적 개수
		totalFiles += filenum; // 파일 누적 개수
		
		System.out.println("[Current dirnum]: " +dirnum);
		System.out.println("[Current Filenum]: " + filenum);
		System.out.println("++++++++++++++++++++++++++++++++");
		
		
		//포문의 해석 subDir 즉 폴더 안의 폴더의 갯수 만큼 다시 함수를 실행하도록 하는 함수
		for(int j=0; j<subDir.size(); j++) {
			int index = subDir.get(j);
			printFileList(files[index]);
		}
		
	}
}
