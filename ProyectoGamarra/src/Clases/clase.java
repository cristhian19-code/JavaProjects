package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class clase {
    public int cant;
    public float valor;
    private Connection cn;
    private Statement st;
    private ResultSet rs;
    public String Base=null;
    
    public void conectar() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/"+Base,"root","root");
            st=cn.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
    }
    
    public void actualizar(String sql) throws SQLException{
        st.executeUpdate(sql);
    }
    
    public void desconectar() throws SQLException{
        cn.close();
    }
    
    public ResultSet verDatos(String sql) throws SQLException{
        rs=st.executeQuery(sql);
        return rs;
    }
    
    public void RsSt() throws SQLException{
        rs.close();
        st.close();
    }
    public float SubTotal(){
        return valor*cant;
    }
    
    public clase(){
        
    }
}