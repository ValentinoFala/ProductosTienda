package Tienda;

import java.util.ArrayList;

public class ProductosMain {

	public static void main(String[] args) {
		ArrayList<Productos> Productos = new ArrayList<>();
		Productos p1 = new Productos("Coca", 2950, "Bebida");
		Productos p2 = new Productos("Agua", 2000, "Bebida");
		Productos p3 = new Productos("Carne", 3000, "Comestible");
		Productos p4 = new Productos("Lysoform", 1500, "Limpieza");
		
		Productos.add(p1);
		Productos.add(p2);
		Productos.add(p3);
		Productos.add(p4);
		
		for (int i = 0; i < Productos.size(); i++) {
			System.out.println(Productos.get(i).toString());
			
		}
		
		p1.setPrecio(2.0);
		System.out.println(p1);
		
		for (int i = 0; i < Productos.size(); i++) {
			System.out.println(Productos.get(i).toString());
			
		}
	}

}
