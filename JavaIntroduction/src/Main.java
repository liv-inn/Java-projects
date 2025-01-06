import java.util.ArrayList; // Importação no início do arquivo

// Classe principal deve ter o mesmo nome do arquivo: Main.java
public class Main {
    public static void main(String[] args) {
        // Declaração de variáveis
        int idade = 10; // declaração e inicialização
        int outraIdade; // apenas declaração
        outraIdade = 15; // atribuindo valor depois

        // Java é forte e estaticamente tipada
        // Uma vez que uma variável tem um tipo, ele não pode ser alterado.

        // Inferência de tipo com 'var' (a partir do Java 10)
        var nome = "João"; // o compilador infere que é uma String

        // Tipos primitivos
        byte pequenoNumero = 10; // números inteiros, ocupa 8 bits
        int numero = 100; // números inteiros padrão, ocupa 32 bits
        long grandeNumero = 100000L; // inteiros maiores, ocupa 64 bits
        float preco = 10.5f; // números decimais, requer 'f' no final
        double precoPadrao = 20.99; // padrão para números decimais
        boolean verdade = true; // valores booleanos
        char letra = 'a'; // armazena um único caractere

        // String é um objeto (não um tipo primitivo)
        String palavra = "Olá mundo!";

        // Condicionais
        if (idade > 18) {
            System.out.println("Maior de idade.");
        } else if (idade == 18) {
            System.out.println("Você tem 18 anos.");
        } else {
            System.out.println("Menor de idade.");
        }

        // Vetores (arrays)
        int[] idades = new int[3]; // vetor de 3 posições
        idades[0] = 20; // atribuindo valores
        idades[1] = 25;
        idades[2] = 30;

        String[] nomes = {"João", "Maria", "Pedro"}; // inicializando com valores

        // Acessando elementos
        System.out.println(nomes[0]); // João
        System.out.println("Tamanho do vetor: " + nomes.length); // 3

        // ArrayList (classe para listas dinâmicas)
        ArrayList<Integer> listaIdades = new ArrayList<Integer>();
        listaIdades.add(idade); // adicionando valor
        listaIdades.add(outraIdade);
        System.out.println("Primeira idade da lista: " + listaIdades.get(0)); // acessando o primeiro elemento
        listaIdades.remove(0); // removendo o primeiro elemento

        // Loops
        for (var i = 0; i < listaIdades.size(); i++) {
            System.out.println("Idade: " + listaIdades.get(i));
        }

        int i = 0;
        while (i < idades.length) {
            System.out.println("Idade no vetor: " + idades[i]);
            i++;
        }

        // Casting (conversão de tipos)
        double idadeDouble = idade; // casting implícito
        int idadeInt = (int) idadeDouble; // casting explícito

        char inicial = 'J';
        String inicialStr = String.valueOf(inicial); // transformando char em String
        char letraConvertida = inicialStr.charAt(0); // pegando o primeiro caractere da String

        // POO: Classes, Construtores e Modificadores de Acesso
        Animal cachorro = new Animal("Bolinha", 3);
        cachorro.emitirSom();

        // Exemplo de Herança
        Gato gato = new Gato("Mingau", 2);
        gato.emitirSom();
        gato.pular();
    }
}

// Exemplo de uma classe "Animal"
class Animal {
    private String nome;
    private int idade;

    // Construtor
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Método que pode ser sobrescrito
    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }
}

// Exemplo de herança: classe "Gato"
class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade); // chamando o construtor da superclasse
    }

    // Sobrescrevendo método
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    public void pular() {
        System.out.println("O gato pulou na prateleira!");
    }
}
