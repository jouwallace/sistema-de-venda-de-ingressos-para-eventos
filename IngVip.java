
/**
 *
 * @author Notebook
 */
public class IngVip extends Ingresso{
    

    public double valorIngressoVip = valorIngressoPista * 1.3;
   

    
    public void calcularValor(){
        valorIngressoVip = valorIngressoPista * 1.3;
    }
    
    public void imprimirValor(){
        System.out.println("O valor do ingresso Vip: " + this.valorIngressoVip);
    }

}