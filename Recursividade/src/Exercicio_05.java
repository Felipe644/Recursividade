public class Exercicio_05 {
    public int soma(int num){
        if(num==1){
            return 1;
        }return num + soma(num - 1);
    }
}
