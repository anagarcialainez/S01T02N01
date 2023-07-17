package s01n01Ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProductoVenta {
	static ArrayList<Producto> listaProductos = new ArrayList<>();

	public static void main(String[] args) {
		int codigo;

		Producto producto1 = new Producto("Banana", 1.29);
		Producto producto2 = new Producto("Aguacate", 3);
		Producto producto3 = new Producto("Sandia", 1);
		Producto producto4 = new Producto("Coco", 4);

		listaProductos.add(producto1);
		listaProductos.add(producto2);
		listaProductos.add(producto3);
		listaProductos.add(producto4);

		Scanner entrada = new Scanner(System.in);

		Venta venta = new Venta(listaProductos);

		try {
			System.out.println("Busca un producto, ingresa codigo (inicia en 1):");
			codigo = entrada.nextInt();
			for (int i = 0; i < listaProductos.size(); i++) {
				if (i == codigo) {
					System.out.println(listaProductos.get(codigo-1));
				}
			}
		} catch (ArrayIndexOutOfBoundsException m) {
			System.out.println("El producto no existe");
		}finally {
			entrada.close();
		}
		
		System.out.println("-----------------------------------");
		
		try {
			System.out.println(venta.listaProductos + "\n"
					+ venta.calcularTotal());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

/*Ejercicio
 * Crea una clase llamada "Producto" con los atributos nombre y precio, y otra
 * clase llamada "Venta". Esta clase tiene por atributos una colección de
 * productos y el precio total de la venta. La clase "Venta", tiene un método
 * llamado calcularTotal() que lanza la excepción personalizada
 * VentaBuidaException y muestra por pantalla
 * "Para hacer una venta primero debes añadir productos" si la colección de
 * productos está vacía. Si la colección tiene productos, entonces debe recorrer
 * la colección y guardar la suma de todos los precios de los productos en el
 * atributo precio total de la venta. La excepción personalizada
 * VendaBuidaException debe ser hija de la clase Exception. A su constructor
 * debemos pasarle el mensaje “Para hacer una venta primero debes añadir
 * productos” y cuando capturamos la excepción, debemos mostrarlo por pantalla
 * con el método getMessage() de la excepción. Escribe el código necesario para
 * generar y capturar una excepción de tipo ArrayIndexOutOfBoundsException.
 */