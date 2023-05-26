/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaprograiipoo;

/**
 *
 * @author luis2
 */
public class CalculadoraEspecial {
    public String tipoCalculadoraEspecial;
    public String color;
    public int dimensionPantalla;
    private String numeroDeSerie;
    private String nombrePropietario;
 
    
    
    
    
    
    
    public CalculadoraEspecial (String propietario){
        this.tipoCalculadoraEspecial="Calculadora Especial";
        this.dimensionPantalla=20;
        this.numeroDeSerie="N3C32170C4F3";
        this.color="Negro";
        this.nombrePropietario=propietario;
   
    }
    
    public CalculadoraEspecial(){}
    
     public static int esPar(int numero) {
        if (numero %2 == 0) {
        System.out.println(" El numero es impar.");
        }else{
        System.out.print("El numero");
        }
        System.out.print(" es impar/");
        return numero; 
    } 
    
     public static int Tabla(int Numero2){
       System.out.println("Tabla del" + Numero2 + ":");
       for (int i = 1; i <= 10; i++){
       int  resultado = Numero2 * i;
       System.out.println(Numero2 + "x" + i + "=" + resultado); 
       }
       System.out.println("Esta es la tabla del");
        return Numero2;
    }
     
   public  int AreaTriangulo (double base,double altura){
       
       double area = (base * altura)/ 2;
       
       System.out.println("El área del triángulo es: " + area);
       
       return (int)  area;
       
   }
   
     public double elevarAlCuadrado(double numero) {
        double resultado = numero * numero;
        System.out.println("El numero elevado al cuadrado es" + resultado+ " ");
        return resultado;
    }

  public static int calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            int factorial = 1;
            for (int i = 2; i <= numero; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
 
public static int mostrarNumerosImpares(int numero) {
    
    
        System.out.println("Números impares  " + numero + ":");
        
        for(int i = 1; i <= numero; i++){
            
            if(i % 2 !=0){ 
                System.out.println(i);
                }   
        }
        return 0;
        
        
}     
}      



 




