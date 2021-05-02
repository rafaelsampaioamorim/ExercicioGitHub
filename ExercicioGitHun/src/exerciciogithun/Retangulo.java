package exerciciogithun;

public class Retangulo {
    float base =0;
    float altura=0;
    
    void setBase(float base){
        this.base = base;
    }
    void setAltura(float altura){
        this.altura = altura;
    }
    
    float calculaAreaRetangulo(){
        return base * altura ;
    }
    
    float calculaPerimetroRetangulo(){
        return 2*base + 2*altura;
    }
            
    void imprimir(){
        System.out.println("Area do retangulo: " + calculaAreaRetangulo());
        System.out.println("Perimetro do retangulo: "+ calculaPerimetroRetangulo());
    } 
            
}
