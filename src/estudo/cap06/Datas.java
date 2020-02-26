package estudo.cap06;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Datas {

	public static void main(String[] args) {
		
		//Calendar antes = new GregorianCalendar(2018, Calendar.JANUARY, 01); 
		//Calendar depois = new GregorianCalendar();
		
		//System.out.println(antes.before(depois));
		
		String
		lote_1		=	"2018/04/25";
		String
		lote_2		=	"2018/04/26";
		int
		resultado			=	lote_2.compareTo(lote_1);
		System.out.println("lote maior "+resultado);
		
		
			
		
		

	}

}
