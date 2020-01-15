package br.com.codenation.calculadora;


public class CalculadoraSalario {

	private double calcularImposto (double salarioBase, Imposto imposto) {
		return imposto.calcula(salarioBase);
	}

	public long calcularSalarioLiquido(double salarioBase) {

		double salarioBrutoInss = calcularImposto(salarioBase, new Inss());

		double salarioArredondado = calcularImposto(salarioBrutoInss, new Irrf());

		return Math.round(salarioArredondado);
	}

}
/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar! 
*/