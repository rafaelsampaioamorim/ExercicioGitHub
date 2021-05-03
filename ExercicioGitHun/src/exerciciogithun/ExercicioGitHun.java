
package exerciciogithun;

import java.util.Scanner;

public class ExercicioGitHun {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int retornoMenu; 
        
        do{
            System.out.print("Favor Informar abaixo o que deseja Fazer:\n[1]-Calcular area de uma circunferÃªncia\n[2]-Calcular PerÃ­metro de uma circunferÃªncia\n[3]-Calcular Area do Retangulo\n[4]-Sair\nOpÃ§Ã£o:");
            
            retornoMenu = teclado.nextInt();    

            switch (retornoMenu){
                case 1,2:
                    {

                    Circuferencia bola1 = new Circuferencia();
                        do{
                            System.out.print("\n\nFavor informar o valor do Raio da Bola: ");
                            bola1.setRaio(teclado.nextFloat());    
                        }while(bola1.getRaio()==0);
                        
                        if(retornoMenu==1){
                            System.out.println("A area do circulo Ã©: " + bola1.retornarArea());}
                        else{System.out.println("O perimetro Ã© do circulo Ã©: " + bola1.retornarPrimetro());}
                    }
                    break;
                case 3:{
                        Retangulo obj1 = new Retangulo();
                        do{
                            System.out.print("\n\nFavor informar os valores da base e altura do  Retangulo: ");
                            System.out.println("Base ?");
                            obj1.setBase(teclado.nextFloat());
                            System.out.println("Altura ?");
                            obj1.setAltura(teclado.nextFloat());
                            
                        }while(obj1.base==0);
                        obj1.imprimir();
                    }
                       
                    break;
                case 4:
                    break;// saÃ­da
                default:
                    throw new IllegalArgumentException("OpÃ§Ã£o invÃ¡lida!!!");
            }
        }while(retornoMenu!=4);
    } 
}
