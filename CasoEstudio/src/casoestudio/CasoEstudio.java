/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoestudio;

import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class CasoEstudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int continuidad= 0;
        int Cant_factura=Integer.parseInt(JOptionPane.showInputDialog("Introduza la cantidad de facturas:"));
        String nombre_cliente = JOptionPane.showInputDialog("Introduzca el nombre del Cliente");
        String ID = JOptionPane.showInputDialog("Introduzca la cédula del cliente");
        int year = 2023;
        
        Facturacion [] facturas = new Facturacion[32000];
        
        for (continuidad = 0; continuidad < Cant_factura ;continuidad++){
            
            facturas[continuidad] = new Facturacion();
            
            facturas[continuidad].setNombre(nombre_cliente);
            facturas[continuidad].setID_cliente(ID);
            facturas[continuidad].setMonto_Factura(Double.parseDouble(JOptionPane.showInputDialog("Digite el monto de la factura del cliente:")));
            facturas[continuidad].setMes_Factura(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el mes de la factura 1-6")));
            facturas[continuidad].setYear_cliente(year);
            facturas[continuidad].setEstado_Factura(Integer.parseInt(JOptionPane.showInputDialog("Introduzca si la factura está pagada 1 sino 2")));
            facturas[continuidad].setNumero_Factura(Integer.parseInt(JOptionPane.showInputDialog("Coloque el numero de la factura del cliente:")));
                
            }
        for (int i = 0; i < Cant_factura; i++) {
            System.out.println("Cedula: "+facturas[i].getID_cliente()+" Cliente: "+facturas[i].getNombre()+" Número de factura: "+facturas[i].getNumero_Factura()+" Mes: "+facturas[i].getMes_Factura()+ " Ano: "+facturas[i].getYear_cliente()+" Monto Factura: "+facturas[i].getMonto_Factura()+" Estado Factura: "+facturas[i].getEstado_Factura());
            
        }
        double total_grueso=0;
        
        for (int i = 0; i < Cant_factura; i++) {
            if (facturas[i].getEstado_Factura()== 2){
                total_grueso =total_grueso+facturas[i].getMonto_Factura();
            }
     
        }
        double total_cuotas=(total_grueso*1.05)/6;
        
        
        
        
        
        
        
        
        
        System.out.println("\n\n\n");
        
        System.out.println("Cuota 1 "+total_cuotas+" Fecha de pago Julio 2023 ");
        System.out.println("Cuota 2 "+total_cuotas+" Fecha de pago Agosto 2023 ");
        System.out.println("Cuota 3 "+total_cuotas+" Fecha de pago Setiembre 2023 ");
        System.out.println("Cuota 4 "+total_cuotas+" Fecha de pago Octubre 2023 ");
        System.out.println("Cuota 5 "+total_cuotas+" Fecha de pago Noviembre 2023 ");
        System.out.println("Cuota 6 "+total_cuotas+" Fecha de pago Diciembre 2023 ");
        
        }
      
    
}
