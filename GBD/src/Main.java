import Etapa1.Arquivo;
import Etapa1.Catalogo;
// import Etapa2.Indice;
// import Etapa2.Operacoes;
// import Etapa3.Join;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // ETAPA 1 =============================================================================
        // Dados da tabela cliente
        String[] atributoscliente = new String[4];
        atributoscliente[0] = "cliente";
        atributoscliente[1] = "Nome";
        atributoscliente[2] = "Sexo";
        atributoscliente[3] = "Idade";

        String[] tiposcliente = new String[4];
        tiposcliente[0] = "integer";
        tiposcliente[1] = "varchar";
        tiposcliente[2] = "char";
        tiposcliente[3] = "small_int";

        // Criando e povoando a tabela cliente
        Catalogo c1 = new Catalogo("cliente",4, atributoscliente, tiposcliente);
        c1.criaCatalogo();

        // 1.4 varredura sequencial do arquivo;

        // Remover para mostrar insert
        // Arquivo a1 = new Arquivo();
        // File dadoscliente = new File("cliente.txt");//arquivo de entrada(povoamento)
        // a1.carregaDados(c1, dadoscliente);



        // Dados da tabela tipoconta
        String[] atributostipoconta = new String[2];
        atributostipoconta[0] = "contaCliente";
        atributostipoconta[1] = "TipoConta";

        String[] tipos_tipoconta = new String[2];
        tipos_tipoconta[0] = "integer";
        tipos_tipoconta[1] = "varchar";

        // Criando e povoando a tabela TipoConta
        Catalogo c2 = new Catalogo("TipoConta",2, atributostipoconta, tipos_tipoconta);
        c2.criaCatalogo();

        // remover para mostrar o insert

        // Arquivo a2 = new Arquivo();
        // File dadostipoconta = new File("TipoConta.txt");//arquivo de entrada(povoamento)
        // a2.carregaDados(c2, dadostipoconta);

        /*
        //ETAPA 2 =============================================================================

        System.out.println("==========ETAPA 2==========================");

        //Criando o indice da tabela alunos
        Indice i1 = new Indice("cliente",c1);
        i1.criaIndice();

        //Criando o indice da tabela matricula
        Indice i2 = new Indice("TipoConta",c2);
        i2.criaIndice();

        //Executando as operaÃ§Ãµes
        Operacoes o = new Operacoes();

        //Select dado uma chave e o catÃ¡logo da relaÃ§Ã£o
        //String resultado = o.select(2445, c1);
        //System.out.println(resultado);



        Operacoes o = new Operacoes();
        //Insert dado um catalogo e seus dados
        List<String> item = new ArrayList<String>();//lista de atributos
        item.add("3048");
        item.add("Gildo");
        item.add("m");
        item.add("19");
        o.insert(item,c1);

        Operacoes o = new Operacoes();
        String resultado = o.select(3048, c1);
        System.out.println(resultado);


        List<String> item2 = new ArrayList<String>();//lista de atributos
        item2.add("");
        item2.add("Poupanca");
        o.insert(item2,c2);


        // Delete dado uma chave e o catÃ¡logo da relaÃ§Ã£o
        //o.delete(1100,c1);

        //  String resultado = o.select(1100, c1);
        //  System.out.println(resultado);


        //ETAPA 3 =============================================================================


        Join j = new Join(c1,c2);
        j.juncao();

        */
    }
}

