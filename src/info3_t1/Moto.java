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
public class Moto extends Vehiculo {
    private String tcaja;
    public Moto(String tcaja,String placa, String color, String cilindraje) {
        super(placa, color, cilindraje);
        this.tcaja=tcaja;
    }

    public String getTcaja() {
        return tcaja;
    }

    public void setTcaja(String tcaja) {
        this.tcaja = tcaja;
    }
 @Override
 public String toString(){
  return this.getPlaca();
 }
}
