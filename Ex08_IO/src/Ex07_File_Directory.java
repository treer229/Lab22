import java.io.File;

/*
 자바는 이상하게도 파일 클래스라는걸 제공한다.
 파일 > 생성, 수정, 삭제 가능 ㅎㄷ~ 강려크
 디렉토리(폴더)(C:\\Temp : 생성, 삭제)
 사용 : 파일정보, 폴더 정보
 
 
 C# : File 클래스, Directory 클래스
 */

//Point : FileOutputStream, FileWriter (파일 생성 가능하다링 강려크) 허지만 주목적은 아니다리

public class Ex07_File_Directory {
	public static void main(String[] args) {
		String path = "C:\\Temp\\file"; // file.txt가 만들어져있는 전제에서 작업  요것은 주소를 의미
		String path2 = "C:\\Temp\\copy";
		File f = new File(path); // 요것은 파일주소에 대한 분석을 요구
		File f2 = new File(path2);
		
		
		String filename = f.getName(); //파일 이름 가져와!
		System.out.println("파일이름: " + filename); //대령했습니다~~!!
		System.out.println("전체경로: " + f.getPath());
		System.out.println("너 폴더니?: " + f.isDirectory());
		System.out.println("절대경로: " + f.getAbsolutePath());
		System.out.println("너 파일이니? " + f.isFile());
		System.out.println("너 숨겨진 자식이니? " + f.isHidden());
		System.out.println("너 크기가 뭐니? " + f.length()+ "byte");
		System.out.println("늬 부모님 불러와라! " + f.getParent());
		System.out.println("늬 있긴하니? " +f.exists());
		System.out.println(f.renameTo(f2));
		f.renameTo(f2);
		//f.createNewFile() 파일생성
//		f.delete(); 파일삭제(return true, false)
//		f.canExecute(); 마! 늬 실행은 가능하나? 귀욤
		f.canExecute();
		
		
		
		
	}
}
