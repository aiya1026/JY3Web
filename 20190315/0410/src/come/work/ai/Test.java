package come.work.ai;
/**
 * 测试类
 * @author lx
 *
 */
public class Test {
	
	public static void main(String[] args) {
		 Book b1 = new Book();
		 b1.bookName = "水浒传"; 
		 b1.author = "施耐庵";
		 b1.bookType = "四大名著";
		 b1.ISBN = "87561423214";
		 b1.price = 188;
		 b1.pageNum = 600;
		 b1.press = "人民出版社";
		 b1.isCollection = true;
		 b1.readbook();
		 boolean result = b1.getCollectionStatus();
		 if(result == true)
		 {
			 System.out.println("已收藏");
		 }else
		 {
			 System.out.println("未收藏");
		 }
		 double bookPrice = b1.getBookPrice();
		 System.out.println("价格为:"+bookPrice);
		 
		 
	}

}
