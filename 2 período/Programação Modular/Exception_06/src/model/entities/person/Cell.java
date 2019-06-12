package model.entities.person;

class Cell {
	public Object element;
	public Cell next;
	
	public Cell() {
		this(0);
	}//end constructor()
	
	public Cell(Object element) {
		this.element = element;
		this.next = null;
	}//end constructor()
}//end class Cell()