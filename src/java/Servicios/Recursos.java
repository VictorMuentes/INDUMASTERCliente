/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import CapaGetion.GestionCliente;
import ClasePOJO.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author V1C70R MU3N735
 */
@Path ("Cliente")
public class Recursos 
{
GestionCliente Client = new GestionCliente();
public static List<Cliente> ListaCliente = new ArrayList<>();    
   
   

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Cliente> Consultar(@QueryParam("Cedula") String Cedula) {


        Client.getCliente().setCedula(Cedula);
        
        List<Cliente> lista = new ArrayList<Cliente>();
        for (Cliente persona : ListaCliente) {
            if (persona.getCedula().indexOf(Cedula) >= 0) {
                lista.add(persona);
                
                
            }

        }
        return lista;
        
//        try {
//            ArrayList<Cliente>Consultar=Client.Consultar();
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(Recursos.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return ListaCliente;
    }    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String Insertar(Cliente objCliente)
    {
        Recursos.this.Client.getCliente().setCedula(objCliente.getCedula());
        Recursos.this.Client.getCliente().setNombres(objCliente.getNombres());
        Recursos.this.Client.getCliente().setApellidos(objCliente.getApellidos());
        Recursos.this.Client.getCliente().setDireccion(objCliente.getDireccion());
        Recursos.this.Client.getCliente().setTelefono(objCliente.getTelefono());
        Recursos.this.Client.getCliente().setSexo(objCliente.getSexo());
        Recursos.this.Client.getCliente().setCorreo(objCliente.getCorreo());

        try {
            Client.Grabar();
            return "Cliente Registrado ";
        } catch (SQLException ex) {
            Logger.getLogger(Recursos.class.getName()).log(Level.SEVERE, null, ex);
            return "Eror" + ex;
        }
    
    }
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN) 
    public String modificar(Cliente objCliente)
    {
        try {
            Client.Modificar();
            return "Cliente modificado"+objCliente.getNombres();
        } catch (SQLException ex) {
            Logger.getLogger(Recursos.class.getName()).log(Level.SEVERE, null, ex);
            return "Eror" + ex;
        }
        
    }
    
    @DELETE
    @Path("{Cedula}")
    @Produces(MediaType.TEXT_PLAIN)
    public String eliminar(@PathParam("Cedula") String cedula)
    {
        
        ListaCliente.clear();
        
        try {
            Client.Eliminar();
            return "El Cliente ha sido eliminado";
        } catch (SQLException ex) {
            Logger.getLogger(Recursos.class.getName()).log(Level.SEVERE, null, ex);
            return "Eror" + ex;
        }
        
    }    
}
