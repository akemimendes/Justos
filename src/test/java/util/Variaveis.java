package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.stringtemplate.v4.ST;

import java.io.File;
import java.io.PrintWriter;

public class Variaveis {
    protected WebDriver navegador;
    protected String excluircotacao;
    protected String segmento;
    protected String login;
    protected String senha;
    protected String nrcotacao;
    protected String cpf;

    protected String email;
    protected String nome;

    protected String bonus;
    protected String cep;
    protected String cepper;
    protected String franquia;
    protected String ano_modelo;
    protected String zero;
    protected String fipe;
    protected String tipo_de_se;
    protected String classe_bon;
    protected String sinistro;
    protected String congenere;
    protected String dm;
    protected String dc;
    protected String comissao;
    protected String fatajust;
    protected String antifurto;
    protected String utiliz;
    protected String tiporesid;
    protected String ass24;
    protected String creser;
    protected String vidro;
    protected String grgres;
    protected String grgtrab;
    protected String grgescola;
    protected String dmo;
    protected String appmorte;
    protected String resid25;
    protected String idade25;
    protected String sexo25;
    protected String dirige25;
    protected String sexo_condu;
    protected String segecond;
    protected String cond_princ;
    protected String nomecond;
    protected String cpfcond;
    protected String estado_civ;
    protected String datacond;
    protected String temphab;
    protected String blindagem;
    protected String placa;
    protected String ano_fabric;
    protected String marcaagf;
    protected String modelo1;

    protected String sobrenome;
    protected String celular;
    protected String modelo;
    protected String partmodelo2;
    protected String tipopessoa;
    protected String is;
    protected String nrlinha;
    protected String chassi;
    protected WebElement elemento;
    protected String msgerro;
    protected PrintWriter criaarquivoerro;
    protected boolean existeerro;
    protected static String nomepc = "robertinho";
    protected String cap;
    protected String isblind;
    String fazblindado;


    protected File deletarerro;
    protected PrintWriter criaarquivologar;
    protected boolean existenrcotacao;
    protected File deletararqlogar;

    public String getBonus() { return bonus; }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCepper() {
        return cepper;
    }

    public void setCepper(String cepper) {
        this.cepper = cepper;
    }

    public String getFranquia() {
        return franquia;
    }

    public void setFranquia(String franquia) {
        this.franquia = franquia;
    }

    public String getAno_modelo() {
        return ano_modelo;
    }

