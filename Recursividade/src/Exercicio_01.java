public class Exercicio_01 {
    public int fat(int num){
        if(num == 0){//Condição de Parada
            return 1;
        }
        return num * fat(num - 1);//O NÚMERO DIGITADO PELO USUÁRIO ESTÁ SENDO MULTIPLICADO PELA PRÓPRIA FUNÇÃO - 1  ATÉ QUE ELA POSSUA O VALOR "1" E SAIA DA REPETIÇÃO.
    }
}
