package carros;

public class Display {

    public void exibirMensagemInicial(char primeiraLetra, char ultimaLetra) {
        System.out.println("Bem-vindo ao jogo de adivinhação de carros!");
        System.out.println("Adivinhe o nome do carro.");
        System.out.println("Dica: A palavra começa com '" + primeiraLetra + "' e termina com '" + ultimaLetra + "'.");
    }

    public void exibirPalavraParcial(String palavra, String palavraParcial) {
        System.out.println("Palavra: " + palavraParcial);
        System.out.print("Tentativa: ");
    }

    public void exibirMensagemAcerto() {
        System.out.println("Correto! Continue assim.");
    }

    public void exibirMensagemErro() {
        System.out.println("Incorreto. Tente novamente.");
    }

    public void exibirMensagemVitoria(String palavra) {
        System.out.println("Parabéns! Você adivinhou corretamente. A palavra é: " + palavra);
    }
}
