/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DAO;

import Util.DataBase;
import Modelo.VO.Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mac
 */
public class MDInforme3 {
    DataBase dbData;
    Compra compra;

    public MDInforme3() {
        this.dbData = new DataBase();
        this.compra = new Compra();
    }

    public void consultaInforme3(DefaultTableModel modelo){
    try{
        
        Connection conn = dbData.getConnection();
            String query = "SELECT c.ID_Compra, p.Constructora ,p.Banco_Vinculado  FROM Compra AS c INNER JOIN Proyecto AS p on c.ID_Proyecto = p.ID_Proyecto WHERE p.Ciudad ='Salento' and c.Proveedor = 'Homecenter'";
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet result = statement.executeQuery();
            
            while (result.next()) {
                compra.setId_compra(result.getInt(1));
                compra.setConstructora(result.getString(2));
                compra.setBanco(result.getString(3));
                modelo.addRow(new Object[]{compra.getId_compra(),compra.getConstructora(),compra.getBanco()});
            }
            result.close();
        } catch (Exception e) {
        }
        
    }
    
}
