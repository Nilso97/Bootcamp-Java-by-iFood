package bytes;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ExemploIOBytes {

    public static void copiarArquivo() throws IOException {

        File arquivo = new File("C:/Users/nilso.nascimento/Desktop/Entrada e Saída de Arquivos (IO) em Java/recomendacoes-copy.txt");
        String nomeArquivo = arquivo.getName();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(arquivo.getName()));

        String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf("-")).concat("-copy2.txt");
        File arquivoCopia = new File(nomeArquivoCopy);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nomeArquivoCopy));

        int linha = 0;

        while((linha = bis.read()) != -1) {
            bos.write((char) linha);
            bos.flush();
        } // -1 (acabou) até 255

        bis.close();
        bos.close();

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo %s copiado com sucesso! Está no diretório %s, com %d bytes.", arquivoCopia.getName(), arquivoCopia.getAbsolutePath(), arquivoCopia.length());
    }

    public static void main(String[] args) throws IOException {
        
        copiarArquivo();
    }
}