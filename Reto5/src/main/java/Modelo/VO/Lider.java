/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.VO;

/**
 *
 * @author mac
 */
public class Lider {

    private int id_lider;
    private String nombre;
    private String ciudad;

    public Lider() {
    }

    public Lider(int id_lider, String nombre, String ciudad) {
        this.id_lider = id_lider;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    

    /**
     * @return the id_lider
     */
    public int getId_lider() {
        return id_lider;
    }

    /**
     * @param id_lider the id_lider to set
     */
    public void setId_lider(int id_lider) {
        this.id_lider = id_lider;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
