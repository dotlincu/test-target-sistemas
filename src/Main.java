public class Main {
    public static void main(String[] args) {
        System.out.println("Questão 1:");
        Questao1();
        System.out.println("\nQuestão 2:");
        Questao2(23);
        System.out.println("\nQuestão 3:");
        Questao3();
        System.out.println("\nQuestão 4:");
        Questao4();
        System.out.println("\nQuestão 5:");
        System.out.println(Questao5("Teste de string invertida."));
    }

    public static void Questao1() {
//        int INDICE = 13, SOMA = 0, K = 0;
//        enquanto K < INDICE faça
//        {
//            K = K + 1;
//            SOMA = SOMA + K;
//        }
//        imprimir(SOMA);
//        Ao final do processamento, qual será o valor da variável SOMA?

        int INDICE = 13, SOMA = 0, K = 0;
        while(K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("O valor da variável SOMA é: " + SOMA);
    }

    public static void Questao2(int n) {
//        Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e
//        o próximo valor sempre será a soma dos 2 valores anteriores
//        (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um
//        programa na linguagem que desejar onde, informado um número,
//        ele calcule a sequência de Fibonacci e retorne uma mensagem
//        avisando se o número informado pertence ou não a sequência.
//        IMPORTANTE:
//        Esse número pode ser informado através de qualquer entrada
//        de sua preferência ou pode ser previamente definido no código.

        if(pertenceFibo(n)) {
            System.out.println("O número " + n + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + n + " não pertence à sequência de Fibonacci.");
        }
    }

    public static void Questao3() {
//        Descubra a lógica e complete o próximo elemento:
//        a) 1, 3, 5, 7, ___
//        b) 2, 4, 8, 16, 32, 64, ____
//        c) 0, 1, 4, 9, 16, 25, 36, ____
//        d) 4, 16, 36, 64, ____
//        e) 1, 1, 2, 3, 5, 8, ____
//        f) 2,10, 12, 16, 17, 18, 19, ____

        System.out.println("a) 9 - A sequência é de números ímpares, então o próximo número é 7 + 2 = 9");
        System.out.println("b) 128 - A sequência é de números em potência de 2, então o próximo número é 2 ^ 7 = 128");
        System.out.println("c) 49 - A sequência é de números quadrados, então o próximo número é 7 ^ 2 = 49");
        System.out.println("d) 100 - A sequência é de quadrados perfeitos dos números pares, então o próximo número é 10 ^ 2 = 100");
        System.out.println("e) 13 - A sequência é de números de Fibonacci, então o próximo número é 8 + 5 = 13");
        System.out.println("f) 200 - A sequência é de número que iniciam pela letra 'D', então o próximo número é 'Duzentos' = 200");
    }

    public static void Questao4() {
//        Você está em uma sala com três interruptores, cada um
//        conectado a uma lâmpada em uma sala diferente. Você não
//        pode ver as lâmpadas da sala em que está, mas pode ligar e
//        desligar os interruptores quantas vezes quiser. Seu objetivo
//        é descobrir qual interruptor controla qual lâmpada.
//        Como você faria para descobrir, usando apenas duas idas
//        até uma das salas das lâmpadas, qual interruptor controla
//        cada lâmpada?

        System.out.println("Ligo o primeiro interruptor e espero 5 minutos. Depois desligo o primeiro interruptor e ligo o segundo interruptor. Entro na sala e a lâmpada que estiver acesa é controlada pelo segundo interruptor, a lâmpada que estiver apagada e quente é controlada pelo primeiro interruptor e a lâmpada que estiver apagada e fria é controlada pelo terceiro interruptor.");
    }

    public static String Questao5(String s) {
//        Escreva um programa que inverta os caracteres de um string.
//        IMPORTANTE:
//        a) Essa string pode ser informada através de qualquer entrada
//        de sua preferência ou pode ser previamente definida no código;
//        b) Evite usar funções prontas, como, por exemplo, reverse;

        String invertida = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            invertida += s.charAt(i);
        }
        return invertida;
    }

    public static boolean pertenceFibo(int n) {
        int a = 0, b = 1, c = 0;
        boolean pertence = false;

        while(c < n) {
            c = a + b;
            a = b;
            b = c;
        }

        if(c == n) {
            pertence = true;
        }

        return pertence;
    }
}
