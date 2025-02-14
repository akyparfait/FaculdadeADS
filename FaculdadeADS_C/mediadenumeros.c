#include <stdio.h>

int main() {
    int n, i;
    float soma = 0, numero, media;

    printf("Quantos números deseja inserir? ");
    scanf("%d", &n);

    if (n <= 0) {
        printf("O número de valores deve ser maior que zero.\n");
        return 1;
    }

    for (i = 0; i < n; i++) {
        printf("Digite o número %d: ", i + 1);
        scanf("%f", &numero);
        soma += numero;
    }

    media = soma / n;
    printf("A média dos %d números é: %.2f\n", n, media);

    return 0;
}
