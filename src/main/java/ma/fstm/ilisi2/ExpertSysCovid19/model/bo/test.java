package ma.fstm.ilisi2.ExpertSysCovid19.model.bo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate start = LocalDate.of(2000, 9, 18);
		long years = ChronoUnit.YEARS.between(start, LocalDate.now());
		System.out.println(years); // 17
		
		
	

	}

}
