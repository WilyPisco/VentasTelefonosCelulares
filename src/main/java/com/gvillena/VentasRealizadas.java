
package com.gvillena;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
    
    JSONObject obj = new JSONObject();
    JSONArray list = new JSONArray();
    
    
  public VentasRealizadas(){}
  public VentasRealizadas(String nom,String pago,String email,String ciu,String pais,String marcacel) throws IOException
  {
      this.nombre=nom;
      this.correo=email;
      this.pago=pago;
      this.ciudad=ciu;
      this.pais=pais;
      this.marca_celular=marcacel;
      RegistrarVentaJson();
      
  }
  public void RegistrarVenta() throws IOException{
      f= new File("D:\\ResgistroVentas.txt");
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
  public void RegistrarVentaJson()throws IOException{
      f= new File("D:\\ResgistroVentas.txt");
      obj.put("Vendedor", "WILMER PISCO RAMIREZ");
      obj.put("TIENDA", "CLARO PERU SAC");
      JSONObject objc = new JSONObject();
       objc.put("Nombre: ",nombre);              
      objc.put("Email: ",correo);
      objc.put("Pago: ",pago);
      objc.put("Ciudad: ",ciudad);
      objc.put("Pais: ",pais);
      objc.put("Marca de Celular: ",marca_celular);obj.put("FACTURA",objc );      
      fw= new FileWriter("D:\\ResgistroVentas.txt");
      fw.write(obj.toJSONString());
      fw.flush();
      fw.close();
  }
}
