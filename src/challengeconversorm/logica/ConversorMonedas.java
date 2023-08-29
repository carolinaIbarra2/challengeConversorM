package challengeconversorm.logica;

public class ConversorMonedas{

    private double cantidad;

    public ConversorMonedas(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public double operacionesConversor(String divisa1, String divisa2){
        FactorConversionMonedas operaciones = new FactorConversionMonedas();
        double tasaDeCambio = operaciones.factorDeCambio(divisa1, divisa2);
        double resultado = this.cantidad * tasaDeCambio;
        return resultado;    
    }
    
   
}
