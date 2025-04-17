import java.util.Scanner;

public class programa{
    public static void main(String[] args) {
    Scanner digitar = new Scanner(System.in);
        System.out.println("Bem vindos a opção de planos\n");

        System.out.println("Planos disponiveis:\n ");
        System.out.println("Plano A R$ 27,90\n Filmes disponivéis:\n Minecraft\n Cada um tem a gêmea que merece\n Tropa de Elite\n Beneficios: Full hd, 4 telas ao mesmo tempo \n");
        System.out.println("Plano B R$ 19,90\n Filmes disponivéis:\n Até que a sorte nós separe\n Diário de um Banana 01\n Diário de um banana 02\n Beneficios: Qualidade: Hd, 3 telas ao mesmo tempo\n");
        System.out.println("Plano C R$ 9,90\n Filmes disponivéis\n Barbie\n Transformers \n O fabricante de lágrimas\n Beneficios: Sd, 1 tela somente");
        System.out.println("Qual plano você prefere?\n");

        String planos = digitar.next().toUpperCase();
        if(planos.equals("A") ){
            System.out.println("Plano A escolhido!");
        } 
            else if(planos.equals("B")){
            System.out.println("Plano B escolhido!");
        }
            else if (planos.equals("C")) {
                System.out.println("Plano C escolhido");
        }   else{
            System.out.println("Não existe esse plano");
        }
            
        


    }    
}