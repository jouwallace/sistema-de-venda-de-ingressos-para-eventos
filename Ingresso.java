
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Notebook
 */
public class Ingresso {
    String nome;
    String cpf;
    private String data;
    private String eventoRelacionado;
    
    /**
     *
     */
    public final double valorIngressoPista = 40;
    
    public double getvalorIngressoPista(){
        return valorIngressoPista;
    }
    
    
    
    public void imprimirValor(){
        System.out.println("O valor do ingresso Pista: " +this.valorIngressoPista);
        }   
    
    
    public void mostrarResumo(){
        System.out.println("Ingresso vendido para: " + this.getNome());
        System.out.println("Cpf: " + this.getCpf());
        System.out.println("Evento: " + this.getEventoRelacionado());
        System.out.println("Data do evento: " + this.getData());
        
        
        }
        
        
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEventoRelacionado() {
        return eventoRelacionado;
    }

    public void setEventoRelacionado(String eventoRelacionado) {
        this.eventoRelacionado = eventoRelacionado;
    }

    public double getValorIngressoPista() {
        return valorIngressoPista;
    }


    
    

}
