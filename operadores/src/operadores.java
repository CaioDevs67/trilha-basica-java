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

            System.out.println("Exemplos de operadores relacionais: ");

            int idade = 18;

            System.out.println(idade == 18);
            System.out.println(idade != 18);
            System.out.println(idade > 18);
            System.out.println(idade < 18);
            System.out.println(idade >= 18);
            System.out.println(idade <= 18);

        
    }
}
