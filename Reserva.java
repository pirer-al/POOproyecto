package AerolinaReservas; 
public class Reserva{
	static int contador = 0;
	public String reserva_id;
	public String vuelo_id;
	public Pasajero pasajero;
	public Reserva(String vuelo_id, Pasajero pasajero){
		this.reserva_id = generarId();
		this.vuelo_id = vuelo_id;
		this.pasajero = pasajero;
	}
	private static String generarId(){
        contador++; 
        return "RV" + contador; 
    }
}
