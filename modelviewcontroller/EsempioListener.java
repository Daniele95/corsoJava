package com.gft.esempi.modelviewcontroller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EsempioListener {
	public static void main(String[] args) {
		
		// new WindowAdapter() {};
		// è l'istanza di una classe senza nome
		// che estende la classe astratta WindowAdapter()
		// dentro le graffe sovrascrivo solo i metodi che mi servono
		WindowAdapter adapter = new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				System.exit(0);
			}
		}; // queste virgolette chiudono la classe interna anonima
		// che istanzia la classe astratta WindowAdapter()
		// la quale realizza l'interfaccia WindowListener()
		JFrame frame = new JFrame("ListenerTest");
		frame.addWindowListener(adapter);
		
		JButton bottone = new JButton("Test");
		// qui creo automaticamente un'istanza anonima di una classe
		// che implementa l'interfaccia ActionListener
		bottone.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, 
						"evento gestito");
			}
		});
		frame.getContentPane().add(bottone);
		frame.setVisible(true);
		frame.setSize(1000, 300);
		
	}
}
