package model.entities.person;

class List {
	private Cell first;
	private Cell last;
	private int amount;
	
	public List() {
		first = new Cell();
		last = first;
	}//end constructor()
	
	public void insertLast(Object x) {
		last.next = new Cell(x);
		last = last.next;
		this.amount++;
	}//end insertLast()
	
	public Object removeBegin() throws Exception {
		if(first == last) {
			throw new Exception("ERROR: (Empty)");
		}//end if
		Cell tpm = first;
		first = first.next;
		Object answer = first.element;
		tpm.next = null;
		tpm = null;
		this.amount--;
		return answer;
	}//end removeBegin()
	
	public int getAmount() {
		return this.amount;
	}//end getAmount()
	
	public void setAmount(int amount) {
		this.amount = amount;
	}//end setAmount()
}//end class List()