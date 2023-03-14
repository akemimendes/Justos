package test;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import util.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import static com.tigervnc.rfb.Keysyms.Right;
import static java.lang.Thread.sleep;

public class JustosPrincipal {

    @Test
    public void iniciarSiteJustos()throws IOException, InterruptedException{
        WebDriver navegador = null;
        ArrayList<String> listaNr = null;
        WebDriverWait wait = null;

        System.out.println("Iniciando");
        NrArquivo nrlinha = new NrArquivo();
        Distribuir distribuir = new Distribuir();
        distribuir.distribuirArquivos();
        LerArquivoObjetos arquivo = new LerArquivoObjetos();

        int temArq = 999;
        while (temArq == 999) {
            listaNr = nrlinha.carregarArquivos();
            if (listaNr.size() == 0) {
                JOptionPane.showMessageDialog(null, "Acabou");
            } else {
                Variaveis v = arquivo.lerArquivoNr(listaNr.get(0));
                try {
                    navegador = Navegador.retornarNavegador();
                    wait = new WebDriverWait(navegador, 5);
                    sleep(1000);
                    System.out.println("preencher dados");
                    //TELA 1
                    navegador.findElement(By.id("jinput-CPF")).sendKeys(v.getCpf());
                    sleep(2000);
                    navegador.findElement(By.id("jinput-CEP")).sendKeys(v.getCepper());
                    sleep(1200);
                    navegador.findElement(By.id("jinput-Placa-do-Carro")).sendKeys(v.getModelo1());
                    sleep(1200);
                    navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[2]/button")).click();
                    //TELA 2
                    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[2]/div/h2")));
                    sleep(10000);
                    //Restrição
                    try{
                        navegador.findElement(By.xpath("//h1[text()=\"Ainda não estamos na sua cidade\"]"));

                    } catch (Exception e) {
                        navegador.findElement(By.id("jinput-Nome")).sendKeys(v.getNome());
                        sleep(950);
                        navegador.findElement(By.id("jinput-Sobrenome")).sendKeys(v.getSobrenome());
                        sleep(950);
                        navegador.findElement(By.id("jinput-E-mail")).sendKeys(v.getEmail());
                        sleep(950);
                        navegador.findElement(By.id("jinput-Celular")).sendKeys(v.getCelular());
                        sleep(950);
                        navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[1]/div[5]/span")).click();
                        sleep(1000);
                        navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[2]/button")).click();
                    }


                    //TELA 3-Conte Sobre Seu Carrrro
                    sleep(3000);
                    try{
                        navegador.findElement(By.id("digit0")).click();
                        sleep(1000);
                        navegador.findElement(By.className("jstep__back-button")).click();
                        sleep(2000);
                        //verifica se tem que trocar email
                        navegador.findElement(By.id("jinput-E-mail")).clear();
                        String email= "X"+(v.getEmail());
                        navegador.findElement(By.id("jinput-E-mail")).sendKeys(email);
                        sleep(1000);

                        navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[1]/div[5]/span")).click();
                        sleep(1000);
                        navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[2]/button")).click();
                        sleep(2000);
                        try{
                            navegador.findElement(By.id("digit0")).click();
                            sleep(1000);
                            navegador.findElement(By.className("jstep__back-button")).click();
                            sleep(2000);
                            //verifica se tem que trocar email
                            navegador.findElement(By.id("jinput-E-mail")).clear();
                            String email1= "B"+(v.getEmail());
                            navegador.findElement(By.id("jinput-E-mail")).sendKeys(email1);
                            sleep(1000);
                            navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[1]/div[5]/span")).click();
                            sleep(1000);
                            navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[2]/button")).click();
                            sleep(2000);
                        }
                        catch (Exception e1){
                            navegador.findElement(By.id("digit0")).click();
                            sleep(1000);
                            navegador.findElement(By.className("jstep__back-button")).click();
                            sleep(2000);
                            //verifica se tem que trocar email
                            navegador.findElement(By.id("jinput-E-mail")).clear();
                            String email2= "C"+(v.getEmail());
                            navegador.findElement(By.id("jinput-E-mail")).sendKeys(email2);
                            sleep(1000);
                            navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[1]/div[5]/span")).click();
                            sleep(1000);
                            navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[2]/button")).click();
                            sleep(2000);
                        }
                    }catch (Exception e){

                    }
                    //aqui clica no veiculo
                    try{
                        navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[2]/button[2]")).click();
                    }catch (Exception e){
                        navegador.findElement(By.className("jradio--input")).click();
                        sleep(1500);
                        navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[1]/div[2]/button[2]")).click();
                    }
                    //TELA 4-Blindado
                    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[2]/div/h2")));
                    sleep(10000);
                    navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[1]/div/button[2]")).click();
                    sleep(3000);
                    //TELA 5-Tem seguro?
                    navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[1]/div[2]/button[2]")).click();
                    sleep(3000);
                    //TELA 6-Classe bônus
                    if(v.getBonus().contains("3")) {
                        navegador.findElement(By.id("jslider-bonusClass")).sendKeys(Keys.ARROW_RIGHT);
                        navegador.findElement(By.id("jslider-bonusClass")).sendKeys(Keys.ARROW_RIGHT);
                        navegador.findElement(By.id("jslider-bonusClass")).sendKeys(Keys.ARROW_RIGHT);
                    }
                    if(v.getBonus().contains("10")) {
                        navegador.findElement(By.id("jslider-bonusClass")).sendKeys(Keys.ARROW_RIGHT);
                        navegador.findElement(By.id("jslider-bonusClass")).sendKeys(Keys.ARROW_RIGHT);
                        navegador.findElement(By.id("jslider-bonusClass")).sendKeys(Keys.ARROW_RIGHT);
                        navegador.findElement(By.id("jslider-bonusClass")).sendKeys(Keys.ARROW_RIGHT);
                        navegador.findElement(By.id("jslider-bonusClass")).sendKeys(Keys.ARROW_RIGHT);
                        navegador.findElement(By.id("jslider-bonusClass")).sendKeys(Keys.ARROW_RIGHT);
                        navegador.findElement(By.id("jslider-bonusClass")).sendKeys(Keys.ARROW_RIGHT);
                        navegador.findElement(By.id("jslider-bonusClass")).sendKeys(Keys.ARROW_RIGHT);
                        navegador.findElement(By.id("jslider-bonusClass")).sendKeys(Keys.ARROW_RIGHT);
                        navegador.findElement(By.id("jslider-bonusClass")).sendKeys(Keys.ARROW_RIGHT);

                    }
                    navegador.findElement(By.id("jslider-bonusClass")).sendKeys();
                    navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/section/div/div[2]/button[2]")).click();
                    sleep(10000);
                    //TELA 7-Seguro Perfeito
                    try{
                        navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/button")).click();
                        sleep(3000);
                        //TELA 8-Como você usa seu carro?
                        navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[1]/div/div/button[1]")).click();
                        sleep(3000);
                        //TELA 9-Oque espera?
                        navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[1]/div/div/button[1]")).click();
                        sleep(3000);
                        //TELA 10-Oque procura?
                        navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[1]/div/div/button[3]")).click();
                        sleep(21000);

                    }catch (Exception e){

                    }
                   //TELA 11-Ir orçamento
                    try{
                        navegador.findElement(By.xpath("//*[@id=\"app\"]/section/div[2]/div/div[3]/button")).click();
                        sleep(2000);
                    }catch (Exception e) {
                        try {
                            navegador.findElement(By.xpath("//*id=\"app\"]/section/footer/button")).click();
                            sleep(5000);
                        } catch (Exception e1) {

                        }
                    }
                          //TELA 12-Ultima tela/Acionando os toogles

                        //WebElement alavanca1 = navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/div[2]/div/div[1]/div/div/div"));
                        //JavascriptExecutor jsAlavanca1 = (JavascriptExecutor) navegador;
                        //jsAlavanca1.executeScript("arguments[0].click();", alavanca1);
                        //sleep(1000);
                        //WebElement alavanca4= navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/div[2]/div/div[1]/div/div/div/span[1]"));
                        //JavascriptExecutor jsAlavanca4 = (JavascriptExecutor) navegador;
                        //jsAlavanca4.executeScript("arguments[0].click();", alavanca4);
                        //sleep(1000);
                        try{
                            WebElement alavanca5 = navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/div[2]/div/div[3]/div/div/div"));
                            JavascriptExecutor jsAlavanca5 = (JavascriptExecutor) navegador;
                            jsAlavanca5.executeScript("arguments[0].click();", alavanca5);
                            sleep(1000);

                            WebElement alavanca6 = navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[3]/div/div[2]/div/div[1]/div/div/div"));
                            JavascriptExecutor jsAlavanca6 = (JavascriptExecutor) navegador;
                            jsAlavanca6.executeScript("arguments[0].click();", alavanca6);
                            sleep(1000);
                            WebElement alavanca7 = navegador.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[3]/div/div[2]/div/div[2]/div/div/div"));
                            JavascriptExecutor jsAlavanca7 = (JavascriptExecutor) navegador;
                            jsAlavanca7.executeScript("arguments[0].click();", alavanca7);
                            sleep(1000);


                        }catch(Exception e2){

                        }



                    Robot r = new Robot();

                    r.keyPress(KeyEvent.VK_CONTROL);
                    r.keyPress(KeyEvent.VK_P);
                    r.keyRelease(KeyEvent.VK_P);
                    r.keyRelease(KeyEvent.VK_CONTROL);
                    sleep(2000);
                    System.out.println("vai imprimir");


                    Pattern salvarpdf = new Pattern("/home/robertinho/Justos/images/SalvarBotao.png");
                    Pattern salvarLinux=new Pattern("/home/robertinho/Justos/images/salvarbtnlinux.png");

                    System.out.println("carregou imagens");


                    System.out.println("vai clicar");
                    Screen screen = new Screen();
                    int teste = 0;
                    while (teste == 0) {
                        try {
                            screen.click(salvarpdf);
                            teste = 999;
                        } catch (Exception e) {
                            System.out.println("esperando imagem para imprimir");
                        }
                    }

                    Thread.sleep(2000);
                    String nome= listaNr.get(0);
                    String nomearq=nome.replace(".TXT","");
                    screen.type("/home/robertinho/Justos/pdf/" +nomearq);
                    Thread.sleep(1000);
                    screen.click(salvarLinux);

                    Thread.sleep(2000);
                    int x = 0;
                    while (x <= 3) {
                        screen.type(Key.ESC);
                        x++;
                    }

                    //mover para prontos


                    File filearquivo = new File( "/home/robertinho/Justos/arquivos/" + nomearq+".TXT" );
                    File filepdf = new File( "/home/robertinho/Justos/pdf/" + nomearq+".pdf" );
                    System.out.println( filepdf );

                    if (filepdf.exists() && filepdf.isFile()) {
                        filearquivo.renameTo( new File( "/home/robertinho/Justos/prontos/" + nomearq+".TXT" ) );
                        filearquivo.delete();


                    }


                } catch (Exception e) {
                    String nomeComputador = System.getProperty("user.name");
                    File file = new File("/home/robertinho/Justos/arquivos/" +  listaNr.get(0));
                    FileWriter arq = new FileWriter("/home/" + nomeComputador + "/Justos/erro/" +  listaNr.get(0));
                    PrintWriter gravarArq = new PrintWriter(arq);
                    gravarArq.println("erro no cep");
                    gravarArq.flush();
                    gravarArq.close();

                    File fileerro = new File("/home/" + nomeComputador + "/Justos/erro/" +  listaNr.get(0));
                    File filearquivo = new File("/home/" + nomeComputador + "/Justos/arquivos/" +  listaNr.get(0));

                    if (fileerro.exists() && fileerro.isFile()) {
                        filearquivo.delete();
                    }
                }finally {
                    navegador.close();
                }
            }
        }
    }
}

