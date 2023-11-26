import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
		//LocalDate obj = LocalDate.now();
		//LocalTime obj = LocalTime.now();
		LocalDateTime obj =  LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E,MMMM dd yyyy");
		
		System.out.println(obj.format(formatter));
	}

}
