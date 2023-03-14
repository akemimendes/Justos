package util;

import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class PegarNomeVm {
    public static PrintWriter CriarNomeVM() throws IOException {
        FileWriter arq = new FileWriter("/home/robertinho/ferramentas/mover/NomeVm.txt");
        String hostname = "Unknown";

        try
        {
            InetAddress addr;
            addr = InetAddress.getLocalHost();
            hostname = addr.getHostName();
        }
        catch (UnknownHostException ex)
        {
            System.out.println("Hostname can not be resolved");
        }
        PrintWriter gravararq = new PrintWriter(arq);
        gravararq.println(hostname);
        gravararq.flush();
        gravararq.close();

        return gravararq;

    }
    public static String NomeVm(String nomevm) throws IOException {
        Scanner ler = new Scanner("/home/robertinho/ferramentas/mover/NomeVm.txt");
        String nome1 = ler.nextLine();
        FileReader arq = new FileReader(nome1);
        BufferedReader LerArquivo = new BufferedReader(arq);
        nomevm = LerArquivo.readLine();
        arq.close();
        return nomevm;
    }
}
