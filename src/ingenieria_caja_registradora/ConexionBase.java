package ingenieria_caja_registradora;



import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConexionBase {

    Connection ConexionSQL;

    public Connection ConexionBase() {
        //RUTA URL DE LA BASE DE DATOS
        String Host = "localhost";
        String Puerto = "3306";
        String BaseData = "newschema";

        //ACCEDER URL
        String User = "root";
        String Password = "root";

        //DRIVER
        String Driver = "com.mysql.cj.jdbc.Driver";

        //CONTRUIR URL
        String DataBaseURL = "jdbc:mysql://" + Host + ":" + Puerto + "/" + BaseData;

        try {
            Class.forName(Driver);
            ConexionSQL = DriverManager.getConnection(DataBaseURL, User, Password);
        } catch (Exception e) {
            System.out.println("No se pudo conectar a la base de datos");
        }
        return ConexionSQL;
    }

    //METODO PARA PODER HACER LA CONEXION CON LA BASE DE DATOS Y MOSTRAR LA INFORMACION DE ESTA
    public ResultSet Visualizar() {
        String sql = "SELECT * FROM newschema.producto";
        Connection Con = ConexionBase();
        ResultSet Rs = null;
        
        try {
            PreparedStatement Ps = Con.prepareStatement(sql);
            System.out.println(Ps.toString());
            
            Rs = Ps.executeQuery();
            System.out.println("entra");
            System.out.println(Rs.toString());
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        return Rs;
    }

    //METODO PARA AGREGAR INFORMACION A LA BASE DE DATOS
    public void GuardarInformacion(String Ruta, String Descripcion, int Cantidad, int Id, float Precio) {
        Connection Con = ConexionBase();
        String sql = "insert into producto(Imagen,Descripcion,Cantidad,Id,Precio) values(?,?,?,?,?)";
        FileInputStream Fi = null;
        PreparedStatement Ps = null;
        try {
            File Archivo = new File(Ruta);
            Fi = new FileInputStream(Archivo);

            Ps = Con.prepareStatement(sql);
            Ps.setBinaryStream(1, Fi);
            Ps.setString(2, Descripcion);
            Ps.setInt(3, Cantidad);
            Ps.setInt(4, Id);
            Ps.setFloat(5, Precio);
            Ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("No se pudo guardar los datos");
        }
    }

    //METODO PARA CAMBIAR ALGUNA INFORMACION DE LA BASE DE DATOS
    public void ModificarInformacion(String Ruta, String Descripcion, int Cantidad, int Id, float Precio) {
        Connection Con = ConexionBase();
        String sql = "Update producto set Imagen= ?, Descripcion= ?,Cantidad= ?,Id=?, Precio=? where Id=" + Id;
        FileInputStream Fi = null;
        PreparedStatement Ps = null;
        try {
            File Archivo = new File(Ruta);
            Fi = new FileInputStream(Archivo);

            Ps = Con.prepareStatement(sql);
            Ps.setBinaryStream(1, Fi);
            Ps.setString(2, Descripcion);
            Ps.setInt(3, Cantidad);
            Ps.setInt(4, Id);
            Ps.setFloat(5, Precio);
            Ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("No se pudo Cambiar los datos");
        }
    }

    //METODO PARA ELIMINAR ALGUN DATO DE LA BASE DE DATOS
    public void EliminarInformacion(int Id) {
        Connection Con = ConexionBase();
        String sql = "delete from producto where Id=" + Id;
        PreparedStatement Ps = null;
        try {
            Ps = Con.prepareStatement(sql);
            Ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("No se eliminaron los datos");
        }
    }

    //METODO PARA BORRAR TODA LA BASE DE DATOS
    public void BorraTodo() {
        Connection Con = ConexionBase();
        String sql = "truncate producto";
        PreparedStatement Ps = null;
        try {
            Ps = Con.prepareStatement(sql);
            Ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("No se pudo eliminar nada");
        }
    }
}
