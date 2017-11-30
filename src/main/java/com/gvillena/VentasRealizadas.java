
package com.gvillena;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class VentasRealizadas {
  private String nombre;
  private String pago;
  private String correo;
  private String ciudad;
  private String pais;
  private String marca_celular;
  
    BufferedWriter bw ;
    PrintWriter pw;
    FileWriter fw;
    File f;
  
  //ArrayList<String> ventas= new ArrayList<>();
  public VentasRealizadas(){}
  public VentasRealizadas(String nom,String pago,String email,String ciu,String pais,String marcacel) throws IOException
  {
      this.nombre=nom;
      this.correo=email;
      this.pago=pago;
      this.ciudad=ciu;
      this.pais=pais;
      this.marca_celular=marcacel;
      RegistrarVenta();
      
  }
  public void RegistrarVenta() throws IOException{
      f= new File("ResgistroVentas.txt");
      fw= new FileWriter(f);
      bw=new BufferedWriter(fw);
      pw= new PrintWriter(bw);
      
      pw.write("Nombre: "+nombre+"\r\n");      
      pw.append("Email: "+correo+"\r\n");
      pw.append("Pago: "+pago+"\r\n");
      pw.append("Ciudad: "+ciudad+"\r\n");
      pw.append("Pais: "+pais+"\r\n");
      pw.append("Marca de Celular: "+marca_celular+"\r\n"); 
      
      bw.close();
      pw.close();
  }
  
    
    
}
