package challengeconversorm.logica;

public class ConversorTemperatura {
   
    private double cantidad;

    public ConversorTemperatura(double cantidad) {
        this.cantidad = cantidad;
    }

    public double operacionesConversor(String temperaturaInicial, String temperaturaFinal){
        FactorConversionTemperatura operaciones = new FactorConversionTemperatura();
        double resultado = operaciones.formulas(cantidad, temperaturaInicial, temperaturaFinal);        
        return resultado;    
    }
}
