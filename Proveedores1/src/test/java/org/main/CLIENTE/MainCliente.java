package org.main.CLIENTE;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import org.main.RMI.RemoteInterface;

public class MainCliente {
	public static void main(String[]args) {
		try {

			System.out.println("Se ingresaran los valores del arreglo local");
			int[] arregloLocal = new int[6];
			arregloLocal[0] = 5;
			arregloLocal[1] = 9;
			arregloLocal[2] = 5;
			arregloLocal[3] = 9;
			arregloLocal[4] = 5;
			arregloLocal[5] = 9;

			Registry registroCliente = LocateRegistry.getRegistry("192.168.20.31",2024);
			RemoteInterface rmi = (RemoteInterface) registroCliente.lookup("Ventas");
			rmi.leerArreglo(arregloLocal);
			System.out.println("Se envio todo");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}