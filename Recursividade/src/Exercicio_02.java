public class Exercicio_02 {
    public int fibona(int num){
        if (num < 2){//SE O NUMERO DIGITADO PELO USUÁRIO FOR MENOR QUE 2 SERÁ RETORNADO O NÚMERO 1 QUE SÃO OS DOIS PRIMEIROS TERMOS DA SEQUÊNCIA.
            return 1;
        }
         return  fibona(num - 1) + fibona(num - 2);//A SEQUÊNCIA DE FIBONACCI É CALCULA A PARTIR DA SOMA DE SEUS DOIS NÚMEROS ANTERIORES (NUM-1)+(NUM-2)
    }
}
