
import java.io.Serializable;
import java.util.ArrayList;

public class App implements Serializable {

    private ArrayList<Conversa> conversas = new ArrayList();
    private String telefoneUsuario;
    private int status;
    private ArrayList<String> contatos = new ArrayList();

    public void addContato(String texto) {
        contatos.add(texto);
    }

//confere se ja existe uma conversa com o contato se não cria
    public int addConversa(String telefoneContato) {
        int aux = 0;
        for (Conversa conversa : conversas) {
            if (conversa.getTelefoneContato().equalsIgnoreCase(telefoneContato)) {
                aux++;
            }
        }
        if (aux == 0) {
            Conversa e = new Conversa(telefoneContato);
            conversas.add(e);

        }
        return aux;
    }
//recebe o nome do usuario alternativo\mensagem e cria uma mensagem com o nome do usuario que enviou

    public void enviarMensagem(String telefoneContato, String texto) {
        for (Conversa conversa : conversas) {
            if (conversa.getTelefoneContato().equalsIgnoreCase(telefoneContato)) {
                conversa.addMensagem(telefoneUsuario, texto);
            }
        }
    }
//setters e getters

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public void setStatus(int status) {
        if (status > 0 && status < 4) {
            this.status = status;
        }
    }

    public int getStatus() {
        return status;
    }

    public ArrayList<Conversa> getConversas() {
        return conversas;
    }

    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public Conversa getConversa(String nome) {
        for (Conversa conversa : conversas) {
            if (conversa.getTelefoneContato().equalsIgnoreCase(nome)) {
                return conversa;
            }
        }
        return null;
    }

    public ArrayList<String> getContatos() {
        return contatos;
    }
}
