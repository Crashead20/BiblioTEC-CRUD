package Config;

import java.sql.Connection;
import java.sql.DriverManager;//Importamos las librerias de sql
public class Conexion {//Creamos la clase conexion 
        Connection con;//Creamos una variable tipo coneccion
        public Conexion(){//Creamos el metodo conexion
            try{
              Class.forName("com.mysql.cj.jdbc.Driver");//Importamos el driver de sql y java
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotec","root","");//Ingresamos los datos para ingresar a la base de datos
                System.out.println("Si Jalo (Awebo)");
            }catch(Exception e){
                System.out.println("No Jalo (Tilin Triste)");
            }
        }
        //Creamos el metodo coneccion para lograr la conexion
        public Connection getConnection(){
            return con;//Retornamos el valor de con, para que se ingrese en la shell
        }
}