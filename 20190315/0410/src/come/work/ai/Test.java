package come.work.ai;
/**
 * ������
 * @author lx
 *
 */
public class Test {
	
	public static void main(String[] args) {
		 Book b1 = new Book();
		 b1.bookName = "ˮ䰴�"; 
		 b1.author = "ʩ����";
		 b1.bookType = "�Ĵ�����";
		 b1.ISBN = "87561423214";
		 b1.price = 188;
		 b1.pageNum = 600;
		 b1.press = "���������";
		 b1.isCollection = true;
		 b1.readbook();
		 boolean result = b1.getCollectionStatus();
		 if(result == true)
		 {
			 System.out.println("���ղ�");
		 }else
		 {
			 System.out.println("δ�ղ�");
		 }
		 double bookPrice = b1.getBookPrice();
		 System.out.println("�۸�Ϊ:"+bookPrice);
		 
		 
	}

}
