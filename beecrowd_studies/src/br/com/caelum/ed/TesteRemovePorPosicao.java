package br.com.caelum.ed;

public class TesteRemovePorPosicao {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		
		a1.setNome("Gabriel");
		a2.setNome("Genaro");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		lista.remove(0);
		
		System.out.println(lista);
	}

}
