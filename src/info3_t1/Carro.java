/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info3_t1;

/**
 *
 * @author Andrea Isaza Lopez_Alejandro Ceballos Martinez
 */
public class Carro extends Vehiculo{
    private int npuertas;

    public Carro(int npuertas,String placa, String color, String cilindraje) {
        super(placa, color, cilindraje);
        this.npuertas=npuertas;
    }

    

    public int getNpuertas() {
        return npuertas;
    }

    public void setNpuertas(int npuertas) {
        this.npuertas = npuertas;
    }
    @Override
    
    public String toString(){
        return this.getPlaca();
    }
}
