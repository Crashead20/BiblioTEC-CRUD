package bibliotec;

import Config.Conexion;

public class BiblioTEC {

    public static void main(String[] args) {
        
        Conexion con = new Conexion();
        con.getConnection();
        
    }
}