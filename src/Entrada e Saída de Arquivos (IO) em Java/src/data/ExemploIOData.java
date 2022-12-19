package data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ExemploIOData {

    public static void incluirProduto() throws IOException {

        File arquivo = new File("C:/Users/nilso.nascimento/Documents/roupas.bin");

        PrintStream ps = new PrintStream(System.out);
        ps.flush();

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(arquivo.getPath()));

        Scanner scan = new Scanner(System.in);

        ps.println("Nome da peça de roupa: ");
        String nome = scan.nextLine();
        dos.writeUTF(nome);

        ps.println("Tamanho da peça (P/M/G/U): ");
        char tamanho = (char) System.in.read();
        dos.writeChar(tamanho);

        ps.println("Quantidade: ");
        int quantidade = scan.nextInt();
        dos.writeInt(quantidade);

        ps.println("Preço unitário: ");
        double preco = scan.nextDouble();
        dos.writeDouble(preco);

        ps.printf("O aquivo %s foi criado com %d bytes, no diretório %s", arquivo.getName(), arquivo.length(), arquivo.getPath());

        lerProduto(arquivo.getPath());

        dos.close();
        scan.close();
        ps.close();
    }

    public static void lerProduto(String caminhoArquivo) throws IOException {

        File arquivo = new File(caminhoArquivo);

        DataInputStream dis = new DataInputStream(new FileInputStream(arquivo.getPath()));

        String nome = dis.readUTF();
        char tamanho = dis.readChar();
        int quantidade = dis.readInt();
        double preco = dis.readDouble();

        System.out.printf("\nNome.................: %s\n", nome);
        System.out.printf("\nQuantidade...........: %d\n", quantidade);
        System.out.printf("\nTamanho..............: %s\n", tamanho);
        System.out.printf("\nPreço................: R$%f\n", preco);
        System.out.print("Total do valor das peças: R$" + (quantidade * preco));

        dis.close();
    }

    public static void main(String[] args) throws IOException {
        
        incluirProduto();
    }
}