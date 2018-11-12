/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo_entidad.Cliente;

/**
 *
 * @author mati
 */
public class ClienteDAO {
    
    public void actualiza(Connection con, Cliente cli) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement("UPDATE cliente SET Nombre=?,Ape1=?, Ape2=?,Nick=?,Passwd=?,Saldo=?,Moroso=? WHERE DNI=?");
            statement.setString(1, cli.getNombre());
            statement.setString(2, cli.getApellido1());
            statement.setString(3, cli.getApellido2());
            statement.setString(4, cli.getNick());
            statement.setString(5, cli.getPassword());
            statement.setFloat(6, cli.getSaldo());
            if (cli.isMoroso()) {
                statement.setString(7, 1 + "");
            } else {
                statement.setString(7, 0 + "");
            }
            statement.setInt(8, cli.getDNI());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void insertar(Connection con, Cliente cli) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement("INSERT INTO cliente(Nombre,Ape1,Ape2,Nick,Passwd,Saldo,Moroso,DNI) VALUES(?,?,?,?,?,?,?,?)");
            statement.setString(1, cli.getNombre());
            statement.setString(2, cli.getApellido1());
            statement.setString(3, cli.getApellido2());
            statement.setString(4, cli.getNick());
            statement.setString(5, cli.getPassword());
            statement.setFloat(6, cli.getSaldo());
            if (cli.isMoroso()) {
                statement.setString(7, 1 + "");
            } else {
                statement.setString(7, 0 + "");
            }
            statement.setInt(8, cli.getDNI());
            System.out.println(statement.toString());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void delete(Connection con, int dni) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement("DELETE FROM cliente WHERE DNI=?");
            statement.setInt(1, dni);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void select(Connection con, int dni) {
        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement("SELECT * FROM  cliente WHERE DNI=?");
            statement.setInt(1, dni);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("DNI") + " " + rs.getString("Nombre") + " " + rs.getString("Ape1"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
