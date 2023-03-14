package util;

import java.io.File;

public class CriarPasta {
        public static File criarPastaArquivos(){
            File pastaarquivos = new File("/home/robertinho/Justos/arquivos");
            pastaarquivos.mkdir();
            return pastaarquivos;
        }
        public static File criarPastaPdf(){
            File pastaapdf = new File("/home/robertinho/Justos/pdf");
            pastaapdf.mkdir();
            return pastaapdf;
        }
        public static File criarPastaProntos(){
            File pastaprontos = new File("/home/robertinho/Justos/prontos");
            pastaprontos.mkdir();
            return pastaprontos;
        }
        public static File criarPastaErro(){
            File pastaerro = new File("/home/robertinho/Justos/erro");
            pastaerro.mkdir();
            return pastaerro;
        }

    }

