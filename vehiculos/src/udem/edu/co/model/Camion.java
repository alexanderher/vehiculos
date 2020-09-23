/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.model;

/**
 *
 * @author INDRA
 */
public class Camion {

    private String placa;
    private String marca;    
    
    public Camion() {
    }
    
    ///getters and setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Moto{" + "placa=" + placa + ", marca=" + marca + ", peaje= 0 '}'";
    }
    
    
    
}
