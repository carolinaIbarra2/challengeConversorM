package challengeconversorm.logica;

class FactorConversionTemperatura {
    
    private double value;
    private String temperaturaInicial;
    private String temperaturaFinal;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getTemperaturaInicial() {
        return temperaturaInicial;
    }

    public void setTemperaturaInicial(String temperaturaInicial) {
        this.temperaturaInicial = temperaturaInicial;
    }

    public String getTemperaturaFinal() {
        return temperaturaFinal;
    }

    public void setTemperaturaFinal(String temperaturaFinal) {
        this.temperaturaFinal = temperaturaFinal;
    }

       
    public FactorConversionTemperatura() {
    }
   
    
    public double formulas(double cantidad, String temperaturaInicial, String temperaturaFinal){
        double resultado = 0;
        
         if(temperaturaInicial.equals("Celsius") && temperaturaFinal.equals("Farenheit")){
            resultado = (cantidad*1.8)+32;
        }else if(temperaturaInicial.equals("Celsius") && temperaturaFinal.equals("Celsius")){
            resultado = cantidad;
        }else if(temperaturaInicial.equals("Celsius") && temperaturaFinal.equals("Kelvin")){
            resultado = cantidad + 273.15;
        }else if(temperaturaInicial.equals("Farenheit") && temperaturaFinal.equals("Celsius")){
            resultado = (cantidad-32)*(0.56); 
        }else if(temperaturaInicial.equals("Farenheit") && temperaturaFinal.equals("Farenheit")){
            resultado = cantidad;   
        }else if(temperaturaInicial.equals("Farenheit") && temperaturaFinal.equals("Kelvin")){
            resultado = ((cantidad-32)*(0.56))+273.15;     
        }else if(temperaturaInicial.equals("Kelvin") && temperaturaFinal.equals("Kelvin")){
            resultado = cantidad;  
        }else if(temperaturaInicial.equals("Kelvin") && temperaturaFinal.equals("Celsius")){
            resultado = cantidad - 273.15 ; 
        }else if(temperaturaInicial.equals("Kelvin") && temperaturaFinal.equals("Farenheit")){
            resultado = ((cantidad - 273.15)*(1.8))+32;
        }     
            
         return resultado;
    }
    
}