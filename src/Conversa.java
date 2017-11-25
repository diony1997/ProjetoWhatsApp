
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Conversa implements Serializable {

    private ArrayList<Mensagem> mensagens = new ArrayList();
    private String telefoneContato;
    private LocalDateTime ultima;

    public Conversa(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public void addMensagem(String autor, String texto) {
        LocalDateTime data = LocalDateTime.now();
        Mensagem e = new Mensagem(autor, texto, data);
     
        mensagens.add(e);
           enviado(e);
    }

    public String receberMensagens() {
        String saida = "";
        for (Mensagem mensagen : mensagens) {
            saida += mensagen.retornarMensagem() + "\n";
        }
        return saida;

    }

    public ArrayList<Mensagem> buscarPalavra(String palavra) {
        ArrayList<Mensagem> busca = new ArrayList();
        for (Mensagem mensagen : mensagens) {
            if (mensagen.getTexto().contains(palavra)) {
                busca.add(mensagen);
            }
        }
        return busca;
    }
//aumenta o status
    public void enviado(Mensagem e) {
        e.validarStatus();
        recebido(e);
    }
//aumenta o status
    public void recebido(Mensagem e) {
        e.validarStatus();
    }
//getters
    public String getTelefoneContato() {
        return telefoneContato;
    }

    public ArrayList<Mensagem> getMensagens() {
        return mensagens;
    }

    public LocalDateTime getUltima() {
        return ultima;
    }

}
