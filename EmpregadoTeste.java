package MoodleEmpregado;

public class EmpregadoTeste {

	public static void main(String[] args) {
		Empregado c1 = new Empregado("João", "Gabriel", 1500);
		c1.porcentagem = 10.0;
		c1.resultado1();
		
		System.out.println("----------------------------------------------------------");
		
		Empregado c2 = new Empregado("Maria", "Rita", 1200);
		c2.porcentagem = 10.0;
		c2.resultado2();
	}	
}
