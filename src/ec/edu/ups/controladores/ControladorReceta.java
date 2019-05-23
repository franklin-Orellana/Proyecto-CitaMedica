/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Receta;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 59398
 */
public class ControladorReceta {
    
    private Set<Receta> lista;
    private int codigo;

    public ControladorReceta (){
        lista = new HashSet<>();
        codigo = 1;
    }

    public int getCodigo() {
        return codigo;
    }

    public void cread(Receta objeto) {
    objeto.setCodigo(codigo);
        lista.add(objeto);
        codigo++;
    }

    public Receta read() {
        for (Receta receta : lista) {
            if(receta.getCodigo() == codigo){
                return receta;
            }
        }        
        return null;
    }

    public void update(Receta objeto) {
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }

    public void delete(int codigo) {
       for (Receta receta : lista) {
            if(receta.getCodigo() == codigo){
                lista.remove(receta);
                break;
            }
        }  
    }

    public Set<Receta> getLista() {

        return lista;

    }

          
}
