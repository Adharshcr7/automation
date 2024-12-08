package assignmentprograms;
import java.util.Date;
public class A36_DateClass {

	public static void main(String[] args) {
//Current Date
		Date d1 = new Date();
		String s2 = d1.toString();
		System.out.println(s2);
		String Date = s2.substring(8, 10);
		System.out.println("Date -> "+Date);
		String Month = s2.substring(4, 7);
		System.out.println("Month -> "+Month);
		String Year = s2.substring(24, 28);
		System.out.println("Year -> "+Year);
		System.out.println("Current Date = "+Date+"-"+Month+"-"+Year);
//Past Date
		Date d2 = new Date(d1.getTime()-(1000*60*60*24*1));
		String s1 = d2.toString();
		String Date1 = s1.substring(8, 10);
		String Month1 = s1.substring(4, 7);
		String Year1 = s1.substring(24, 28);
		System.out.println("Past Date = "+Date1+"-"+Month1+"-"+Year1);
//Future Date
		Date d3 = new Date(d1.getTime()+(1000*60*60*24*1));
		String s3 = d3.toString();
		String Date3 = s3.substring(8, 10);
		String Month3 = s3.substring(4, 7);
		String Year3 = s3.substring(24, 28);
		System.out.println("Future Date = "+Date3+"-"+Month3+"-"+Year3);
	}
	}


