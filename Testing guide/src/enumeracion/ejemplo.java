package enumeracion;

import java.util.Random;

import com.sun.beans.editors.ColorEditor;

public class ejemplo {
public static void main(String[] args) {
	String colores[]= {"rojo","azul"};
	String miColor="rejo";
	int posicion=-1;
	for (int i = 0; i < colores.length; i++) {
		if(miColor.equals(colores[i]))
			posicion=i;
	}
	System.out.println(colores[posicion]);
	Azules azules=Azules.ceruleo;
	Planetas mio=Planetas.tierra;
	mio.getGravedad();
	Azules.values();
	Azules[] values = Azules.values();
	int length = values.length;
	int nextInt = new Random().nextInt(length);
	Azules aleatorio=values[nextInt];
}
}
