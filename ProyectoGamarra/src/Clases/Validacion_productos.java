package Clases;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Validacion_productos{
    clase con = new clase();
    public String sql;
    private ResultSet rs;
    
    public void Compra(int ID,int cantidad){   
        try {
            int rest=0;
            rest=Integer.parseInt(rs.getString(2))-cantidad;
            sql="update almacen1 set stock= '"+rest+"' where ID= "+ID+";";
            con.actualizar(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo conectar");
        }
    }
    
    public boolean Verificar_stock(int ID, int cant){
        try{
            con.Base="galeria";
            con.conectar();
            rs=con.verDatos("select * from almacen1 where ID = "+ID+";");
            if(rs.next()){
                if(cant<=Integer.parseInt(rs.getString(2))){
                   JOptionPane.showMessageDialog(null, "producto en el carrito");
                   return true;
                }
                else{
                   JOptionPane.showMessageDialog(null, "la cantidad no se encuentra disponible");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "no se encontro el producto");
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "no se pudo conectar");
        }       
        return false;
    }
    
    public void validacion_prueb(int ID,int cantidad){
        try{
            con.Base="galeria";
            con.conectar();
            rs=con.verDatos("select * from almacen1 where ID="+ID+"");
            if(rs.next()){
                if(cantidad<=Integer.parseInt(rs.getString(2)) && cantidad!=0){
                   int res=0;
                   res=Integer.parseInt(rs.getString(2))-cantidad;
                   con.actualizar("update almacen1 set stock='"+res+"' where ID="+ID+";");
                   JOptionPane.showMessageDialog(null, "producto guardado");
                }
                else{
                   JOptionPane.showMessageDialog(null, "la cantidad no se encuentra disponible");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "no se encontro el producto");
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "no se pudo conectar");
        }
    }
            
    public Validacion_productos(){
        
    }
}