package com.gym.springbootgym.Controladores;
import com.gym.springbootgym.Clases.UserCredentials;
import com.gym.springbootgym.Clases.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Usuario")
public class UsuarioControlador {
    @Autowired
    private com.gym.springbootgym.Repositorios.UsuarioRepositorio usuarioRepositorio;

    //Metodo pra crear el Usuario
    @PostMapping
    public Usuario createBook(@RequestBody Usuario Usuario) {
        return usuarioRepositorio.save(Usuario);
    }

    //Metodo para Verificar el Login
    @PostMapping("/login")
    public boolean loginUser(@RequestBody UserCredentials userCredentials) {
        String correo = userCredentials.getCorreo();
        String contrasena = userCredentials.getContrasena();

        // Buscar usuario por correo y contraseña
        Usuario user = usuarioRepositorio.findByCorreoAndContrasena(correo, contrasena);

        // Verificar si el usuario existe
        return user != null;
    }

    //Metodo para Verificar el Gmail
    @PostMapping("/register")
    public boolean RegisterUser(@RequestBody UserCredentials userCredentials) {
        String correo = userCredentials.getCorreo();

        // Buscar usuario por correo y contraseña
        Usuario user = usuarioRepositorio.findByCorreo(correo);

        // Verificar si el usuario existe
        return user != null;
    }
    //Metodo para Obtener los detalles del Usuario
    @GetMapping("/{correo}")
    public Usuario obtenerUsuarioPorCorreo(@PathVariable String correo) {
        // Utiliza el método findByCorreo (deberías agregarlo en tu repositorio) o
        // cualquier otro método personalizado que necesites en tu repositorio
        return usuarioRepositorio.findByCorreo(correo);
    }
}