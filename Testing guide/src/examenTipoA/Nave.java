package examenTipoA;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Nave {

	private String nombre;
	private Long annosLuzRecorridos;
	private List<Parte> partes; 
	private int requsitosNumericos;
	private List<Parte> requisitosCriticos;
	private boolean arrancada=false;
	private boolean averiada=false;
	
	public Nave(String nombre, List<Parte> partes, List<Parte> requisitosCriticos) {
		super();
		this.nombre = nombre;
		this.partes = partes;
		this.requisitosCriticos = requisitosCriticos;
	}

	
	

	public Nave(String nombre, Long annosLuzRecorridos, List<Parte> partes, int requsitosNumericos,
			List<Parte> requisitosCriticos, boolean arrancada, boolean averiada) {
		super();
		this.nombre = nombre;
		this.annosLuzRecorridos = annosLuzRecorridos;
		this.partes = partes;
		this.requsitosNumericos = requsitosNumericos;
		this.requisitosCriticos = requisitosCriticos;
		this.arrancada = arrancada;
		this.averiada = averiada;
	}




	/**
	 * Realiza una comprobacion de las partes del sistema
	 * el resultado es que sus partes pueden estar funcionando o no
	 */
	public boolean comprobacionSistemas() {
		return comprobarRequisitosCriticos()&&comprobarRequisitosNumericos();
	}
	
	/**
	 * Comprueba si las partes que funcionan de la lista de partes 
	 * suman un total superior al valor requisitos partes
	 * @return true si la cantidad que suman las partes que funcionan
	 * son mayores o iguales a la requisitada (requsitosPartes)
	 */
	private boolean comprobarRequisitosNumericos() {
		return this.partes.stream()
				.mapToInt((Parte parte)
						->{return parte.isFunciona()?parte.getComponente().getMagnitud():0;})
				.sum()>=this.requsitosNumericos;
	}
	
	/**
	 * Comprueba si la lista de partes que funcionan de la nave
	 * coincide con los Componentes definidas en los requisitos
	 * como partes vitales para arrancar
	 * @return true si tiene TODOS los elementos de requisitosCriticos
	 * en estado funcional
	 */
	private boolean comprobarRequisitosCriticos() {
		List<Parte> collect = partes.stream()
				.filter((parte)-> parte.isFunciona())
				.collect(Collectors.toList());
		boolean correcto=true;
		for (Parte requisito : requisitosCriticos) {
			if(!collect.contains(requisito)) correcto=false;
		}
		return correcto;
	}
	
	/**
	 * Arranca la nace si cumple los requisitos
	 * @return true si se ha podido arrancar la nave
	 */
	public boolean arrancar() {
		averiada=false;
		arrancada=false;
		if(comprobacionSistemas()) {
			arrancada=true;
			averiada=false;
			return true;
		}		
		return false;
	}
	
	/**
	 * la magnitud del Componente define el coste de la reparacion.
	 * para saber cuanto cuesta la reparacion debemos sumar la magnitud
	 * de todas las Partes no funcionales
	 * @return el coste de reparar TODOS los sistemas no funcionales
	 */
	public int costeAveria() {
		return this.partes.stream()
				.mapToInt((parte)->{return parte.isFunciona()?0:parte.getComponente().getMagnitud();})
				.sum();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Long getAnnosLuzRecorridos() {
		return annosLuzRecorridos;
	}


	public void setAnnosLuzRecorridos(Long annosLuzRecorridos) {
		this.annosLuzRecorridos = annosLuzRecorridos;
	}


	public List<Parte> getPartes() {
		return partes;
	}


	public void setPartes(List<Parte> partes) {
		this.partes = partes;
	}


	public int getRequsitosNumericos() {
		return requsitosNumericos;
	}


	public void setRequsitosNumericos(int requsitosNumericos) {
		this.requsitosNumericos = requsitosNumericos;
	}


	public List<Parte> getRequisitosCriticos() {
		return requisitosCriticos;
	}


	public void setRequisitosCriticos(List<Parte> requisitosCriticos) {
		this.requisitosCriticos = requisitosCriticos;
	}


	public boolean isArrancada() {
		return arrancada;
	}


	public void setArrancada(boolean arrancada) {
		this.arrancada = arrancada;
	}


	public boolean isAveriada() {
		return averiada;
	}


	public void setAveriada(boolean averiada) {
		this.averiada = averiada;
	}
	
}
