package main;

public class Errores {

    private double valorReal, ValorAproximado;

    public Errores(double valorReal, double ValorAproximado) {
        this.valorReal = valorReal;
        this.ValorAproximado = ValorAproximado;
    }
    
    public double ErrorAbsoluto() {
        double absoluto = Math.abs(valorReal - ValorAproximado);

        return absoluto;
    }

    public double ErrorRelativo() {
        double relativo = ErrorAbsoluto()/ valorReal;

        return relativo;
    }

    public double ErrorRelativoPorcentual() {
        double porcentual = ErrorRelativo()* 100;

        return porcentual;
    }

}
