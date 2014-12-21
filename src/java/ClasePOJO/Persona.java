/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasePOJO;

/**
 *
 * @author V1C70R MU3N735
 */
public class Persona {

    public Persona(String direccion, String sexo, String telefono, String correo, String apellidos, String nombres, String cedula) {
        this.direccion = direccion;
        this.sexo = sexo;
        this.telefono = telefono;
        this.correo = correo;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.cedula = cedula;
    }
    
    private String direccion;

    /**
     * Get the value of direccion
     *
     * @return the value of direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Set the value of direccion
     *
     * @param direccion new value of direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private String sexo;

    /**
     * Get the value of sexo
     *
     * @return the value of sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Set the value of sexo
     *
     * @param sexo new value of sexo
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    private String telefono;

    /**
     * Get the value of telefono
     *
     * @return the value of telefono
     */
    public String getTelefono() {
        
        return telefono;
    }

    /**
     * Set the value of telefono
     *
     * @param telefono new value of telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    private String correo;

    /**
     * Get the value of correo
     *
     * @return the value of correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Set the value of correo
     *
     * @param correo new value of correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    private String apellidos;

    /**
     * Get the value of apellidos
     *
     * @return the value of apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Set the value of apellidos
     *
     * @param apellidos new value of apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    private String nombres;

    /**
     * Get the value of nombres
     *
     * @return the value of nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Set the value of nombres
     *
     * @param nombres new value of nombres
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    private String cedula;

    /**
     * Get the value of cedula
     *
     * @return the value of cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Set the value of cedula
     *
     * @param cedula new value of cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
