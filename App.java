public class App {
         public static void main(String[] args) throws Exception {
            media(5, 8, 8);
            exibir_numeros(150, 200);
            ePrimo(9);
            semana(1);
            eBissexto(2003);




//----------------------------------------------------------------------//
    }
    public static void media(double AP1, double AP2, double AC) {
        double media = (AP1 + AP2) * 0.4 + AC * 0.2;
        System.out.println("Media" + media);
    }

//-------------------------------------//
//questao2
    public static void exibir_numeros(int inicio, int fim) {
        for (int i = inicio; i <= fim; i++){
            System.out.println(i+"");
        }
    }

//questao3
    public static void ePrimo(int num) {
        boolean eprimo = true;
        if (num <= 1) {
            eprimo = false;
        } else{
            for (int i = 2; i <= Math.sqrt (num);i++){
                if (num % i == 0){
                    eprimo = false;
                    break;
                }
            }
        }
        if (eprimo) {
            System.out.println(num + " é primo");
        } else{
            System.out.println(num + "não é primo");
        }
    }
//questao 4 
    public static void semana(int num) {
        switch (num) {
            case 1:
            System.out.println("Domingo");
            break;
             case 2:
            System.out.println("Segunda");
              break;
             case 3:
            System.out.println("Terça");
            break;
             case 4:
            System.out.println("Quarta");
            break;
             case 5:
            System.out.println("Quinta");
            break;
             case 6:
            System.out.println("Sexta");
            break;
             case 7:
            System.out.println("Sabado");
            break;
              default:
            System.out.println("Opção invalida");
        }
    }

//questão 5
public static void eBissexto(int ano) {
    if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
        System.out.println("o ano é bissexto");

        }

        else {
            System.out.println("o ano não é bissexto");

        }

}
   

















}
