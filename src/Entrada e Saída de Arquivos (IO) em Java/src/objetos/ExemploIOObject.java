package objetos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class ExemploIOObject {

    public static void serealizacao() throws IOException {

        Gato gato = new Gato("Tom", 6, "cinza", true, false);

        File arquivo = new File("gato");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo.getName()));

        oos.writeObject(gato);

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo \"%s\" criado com sucesso! Tamanho do arquivo: %d bytes", arquivo.getName(), arquivo.length());

        oos.close();
        ps.close();
    }

    public static void desserialização(String arquivo) throws IOException, ClassNotFoundException { 

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));

        Gato objetoGato = (Gato) ois.readObject();

        System.out.printf("\nNome................: %s\n", objetoGato.getNome());
        System.out.printf("\nIdade...............: %d\n", objetoGato.getIdade());
        System.out.printf("\nCor.................: %s\n", objetoGato.getCor());
        System.out.printf("\nCastrado?...........: %s\n", objetoGato.isCastrado());
        System.out.printf("\nRonrona?............: %s\n", objetoGato.isRonrona());
        System.out.println(objetoGato);

        ois.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        // serealizacao();

        desserialização("C:/Users/nilso.nascimento/Desktop/Entrada e Saída de Arquivos (IO) em Java/gato");
    }
}