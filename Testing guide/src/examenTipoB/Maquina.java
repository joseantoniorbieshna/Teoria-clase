package examenTipoB;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Maquina {
	private String nombre;
	private int anno;
	private List<Periodo> periodos;
	
	
	public Maquina() {
		super();
		periodos=new LinkedList();
	}

	
	public void setPeriodos(List<Periodo> periodos) {
		this.periodos = periodos;
	}


	public Maquina(String nombre, int anno) {
		this();
		this.nombre = nombre;
		this.anno = anno;
	}


	public Maquina(String nombre, int anno, List<Periodo> programa) {
		super();
		this.nombre = nombre;
		this.anno = anno;
		this.periodos = programa;
	}


	/**
	 * Retorna el programa de la lista con el que se ha conseguido menor recaudacion
	 * @return
	 */
	public Programa getMenorRecaudacion() {
		HashMap<Programa, Long> inventario = totalizarValores();
		return inventario.entrySet()
			    .stream()
			    .min(Comparator.comparingLong(Entry::getValue)).stream().findFirst().get().getKey();
	}

	private HashMap<Programa, Long> totalizarValores() {
		Set<Entry<Programa, List<Periodo>>> entrySet = periodos.stream()
		.collect(Collectors.groupingBy(Periodo::getPrograma)).entrySet();
		HashMap<Programa,Long> inventario=new HashMap();
		for (Entry<Programa, List<Periodo>> entry : entrySet) {
			inventario.put(entry.getKey(),entry.getValue().stream().mapToLong(algo->algo.getRecaudacionParcial()).sum());
		}
		return inventario;
	}
	
	/**
	 * retorna el programac de la lista con el que se ha conseguido mayor recaudacion
	 * @return
	 */
	public Programa getMayorRecaudacion() {
		HashMap<Programa, Long> inventario = totalizarValores();
		return inventario.entrySet()
			    .stream()
			    .max(Comparator.comparingLong(Entry::getValue)).stream().findFirst().get().getKey();
	}
	
	
	/**
	 * Basandose en el programa con mayor y menor recaudacion elige un nuevo programa. 
	 * si el de mayor recaudacion tiene un porcentaje mayor, que el de menor recaudaci�n,
	 * 	seleccionamos un programa con mayor porcentaje que el de mayor recaudacion.
	 * Si el de mayor recaudacion tiene un porcentaje menor, que el de menor recaudaci�n,
	 * seleccionamos un programa con menor porcentaje que el de menor recaudacion
	 * si son iguales no hacemos nada
	 */
	public void aplicarNuevoPrograma() {
		Programa mayorRecaudacion = getMayorRecaudacion();
		Programa menorRecaudacion = getMenorRecaudacion();
		if(mayorRecaudacion.getPorcentaje()>=menorRecaudacion.getPorcentaje()) {
			periodos.add(new Periodo(Programa.getBigger(mayorRecaudacion),0l,0));
		}else {
			periodos.add(new Periodo(Programa.getLesser(mayorRecaudacion),0l,0));
			
		}
	}
	
	public List<Periodo> getPeriodos() {
		return periodos;
	}


	/**
	 * Hemos de entregar el total de lo recaudado por una maquina en todos los periodos
	 * @return
	 */
	public Long getRecaudacionTotal() {
		//TODO
		return -1L;
	}
	
	/**
	 * Este metodo haya el coeficiente entre la recaudacion de un periodo y su duracion en dias	 * 
	 * @return el programa con el mejor coefiente 
	 */
	public Programa getMejorIndice() {
		return null;
	}


	public Programa getUltimoPrograma() {
		return ((LinkedList<Periodo>)periodos).getLast().getPrograma();
	}


	public void deleteLastPeriodo() {
		((LinkedList)periodos).removeLast();
		
	}
}
