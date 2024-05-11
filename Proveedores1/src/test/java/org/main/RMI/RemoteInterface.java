package org.main.RMI;

import java.rmi.Remote;

public interface RemoteInterface extends Remote {
	public void mostrarArreglo(int[] arreglo) throws Exception;
	public void agregarElemento(int[] arreglo, int elemento) throws Exception;
}
