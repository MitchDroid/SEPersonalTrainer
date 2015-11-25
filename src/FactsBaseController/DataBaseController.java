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
import java.util.Vector;
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
     * Método para recuperar datos de la base de hechos.
     *
     * @return Vector con la los datos
     */
    public Vector<String> getFacts() {
        String URL = "";
        Vector<String> factsData = new Vector<>();

        if (mConnection != null) {
            try {
                String SQL_INSERT_QUERY = "SELECT * FROM tb_base_facts";
                PreparedStatement pst = mConnection.prepareStatement(SQL_INSERT_QUERY);
                ResultSet rs = pst.executeQuery();

                while (rs.next() == true) {
                    factsData.add(rs.getString(7));
                    factsData.add(rs.getString(8));

                }

                pst.close();

            } catch (SQLException e) {
                e.printStackTrace();

            }

        }

        return factsData;
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

    /**
     * Método para recuperar el id de la base de conocimientos.
     *
     * @return Vector con el id de la rutina sugerida
     */
    public Vector<String> getSuggestedRoutineId(String routineId) {
        String URL = "";
        Vector<String> suggestedRoutineData = new Vector<>();

        if (mConnection != null) {
            try {
                String SQL_INSERT_QUERY = "SELECT * FROM tb_routines where id_routine = " + "'" + routineId + "'";
                PreparedStatement pst = mConnection.prepareStatement(SQL_INSERT_QUERY);
                ResultSet rs = pst.executeQuery();

                while (rs.next() == true) {
                    suggestedRoutineData.add(rs.getString(1));
                    suggestedRoutineData.add(rs.getString(2));
                    suggestedRoutineData.add(rs.getString(3));

                }

                pst.close();

            } catch (SQLException e) {
                e.printStackTrace();

            }

        }

        return suggestedRoutineData;
    }

    /**
     * Método para recuperar la rutina sugerida de la base de conocimientos.
     *
     * @return Vector con el id de la rutina sugerida
     */
    public Vector<Vector<String>> getSuggestedRoutine(String id) {
        String s_tb_name = "";

        if (id.equalsIgnoreCase("PI")) {
            s_tb_name = routineTBNameQuery(1);
        } else if (id.equalsIgnoreCase("BP")) {
            s_tb_name = routineTBNameQuery(2);
        } else if (id.equalsIgnoreCase("GM")) {
            s_tb_name = routineTBNameQuery(3);
        } else {
            s_tb_name = routineTBNameQuery(1);
        }
        Vector<Vector<String>> suggestedRoutine = new Vector<Vector<String>>();

        if (mConnection != null) {
            try {
                String SQL_INSERT_QUERY = "SELECT * FROM " + s_tb_name;
                PreparedStatement pst = mConnection.prepareStatement(SQL_INSERT_QUERY);
                ResultSet rs = pst.executeQuery();

                while (rs.next() == true) {
                    Vector<String> singlevector = new Vector<String>();
                    singlevector.add(rs.getString(1));
                    singlevector.add(rs.getString(2));
                    singlevector.add(rs.getString(3));
                    singlevector.add(rs.getString(4));
                    suggestedRoutine.add(singlevector);

                }

                pst.close();

            } catch (SQLException e) {
                e.printStackTrace();

            }

        }

        return suggestedRoutine;
    }

    public String routineTBNameQuery(int id) {
        String tb_name = "";
        switch (id) {
            case 1:
                tb_name = "tb_bk_goal_weight_maintenance";
                break;
            case 2:
                tb_name = "tb_bk_loose_weight";
                break;
            case 3:
                tb_name = "tb_bk_goal_weight_gain_muscle";
                break;
            default:
                tb_name = "tb_bk_goal_weight_maintenance";
        }

        return tb_name;

    }

}
