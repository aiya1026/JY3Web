package come.work.ai;

import java.util.Scanner;

public class UserTest {
	
	
	public static void main(String[] args) {
		//����һ��user�Ķ���
		User user = new User();
		//����һ����������Ķ���
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û�����");
		String username = scanner.next();
		System.out.println("���������룺");
		String psw = scanner.next();
		//���ü���û��ķ���
		boolean checkUser = user.checkUser(username, psw);
		//System.out.println(checkUser);
		System.out.println(checkUser == true ? "��¼�ɹ�":"��¼ʧ��");
		//�ر�ˮ��
		scanner.close();
	}

}
