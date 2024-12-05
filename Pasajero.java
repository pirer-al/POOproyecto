package AerolinaReservas; 
import java.time.LocalDate;
public class Pasajero{
	public String nombre;
	public String apellido;
	public String fecha_nacimiento;
	public Pasajero(String nombre, String apellido, String fecha_nacimiento){
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
	}
}
