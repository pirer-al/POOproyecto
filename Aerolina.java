package AerolinaReservas; 
import java.util.ArrayList;
public class Aerolina{
	public String nombre;
	public ArrayList<Vuelo> vuelos = new ArrayList<>();
	public ArrayList<Reserva> reservas = new ArrayList<>();
	public Aerolina(String nombre){
		this.nombre = nombre;
	}
	public void agregarVuelo(String origen, String destino, String hora_salida){
		Vuelo v = new Vuelo(origen, destino, hora_salida);
		vuelos.add(v);
	}
	public void imprimirReservaciones(){
		System.out.println("\nReserva Vuelo Pasajero");
		for (Reserva r: reservas){
			System.out.println(r.reserva_id + "\t" + r.vuelo_id + "\t" + r.pasajero.nombre);
		}
	}
	public void imprimirVuelos(){
		System.out.println("\n Vuelo\tFecha\t\tPartida");
		for (Vuelo v: vuelos){
			System.out.println(v.vuelo_id + "\t" + v.fecha + "\t" + v.hora_salida);
		}
	}
}
