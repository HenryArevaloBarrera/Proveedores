package org.main.SERVIDOR;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;

import org.main.RMI.RemoteInterface;
public class ServerImplements extends UnicastRemoteObject implements RemoteInterface {

	protected ServerImplements() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarArreglo(int[] arreglo) throws Exception {
		for(int arr: arreglo) {
			System.out.println(arr);
		}
	}

	// Método para agregar un elemento al arreglo
	@Override
	public void agregarElemento(int[] arreglo, int elemento) {
		int[] nuevoArreglo = Arrays.copyOf(arreglo, arreglo.length + 1);
		nuevoArreglo[nuevoArreglo.length - 1] = elemento;
		System.arraycopy(nuevoArreglo, 0, arreglo, 0, nuevoArreglo.length);
	}


}
