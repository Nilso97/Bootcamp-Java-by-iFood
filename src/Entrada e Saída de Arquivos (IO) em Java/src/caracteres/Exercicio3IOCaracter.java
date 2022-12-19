package caracteres;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Exercicio3IOCaracter {
    
    public static void copiarArquivo() throws IOException {

        File arquivo = new File("C:/Users/nilso.nascimento/Desktop/Entrada e Saída de Arquivos (IO) em Java/recomendacoes.txt");
        String nomeArquivo = arquivo.getName();

        BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
        String linha = br.readLine();

        String nomeArquivoCopia = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("-copy.txt");
        File copia = new File(nomeArquivoCopia);

        BufferedWriter bw = new BufferedWriter(new FileWriter(copia.getName()));

        do {
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        } while((linha != null));

        System.out.printf("Arquivo \"%s\" copiado com sucesso! Com o tamanho de '%d' bytes.\n", arquivo.getName(), arquivo.length());
        System.out.printf("Arquivo \"%s\" copiado com sucesso! Com o tamanho de '%d' bytes.\n", copia.getName(), copia.length());

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Recomende 3 livros: ");
        pw.flush();

        adicionarInfoNoArquivo(copia.getName());

        pw.printf("Ok! Tudo certo. Tamanho do arquivo: '%d' bytes.", copia.length());

        br.close();
        bw.close();
        pw.close();
    }

    public static void adicionarInfoNoArquivo(String arquivo) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));

        do {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        } while(!(linha.equalsIgnoreCase("fim")));

        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        
        copiarArquivo();
    }
}
