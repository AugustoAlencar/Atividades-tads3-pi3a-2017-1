/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author augusto.palencar1
 */
public class ConnectionDB {
    
    
    private static final String DRIVER = "con.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/dbagenda";
    private static final String USER = "root";
    private static final String PASS = "";
    public Statement stmt = null; //prepara sql e executar
    public ResultSet rs = null; // retornando na variavel rs
    public Connection con;
    
    public void Connection() {
        try {
            
            System.setProperty("jdbc.Drivers", DRIVER);
            con=(Connection) DriverManager.getConnection(URL, USER, PASS);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro na Conexção: \n " + ex);
        }
    }    
    public void closeConnection(){
        try {
            
             con.close();
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao Fechar Conexão com Banco de Dados: \n " + ex.getMessage());
        }
    }    
    public void executaSql(String sql){
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro Executa Sql: \n " + ex.getMessage());
        }
    }
}
    

