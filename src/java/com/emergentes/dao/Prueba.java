
package com.emergentes.dao;

import com.emergentes.modelo.Aviso;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Prueba {
    
    public static void main(String[] args){
        
        Prueba p = new Prueba();
      
        //p.prueba_adicionar("Vendo vendo", "Tablet samsugn note pad s7");
        p.prueba_listado();
        
    }
    
    public void prueba_adicionar(String titulo, String contenido){
        AvisoDAO dao = new AvisoDAOimpl();
        Aviso avi = new Aviso();
        
        avi.setTitulo(titulo);
        avi.setContenido(contenido);
        
        try {
            dao.insert(avi);
        } catch (Exception ex) {
           System.out.println("Error " + ex.getMessage());
        }
    }
    
    public void prueba_eliminacion(int id)
    {
        AvisoDAO dao = new AvisoDAOimpl();
        
        try {
            dao.delete(1);
           
        } catch (Exception ex) {
            System.out.println("Error " + ex.getMessage());
        }
    }
    
    public void prueba_listado()
    {
        AvisoDAO dao = new AvisoDAOimpl();
        try {
            List<Aviso> lista = dao.getAll();
            for(Aviso a : lista){
                System.out.println("Titulo: " + a.getTitulo());
            }
        } catch (Exception ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
