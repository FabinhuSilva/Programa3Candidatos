
package progrma3recrutamento;

import java.util.Scanner;

/**
 *
 * @author Fabinhu
 */
public class Progrma3Recrutamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        int candidatosMasculino=0, candidatosFemininos=0;
        int quantidadeHomens = 0, somaIdadesHomens=0,idade=0;
        int tempoExperienciaHomens=0, somaIdadesMulheres=0,candFemCExp=0;
        char sexo,experiencia;
        
        Scanner respostaCandidato = new Scanner(System.in);
        
        do{
            System.out.println("===> Cadastro de Candidatos <=== \n");
            System.out.println("Qual sua identidade sexual anatomica: \n"
                    + "(M/F) - M -> Masculino\nF -> Feminino\n"
                    + "S -> Sair");
            sexo = respostaCandidato.next().charAt(0);
            if(sexo=='M' || sexo =='m'){
                candidatosMasculino = candidatosMasculino+1;
                    System.out.println("Qual sua Idade: ");
                    idade = respostaCandidato.nextInt();
                    somaIdadesHomens = somaIdadesHomens + idade;
            }else if(sexo == 'F' || sexo == 'f'){
                candidatosFemininos = candidatosFemininos+1;
                    System.out.println("Possui Expeirncias Profissional: (S/N)");
                    experiencia = respostaCandidato.next().charAt(0);
                    if(experiencia == 'S' || experiencia == 's'){
                        candFemCExp++;
                        System.out.println("Qual sua idade: ");
                        idade = respostaCandidato.nextInt();
                        somaIdadesMulheres = somaIdadesMulheres + idade;
                    }
            }else{
                System.out.println("Opção Invalida| Digite Novamnete\n");
            }
        }while(sexo != 's');
        
        System.out.println("Total de Candidatos Masculinos: "+candidatosMasculino);
        System.out.println("Total de Candidatos Femininos: "+(candidatosFemininos+candFemCExp));
    }
    
}
