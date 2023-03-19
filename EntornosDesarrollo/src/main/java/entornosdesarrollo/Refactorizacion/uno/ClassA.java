/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornosdesarrollo.Refactorizacion.uno;

/**
 *
 * @author Usuario
 */
public class ClassA {
    
    int atributo1;
    String atributo2;
    float atributo3;
    
    /* 1. Rename. Cambiar el nombre de un método */
    public int metodo1(){
        int a = 0;
        int b = 10;
        return a + b;
    }
    
    
    public int metodo2(){
        int a = 110;
        int b = 10;
        return a - b;
    }
    /* 2. Sustitución de bloques
        Se sustituye un bloque de código por un método. Seleccionar las dos
        últimas líneas de método3. Opción Refactor - Introduce - method
    */
    public void metodo3(){
       int valor = metodo2();
       System.out.println("Estamos en metodo 3");
       System.out.println("Esto es una prueba");
    }
    
    /* 3. Campos encapsulados
        Nos va a permitir hacer privados los atributos de una clase. 
        Además nos da la opción de crear getter/setter.
        Refactor - Encapsulate Fields
    */
    
    /* 4. Movimiento de clases. 
        Mover una clase (u otro elemento) a otro paquete.
        Refactor - Move (seleccionar clase y paquete)
        
    */
    
    /*  5. Extracción de la interfaz.
        Podemos crear una Interfaz desde una clase
        Interfaz: clase con métodos vacíos para que desde diferentes clases
        se puedan implementar dichos métodos. Ejemplo: metodo suma - Cada 
        clase lo puede implementar de una forma distinta.
        En Netbeans sobre una clase Refactor - Extract Interface
    
    */
    
    /*  6. Cambio de parámetros
        Es posible modificar el número de parámetros de un método 
        y cambiar incluso su  forma de acceso. Cambiar parametros de
        metodo5(int num1) a metodo5(int num1, int num2)
        En Netbeans Refactor - Change Method Parameters. Añadir parametros.
        
    */
    public int metodo5(int num1){
        return num1 * num1;
    }
    
    /*  7. Mover a otro nivel
       Con este patrón podemos mover una clase a otro nivel de la jerarquía
       para que pueda  incluso ser pública. Cambiar el acceso de una clase.
       Una clase suele ser pública.
    */
    
    /* 8. Borrar
        
    */
}

