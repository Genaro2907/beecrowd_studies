package br.com.caelum.ed;

public class TestePegaPorPosicao {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		
		a1.setNome("Gabriel");
		a2.setNome("Genaro");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		Aluno aluno1 = lista.pega(0);
		Aluno aluno2 = lista.pega(1);

		
		System.out.println(aluno1);
		System.out.println(aluno2);
	}

}