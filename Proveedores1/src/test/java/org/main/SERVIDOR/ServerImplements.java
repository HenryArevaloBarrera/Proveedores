package org.main.SERVIDOR;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
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

	
}
