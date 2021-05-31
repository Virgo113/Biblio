package view;

import controller.LibreriaCtrl;
import model.*;

public class ProvaLibreria {

	public static void main(String[] args) {

		LibreriaCtrl ctrl = new LibreriaCtrl();
		
		ctrl.addScaffale(); //aggiunto lo scaffale
		
		Scaffale scaffale = ctrl.getLibreria().getScaffali().get(0); // abbiamo richiamato a scaffale lo scaffale di indice 0
		
		ctrl.addRipiano(0);//aggiungo ripiano
		ctrl.addRipiano(0);//aggiungo ripiano
		Ripiano r1 = scaffale.getRipiani().get(0);
		Ripiano r2 = scaffale.getRipiani().get(1);
		
		Libro l1 = ctrl.creaLibro("The Shining", 235);
		Libro l2 = ctrl.creaLibro("The Shining", 235);
		Libro l3 = ctrl.creaLibro("La fattoria degli animali", 270);
		Libro l4 = ctrl.creaLibro("La fattoria degli animali", 270);
		Libro l5 = ctrl.creaLibro("The Shining", 235);
		ctrl.addLibro(l1, r1);
		ctrl.addLibro(l2, r2);
		ctrl.addLibro(l3, r1);
		ctrl.addLibro(l4, r2);
		ctrl.addLibro(l5, r1);
		
		for (Ripiano r : scaffale.getRipiani()) {
			
			System.out.println("ripiano-------");
			
			for (Libro l : r.getLibri()) {
				System.out.println(l);
			}
		}
		
		//System.out.println(r2.getLibri());
		
		
		
		

	}

}
