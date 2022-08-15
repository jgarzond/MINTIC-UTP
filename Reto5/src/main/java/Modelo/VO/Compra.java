/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.VO;

/**
 *
 * @author mac
 */
public class Compra {
    private int id_compra;
    private String Constructora;
    private String banco;
    
    public Compra() {
    }

    public Compra(int id_compra, String Constructora, String banco) {
        this.id_compra = id_compra;
        this.Constructora = Constructora;
        this.banco = banco;
    }

    
    /**
     * @return the id_compra
     */
    public int getId_compra() {
        return id_compra;
    }

    /**
     * @param id_compra the id_compra to set
     */
    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    /**
     * @return the Constructora
     */
    public String getConstructora() {
        return Constructora;
    }

    /**
     * @param Constructora the Constructora to set
     */
    public void setConstructora(String Constructora) {
        this.Constructora = Constructora;
    }

    /**
     * @return the banco
     */
    public String getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(String banco) {
        this.banco = banco;
    }
    
}
