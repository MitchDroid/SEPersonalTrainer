/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 *
 */
package FactsBaseController;

import FactsBaseHandler.ConnectionHandler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author miller.barrera
 *
 */
public class DataBaseController {

    private ConnectionHandler mConnectionHandler;
    private Connection mConnection = null;
    private static DataBaseController mController;

    public static DataBaseController getInstance() {
        if (mController == null) {
            mController = new DataBaseController();
        }
        return mController;
    }

    /**
     * Esta clase es la interfaz entre la base de datos y las vistas
     */
    public DataBaseController() {
        mConnectionHandler = new ConnectionHandler();
        mConnection = mConnectionHandler.createConnection();

    }

    /**
     * Método para recuperar el formato de URL según los criterios de búsqueda.
     *
     * @param id identificación de la URL solicitada
     * @return String con la URL Formateada
     */
    public String getURLTypeToSearch(int id) {
        String URL = "";

        if (mConnection != null) {
            try {
                String SQL_INSERT_QUERY = "SELECT * FROM tb_url_store WHERE url_id = " + id;
                PreparedStatement pst = mConnection.prepareStatement(SQL_INSERT_QUERY);
                ResultSet rs = pst.executeQuery();

                while (rs.next() == true) {
                    URL = rs.getString("url");

                }

                pst.close();

            } catch (SQLException e) {
                e.printStackTrace();

            }

        }

        return URL;
    }

    /**
     * Método para insertar la base de hechos en la base de datos.
     *
     * @return 1 si el registro fué insertado correctamente
     */
    public int sqlInsertFacts(String name, String birth_Date, String age,
            String address, String sex, String weight, String height, String diseases) {

        int queryResult = 0;
        if (mConnection != null) {
            try {
                String SQL_INSERT_QUERY = "INSERT INTO tb_base_facts (nombre, fecha_nacimiento, edad,"
                        + "direccion, sexo, peso_kg, estatura_cm, enfermedades) VALUES (?,?,?,?,?,?,?,?)";
                PreparedStatement pst = mConnection.prepareStatement(SQL_INSERT_QUERY);

                pst.setString(1, name);
                pst.setString(2, birth_Date);
                pst.setString(3, age);
                pst.setString(4, address);
                pst.setString(5, sex);
                pst.setString(6, weight);
                pst.setString(7, height);
                pst.setString(8, diseases);
                

                /**
                 * Execute QUERY*
                 */
                queryResult = pst.executeUpdate();
                

                if (pst != null) {
                    pst.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();

            }
        }
        return queryResult;
    }

}
