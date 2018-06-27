package dao;

import entities.forecast;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Moises
 */
public class dao {
    RelDatabase db;
    
     public dao(){
        db= new RelDatabase();
    }
     
     private forecast Forecast(ResultSet rs) throws SQLException{
         
     forecast fct=new forecast();
     fct.setMes(rs.getInt("mes"));
     fct.setDia(rs.getInt("dia"));
     fct.setPeriodo(rs.getString("periodo"));
     fct.setEstado(rs.getInt("estado"));
     fct.setDescripcion(rs.getString("descripcion"));
     fct.setMinima(rs.getInt("minima"));
     fct.setMaxima(rs.getInt("maxima"));
     fct.setLlovera(rs.getInt("llovera"));
     return fct;
     }
     
     public List<forecast> getForecast(int d, int m) throws SQLException{
         List<forecast> result=new ArrayList<>();
         try{
             String sql="select*from clima"+
                     "where dia = %d and mes = %d and periodo='Resumen'";
             sql=String.format(sql,d,m);
             ResultSet rs=db.executeQuery(sql);
             while(rs.next()){
                 result.add(Forecast(rs));
             }
         }catch (SQLException ex) { }
         return result;
     }
     
}
