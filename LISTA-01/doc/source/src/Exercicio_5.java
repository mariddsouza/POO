import java.util.Scanner;

public class Exercicio_5 {

    public static boolean Verifica(int day,int mes){
        boolean verifica = false;
        
        if(day>31 || day<=0){
            verifica = false;
        }
        else if(mes>12 || mes <=0){
            verifica = false;
        }
        else if(mes==2&&day>28){
            verifica = false;
        }
        else if((mes=4 || mes==6 || mes==9 || mes==11)&&day>30){
            verifica = false;
        }
        else {
            verifica = true;
        }
        
        return verifica;
    }
    
    public static String Mes(int value){
        
        String resp;
        
        switch (value) {
            case 1:
                resp = "Janeiro";
                break;
            case 2 :
                resp ="Fevereiro";
                break;
            case 3:
              resp = "Março";
              break;
            case 4:
              resp = "Abril";
              break;
            case 5:
              resp = "Maio";
              break;
            case 6:
              resp = "Junho";
              break;
            case 7:
              resp = "Julho";
              break;
            case 8:
              resp = "Agosto";
              break;
            case 9:
              resp = "Setembro";
              break;
            case 10:
              resp = "Outubro";
              break;
            case 11:
              resp = "Novembro";
              break;
            case 12:
              resp = "Dezembro";
              break;
        default:
          response= "";
        }
        
        return response;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
       System.out.print("Informe o dia do seu aniversário: ");
       int dianiver = scan.nextInt();
       
       System.out.print("Informe o mês do seu aniversário: ");
       int mesniver = scan.nextInt();
       
       if(Verifica(dianiver, mesniver)){
           System.out.println("Data válida e o mes é "+ Mes(mesniver)+".");
       }else{
           System.out.println("Data inválida!");
       }

       scan.close();
    }
}