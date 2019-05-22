/**
 * 
 */
package com.lab6.model;

import java.io.Serializable;
import java.util.Date;


@SuppressWarnings("serial")
public class Spectator extends Person implements Comparable, Serializable {

	private Spectator rigth;

	private Spectator left;

	public Spectator(int id, String firstName, String lastName, String email, String gender, String country, String photo,
			Date birthday) {
		super(id, firstName, lastName, email, gender, country, photo, birthday);

	}
	
	public Spectator search(int id) {
		Spectator aux = this;
		while (aux != null) {
			int result = Integer.compare(aux.id, id);
			if (result == 0) {
				return aux;
			} 
			else if ( result > 0) {
				aux = aux.left;
			}
			else {
				aux = aux.rigth;
			}
		}
		return null;
	}
	
	public void add(Spectator spectator) throws ElementExitsException {
		if (compareTo(spectator) == 0) {
			throw new ElementExitsException("Este Espectador ya se encuentra registrado");
		}
		if (compareTo(spectator) > 0) {
			if (left == null) {
				left = spectator;
			} else {
				left.add(spectator);
			}
		} else {
			if (rigth == null) {
				rigth = spectator;
			} else {
				rigth.add(spectator);
			}
		}
	}
	
	
	
	public Spectator getRigth() {
		return rigth;
	}

	public Spectator getLeft() {
		return left;
	}

	
	public int compareTo(Spectator o) {
		return Integer.compare(this.id, o.id);
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
