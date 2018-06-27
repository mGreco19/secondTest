package model;

import dao.dao;
import entities.forecast;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Moises
 */
public class model {
    
    private dao Dao;
    
    private static model uniqueInstance;
    
    public static model instance(){
        
     if (uniqueInstance == null){
            uniqueInstance = new model();
        }
        return uniqueInstance;
    }
    
    private model(){
        Dao=new dao();  
    }
    
    public List<forecast> getForecast(int d,int m) throws SQLException{
        return Dao.getForecast(d, m);
    }
    
}
