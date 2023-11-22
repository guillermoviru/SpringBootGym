package com.gym.springbootgym.Clases;

//Clase para validar las credenciales del usuario El Email y la Contraseña
public class UserCredentials {
    private String correo;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    private String contrasena;
}
