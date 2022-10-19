/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info3_t1;

import java.util.ArrayList;

/**
 *
 * @author Andrea Isaza Lopez_Alejandro Ceballos 
 */
public class gestionParqueadero {
    public static ArrayList<Carro> listaCarros = new ArrayList<>(); //listado para carros
    public static ArrayList<Moto> listaMotos = new ArrayList<>();//listado para motos individualmente
     public static ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
     
     
    public static void agregarCarro(Carro unCarro){ //agrego un carro al listado
        listaCarros.add(unCarro);
    }
    public static void agregarMoto(Moto unaMoto){ //agrego una moto al listado
        listaMotos.add(unaMoto);
    }
    public static void agregarVehiculo(Vehiculo unVehiculo){ //agrego un carro al listado
        listaVehiculos.add(unVehiculo);
    }
      
    public static boolean existeVehiculo(String placa){
          boolean existe = false;
          int tlista = listaVehiculos.size();
            for (int i=0;i<tlista;i++){
            if (listaVehiculos.get(i).getPlaca().equals(placa)){
                existe=true;
                break;
            }
        }
          return existe;
      }
      
 
 
     public static Vehiculo VehiculoBuscar(String placa, String cilindraje){
         Vehiculo unVehiculo=null;
        for (int i=0;i<listaVehiculos.size();i++){
            if (listaVehiculos.get(i).equals(cilindraje) || listaVehiculos.get(i).getPlaca().equals(placa)){
                unVehiculo=listaVehiculos.get(i);
                break;
            } else {
            }
        }
        return unVehiculo; 
      }
     
     public static Vehiculo VehiculoBuscarPlaca(String placa){
         Vehiculo unVehiculo=null;
        for (int i=0;i<listaVehiculos.size();i++){
            if ( listaVehiculos.get(i).getPlaca().equals(placa)){
                unVehiculo=listaVehiculos.get(i);
                break;
            } else {
            }
        }
        return unVehiculo; 
      }
     
       public static Vehiculo VehiculoBuscarCilindraje(String Cilindraje){
         Vehiculo unVehiculo=null;
        for (int i=0;i<listaVehiculos.size();i++){
            if ( listaVehiculos.get(i).getCilindraje().equals(Cilindraje)){
                unVehiculo=listaVehiculos.get(i);
                break;
            } 
            
        }
        return unVehiculo; 
      }
     
       public static boolean modificarVehiculo(Vehiculo unVehiculo){
          
           boolean encontrado=false;
           for(int cont=0; cont<listaVehiculos.size();cont++){
               if(listaVehiculos.get(cont).getPlaca().equals(unVehiculo.getPlaca())){
                   encontrado=true;
                   listaVehiculos.get(cont).setColor(unVehiculo.getColor());
               }
           }
           return encontrado;
       }
}
