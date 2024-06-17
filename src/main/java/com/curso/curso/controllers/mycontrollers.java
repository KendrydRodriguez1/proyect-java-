package com.curso.curso.controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.curso.curso.models.Usuario;

@RestController
public class mycontrollers {
    @GetMapping("usuario/{id}")
    public Usuario Getuser(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("kendryd");
        usuario.setApellido("rodriguez");
        usuario.setEmail("kendryd@gmail.com");
        usuario.setTelefono("083883883");
        return usuario;
    }


    @GetMapping("usuarios")
    public List<Usuario> Usuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario4 = new Usuario();
        usuario4.setId(1l);
        usuario4.setNombre("kendryd");
        usuario4.setApellido("rodriguez");
        usuario4.setEmail("kendryd@gmail.com");
        usuario4.setTelefono("083883883");

        Usuario usuario1 = new Usuario();
        usuario1.setId(2l);
        usuario1.setNombre("Fernanda");
        usuario1.setApellido("rodriguez");
        usuario1.setEmail("kendryd@gmail.com");
        usuario1.setTelefono("083883883");


        Usuario usuario2 = new Usuario();
        usuario2.setId(3l);
        usuario2.setNombre("maria");
        usuario2.setApellido("rodriguez");
        usuario2.setEmail("kendryd@gmail.com");
        usuario2.setTelefono("083883883");

        usuarios.add(usuario4);
        usuarios.add(usuario1);
        usuarios.add(usuario2);

        return usuarios;



    }


    @GetMapping("/usuario/editar")
    public Usuario Editaruser(){
        Usuario usuario = new Usuario();
        usuario.setNombre("kendryd");
        usuario.setApellido("rodriguez");
        usuario.setEmail("kendryd@gmail.com");
        usuario.setTelefono("083883883");
        return usuario;
    }



    @GetMapping("/usuario/crear")
    public Usuario Crearuser(){
        Usuario usuario = new Usuario();
        usuario.setNombre("kendryd");
        usuario.setApellido("rodriguez");
        usuario.setEmail("kendryd@gmail.com");
        usuario.setTelefono("083883883");
        return usuario;
    }


    @GetMapping("/usuario/eliminar")
    public Usuario Getuser(){
        Usuario usuario = new Usuario();
        usuario.setNombre("kendryd");
        usuario.setApellido("rodriguez");
        usuario.setEmail("kendryd@gmail.com");
        usuario.setTelefono("083883883");
        return usuario;
    }
}



