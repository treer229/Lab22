import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
	static String currentPath = "C:\\";

	static void viewFile(String[] arg) {
//      arg[0] = "type";
//      arg[1] = "today.txt";
      FileReader fr = null;
      BufferedReader bi = null;

      try {
          fr = new FileReader(arg[1]);
          bi = new BufferedReader(fr);
          int line = 0;
          for (int i = 0; (line = bi.read()) != -1; i++) {
              System.out.print((char)line);
          }
      } catch (Exception e) {
          e.printStackTrace();
      }

  }
	
	static void RenameJH(String[] args) {
        // �м��۾�
        File f = new File(currentPath); // args[0] > C:\\Temp
        Scanner sc = new Scanner(System.in);

        System.out.println("�ٲٷ��� ���ϸ� �Է�");
        String bef = sc.nextLine();
        String path = "";
        path = f + "\\"+bef;
        File before = new File(path);

        if (before.exists()) {
            System.out.println("�ٲ� ���ϸ� �Է�");
            String aft = sc.nextLine();
            path = f + "\\" + aft;
            File after = new File(path);

            if (after.exists()) {
                System.out.println("�̹� �������ִ� �����̸�");
            } else {
                before.renameTo(after);
                System.out.println("����Ϸ�");
            }
        } else
            System.out.println("�����̾���");
    }
	
	static void makeDirectory(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("���� : [java���ϸ�] mkdir [�������丮��]");
            
        }
        File f = new File(currentPath);

        if (!f.exists() || !f.isDirectory()) { // �������� �ʰų� ���丮 �ƴ϶��
            System.out.println("��ȿ���� ���� ���丮�Դϴ�");
           
        }

        if (args[0].equalsIgnoreCase("MKDIR")) {

            String path = "";
            path = f + "\\" + args[1];
            File newfile = new File(path);
            if (newfile.exists()) {
                System.out.println("�̹� �����ϴ� ���丮�Դϴ�");
            } else {
                newfile.mkdir();
            }
        }
    }
	
	static void deleteDirectory(String[] args) throws Exception {

        if (args.length != 2) {
            System.out.println("���� : [java���ϸ�] delete [���ϸ�]");
            
        }

        File f = new File(currentPath);
        
        if (args[0].equalsIgnoreCase("RMDIR")) {
            String path = "";
            path = f + "\\" + args[1];
            File deletefile = new File(path);

            if (!deletefile.exists()) {
                System.out.println("���� ���� �ʴ� �����Դϴ�");
            } else {
                deletefile.delete();
            }

        }

    }

	static void chnageDirectory(String[] arg) {
		File cd = new File(arg[1]);
		// cd temp�� �ȵǰ� cd \temp�� �ؾ� �Ǵ� ����
		if (cd.isDirectory()) {

			if (arg[1].startsWith("..")) {
				int num = 0;
				String[] ss = null;
				ss = arg[1].split("/");
				for (String s : ss) {
					if (s.equals(".."))
						num++;
				}
				String[] str = currentPath.split("\\\\");
				currentPath = currentPath.substring(0, currentPath.lastIndexOf(str[str.length - num]));
				if (currentPath.equals(""))
					currentPath = "C:\\";
			} else {
				currentPath = cd.getAbsolutePath();
			}
		} else {
			System.out.println("������ ��θ� ã�� �� �����ϴ�.");
		}
	}

	static void viewDirectory(String[] arg) {
		File dir = new File(currentPath);
		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			String name = file.getName(); // ���ϸ�(a.txt), ������

			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH-mma");
			DecimalFormat nf = new DecimalFormat("#,###");
			String attribute = "";
			long size = 0;

			if (files[i].isDirectory()) {
				attribute = "<DIR>";
			} else { // �������� ���� (a.txt, copy.jpg.. )
				attribute = "     ";
				size = file.length();
			}
			System.out.printf("%s     %6s     %10s  %s \n", df.format(file.lastModified()), attribute, nf.format(size),
					name);

		}
		System.out.println();
	}

	static void RenameSJ(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		boolean result = false;
		String ExE = "";
		do {
			System.out.println("������ ����ϴ� ���ϸ��� �Է����ּ���");
			String name = sc.nextLine();
			String fileName = currentPath + "\\" + name;
			System.out.println(fileName);
			File f = new File(fileName);
			if (f.exists()) {// �����ϰ����ϴ� ���ϸ��� ������ ���� �Ұ�� ����
				System.out.println("�����Ͻð� ���� �̸��� �Է����ּ���");
				if(name.lastIndexOf(".") > 0) {
					ExE = name.substring(name.lastIndexOf("."));
			}
				String wantChangeName = currentPath + "\\" + sc.nextLine() + ExE;
				File f2 = new File(wantChangeName);
				if (!f2.exists()) {// �����ϰ��� �ϴ� ������ ������ ���� ��� ���ڰ��� �����ְ� renameto���� while�� ����
					System.out.println(wantChangeName);
					System.out.println("����");
					f.renameTo(f2);
					result = false;
				} else {
					System.out.println("�̸��� �ߺ��Ǿ����ϴ� �ٽ� �Է��ϼ���.");
					result = true;
				}
			} else { // �̸��� �߸��Է��Ѱ�� ���α׷� ����
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				result = true;
			}
		} while (result);
	}

	static void Copy(String[] arg) {
		    
		    Scanner sc = new Scanner(System.in);
		    
		    System.out.println("�����ϰ� ���� ������ �����ϼ���");
	        File F = new File(currentPath + "\\"+ sc.nextLine());
	        System.out.println(F);
	        String name = F.getName();

	        System.out.println("�����ϰ� ���� ������ ��� : ");
	        String adr = sc.nextLine();
	        System.out.println(adr);

	        FileReader fr = null;
	        BufferedReader br = null;
	        FileWriter fw = null;
	        BufferedWriter bw = null;

	        try {
	            fr = new FileReader(F);
	            br = new BufferedReader(fr);
	            fw = new FileWriter(adr + "\\" + name);
	            bw = new BufferedWriter(fw);
	            int data = 0;
	            while ((data = br.read()) != -1) {
	                bw.write(data);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                bw.close();
	                fw.close();
	                br.close();
	                fr.close();

	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	               System.out.println("���� �Ϸ�");
	    }
	
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		String userInput = "";
		currentPath = System.getProperty("user.dir");
//		currentPath = args[0];
		while (!userInput.equalsIgnoreCase("EXIT")) {
			System.out.println(currentPath + ">");
			userInput = sc.nextLine();
			// System.out.println(userInput);

			String[] arg = userInput.split(" ");
//			for (String a : arg) {
//				System.out.println(a);
//			}

			if (arg[0].equalsIgnoreCase("RENAMESJ")) {
				RenameSJ(arg);
			} else if (arg[0].equalsIgnoreCase("CD")) {
				chnageDirectory(arg);
			} else if (arg[0].equalsIgnoreCase("DIR")) {
				viewDirectory(arg);
			} else if (arg[0].equalsIgnoreCase("COPY")) {
				Copy(arg);
			} else if(arg[0].equalsIgnoreCase("RMDIR")) {
				deleteDirectory(arg);
			} else if(arg[0].equalsIgnoreCase("MKDIR")) {
				makeDirectory(arg);
			} else if(arg[0].equalsIgnoreCase("RENAMEJH")) {
				RenameJH(arg);
			} else if(arg[0].equalsIgnoreCase("VIEWFILE")) {
				viewFile(arg);
			}
 		}
	}
}