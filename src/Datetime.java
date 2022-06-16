import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Datetime {

	public static void main(String[] args) {

		 LocalDate ld = LocalDate.EPOCH;
		 LocalDate ld1 = LocalDate.now();
		 LocalDate ld2 = ld1.plusYears(4);
		 LocalDate birthDay = LocalDate.of(1997,Month.SEPTEMBER, 04); //kullanýcýdan dogum gunun alýrsýn parametre atarsýn içine.month enum var.
		 ZoneId brussel = ZoneId.of("Europe/Brussels");
		 ZoneId istanbul = ZoneId.of("Europe/Istanbul");
		 
		 ZonedDateTime brusselTime = ZonedDateTime.now(brussel);
		 ZonedDateTime istanbulTime = ZonedDateTime.now(istanbul);
		
		 
         System.out.println(ld);
         System.out.println(ld1);
         
         System.out.println(ld1.plusYears(1));
         System.out.println(ld2);
         System.out.println(birthDay);	
         
         
         
         System.out.println(brusselTime);
	     System.out.println(istanbulTime);
	     
	     System.out.println(brusselTime.compareTo(istanbulTime));
	     
	     System.out.println(brusselTime.getOffset());
	     System.out.println(istanbulTime.getOffset());
	     
	     ZoneOffset zdt1 = brusselTime.getOffset();
	     ZoneOffset zdt2 = istanbulTime.getOffset();
	     
	     System.out.println((zdt1.compareTo(zdt2))/ 60); //eger 60 a bolersek saati buluruz compar dakýkayý gosterýyor.
	}
	
	

}
