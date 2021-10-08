package escola;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Aluno estudante = new Aluno("Katia Silveira", 9.0,8.5,10,10);
		
		System.out.println("Nome: " + estudante.getNome());
		System.out.println("Primeiro Bimestre: " + estudante.getPrim());
		System.out.println("Segundo Bimestre: " + estudante.getSeg());
		System.out.println("Terceiro Bimestre: " + estudante.getTer());
		System.out.println("Quarto Bimestre: " + estudante.getQua());
		System.out.println("Média: " + estudante.getMedia());
		System.out.println("Status: " + estudante.getStatus());
		
		System.out.println();
		
		Aluno estudante2 = new Aluno();
		estudante2.setNome("Pedro Caros");
		estudante2.setPrim(5.0);
		estudante2.setSeg(6.0);
		estudante2.setTer(8.0);
		estudante2.setQua(3.5);
		estudante2.setMedia(estudante2.calcularMedia());
		estudante2.setStatus(estudante2.verificarStatus());
		
		System.out.println("Nome: " + estudante2.getNome());
		System.out.println("Primeiro Bimestre: " + estudante2.getPrim());
		System.out.println("Segundo Bimestre: " + estudante2.getSeg());
		System.out.println("Terceiro Bimestre: " + estudante2.getTer());
		System.out.println("Quarto Bimestre: " + estudante2.getQua());
		System.out.println("Média: " + estudante2.getMedia());
		System.out.println("Status: " + estudante2.getStatus());
		
		
		
		
		

	}

}
