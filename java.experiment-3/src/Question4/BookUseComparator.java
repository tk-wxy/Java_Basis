package Question4;
import java.util.*;
public class BookUseComparator {

	public static void main(String[] args) {
		ArrayList<Book>al= new ArrayList<Book>();
		al.add(new Book(11, "程序设计", 59.8, new GregorianCalendar(2009, 0, 1)));
		al.add(new Book(2, "操作系统", 35.8, new GregorianCalendar(2018, 8, 8)));
		al.add(new Book(3, "中国历史", 89.68, new GregorianCalendar(2008, 7, 8)));
		System.out.println(" 按照正常加入顺序输出：");
		al.forEach(x->System.out.println(x.toString()));
	
	Collections.sort(al, new Comparator<Book>(){

		@Override
		public int compare(Book o1, Book o2) {
			
			return o1.getId()>=o2.getId()?1:-1;
		}});
	System.out.println("-----------------------------");
	System.out.println(" 按照编号升序输出：");
	al.forEach(x->System.out.println(x.toString()));
	
	
	Collections.sort(al, new Comparator<Book>(){

		@Override
		public int compare(Book o1, Book o2) {
			
			return o1.getPrice()>=o2.getPrice()?1:-1;
		}});
	System.out.println("-----------------------------");
	System.out.println(" 按照价格升序输出：");
	al.forEach(x->System.out.println(x.toString()));
	
	
	Collections.sort(al, new Comparator<Book>(){

		@Override
		public int compare(Book o1, Book o2) {
return o1.getDate().compareTo(o2.getDate());

		}});
	System.out.println("-----------------------------");
	System.out.println(" 按照出版升序输出：");
	al.forEach(x->System.out.println(x.toString()));
	
	
	}
}
