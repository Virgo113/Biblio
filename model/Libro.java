package model;

public class Libro {

	private int id;
	private String titolo;
	private int pagine;
	private static int contatore = 1;
	
	
	/**
	 *costruttore oggetto libro
	 *
	 * @param titolo - passare String come titolo del libro.
	 * @param pagine - passare un int come numero di pagine.
	 */
	public Libro(String titolo, int pagine) {
	
		this.titolo = titolo;
		this.pagine = pagine;
		this.id = contatore++;
		System.out.println("Aggiunto nuovo libro");
	}


	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public int getPagine() {
		return pagine;
	}


	public void setPagine(int pagine) {
		this.pagine = pagine;
	}



	@Override
	public String toString() {
		return "Libro [id=" + id + ", titolo=" + titolo + ", pagine=" + pagine + "]";
	}
	
	
	
	
}
