/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Notebook
 */
public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ingresso ingresso1 = new Ingresso();
        ingresso1.setNome("Silvus Sanctus");
        ingresso1.setCpf("123.142.211-22");
        ingresso1.setEventoRelacionado("Dubai Fest");
        ingresso1.setData("14/10/2022");
        ingresso1.imprimirValor();
        ingresso1.mostrarResumo();
        System.out.println("-------------------------");
        
        Ingresso ingresso2 = new Ingresso();
        ingresso2.setNome("Luciano Benner");
        ingresso2.setCpf("223.392.232-73");
        ingresso2.setEventoRelacionado("Dubai Fest");
        ingresso2.setData("14/10/2022");
        ingresso2.imprimirValor();
        ingresso2.mostrarResumo();
        System.out.println("-------------------------");
        
        IngVip vip1 = new IngVip();
        vip1.setNome("Chico Stark");
        vip1.setCpf("313.534.335-93");
        vip1.setEventoRelacionado("Dubai Fest");
        vip1.setData("14/10/2022");
        vip1.imprimirValor();
        vip1.mostrarResumo();
        System.out.println("-------------------------");
        
        IngVip vip2 = new IngVip();
        vip2.setNome("Donald Crump");
        vip2.setCpf("454.644.415-77");
        vip2.setEventoRelacionado("Dubai Fest");
        vip2.setData("14/10/2022");
        vip2.imprimirValor();
        vip2.mostrarResumo();
        System.out.println("-------------------------");
        
        IngCamarote Cmrt1 = new IngCamarote();
        Cmrt1.setNome("Fausto Silas");
        Cmrt1.setCpf("575.557.855-78");
        Cmrt1.setEventoRelacionado("Dubai Fest");
        Cmrt1.setData("14/10/2022");
        Cmrt1.imprimirValor();
        Cmrt1.mostrarResumo();
        System.out.println("-------------------------");
        
        IngCamarote Cmrt2 = new IngCamarote();
        Cmrt2.setNome("Elio Murkim");
        Cmrt2.setCpf("123.456.789-88");
        Cmrt2.setEventoRelacionado("Dubai Fest");
        Cmrt2.setData("14/10/2022");
        Cmrt2.imprimirValor();
        Cmrt2.mostrarResumo();
        System.out.println("-------------------------");
        
        Evento evento = new Evento();
        evento.setNome("Dubai Fest");
        evento.setData("14/10/2022");
        evento.venderIngresso(ingresso1);
        evento.venderIngresso(ingresso2);
        evento.venderIngresso(vip1);
        evento.venderIngresso(vip2);
        evento.venderIngresso(Cmrt1);
        evento.venderIngresso(Cmrt2);
        
        evento.ingVendidos();
        
        // TODO code application logic here
    }
    
}
