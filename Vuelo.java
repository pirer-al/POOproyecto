package AerolinaReservas; 
import java.time.LocalDate;
public class Vuelo {
    static int contador = 0;
    public String vuelo_id;
    public String origen;
    public String destino;
    public String hora_salida;
    public LocalDate fecha;
    Vuelo(String origen, String destino, String hora_salida) {
        this.vuelo_id = generarId(); 
        this.origen = origen;
        this.destino = destino;
        this.hora_salida = hora_salida;
        this.fecha = LocalDate.now().plusDays(1);
    }

    private static String generarId() {
        contador++; 
        return "VU" + contador; 
    }
}
	
