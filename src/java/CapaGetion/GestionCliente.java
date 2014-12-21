/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CapaGetion;

import CapaDatos.Conexion;
import ClasePOJO.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author V1C70R MU3N735
 */
public class GestionCliente implements IGestiones {

    public GestionCliente()  {
        try {
            Conexion.GetInstancia().Enlace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private Cliente client=new Cliente(null, null , null, null, null, null, null);
    public Cliente getCliente()
    {
    return client;
    }
    public void setCliente(Cliente client)
    {
    this.client=client;
    }
    
    @Override
    public void Grabar() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("insert into cliente(cedula,nombres,apellidos,direccion,telefono,correo,sexo) values ('"+this.client.getCedula()+"','"+this.client.getNombres()+"','"+this.client.getApellidos()+"','"+this.client.getDireccion()+"','"+this.client.getTelefono()+"','"+this.client.getCorreo()+"','"+this.client.getSexo()+"')");
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
    }

    @Override
    public void Modificar() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("update cliente SET nombres='"+this.client.getNombres()+"',apellidos='"+this.client.getApellidos()+"', direccion = '"+this.client.getDireccion()+"',telefono='"+this.client.getTelefono()+"',correo='"+this.client.getCorreo()+"', sexo = '"+this.client.getSexo()+"' WHERE cedula = "+this.client.getCedula());
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
    }

    @Override
    public void Nuevo() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     this.client.setCedula(" ");
    this.client.setNombres(" ");
    this.client.setApellidos(" ");
    this.client.setDireccion(" ");
    this.client.setTelefono(" ");
    this.client.setCorreo(" ");
    this.client.setSexo(" ");
    
    }

    @Override
    public void Eliminar() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("delete FROM cliente WHERE cedula = "+client.getCedula());
    Conexion.GetInstancia().Desconectar();

    }
    catch(SQLException e)
    {
    throw e;
    }
    }

    @Override
    public void Consultar() throws SQLException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     try{
    Conexion.GetInstancia().Conectar();
        ResultSet consulta=Conexion.GetInstancia().EjectConsulta("select * FROM cliente WHERE Cedula = "+client.getCedula());
   while(consulta.next())
   {
    this.client.setCedula(consulta.getString(2));
    this.client.setNombres(consulta.getString(3));
    this.client.setApellidos(consulta.getString(4));
    this.client.setDireccion(consulta.getString(5));
    this.client.setTelefono(consulta.getString(6));
    this.client.setCorreo(consulta.getString(7));
    this.client.setSexo(consulta.getString(8));
   }
        Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
    }
    
}
