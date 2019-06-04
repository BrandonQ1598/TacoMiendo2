package com.example.tacomiendo;

public class Direccion {
    private String direccion;
    private String departamento;
    private String ciudad;
    private String telefono;

    public Direccion(String direccion, String departamento, String ciudad, String telefono) {
        this.direccion = direccion;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
