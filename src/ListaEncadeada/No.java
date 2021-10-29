package ListaEncadeada;

public class No{
	private String elemento; 
	private No proximo;
	
	
	public No(String elemento, No proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}

	public No(String elemento) {
		this.elemento = elemento;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "No [elemento=" + elemento + "]";
	}

}