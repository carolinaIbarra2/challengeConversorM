package challengeconversorm.logica;

public class FactorConversionMonedas {
    
    private double value;
    private double divisa1;
    private double divisa2;
   
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getDivisa1() {
        return divisa1;
    }

    public void setDivisa1(double divisa1) {
        this.divisa1 = divisa1;
    }

    public double getDivisa2() {
        return divisa2;
    }

    public void setDivisa2(double divisa2) {
        this.divisa2 = divisa2;
    }

    //Constructor

    public FactorConversionMonedas() {
    }
    
    //Operaciones
    
    public double factorDeCambio(String divisa1, String divisa2){
        
        double conversion=1;
        
        if(divisa1.equals("Peso colombiano") && divisa2.equals("Dolar")){
            conversion = 0.00025;
        }else if(divisa1.equals("Peso colombiano") && divisa2.equals("Euro")){
            conversion = 0.00022;
            }else if(divisa1.equals("Peso colombiano") && divisa2.equals("Libras")){
            conversion = 0.00019;
            }else if(divisa1.equals("Peso colombiano") && divisa2.equals("Yen")){
            conversion = 0.033;
            }else if(divisa1.equals("Peso colombiano") && divisa2.equals("Won Coreano")){
            conversion = 0.31;
            }else if(divisa1.equals("Dolar") && divisa2.equals("Peso colombiano")){
            conversion = 4139.39 ;
            }else if(divisa1.equals("Dolar") && divisa2.equals("Euro")){
            conversion = 0.92;
            }else if(divisa1.equals("Dolar") && divisa2.equals("Libras")){
            conversion = 0.79 ;
            }else if(divisa1.equals("Dolar") && divisa2.equals("Yen")){
            conversion = 146.32;
            }else if(divisa1.equals("Dolar") && divisa2.equals("Won Coreano")){
            conversion = 1321.16;
            }else if(divisa1.equals("Euro") && divisa2.equals("Peso colombiano")){
            conversion = 4611.26 ;
            }else if(divisa1.equals("Euro") && divisa2.equals("Dolar")){
            conversion = 1.08;
            }else if(divisa1.equals("Euro") && divisa2.equals("Libras")){
            conversion = 0.86 ;
            }else if(divisa1.equals("Euro") && divisa2.equals("Yen")){
            conversion = 158.52;
            }else if(divisa1.equals("Euro") && divisa2.equals("Won Coreano")){
            conversion = 1430.69;
             }else if(divisa1.equals("Libras") && divisa2.equals("Peso colombiano")){
            conversion = 5205.59 ;
            }else if(divisa1.equals("Libras") && divisa2.equals("Dolar")){
            conversion = 1.26;
            }else if(divisa1.equals("Libras") && divisa2.equals("Euro")){
            conversion = 1.17;
            }else if(divisa1.equals("Libras") && divisa2.equals("Yen")){
            conversion = 184.77;
            }else if(divisa1.equals("Libras") && divisa2.equals("Won Coreano")){
            conversion = 1668.22;
             }else if(divisa1.equals("Yen") && divisa2.equals("Peso colombiano")){
            conversion = 28.18;
            }else if(divisa1.equals("Yen") && divisa2.equals("Dolar")){
            conversion = 0.0068;
            }else if(divisa1.equals("Yen") && divisa2.equals("Euro")){
            conversion = 0.0063;
            }else if(divisa1.equals("Yen") && divisa2.equals("Libras")){
            conversion = 0.0054;
            }else if(divisa1.equals("Yen") && divisa2.equals("Won Coreano")){
            conversion = 9.03;
             }else if(divisa1.equals("Won Coreano") && divisa2.equals("Peso colombiano")){
            conversion = 3.12;
            }else if(divisa1.equals("Won Coreano") && divisa2.equals("Dolar")){
            conversion = 0.00076;
            }else if(divisa1.equals("Won Coreano") && divisa2.equals("Euro")){
            conversion = 0.0007;
            }else if(divisa1.equals("Won Coreano") && divisa2.equals("Libras")){
            conversion = 0.0000060;
            }else if(divisa1.equals("Won Coreano") && divisa2.equals("Yen")){
            conversion = 0.11;
            }else if(divisa1.equals("Peso colombiano") && divisa2.equals("Peso colombiano")){
            conversion = 1;  
             }else if(divisa1.equals("Dolar") && divisa2.equals("Dolar")){
            conversion = 1;  
             }else if(divisa1.equals("Euro") && divisa2.equals("Euro")){
            conversion = 1;  
             }else if(divisa1.equals("Libras") && divisa2.equals("Libras")){
            conversion = 1;  
             }else if(divisa1.equals("Yen") && divisa2.equals("Yen")){
            conversion = 1;  
              }else if(divisa1.equals("Won Coreano") && divisa2.equals("Won Coreano")){
            conversion = 1;}    
            
        return conversion;
    }
    
}
