package ListaEncadeada;

public class ListaEncadeadaSimples {
	No cabeca = null;
	Integer tamanho = 0;
	No cauda = null;


	public void adicionaPrimeiroElemento(No no) {
		// lista vazia
		if (tamanho == 0) {
			cauda = no;
			cabeca = no;
		}else {
			no.setProximo(cabeca);
			cabeca = no;
		}
		tamanho++;
	}

	
	public void adicionaElemento(No no) {
		if (tamanho == 0) {
			cabeca.setProximo(no);
		} else {
			cauda.setProximo(no);
			cauda = no;
		}
		tamanho++;
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < tamanho;
	}

	private No pegaNo(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		No atual = cabeca;
		for (int i = 0; i < posicao-1; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}
	
	public String pegaElemento(int posicao) {
		return this.pegaNo(posicao).getElemento();
	}

	public void adicionaPosicao(int posicao, No no) {
		if (posicao == 0) { // No começo.
			this.adicionaPrimeiroElemento(cabeca);
		} else {
			if (posicao == tamanho) { // No fim.
				this.adicionaElemento(no);
			} else {
				No anterior = this.pegaNo(posicao - 1);
				No novoNo = new No(no.getElemento(), anterior.getProximo());
				anterior.setProximo(novoNo);
				tamanho++;
			}
		}
	}

	public void removeCabeca() {
		if (!this.posicaoOcupada(0)) {
			throw new IllegalArgumentException("Posição não existe");
			}
		cabeca = cabeca.getProximo();
 		tamanho--;
 		if (this.tamanho == 0) {
 			this.cauda = null;
 		}
	}

	public String toString() {
		// Verificando se a Lista está vazia
		if (tamanho == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		No atual = cabeca;
		// Percorrendo até o penúltimo elemento.
		for (int i = 0; i < tamanho - 1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProximo();
		}
		// último elemento
		builder.append(atual.getElemento());
		builder.append("]");
		return builder.toString();
	}
}
