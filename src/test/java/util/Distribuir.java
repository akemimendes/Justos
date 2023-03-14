package util;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Distribuir {
    private String nomevm;
    private static File pastaarquivos;
    private static File pastaapdf;
    private static File pastaprontos;
    private static File pastatxt;
    private static File pastaerro;
    private static File pastastatus;
    private static File pastacotacao;
    private static File pastaimage;
    private static File pastadownload;
    private static PrintWriter gravarArq;
    private boolean existenrcotacao;

    public void distribuirArquivos() throws IOException {
        File destpastamae = new File("/home/robertinho/Justos");
        destpastamae.mkdir();
        pastaarquivos = CriarPasta.criarPastaArquivos();
        pastaapdf = CriarPasta.criarPastaPdf();
        pastaprontos = CriarPasta.criarPastaProntos();
        pastaerro = CriarPasta.criarPastaErro();

        //cria arquivo com o nome da vm caso nao exista
        gravarArq = PegarNomeVm.CriarNomeVM();
        //ler o nome da vm
        nomevm = PegarNomeVm.NomeVm(nomevm);
        // caminho de onde ira pegar os arquivos
        File diretorio = new File("/run/user/1000/gvfs/smb-share:server=freenas.local,share=arquivosgerais/E/LABSEG/apolice/result/justus/prontos" + nomevm + "/");
        File destino = new File("/home/robertinho/Justos/arquivos/");
//distribui os arquivos para a vm
        if (diretorio.exists()) {
            FileUtils.copyDirectory(diretorio, destino);
            FileUtils.deleteDirectory(diretorio);
        }

    }
}