    public void setAno_modelo(String ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

    public String getZero() {
        return zero;
    }

    public void setZero(String zero) {
        this.zero = zero;
    }

    public String getFipe() {
        return fipe;
    }

    public void setFipe(String fipe) {
        this.fipe = fipe;
    }

    public String getTipo_de_se() {
        return tipo_de_se;
    }

    public void setTipo_de_se(String tipo_de_se) {
        this.tipo_de_se = tipo_de_se;
    }

    public String getClasse_bon() {
        return classe_bon;
    }

    public void setClasse_bon(String classe_bon) {
        this.classe_bon = classe_bon;
    }

    public String getSinistro() {
        return sinistro;
    }

    public void setSinistro(String sinistro) {
        this.sinistro = sinistro;
    }

    public String getCongenere() {
        return congenere;
    }

    public void setCongenere(String congenere) {
        this.congenere = congenere;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getComissao() {
        return comissao;
    }

    public void setComissao(String comissao) {
        this.comissao = comissao;
    }

    public String getFatajust() {
        return fatajust;
    }

    public void setFatajust(String fatajust) {
        this.fatajust = fatajust;
    }

    public String getAntifurto() {
        return antifurto;
    }

    public void setAntifurto(String antifurto) {
        this.antifurto = antifurto;
    }

    public String getUtiliz() {
        return utiliz;
    }

    public void setUtiliz(String utiliz) {
        this.utiliz = utiliz;
    }

    public String getTiporesid() {
        return tiporesid;
    }

    public void setTiporesid(String tiporesid) {
        this.tiporesid = tiporesid;
    }

    public String getAss24() {
        return ass24;
    }

    public void setAss24(String ass24) {
        this.ass24 = ass24;
    }

    public String getCreser() {
        return creser;
    }

    public void setCreser(String creser) {
        this.creser = creser;
    }

    public String getVidro() {
        return vidro;
    }

    public void setVidro(String vidro) {
        this.vidro = vidro;
    }

    public String getGrgres() {
        return grgres;
    }

    public void setGrgres(String grgres) {
        this.grgres = grgres;
    }

    public String getGrgtrab() {
        return grgtrab;
    }

    public void setGrgtrab(String grgtrab) {
        this.grgtrab = grgtrab;
    }

    public String getGrgescola() {
        return grgescola;
    }

    public void setGrgescola(String grgescola) {
        this.grgescola = grgescola;
    }

    public String getDmo() {
        return dmo;
    }

    public void setDmo(String dmo) {
        this.dmo = dmo;
    }

    public String getAppmorte() {
        return appmorte;
    }

    public void setAppmorte(String appmorte) {
        this.appmorte = appmorte;
    }

    public String getResid25() {
        return resid25;
    }

    public void setResid25(String resid25) {
        this.resid25 = resid25;
    }

    public String getIdade25() {
        return idade25;
    }

    public void setIdade25(String idade25) {
        this.idade25 = idade25;
    }

    public String getSexo25() {
        return sexo25;
    }

    public void setSexo25(String sexo25) {
        this.sexo25 = sexo25;
    }

    public String getDirige25() {
        return dirige25;
    }

    public void setDirige25(String dirige25) {
        this.dirige25 = dirige25;
    }

    public String getSexo_condu() {
        return sexo_condu;
    }

    public void setSexo_condu(String sexo_condu) {
        this.sexo_condu = sexo_condu;
    }

    public String getSegecond() {
        return segecond;
    }

    public void setSegecond(String segecond) {
        this.segecond = segecond;
    }

    public String getCond_princ() {
        return cond_princ;
    }

    public void setCond_princ(String cond_princ) {
        this.cond_princ = cond_princ;
    }

    public String getNomecond() {
        return nomecond;
    }

    public void setNomecond(String nomecond) {
        this.nomecond = nomecond;
    }

    public String getCpfcond() {
        return cpfcond;
    }

    public void setCpfcond(String cpfcond) {
        this.cpfcond = cpfcond;
    }

    public String getEstado_civ() {
        return estado_civ;
    }

    public void setEstado_civ(String estado_civ) {
        this.estado_civ = estado_civ;
    }

    public String getDatacond() {
        return datacond;
    }

    public void setDatacond(String datacond) {
        this.datacond = datacond;
    }

    public String getTemphab() {
        return temphab;
    }

    public void setTemphab(String temphab) {
        this.temphab = temphab;
    }

    public String getBlindagem() {
        return blindagem;
    }

    public void setBlindagem(String blindagem) {
        this.blindagem = blindagem;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno_fabric() {
        return ano_fabric;
    }

    public void setAno_fabric(String ano_fabric) {
        this.ano_fabric = ano_fabric;
    }

    public String getIs() {
        return is;
    }

    public void setIs(String is) {
        this.is = is;
    }

    public String getNrlinha() {
        return nrlinha;
    }

    public void setNrlinha(String nrlinha) {
        this.nrlinha = nrlinha;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getMarcaagf() {
        return marcaagf;
    }

    public void setMarcaagf(String marcaagf) {
        this.marcaagf = marcaagf;
    }

    public String getModelo1() {
        return modelo1;
    }

    public void setModelo1(String modelo1) {
        this.modelo1 = modelo1;
    }

    public String getSobrenome(){return sobrenome;}
    public void setSobrenome(String sobrenome){this.sobrenome = sobrenome; }
    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email; }

    public String getCelular(){return celular;}
    public void setCelular(String celular){this.celular = celular; }

    //public String getModelo2(){
    //    return modelo2;
    //}

   // public void setModelo2(String modelo2) {
        //this.modelo2 = modelo2;
    //}

    public String getTipopessoa() {
        return tipopessoa;
    }

    public void setTipopessoa(String tipopessoa) {
        this.tipopessoa = tipopessoa;
    }

    public String getPartmodelo2() {
        return partmodelo2;
    }

    public void setPartmodelo2(String partmodelo2) {
        this.partmodelo2 = partmodelo2;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getIsblind() {
        return isblind;
    }

    public void setIsblind(String isblind) {
        this.isblind = isblind;}}
