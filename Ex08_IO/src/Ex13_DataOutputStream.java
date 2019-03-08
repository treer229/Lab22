import java.io.DataOutputStream;
import java.io.FileOutputStream;

//���� ��Ʈ��
//JAVA API ���� �⺻Ÿ�� ��� �ł�(Ÿ�Ժ��� read, write) Ŭ����
//DataOutputStram, DataInputStram


public class Ex13_DataOutputStream {
	public static void main(String[] args) {
		int[] score = {100, 50, 40, 30 ,2 , 13};
		try {
			FileOutputStream fos = new FileOutputStream("Score.txt");
			//���۰� ������ ����Ÿ �ƿ�ǲ ��Ʈ���̝�
			DataOutputStream dos = new DataOutputStream(fos);
			//����Ÿ�ƿ�ǲ��Ʈ���� ���ؼ� ���ھ� �ؽ�Ʈ �� ���ն� �ϰڴ�
			for(int i =0 ; i< score.length; i++) {
				dos.writeInt(score[i]); //�������� write.... �ݵ�� read DataInputStream �����������ǰ�������
//				dos.writeUTF(str); ��, ä�� �Ҷ� �ַ� ���
			}
			
			dos.close();
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
