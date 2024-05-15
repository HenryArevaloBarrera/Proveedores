package org.main.RMI;

import java.rmi.Remote;

public interface RemoteInterface extends Remote {

	void mostrarArreglo(int[] arreglo) throws Exception;

}
