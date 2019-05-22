/**
 * 
 */
package com.lab6.model;

/**
 * @author ASUS
 *
 */
public class SpectatorManager {

	private Spectator root;
	
	private int size;
	
	public SpectatorManager() {
		root = null;
		size = 0;
	}
	
	public Spectator search(int id) {
		return root == null? null: root.search(id);
	}
	
	public void Add(Spectator spectator) throws ElementExitsException {
		if (root == null) {
			root = spectator;
		} else {
			root.add(spectator);
		}
		size++;
	}
	

	public int getSize() {
		return size;
	}
	

}
