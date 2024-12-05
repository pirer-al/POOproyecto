import AerolinaReservas.*;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
		Aerolina a = new Aerolina("AeroMexico");
		a.agregarVuelo("Ciudad de México", "Guadalajara", "08:30");
		a.agregarVuelo("Nueva York", "Los Ángeles", "06:00");
		a.agregarVuelo("Madrid", "Barcelona", "14:45");
		a.agregarVuelo("Londres", "París", "07:00");
		a.agregarVuelo("Tokio", "Osaka", "13:10");
		a.agregarVuelo("Buenos Aires", "Santiago", "10:00");
		a.agregarVuelo("Berlín", "Ámsterdam", "09:25");
		a.agregarVuelo("Sídney", "Melbourne", "15:00");
		a.agregarVuelo("Chicago", "Miami", "18:45");
		a.agregarVuelo("Toronto", "Montreal", "12:30");
		System.out.println("Bienvenido al sistema de reservas de " + a.nombre);
		Scanner s = new Scanner(System.in);
		do {
            System.out.println("Selecciona una de las opciones disponibles:");
            System.out.println("1) Crear reservación");
            System.out.println("2) Consultar vuelos disponibles");
            System.out.println("3) Consultar reservaciones");
            System.out.println("4) Salir");
			
			int opcion = 0;
			boolean entradaValida = false;

			while (!entradaValida) {
				if (s.hasNextInt()) {
					opcion = s.nextInt(); 
					s.nextLine(); 
					if (opcion >= 1 && opcion <= 4) {
						entradaValida = true; 
					} 
					else {
						System.out.println("Por favor, ingrese un número entre 1 y 4.");
					}
				} 
				else {
					System.out.println("Por favor, ingrese un número válido.");
					s.nextLine(); 
				}
			}
			
			switch (opcion) {
				case 1:
					System.out.println("Crear Reservacion");
					String vuelo_id = null; 
					boolean vuelo_encontrado = false;
					while (!vuelo_encontrado){
						System.out.println("Ingrese el codigo de vuelo e.j. VU1:");
						vuelo_id = s.nextLine();
						for (Vuelo v: a.vuelos){
							if (v.vuelo_id.equals(vuelo_id)){
								vuelo_encontrado = true;
								break;
							}
						}
					}
					System.out.print("Ingrese el nombre del pasajero: ");
					String nombre = s.nextLine();
					System.out.print("Ingrese los apellidos del pasajero: ");
					String apellidos = s.nextLine();
					System.out.print("Ingrese la fecha de nacimiento del pasajero (formato: aaaa-mm-dd): ");
					String fechaNacimiento = s.nextLine();
					Pasajero pasajero = new Pasajero(nombre, apellidos, fechaNacimiento);
					Reserva reserva = new Reserva(vuelo_id, pasajero);
					a.reservas.add(reserva);
					System.out.println("Reservación creada para: " + pasajero.nombre);
					System.out.println();
					break;
				case 2:
					a.imprimirVuelos();
					System.out.println();
					break;
				case 3:
					a.imprimirReservaciones();
					break;
				case 4:
					System.exit(0);	
			} 
		} while(true);
	}
}
