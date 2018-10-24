public class Exercicio_08 {
    public int multiplicacao(int num1,int num2){
        if (num1 == 0 || num2 == 0){
            return 0;
        }
        if (num2 == 1){
            return num1;
        }
        return num1 + multiplicacao(num1,num2 - 1);
    }
}
