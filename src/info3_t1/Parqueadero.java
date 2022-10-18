/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info3_t1;

/**
 *
 * @author USER
 */
public class Parqueadero {
    private String nombre;
    private Carro unAuto;
    private Moto unaMoto;
    private Vehiculo unVehiculo;

    public Parqueadero(String nombre, Carro unAuto, Moto unaMoto, Vehiculo unVehiculo) {
        this.nombre = nombre;
        this.unAuto = unAuto;
        this.unaMoto = unaMoto;
        this.unVehiculo = unVehiculo;
    }
 public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carro getUnAuto() {
        return unAuto;
    }

    public void setUnAuto(Carro unAuto) {
        this.unAuto = unAuto;
    }

    public Moto getUnaMoto() {
        return unaMoto;
    }

    public void setUnaMoto(Moto unaMoto) {
        this.unaMoto = unaMoto;
    }

    public Vehiculo getUnVehiculo() {
        return unVehiculo;
    }

    public void setUnVehiculo(Vehiculo unVehiculo) {
        this.unVehiculo = unVehiculo;
    }
   
    }

   

   
   

