package Atividade2;

import Atividade2.Funcionario.TipoContrato;
/**
 *
 * @author Mariana Souza - 3898
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("\n---------Horista--------\n");
        Funcionario NovoHorista = new Funcionario("Mariana", "15/05/2001");
        
        NovoHorista.contratar(Funcionario.TipoContrato.Horista, 200, 2, "10/03/2020");

        NovoHorista.folhaPagamento(NovoHorista.calculaSalarioBruto(260));
        

        
        System.out.println("\n---------Efetivo--------\n");
        Funcionario NovoEfetivo = new Funcionario("Junior", "23/09/2000");
                
        NovoEfetivo.contratar(Funcionario.TipoContrato.Efetivo, 3000, 1, "05/12/2015");

        NovoEfetivo.folhaPagamento(NovoEfetivo.calculaSalarioBruto(280));
        

        
        System.out.println("\n---------Horista--------\n");
        Funcionario NovoHoristaTwo = new Funcionario( "Marcia", "17/03/2000");
                
        NovoHoristaTwo.contratar(Funcionario.TipoContrato.Horista, 600, 4, "19/12/2017");

        NovoHoristaTwo.folhaPagamento(NovoHoristaTwo.calculaSalarioBruto(240));
        

        System.out.println("\n---------Efetivo--------\n");
        Funcionario NovoEfetivoTwo = new Funcionario("Jorge Matheus", "09/09/2000");
                
        NovoEfetivoTwo.contratar(Funcionario.TipoContrato.Efetivo, 2150, 2, "28/03/2021");

        NovoEfetivoTwo.folhaPagamento(NovoEfetivoTwo.calculaSalarioBruto(240));
    }
}
