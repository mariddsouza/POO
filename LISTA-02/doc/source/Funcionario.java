package Atividade2;

import java.text.DecimalFormat;

/**
 *
 * @author Mariana Souza - 3898
 */
public class Funcionario {
    
    //para o metodo contratar
    public enum TipoContrato { 
        Efetivo, Horista 
    }

    private final String nome; private final String DataNascimento;
    private TipoContrato TipoContrato; //Efetivo ou Horista
    private double ValorSalario; //Salário mensal para o Efetivo ou o valor por hora do Horista
    private int NumFilhosMenores;
    private String DataAdmissao;

    //metodo construtor 
    public Funcionario(String nome, String DataNascimento) {
        this.nome = nome;
        this.DataNascimento = DataNascimento;
    }

    //metodo contratar
    public void contratar(TipoContrato TipoContrato, double ValorSalario, int NumFilhosMenores, String DataAdmissao) {
        
        this.TipoContrato = TipoContrato;
        this.ValorSalario = ValorSalario;
        this.NumFilhosMenores = NumFilhosMenores;
        this.DataAdmissao = DataAdmissao;
    }
    
    //metodos para alterar set e get (inicio)
    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public TipoContrato getTipoContrato() {
        return TipoContrato;
    }

    public double getSalario() {
        return ValorSalario;
    }

    public int getNumFilhosMenores() {
        return NumFilhosMenores;
    }

    public String getDataAdmissao() {
        return DataAdmissao;
    }

    public void setTipoContrato(TipoContrato contrato) {
        this.TipoContrato = contrato;
    }

    public void setSalario(double salario) {
        this.ValorSalario = salario;
    }

    public void setNumFilhosMenores(int numFilhosMenores) {
        this.NumFilhosMenores = numFilhosMenores;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.DataAdmissao = dataAdmissao;
    }
    //metodos para alterar set e get (final)
    
    public double calculaSalarioBruto(int QtdHoras) {
        double SalarioFinal;
        
        if (this.TipoContrato == TipoContrato.Efetivo) { //verifica Efetivo
            SalarioFinal = this.ValorSalario;  
        } 
        else {
            SalarioFinal = QtdHoras * this.ValorSalario; //verifica Horista
        }

        return SalarioFinal;
    }
    
    //metodo desconto INSS
    public double descontoInss(double SalarioBruto) {
        double Desconto = 0;
        
        if (SalarioBruto <= 1659.38) {
            Desconto = (SalarioBruto * 8) / 100;
            
        } else if (SalarioBruto > 1659.38 && SalarioBruto <= 2765.66) {
            Desconto = (SalarioBruto * 9) / 100;
            
        } else if (SalarioBruto > 2765.66 && SalarioBruto <= 5531.31) {
            Desconto = (SalarioBruto * 11) / 100;
            
        } else if (SalarioBruto > 5531.31) {
            Desconto = (5531.31 * 11) / 100;
        }

        return Desconto;
    }

    //metodo desconto imposto de renda
    public double descontoImpostoRenda(double SalarioBruto) {
        double Desconto = 0;
        double inss = this.descontoInss(SalarioBruto);

        if (SalarioBruto <= 1903.98) {
            Desconto = 0;  
        } 
        else if (SalarioBruto > 1903.98 && SalarioBruto <= 2826.65) {
            Desconto = (((SalarioBruto - inss) * 7.5) / 100) - 142.80;
        } 
        else if (SalarioBruto > 2826.65 && SalarioBruto <= 3751.05) {
            Desconto = (((SalarioBruto - inss) * 15) / 100) - 354.80;
        } 
        else if (SalarioBruto > 3751.05 && SalarioBruto <= 4664.68) {
            Desconto = (((SalarioBruto - inss) * 22.5) / 100) - 636.13;
        } 
        else if (SalarioBruto > 4664.68) {
            Desconto = (((SalarioBruto - inss) * 27.5) / 100) - 869.36;
        }

        return Desconto;
    }

    //metodo para calcular salario liquido
    public double salarioLiquido(double SalarioBruto) {
        
        double inss = this.descontoInss(SalarioBruto);
        
        double impostoRenda = this.descontoImpostoRenda(SalarioBruto);
        
        double salarioLiquido = SalarioBruto - (inss + impostoRenda);
        
        return salarioLiquido;
    }

    //metodo imprime folha de pagamento
    public void folhaPagamento(double SalarioBruto) {
        DecimalFormat formatador = new DecimalFormat("0.00");
        
        double inss = this.descontoInss(SalarioBruto);
        
        double impostoRenda = this.descontoImpostoRenda(SalarioBruto);
        
        double salarioLiquido = this.salarioLiquido(SalarioBruto);

        System.out.println("Salário Bruto: " + formatador.format(SalarioBruto));
        
        System.out.println("Desconto do Imposto de Renda: " + formatador.format(impostoRenda));
        
        System.out.println("Desconto do INSS: " + formatador.format(inss));

        System.out.println("Salário Líquido: " + formatador.format(salarioLiquido));
    }
}