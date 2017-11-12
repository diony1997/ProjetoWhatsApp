
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
public class App {

    private ArrayList<Conversa> conversas = new ArrayList();
    private String nomeUsuario, telefoneUsuario;
    private int status;

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

    public void enviarMensagem(String telefoneContato, String texto) {
        for (Conversa conversa : conversas) {
            if (conversa.getTelefoneContato().equalsIgnoreCase(telefoneContato)) {
                conversa.addMensagem(telefoneUsuario, texto);
            }
        }
    }

    public String receberConversa(String nome) {
        String saida = "";
        for (Conversa conversa : conversas) {
            if (conversa.getTelefoneContato().equalsIgnoreCase(nome)) {
                saida += conversa.receberMensagens() + "\n";
            }
        }
        return saida;
    }

    public Conversa getConversa(String nome) {
        for (Conversa conversa : conversas) {
            if (conversa.getTelefoneContato().equalsIgnoreCase(nome)) {
                return conversa;
            }
        }
        return null;
    }

    public ArrayList<Conversa> getConversas() {
        return conversas;
    }

}
