/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DAO;

import Modelo.VO.Lider;
import Util.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mac
 */
public class MDInforme1 {
    DataBase dbData;
    Lider lider;

    public MDInforme1() {
        this.dbData = new DataBase();
        this.lider = new Lider();
    }

    public void consultaInforme1(DefaultTableModel modelo){
    try{
        
        Connection conn = dbData.getConnection();
            String query = "SELECT ID_Lider as ID, Nombre||' '||Primer_Apellido||' '||Segundo_Apellido as LIDER, Ciudad_Residencia as RESIDENCIA FROM Lider ORDER BY Ciudad_Residencia ";
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet result = statement.executeQuery();
            
            while (result.next()) {
                lider.setId_lider(result.getInt(1));
                lider.setNombre(result.getString(2));
                lider.setCiudad(result.getString(3));
                modelo.addRow(new Object[]{lider.getId_lider(),lider.getNombre(),lider.getCiudad()});
            }
            result.close();
        } catch (Exception e) {
        }
        
    }

   
}