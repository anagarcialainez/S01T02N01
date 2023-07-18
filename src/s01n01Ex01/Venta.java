package s01n01Ex01;

import java.util.ArrayList;

public class Venta {
	// Atributos.
	private ArrayList<Producto> listaProductos;
	private float precioTotalVenta;

	// constructor
	/*public Venta(){listaProductos = new ArrayList<Producto>();}*/
	public Venta(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	// getter y setters
	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public float getPrecioTotalVenta() {
		return precioTotalVenta;
	}

	public void setPrecioTotalVenta(float precioTotalVenta) {
		this.precioTotalVenta = precioTotalVenta;
	}

	// métodos generales

	public String calcularTotal() throws VentaBuidaException {
		
		for (Producto lista : listaProductos) {
			precioTotalVenta += lista.getPrecio();
		}
		
		if (listaProductos == null || listaProductos.size() == 0) {
			throw new VentaBuidaException("Para hacer una venta primero debes añadir productos.");
		} 
		
		return "Total a pagar: " + precioTotalVenta + " Euros.";
	}

	

}
