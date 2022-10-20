package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservention;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Quarto número: ");
		int number = sc.nextInt();
		System.out.println("Check-in date (dd/MM/yyyy): ");
		Date checkIn =  sdf.parse(sc.next());
		System.out.println("Check-out date (dd/MM/yyyy): ");
		Date checkOut =  sdf.parse(sc.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Erro na reserva: A data de check-out deve ser posterior à data de check-in ");
		}
		else {
			Reservention reservation = new Reservention(number, checkIn, checkOut);
			System.out.println("Reserva: "  + reservation);
		
			System.out.println();
			System.out.println("Inisira a nova data da reserva: ");
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkIn =  sdf.parse(sc.next());
			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkOut =  sdf.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reserva: "  + reservation);
		}
		
		
		sc.close();
	}

}
