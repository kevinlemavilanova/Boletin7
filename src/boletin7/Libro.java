/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7;

/**
 *
 * @author klemavilanova
 */
public class Libro {
    private String autor, titulo;
    private int nlibros, nprestados;
    
    public Libro(){}
    public Libro(String autor, String titulo, int nlibros, int nprestados){
        this.autor = autor;
        this.titulo = titulo;
        this.nlibros = nlibros;
        this.nprestados = nprestados;
    }
    public void setautor(String autor){
        this.autor = autor;
    }
    public void settitulo(String titulo){
        this.titulo = titulo;
    }
    public void setnlibros(int nlibros){
        this.nlibros = nlibros;
    }
    public void setnprestados(int nprestados){
        this.nprestados = nprestados;
    }
    public String getautor(){
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getNlibros() {
        return nlibros;
    }
    public int getNprestados() {
        return nprestados;
    }
    
    public Boolean prestamo(){
        Boolean valido = false;
        if (nlibros>0){ 
          nlibros--;
          nprestados++;
          valido = true;}
        return valido;
    }
    public Boolean devolucion(){
        Boolean valido = false;
        if (nprestados>0){ 
          nprestados--;
          nlibros++;
          valido = true;}
        return valido;
    }    
}
