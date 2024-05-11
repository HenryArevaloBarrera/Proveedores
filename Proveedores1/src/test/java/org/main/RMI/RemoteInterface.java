package org.main.RMI;

import java.rmi.Remote;

public interface RemoteInterface extends Remote {
	public void leerArreglo(int[] arreglo) throws Exception;
}
