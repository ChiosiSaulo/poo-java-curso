package exDatasImportante;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class exLocal {

	public static void main(String[] args) throws ParseException  {
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html 17
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		//DateTimeFormatter fmt1 ;
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		Instant d3 = Instant.now();
		
		//passando data texto
		LocalDate d4 = LocalDate.parse("2024-05-29");
		LocalDateTime d5 = LocalDateTime.parse("2024-05-29T10:30:30");
		Instant d6 = Instant.parse("2024-05-29T10:30:30Z");
		Instant d7 = sdf.parse("2024-05-29T10:30:30-03:00").toInstant();
		
		//formatado
		LocalDate d8 = LocalDate.parse("29/05/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDateTime d9 = LocalDateTime.parse("29/05/2024 01:30", fmt2);
		
		//passando dados
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		
		//EX!!
		//Data local agora
		System.out.println("D1: " + d1);
		//Data local + tempo(horário) agora
		System.out.println("D2: " + d2);
		//Data GLOBAL PADRAO(LONDRES Z)
		System.out.println("D3: " + d3);
		//Data local texto
		System.out.println("D4: " + d4);
		//Data local + tempo(horário) texto
		System.out.println("D5: " + d5);
		//Data GLOBAL texto PADRAO(LONDRES Z)
		System.out.println("D6: " + d6);
		//Br to Londres
		System.out.println("D7: " + d7);
		//FORMATADO
		System.out.println("D8: " + d8);
		System.out.println("D9: " + d9);
		//passsando dados
		System.out.println("D10: " + d10);
		System.out.println("D11: " + d11);
		
	}

}
