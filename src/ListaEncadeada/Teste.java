package ListaEncadeada;

public class Teste {

	public static void main(String[] args) {
		ListaEncadeadaSimples lista = new ListaEncadeadaSimples();
		lista.adicionaPrimeiroElemento(new No("�caro"));
		lista.adicionaElemento(new No("Jo�o"));
		lista.adicionaElemento(new No("Pedro"));
		lista.adicionaElemento(new No("Jos�"));
		lista.adicionaElemento(new No("Tais"));
		System.out.println("===============   1");
		System.out.println(lista.toString());
		
//		lista.adicionaPosicao(3, new No("Vanessa"));
//		System.out.println("===============   2");
//		System.out.println(lista.toString());
//		lista.removeCabeca();
//		System.out.println("===============   3");
//		System.out.println(lista.pegaElemento(2).toString());
//		lista.adicionaPrimeiroElemento(new No("�caro111111111"));
//		System.out.println("===============  4 ");
//		System.out.println(lista.toString());
	
	}
}
