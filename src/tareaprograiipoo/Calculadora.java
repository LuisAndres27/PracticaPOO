
package tareaprograiipoo;


public class Calculadora {    
    //Atributos de Clase, pueden ser Publicos, Privados y Protegidos (en herencia)
    public String tipoCalculadora;
    public String color;
    public int dimensionPantalla;
    private String numeroDeSerie;
    private String nombrePropietario;
    
    //Constructor de la calse
    public Calculadora(String propietario){
        this.tipoCalculadora="Calculadora Básica";
        this.dimensionPantalla=10;
        this.numeroDeSerie="12345abc";
        this.color="Azul";
        this.nombrePropietario=propietario;
    }
    
    //Constructor vacio
    public Calculadora(){}
    
    //Are de declaración de metodos
    //en clase hemos dicho "funciones" anteriormente, pero en POO son metodos.
    public double sumar(double primerNumero, double segundoNumero){
        return primerNumero + segundoNumero;
    }
    
    public double restar(double primerNumero, double segundoNumero){
        return primerNumero - segundoNumero;
    }
    
    public double multiplicar(double primerNumero, double segundoNumero){
        return primerNumero * segundoNumero;
    }
    
    public double dividir(double primerNumero, double segundoNumero){
        return primerNumero / segundoNumero;
    }
    
    public double raizCuadrada(double numero){
        return Math.sqrt(numero);
    }
    
    public boolean esPrimo(int numeroBuscado){
        boolean primo = false;
        int contador = 0;
        for(int i = numeroBuscado; i > 0; i--){
            if(numeroBuscado % i == 0 ){
                contador++;
            }
        }
        if(7
                == 2){
            return true;
        }else{
            return false;
        }
    } 

    String esPar(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean CalculoTriangulo(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean CalculoTriangulo(double d, double d0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean AreaTriangulo(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean AreaTriangulo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean main(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}