
package com.gvillena;

import java.util.ArrayList;

public class VentasRealizadas {
  private String nombre;
  private String pago;
  private String correo;
  private String ciudad;
  private String pais;
  private String marca_celular;
  //ArrayList<String> ventas= new ArrayList<>();
  public VentasRealizadas(){}
  public VentasRealizadas(String nom,String pago,String email,String ciu,String pais,String marcacel)
  {
      this.nombre=nom;
      this.correo=email;
      this.pago=pago;
      this.ciudad=ciu;
      this.pais=pais;
      this.marca_celular=marcacel;
      
  }
  
    
    
}
