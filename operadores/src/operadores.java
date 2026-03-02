public class operadores {
    public static void main(String[] args) throws Exception {
       /*
            Operadores em Java

            Em Java, operadores são símbolos que realizam operações sobre variáveis e valores (operandos). Abaixo está a classificação técnica e objetiva dos principais operadores da linguagem.
       */
      
      /*
          Operadores Aritméticos

          Usados para cálculos matemáticos.

          Operador   /   Descrição   /   Exemplo
            +            Soma            a + b
            -            Subtração       a - b
            *            Multiplicação   a * b
            /            Divisão         a / b
            %            Resto           a % b
            ++           Incremento      a++ ou ++a
            --           Decremento      a-- ou --a
      */


        System.out.println("Exemplos de Operadores Aritmeticos: ");

        int a = 10;

        int soma = 10 + 5;
        int subtracao = 10 - 5;
        int multiplicacao = 10 * 5;
        double divisao = 10 / 5;
        double resto = 10 % 5;
        int incremento = a++;
        int decremento = a--;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(resto);
        System.out.println(incremento);
        System.out.println(decremento);
        System.out.println(" ");

        /* 
            Operadores Relacionais (Comparação) 

            Retornam TRUE ou FALSE.

            Operador    /   Significado

                ==          Igual
                !=          Diferente
                >           Maior que
                <           Menor que
                >=          Maior ou igual
                <=          Menor ou igual

        */
            System.out.println(" ");
            System.out.println("Exemplos de operadores relacionais: ");

            int idade = 18;

            System.out.println(idade == 18);
            System.out.println(idade != 18);
            System.out.println(idade > 18);
            System.out.println(idade < 18);
            System.out.println(idade >= 18);
            System.out.println(idade <= 18);
            System.out.println(" ");

        /* 
            Operadores Lógicos

            Usados para combinar expressões booleanas.

            Operador    /   Nome    /   Exemplo

            &&              AND         a > 5 && b < 10
            ||              OU          a > 5 || b < 10
            !               NOT         !(a > 5)
         */
            System.out.println(" ");
            boolean resultado = (10 > 5 && 3 < 8);
            System.out.println(resultado); // true
            System.out.println(" ");

            /* 
                Operadores de Atribuição

                Atribuim valores a variáveis

                Operador    /   Exemplo    /   Equivalente
                
                =               a = 5               
                +=              a += 3          a = a + 3
                -=              a -= 2          a = a - 2
                *=              a *= 4          a = a * 4
                /=              a /= 2          a = a / 2
                %=              a %= 3          a = a % 3
                
            */


            /*
                Operador Ternário

                Forma compacta de if-else

                    Sintaxe: condicao ? valorSeVerdadeiro : valorSeFalso;

            */
                    System.out.println(" ");
                    System.out.println("Exemplos de Operadores Ternario");
                    int maiorIdade = 20;
                    String status = (maiorIdade >= 18) ? "Maior de idade" : "Menor de idade";
                    System.out.println(" ");

    }
}
