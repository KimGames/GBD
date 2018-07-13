package Etapa1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Catalogo {
    // Nome da tabela (relacao)
    protected String tabela;
    // Número de atributos da tabela
    private int numAtributos;
    // Local que deve ser criado o catalogo
    private String caminho = "DataBase/Catalogos/";
    // Atributos da tabela
    private String[] atributos;
    // Tipos dos atributos da tabela
    private String[] tipos;
    // Quantidade de paginas de arquivos binarios
    private int pagina;

    public String[] getAtributos() {
        return atributos;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public String getCaminho() {
        return caminho;
    }

    public int getNumAtributos() {
        return numAtributos;
    }

    public String getTabela() {
        return tabela;
    }

    public String[] getTipos() {
        return tipos;
    }

    public Catalogo(String tabela, int numAtributos, String[] atributos, String[] tipos){
        this.tabela = tabela;
        this.numAtributos = numAtributos;
        this.atributos = atributos;
        this.tipos = tipos;
    }

    // os metadados do arquivo estão previamente descritos em um catálogo cuja implementação e livre;
    public void criaCatalogo() throws IOException{
        //criacao do catalogo
        FileWriter saida = new FileWriter(new File(caminho + tabela + ".catalogo"),false);
        saida.write(numAtributos+"\n");
        for (int i = 0; i < numAtributos; i++) saida.write(atributos[i] + " " + tipos[i] + "\n");
        saida.close();
    }
}
