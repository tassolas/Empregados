package MoodleEmpregado;

public class Empregado {
	String nome;
	String sobrenome;
	int salariomensal;
	double porcentagem;
	double valor_da_porcentagem;

public Empregado (String nome, String sobrenome, int salariomensal) {
	this.nome = nome;
	this.sobrenome = sobrenome;
	this.salariomensal = salariomensal;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getSobrenome() {
	return sobrenome;
}
public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}
public int getSalariomensal() {
	return salariomensal;
}
public void setSobrenome(int salariomensal) {
	this.salariomensal = salariomensal;
}

public static double calcularPorcentagem(int salariomensal, double porcentagem) {
    double valor_da_porcentagem = (salariomensal * porcentagem) / 100;
    return valor_da_porcentagem;
}
void resultado1() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Sobrenome: " + this.sobrenome);
    System.out.println("Salário mensal: " + this.salariomensal);
    double valor_da_porcentagem = calcularPorcentagem(this.salariomensal, this.porcentagem);
    System.out.println("O valor da porcentagem de " + this.porcentagem + "% de " + this.salariomensal + " é " + valor_da_porcentagem);
    System.out.println("Salário anual é " + this.salariomensal*12);
}
void resultado2() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Sobrenome: " + this.sobrenome);
    System.out.println("Salário mensal: " + this.salariomensal);
    double valor_da_porcentagem = calcularPorcentagem(this.salariomensal, porcentagem);
    System.out.println("O valor da porcentagem de " + porcentagem + "% de " + this.salariomensal + " é " + valor_da_porcentagem);
    System.out.println("Salário anual é " + this.salariomensal*12);
  }
}




