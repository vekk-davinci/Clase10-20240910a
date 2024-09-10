/*
 * 1) La Verificación Técnica Argentina, o VTV, desea realizar un programa para poder consultar el estado de un auto 
 * y generar un informe luego de la revisión de un vehículo. 
 * 
 * En este informe, un operador deberá tener
 * en cuenta el estado de estas tres partes del vehículo: 
	 * el motor, 
	 * los frenos 
	 * y el sistema de suspensión. 
 * En caso de que las tres inspecciones resulten afirmativas, 
 * el vehículo podrá pasar la VTV.
 * 
 * Si no es así, 
 * deberá generarse un informe de revisión en el cual se detalla que el auto no pasó 
 * la VTV y debe realizar reparaciones en estas partes. 
 * Se utilizará la fecha de la VTV para determinar la vigencia 
 * de un año desde que se pasó la VTV 
 * 
 */

import java.time.LocalDate;

public class ConstruArq {
	private LocalDate fechaProduccion;
	private int motor;
	private int frenos;
	private int sistemaDeSuspencion;
	private LocalDate fechaDeExpecion;
	private String Memo;
		
	ConstruArq (int motor, int frenos, int sistemaDeSuspencion, String fechaDeExpecion) {
		this.motor = motor;
		this.frenos = frenos;
		this.sistemaDeSuspencion = sistemaDeSuspencion;	
		this.fechaDeExpecion = LocalDate.parse(fechaDeExpecion);
	}
	
	public boolean inspeccion () {
		boolean resultado = false;
		if (motor > 70 && frenos > 70 && sistemaDeSuspencion >70) {
			resultado = true;
		}
		
		
		return resultado;
	}

	
	

}
