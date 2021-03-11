package main;
/*INSTITUTO TECNOLÓGICO SUPERIOR DE VALLADOLID
MATERIA:
MÉTODOS NUMÉRICOS

DOCENTE.
M.M JORGE MANUEL POOL CEN

KINIL CHI PEDRO PABLO (19070036)

ACTIVIDAD:
programa de errores
    
UNIDAD I: 
INTRODUCCIÓN A LOS MÉTODOS NUMÉRICOS
*/
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
