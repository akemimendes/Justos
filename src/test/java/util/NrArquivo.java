package util;

import java.io.File;
import java.util.ArrayList;

public class NrArquivo extends Variaveis {


    public ArrayList<String> carregarArquivos() {
        ArrayList<String> listaNrlinha = new ArrayList<String>();

        File[] files = new File("/home/" + nomepc + "/Justos/arquivos/").listFiles();
        try {
            for (File file : files) {
                listaNrlinha.add(file.getName());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listaNrlinha;
    }

    public void deleteArquivo(String nrtxt) {
        File file = new File("/home/robertinho/Justos/arquivos/" + nrtxt);

        if (file.exists() && file.isFile()) {
            boolean i = true;
            while (i) {
                if (file.delete()) {
                    i = false;
                } else {
                    System.gc();
                }
            }


        }

    }
}

