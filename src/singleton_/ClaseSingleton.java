/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton_;

/**
 *
 * @author jalvarezotero
 */
class ClaseSingleton {
 private static String nombre;
    private static String apellido;
    private static int edad;
    private static ClaseSingleton ClaseSingleton; 
    
    private ClaseSingleton(String nombre, String apellido, int edad){
        ClaseSingleton.nombre=nombre;
        ClaseSingleton.apellido=apellido;
        ClaseSingleton.edad=edad;
    }

    public void setNombre(String nombre) {
        ClaseSingleton.nombre = nombre;
    }

    public void setApellido(String apellido) {
        ClaseSingleton.apellido = apellido;
    }

    public void setEdad(int edad) {
        ClaseSingleton.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    

    public static ClaseSingleton getSingletonInstance(){
        ClaseSingleton = new ClaseSingleton(nombre, apellido, edad);
        return ClaseSingleton;
    }

    @Override
    public String toString() {
        return "Nombre= " + nombre + "\nApellido= " + apellido + "\nEdad=" + edad;
    }
    
}