
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Notebook
 */
public class IngCamarote extends Ingresso{
    
    public double ValorIngressoCamarote = valorIngressoPista * 1.6;
    
    
    public void calcularValor(){
        ValorIngressoCamarote = valorIngressoPista * 1.6 ;
    }
    
    
    public void imprimirValor(){
        System.out.println("O valor do ingresso camarote: " + this.ValorIngressoCamarote);
    }
    
}    