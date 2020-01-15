package br.com.codenation.calculadora;

public class Inss implements Imposto {

    @Override
    public double calcula(double salarioBase) {
        if (salarioBase >= 1032.00 && salarioBase <= 1500.00) {
            return salarioBase - (salarioBase * 0.08);
        }

        if (salarioBase > 1500.00 && salarioBase <= 4000.00) {
            return salarioBase - (salarioBase * 0.09);
        }

        if (salarioBase > 4000.00) {
            return salarioBase - (salarioBase * 0.11);
        }

        return 0.0;
    }
}
