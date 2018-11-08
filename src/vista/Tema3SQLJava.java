/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador_dao.ClienteDAO;
import java.sql.Connection;
import controlador_dao.Conexion_DB;
import modelo_entidad.Cliente;

/**
 *
 * @author mati
 */
public class Tema3SQLJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion_DB conexiondb = new Conexion_DB();
        System.out.println("Abrir conexion");
        Connection con = conexiondb.abrirConexion();
        System.out.println("Conexion abierta");
        ClienteDAO cliDAO=new ClienteDAO();
        cliDAO.actualiza(con, new Cliente(14,"Andreu","Furio","Benavent","AutismusMAximus","HeyBoss"));
        
        System.out.println("Cerrando conexion");
        conexiondb.CerrarConsulta(con);
        
        
        
    }

}
