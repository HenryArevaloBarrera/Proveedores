package org.main.SERVIDOR;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import org.main.Entidades.*;
import org.main.RMI.RemoteInterface;

public class ServerImplements extends UnicastRemoteObject implements RemoteInterface {
	protected ServerImplements() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public void leerArreglo(int[] arreglo) throws Exception {
		for(int arr: arreglo) {
			System.out.println(arr);
		}

	}



	@Override
	public void mostrarArreglo(int[] arreglo)  {
		for(int arr: arreglo) {
			System.out.println(arr);
		}
	}
	@Override
	public void leerClientes(List<Cliente> clientes)  {
		System.out.println(" hiiii");
		// TODO Auto-generated method stub
		for (Cliente cliente : clientes) {
			System.out.println(cliente.toString());
		}
	}

	@Override
	public void leerDetalleVentas(List<DetalleVenta> detalleVentas){
		// TODO Auto-generated method stub
		for (DetalleVenta detalleVenta : detalleVentas) {
			System.out.println(detalleVenta.toString());
		}
	}

	@Override
	public  void leerProductos(List<Producto> productos) {
		// TODO Auto-generated method stub
		for (Producto producto : productos) {
			System.out.println(producto.toString());
		}
	}

	@Override
	public void leerProveedores(List<Proveedor> proveedores) {
		// TODO Auto-generated method stub
		for (Proveedor proveedor : proveedores) {
			System.out.println(proveedor.toString());
		}
	}
@Override
public void leerTiposProducto(List<TipoProducto> tiposProducto) {
	// TODO Auto-generated method stub
		for (TipoProducto tipoProducto : tiposProducto) {
			System.out.println(tipoProducto.toString());
		}
	}
@Override
	public void leerVentas(List<Venta> ventas) {
	// TODO Auto-generated method stub
		for (Venta venta : ventas) {
			System.out.println(venta.toString());
		}
	}

	@Override
	public Cliente buscarCliente(int identificacion, List<Cliente> clientes) throws Exception {
		Cliente clienteEncontrado = null;
		for (Cliente cliente : clientes) {
			if (cliente.getIdCliente()==(identificacion)) {
				clienteEncontrado = cliente;
			}
		}
		if (clienteEncontrado != null) {
			// Generaremos un archivo con los clientes buscados
			String archivoDestino = "clientesEncontrados.csv";
			List<Cliente> clientesEncontrados = new ArrayList<>();
			clientesEncontrados.add(clienteEncontrado);
			GenerarArchivos.generarCSVCliente(clientesEncontrados, archivoDestino);
			return clienteEncontrado;

		}
		return null;
	}

	@Override
	public DetalleVenta buscarDetalleVenta(int identificacion, List<DetalleVenta> detallesVenta) throws Exception {
		DetalleVenta detalleVentaEncontrado = null;
		for (DetalleVenta detalleVenta : detallesVenta) {
			if (detalleVenta.getIdDetalleVenta() == identificacion) {
				detalleVentaEncontrado = detalleVenta;
			}
		}
		if (detalleVentaEncontrado != null) {
			// Generaremos un archivo con los detalles de venta buscados
			String archivoDestino = "detallesVentaEncontrados.csv";
			List<DetalleVenta> detallesVentaEncontrados = new ArrayList<>();
			detallesVentaEncontrados.add(detalleVentaEncontrado);
			GenerarArchivos.generarCSVDetalleVenta(detallesVentaEncontrados, archivoDestino);
			return detalleVentaEncontrado;
		}
		return null;
	}

	@Override
	public Producto buscarProducto(int identificacion, List<Producto> productos) throws Exception {
		Producto productoEncontrado = null;
		for (Producto producto : productos) {
			if (producto.getIdProducto() == identificacion) {
				productoEncontrado = producto;
			}
		}
		if (productoEncontrado != null) {
			// Generaremos un archivo con los productos buscados
			String archivoDestino = "productosEncontrados.csv";
			List<Producto> productosEncontrados = new ArrayList<>();
			productosEncontrados.add(productoEncontrado);
			GenerarArchivos.generarCSVProducto(productosEncontrados, archivoDestino);
			return productoEncontrado;
		}
		return null;
	}


	@Override
	public Proveedor buscarProveedor(int identificacion, List<Proveedor> proveedores) throws Exception {
		Proveedor proveedorEncontrado = null;
		for (Proveedor proveedor : proveedores) {
			if (proveedor.getIdProveedor() == identificacion) {
				proveedorEncontrado = proveedor;
			}
		}
		if (proveedorEncontrado != null) {
			// Generaremos un archivo con los proveedores buscados
			String archivoDestino = "proveedoresEncontrados.csv";
			List<Proveedor> proveedoresEncontrados = new ArrayList<>();
			proveedoresEncontrados.add(proveedorEncontrado);
			GenerarArchivos.generarCSVProveedor(proveedoresEncontrados, archivoDestino);
			return proveedorEncontrado;
		}
		return null;
	}


	@Override
	public TipoProducto buscarTipoProducto(int identificacion, List<TipoProducto> tiposProducto) throws Exception {
		TipoProducto tipoProductoEncontrado = null;
		for (TipoProducto tipoProducto : tiposProducto) {
			if (tipoProducto.getIdTipoProducto() == identificacion) {
				tipoProductoEncontrado = tipoProducto;
			}
		}
		if (tipoProductoEncontrado != null) {
			// Generaremos un archivo con los tipos de producto buscados
			String archivoDestino = "tiposProductoEncontrados.csv";
			List<TipoProducto> tiposProductoEncontrados = new ArrayList<>();
			tiposProductoEncontrados.add(tipoProductoEncontrado);
			GenerarArchivos.generarCSVTipoProducto(tiposProductoEncontrados, archivoDestino);
			return tipoProductoEncontrado;
		}
		return null;
	}

	@Override
	public Venta buscarVenta(int identificacion, List<Venta> ventas) throws Exception {
		Venta ventaEncontrada = null;
		for (Venta venta : ventas) {
			if (venta.getIdVenta() == identificacion) {
				ventaEncontrada = venta;
			}
		}
		if (ventaEncontrada != null) {
			// Generaremos un archivo con las ventas buscadas
			String archivoDestino = "ventasEncontradas.csv";
			List<Venta> ventasEncontradas = new ArrayList<>();
			ventasEncontradas.add(ventaEncontrada);
			GenerarArchivos.generarCSVVenta(ventasEncontradas, archivoDestino);
			return ventaEncontrada;
		}
		return null;
	}

}
