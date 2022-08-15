/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DAO;

import Util.DataBase;
import Modelo.VO.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mac
 */
public class MDInforme2 {
    
    DataBase dbData;
    Proyecto proyecto;

    public MDInforme2() {
        this.dbData = new DataBase();
        this.proyecto = new Proyecto();
    }

    public void consultaInforme2(DefaultTableModel modelo){
    try{
        
        Connection conn = dbData.getConnection();
            String query = "SELECT ID_Proyecto As 'Proyecto', Constructora , Numero_Habitaciones AS 'Habitaciones' , Ciudad  FROM Proyecto WHERE Clasificacion = 'Casa Campestre' and Ciudad IN ('Santa Marta','Cartagena','Barranquilla') ORDER BY Ciudad";
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet result = statement.executeQuery();
            
            while (result.next()) {
                proyecto.setId_proyecto(result.getInt(1));
                proyecto.setConstructora(result.getString(2));
                proyecto.setNum_habitaciones(result.getInt(3));
                proyecto.setCiudad(result.getString(4));
                modelo.addRow(new Object[]{proyecto.getId_proyecto(),proyecto.getConstructora(),proyecto.getNum_habitaciones(),proyecto.getCiudad()});
               }
            result.close();
        } catch (Exception e) {
        }
        
    }

    
}
