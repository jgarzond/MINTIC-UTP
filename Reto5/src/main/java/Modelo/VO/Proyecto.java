/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.VO;

/**
 *
 * @author mac
 */
public class Proyecto {
    private int id_proyecto;
    private String constructora;
    private int num_habitaciones;
    private String ciudad;

    public Proyecto() {
    }

    public Proyecto(int id_proyecto, String constructora, int num_habitaciones, String ciudad) {
        this.id_proyecto = id_proyecto;
        this.constructora = constructora;
        this.num_habitaciones = num_habitaciones;
        this.ciudad = ciudad;
    }

    
    /**
     * @return the id_proyecto
     */
    public int getId_proyecto() {
        return id_proyecto;
    }

    /**
     * @param id_proyecto the id_proyecto to set
     */
    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    /**
     * @return the constructora
     */
    public String getConstructora() {
        return constructora;
    }

    /**
     * @param constructora the constructora to set
     */
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    /**
     * @return the num_habitaciones
     */
    public int getNum_habitaciones() {
        return num_habitaciones;
    }

    /**
     * @param num_habitaciones the num_habitaciones to set
     */
    public void setNum_habitaciones(int num_habitaciones) {
        this.num_habitaciones = num_habitaciones;
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
