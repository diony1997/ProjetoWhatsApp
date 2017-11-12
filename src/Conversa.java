
import java.time.LocalDateTime;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Diony
 */
public class Conversa {

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
