package heranca;

/**
 *
 * @author fernando.capeletti
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Automovel carro = new Automovel();
       Automovel moto = new Automovel(); 
       
       carro.setNumPlaca("GRO9B78");
       carro.setNumPortas(3);
       carro.setNumRodas(4);
       carro.setCapacidade(5);
       
       
       carro.imprimeDadosCarro();
    }
    
}
