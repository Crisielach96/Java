package com.utn.foreach;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

public class MainForeach {

	public static void main(String[] args) {

		ArrayList<JugadoresDeFutbol> jugadores = new ArrayList<JugadoresDeFutbol>();

		JugadoresDeFutbol jugador1 = new JugadoresDeFutbol();

		jugador1.SolicitarDatos();

		JugadoresDeFutbol jugador2 = new JugadoresDeFutbol();

		jugador2.SolicitarDatos();

		jugadores.add(jugador1);
		jugadores.add(jugador2);

		for (JugadoresDeFutbol j : jugadores) {
			JOptionPane.showMessageDialog(null, j.toString(), "Jugador " + (jugadores.lastIndexOf(j) + 1),
					JOptionPane.INFORMATION_MESSAGE);
		}

		/*
		 * System.out.println(jugadores.size());
		 * 
		 * System.out.println(jugadores.contains(jugador1));
		 * 
		 * System.out.println(jugadores.get(1).toString());
		 * 
		 * jugadores.remove(jugador2);
		 * 
		 * for (JugadoresDeFutbol j : jugadores) { System.out.println(j.toString()); }
		 */
	}

}
