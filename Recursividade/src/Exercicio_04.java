public class Exercicio_04 {
    int vetor [] = {1,2,3,4};
    public int vetores(int vetor [], int num){
        if (num == 1) {
            return vetor[0];
        }
        return vetor[num - 1]+ vetores(vetor, num - 1);

    }
}
