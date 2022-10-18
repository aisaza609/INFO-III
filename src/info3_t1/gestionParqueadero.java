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
      
 
    public static Carro carroBuscar(String placa, String cilindraje){
         Carro unCarro=null;
        for (int i=0;i<listaCarros.size();i++){
            if ((listaCarros.get(i).getPlaca().equals(placa)) || (listaCarros.get(i).equals(cilindraje))){
               unCarro=listaCarros.get(i);
               break;
            }
        }
        return unCarro; 
      }
      
    public static Moto motoBuscar(String placa, String cilindraje){
         Moto unaMoto=null;
        for (int i=0;i<listaMotos.size();i++){
            if ((listaMotos.get(i).getPlaca().equals(placa)) || (listaMotos.get(i).equals(cilindraje))){
               unaMoto=listaMotos.get(i);
               break;
            }
        }
        return unaMoto; 
      }
}
