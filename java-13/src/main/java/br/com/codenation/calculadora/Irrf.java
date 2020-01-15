package br.com.codenation.calculadora;

public class Irrf implements Imposto {


    @Override
    public double calcula(double salarioBase) {
        if (salarioBase <= 3000.00) {
            return salarioBase;
        }

        if (salarioBase > 3000.00 && salarioBase <= 6000.00) {
            return salarioBase - (salarioBase * 0.075);
        }

        if (salarioBase > 6000.00) {
            return salarioBase - (salarioBase * 0.15);
        }

        return 0.0;
    }
}
