/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Notebook
 */
public class Evento {
    private String nome;
    private String data;
    private float valorUnico;
    private final int capMaxima = 30;
    private List<Ingresso> ingressos;
    
    public Evento(){
    this.ingressos = new ArrayList<Ingresso>();    
    }


    public void venderIngresso(Ingresso ingresso){
        if(this.ingressos.size()<=30){
         ingressos.add(ingresso);
        }else{
            System.out.println("Capacidade do Evento esgotada.");
        }
    }
    public void ingVendidos(){
        String msg = "Evento: "+this.nome;
        msg+= "\nData: " +this.data;
        msg+="\nCapacidade Maxima: "+this.getCapMaxima()+"\n";
        for(int i = 0; i<ingressos.size();i++) { String nomes;
            nomes = ingressos.get(i).getNome();
            msg+= "Vendido " +(i+1)+": "+ nomes+ "\n";
        }
        JOptionPane.showMessageDialog(null, msg);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValorUnico() {
        return valorUnico;
    }

    public void setValorUnico(float valorUnico) {
        this.valorUnico = valorUnico;
    }

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {

    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }
}
    
