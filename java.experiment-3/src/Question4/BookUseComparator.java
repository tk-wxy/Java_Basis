package Question4;
import java.util.*;
public class BookUseComparator {

	public static void main(String[] args) {
		ArrayList<Book>al= new ArrayList<Book>();
		al.add(new Book(11, "�������", 59.8, new GregorianCalendar(2009, 0, 1)));
		al.add(new Book(2, "����ϵͳ", 35.8, new GregorianCalendar(2018, 8, 8)));
		al.add(new Book(3, "�й���ʷ", 89.68, new GregorianCalendar(2008, 7, 8)));
		System.out.println(" ������������˳�������");
		al.forEach(x->System.out.println(x.toString()));
	
	Collections.sort(al, new Comparator<Book>(){

		@Override
		public int compare(Book o1, Book o2) {
			
			return o1.getId()>=o2.getId()?1:-1;
		}});
	System.out.println("-----------------------------");
	System.out.println(" ���ձ�����������");
	al.forEach(x->System.out.println(x.toString()));
	
	
	Collections.sort(al, new Comparator<Book>(){

		@Override
		public int compare(Book o1, Book o2) {
			
			return o1.getPrice()>=o2.getPrice()?1:-1;
		}});
	System.out.println("-----------------------------");
	System.out.println(" ���ռ۸����������");
	al.forEach(x->System.out.println(x.toString()));
	
	
	Collections.sort(al, new Comparator<Book>(){

		@Override
		public int compare(Book o1, Book o2) {
return o1.getDate().compareTo(o2.getDate());

		}});
	System.out.println("-----------------------------");
	System.out.println(" ���ճ������������");
	al.forEach(x->System.out.println(x.toString()));
	
	
	}
}
