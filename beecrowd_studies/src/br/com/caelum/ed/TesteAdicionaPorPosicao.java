package br.com.caelum.ed;

public class TesteAdicionaPorPosicao {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		
		a1.setNome("Gabriel");
		a2.setNome("Genaro");
		a3.setNome("Ana");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(0, a2);
		lista.adiciona(1, a3);
		
		System.out.println(lista);
	}

}
