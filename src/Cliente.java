import java.util.Date;


public class Cliente {

       private String nome;
       private int codigo;
       private Date dataNascimento;
       private String nomePai;
       private String nomeMae;
       private String enderecoCompleto;

       @Mostrar
       public String getNome() {
             return nome;
       }

       @Mostrar
       public void setNome(String nome) {
             this.nome = nome;
       }

       @Mostrar
       public int getCodigo() {
             return codigo;
       }
       public void setCodigo(int codigo) {
             this.codigo = codigo;
       }

       @Mostrar
       public Date getDataNascimento() {
             return dataNascimento;
       }
       public void setDataNascimento(Date dataNascimento) {
             this.dataNascimento = dataNascimento;
       }
       public String getNomePai() {
             return nomePai;
       }
       public void setNomePai(String nomePai) {
             this.nomePai = nomePai;
       }
       public String getNomeMae() {
             return nomeMae;
       }
       public void setNomeMae(String nomeMae) {
             this.nomeMae = nomeMae;
       }

       @Mostrar
       public String getEnderecoCompleto() {
             return enderecoCompleto;
       }
       public void setEnderecoCompleto(String enderecoCompleto) {
             this.enderecoCompleto = enderecoCompleto;
       }

}