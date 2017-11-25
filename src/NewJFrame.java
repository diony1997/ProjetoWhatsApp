
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NewJFrame extends javax.swing.JFrame {

    boolean aux = false;
    App novo;
    File arquivo = new File("Backup.txt");

    public NewJFrame() {
        initComponents();
        novo = checarBackup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        campoNome = new javax.swing.JTextField();
        botaoNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaConversa = new javax.swing.JTextArea();
        botaoMensagem = new javax.swing.JButton();
        campoMensagem = new javax.swing.JTextField();
        numeroContato = new javax.swing.JLabel();
        menuContatos = new javax.swing.JComboBox<>();
        numeroUsuario = new javax.swing.JLabel();
        menuStatus = new javax.swing.JComboBox<>();
        numerosContatos = new javax.swing.JLabel();
        contatoUltima = new javax.swing.JLabel();
        contatoConexão = new javax.swing.JLabel();
        botaoUsuario1 = new javax.swing.JRadioButton();
        botaoUsuario2 = new javax.swing.JRadioButton();
        botaoIniciar = new javax.swing.JButton();
        campoUsuario = new javax.swing.JTextField();
        botaoPesquisa = new javax.swing.JRadioButton();
        botaoHistorico = new javax.swing.JRadioButton();
        campoPesquisa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoResultados = new javax.swing.JTextArea();
        botaoPesquisar = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        campoNome.setFont(new java.awt.Font("Lucida Fax", 0, 10)); // NOI18N
        campoNome.setText("Adicionar Contato");
        campoNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoNomeMouseClicked(evt);
            }
        });
        campoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoNomeKeyPressed(evt);
            }
        });

        botaoNome.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        botaoNome.setText("Adicionar");
        botaoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNomeActionPerformed(evt);
            }
        });

        areaConversa.setColumns(20);
        areaConversa.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        areaConversa.setRows(5);
        jScrollPane1.setViewportView(areaConversa);

        botaoMensagem.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        botaoMensagem.setText("Enviar");
        botaoMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMensagemActionPerformed(evt);
            }
        });

        campoMensagem.setFont(new java.awt.Font("Lucida Fax", 0, 10)); // NOI18N
        campoMensagem.setText("Digite uma mensagem");
        campoMensagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoMensagemMouseClicked(evt);
            }
        });

        numeroContato.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        numeroContato.setText("Numero Contato");

        menuContatos.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        menuContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuContatosActionPerformed(evt);
            }
        });

        numeroUsuario.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        numeroUsuario.setText("Usuario");

        menuStatus.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        menuStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponivel", "Ausente", "Offline" }));
        menuStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuStatusActionPerformed(evt);
            }
        });

        numerosContatos.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        numerosContatos.setText("Seus Contatos");

        contatoUltima.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        contatoUltima.setText("Ultima Conexão :");

        contatoConexão.setFont(new java.awt.Font("Lucida Fax", 2, 12)); // NOI18N

        buttonGroup1.add(botaoUsuario1);
        botaoUsuario1.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        botaoUsuario1.setText("Você");
        botaoUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUsuario1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(botaoUsuario2);
        botaoUsuario2.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        botaoUsuario2.setText("Contato");
        botaoUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUsuario2ActionPerformed(evt);
            }
        });

        botaoIniciar.setFont(new java.awt.Font("Lucida Fax", 0, 10)); // NOI18N
        botaoIniciar.setText("Inserir Usuario");
        botaoIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIniciarActionPerformed(evt);
            }
        });

        campoUsuario.setFont(new java.awt.Font("Lucida Fax", 0, 10)); // NOI18N
        campoUsuario.setText("Nome de Usuario");
        campoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoUsuarioMouseClicked(evt);
            }
        });

        buttonGroup2.add(botaoPesquisa);
        botaoPesquisa.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        botaoPesquisa.setText("Pesquisa");
        botaoPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisaActionPerformed(evt);
            }
        });

        buttonGroup2.add(botaoHistorico);
        botaoHistorico.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        botaoHistorico.setText("Histórico");
        botaoHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHistoricoActionPerformed(evt);
            }
        });

        campoPesquisa.setFont(new java.awt.Font("Lucida Fax", 0, 10)); // NOI18N
        campoPesquisa.setText("Digite a pesquisa");
        campoPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoPesquisaMouseClicked(evt);
            }
        });

        campoResultados.setColumns(20);
        campoResultados.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        campoResultados.setRows(5);
        jScrollPane2.setViewportView(campoResultados);

        botaoPesquisar.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numeroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoIniciar)
                            .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numerosContatos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menuContatos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoNome)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoHistorico)
                            .addComponent(botaoPesquisa)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoPesquisar)
                            .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroContato, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoMensagem)
                    .addComponent(campoMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contatoUltima)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contatoConexão, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botaoUsuario1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoUsuario2))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numeroContato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contatoUltima, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contatoConexão, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botaoUsuario1)
                                    .addComponent(botaoUsuario2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoIniciar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numerosContatos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menuContatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(botaoPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoHistorico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoMensagem)
                    .addComponent(botaoPesquisar)
                    .addComponent(botaoNome))
                .addContainerGap(35, Short.MAX_VALUE))
            .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNomeActionPerformed
        // adiciona um contato a lista caso ele não exita
        if (novo.addConversa(campoNome.getText()) == 0) {
            menuContatos.addItem(campoNome.getText());
            novo.addContato(campoNome.getText());
        }

        numeroContato.setText(novo.getConversa(campoNome.getText()).getTelefoneContato());

        botaoUsuario1.setText(numeroUsuario.getText());
        botaoUsuario2.setText(numeroContato.getText());
        campoNome.setText("Adicionar contato");
        atualizarChat();

    }//GEN-LAST:event_botaoNomeActionPerformed

    private void botaoMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMensagemActionPerformed
        //envia uma mensagem para a conversa
        novo.enviarMensagem(botaoUsuario2.getText(), campoMensagem.getText());
        atualizarChat();
        campoMensagem.setText("Digite uma mensagem");
    }//GEN-LAST:event_botaoMensagemActionPerformed

    private void menuContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuContatosActionPerformed
        //troca a conversa para a do contato selecionado
        numeroContato.setText(novo.getConversa(menuContatos.getSelectedItem().toString()).getTelefoneContato());
        botaoUsuario2.setText(numeroContato.getText());
        botaoUsuario1.setSelected(true);
        atualizarChat();

    }//GEN-LAST:event_menuContatosActionPerformed

    private void menuStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuStatusActionPerformed
        //troca o status
        novo.setStatus(menuStatus.getSelectedIndex());

    }//GEN-LAST:event_menuStatusActionPerformed

    private void botaoUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUsuario2ActionPerformed
        //troca o usuario da conversa para o usario2,trocando o nome do usuario principal pelo o alternativo
        novo.setTelefoneUsuario(botaoUsuario2.getText());
        if (menuStatus.getSelectedIndex() == 2) {
            contatoConexão.setText("Offline");
        } else {
            ultimaConexao(2);
        }
        numeroContato.setText(botaoUsuario1.getText());
        statusLido();
        atualizarChat();
    }//GEN-LAST:event_botaoUsuario2ActionPerformed

    private void botaoUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUsuario1ActionPerformed
        //troca o usuario da conversa para o usario1,trocando o nome do usuario principal pelo o alternativo
        novo.setTelefoneUsuario(botaoUsuario1.getText());
        if (menuStatus.getSelectedIndex() == 2) {
            contatoConexão.setText("Offline");
        } else {
            ultimaConexao(1);
        }
        numeroContato.setText(botaoUsuario2.getText());
        statusLido();
        atualizarChat();
    }//GEN-LAST:event_botaoUsuario1ActionPerformed

    private void botaoIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIniciarActionPerformed
        //insere o nome do usuario principal
        novo.setTelefoneUsuario(campoUsuario.getText());
        numeroUsuario.setText(novo.getTelefoneUsuario());
        campoUsuario.setVisible(false);
        botaoIniciar.setVisible(false);
    }//GEN-LAST:event_botaoIniciarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // salva a classe app no arquivo backup
        novo.setTelefoneUsuario(botaoUsuario1.getText());
        try (FileOutputStream writer = new FileOutputStream(arquivo); ObjectOutputStream gravador = new ObjectOutputStream(writer)) {
            gravador.writeObject(novo);
            gravador.flush();
            gravador.close();
            writer.flush();
            writer.close();

        } catch (Exception e) {
            System.out.println("Erro :" + e);
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // atualiza as informações quando inicia
        areaConversa.setEditable(false);
        campoResultados.setEditable(false);
        if (aux == true) {
            numeroUsuario.setText(novo.getTelefoneUsuario());
            botaoUsuario1.setText(novo.getTelefoneUsuario());
            campoUsuario.setVisible(false);
            botaoIniciar.setVisible(false);
        }
        for (String contato : novo.getContatos()) {
            menuContatos.addItem(contato);
        }
    }//GEN-LAST:event_formWindowActivated

    private void campoNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoNomeMouseClicked
        campoNome.setText("");
    }//GEN-LAST:event_campoNomeMouseClicked

    private void campoMensagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoMensagemMouseClicked
        campoMensagem.setText("");
    }//GEN-LAST:event_campoMensagemMouseClicked

    private void campoNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomeKeyPressed
    }//GEN-LAST:event_campoNomeKeyPressed

    private void botaoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisaActionPerformed
        //torna a caixa de texto e botão de pesquisar visiveis
        campoPesquisa.setVisible(true);
        botaoPesquisar.setVisible(true);
    }//GEN-LAST:event_botaoPesquisaActionPerformed

    private void botaoHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHistoricoActionPerformed
        campoPesquisa.setVisible(false);
        botaoPesquisar.setVisible(false);
        atualizarHistorico();

    }//GEN-LAST:event_botaoHistoricoActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        // pesquisa a mensagens com a palavra digitada
        StringBuilder pesquisa = new StringBuilder();
        String nome1 = "";
        for (Mensagem texto : novo.getConversa(botaoUsuario2.getText()).buscarPalavra(campoPesquisa.getText())) {
            if (nome1.equals(texto.getEmissor())) {
                pesquisa.append(texto + "\n");
            } else {
                pesquisa.append(texto.getEmissor() + " disse: \n");
                pesquisa.append(texto + "\n");
                nome1 = texto.getEmissor();
            }
        }
        if (pesquisa.toString().equalsIgnoreCase("")) {
            campoResultados.setText("Não foi encontrada nenhuma Mensagem");
        } else {
            campoResultados.setText(pesquisa.toString());
        }
        campoPesquisa.setText("Digite a pesquisa");
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void campoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoUsuarioMouseClicked
        campoUsuario.setText("");
    }//GEN-LAST:event_campoUsuarioMouseClicked

    private void campoPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoPesquisaMouseClicked
        campoPesquisa.setText("");
    }//GEN-LAST:event_campoPesquisaMouseClicked
    //Confere/cria um arquivo de backup e uma nova classe app

    public App checarBackup() {
        if (arquivo.exists()) {
            try (FileInputStream reader = new FileInputStream(arquivo); ObjectInputStream leitor = new ObjectInputStream(reader)) {
                aux = true;
                return (App) leitor.readObject();

            } catch (Exception e) {
                System.out.println("Erro :" + e);
                return new App();
            }
        }
        try {
            arquivo.createNewFile();
            return new App();
        } catch (Exception e) {
            System.out.println("Erro :" + e);
            return new App();
        }

    }
//atualiza a caixa de mensagens com as mensagens da conversa

    public void atualizarChat() {
        StringBuilder conversa = new StringBuilder();
        String nome = "";
        for (Mensagem texto : novo.getConversa(botaoUsuario2.getText()).getMensagens()) {
            if (nome.equals(texto.getEmissor())) {
                conversa.append(texto);
                conversa.append(status(texto));

            } else {
                conversa.append(texto.getEmissor() + " disse: \n");
                conversa.append(texto);
                nome = texto.getEmissor();
                conversa.append(status(texto));
            }
        }
        areaConversa.setText(conversa.toString());

    }

    //mostra a ultima vez que o usuario enviou uma mensagem
    public void ultimaConexao(int usuario) {
        String saida = "";
        if (usuario == 1) {
            for (Mensagem data : novo.getConversa(botaoUsuario2.getText()).getMensagens()) {
                if (data.getEmissor().equalsIgnoreCase(botaoUsuario2.getText())) {
                    saida = data.getData();
                }
            }
        } else {
            for (Mensagem data : novo.getConversa(botaoUsuario2.getText()).getMensagens()) {
                if (data.getEmissor().equalsIgnoreCase(botaoUsuario1.getText())) {
                    saida = data.getData();
                }
            }
        }
        if (saida.isEmpty()) {
            contatoConexão.setText("Offline");
        } else {
            contatoConexão.setText(saida);
        }
    }
//atualiza a caixa historico com a ultima mensagem de cada conversa

    public void atualizarHistorico() {
        StringBuilder s = new StringBuilder();
        int tamanho = 0;
        String emissor = "";
        for (Conversa conversa : novo.getConversas()) {
            tamanho = conversa.getMensagens().size() - 1;
            s.append("Conversa com " + conversa.getTelefoneContato() + ":");
            try {
                emissor = conversa.getMensagens().get(tamanho).getEmissor();
                s.append("\n" + emissor + " disse: \n");
                s.append(conversa.getMensagens().get(tamanho) + "\n");
            } catch (Exception e) {
                s.append("\n\nNenhuma Mensagem\n\n\n");
            }
        }
        campoResultados.setText(s.toString());
    }

    //acrescenta os status das mensagens
    public String status(Mensagem e) {
        if (novo.getTelefoneUsuario().equalsIgnoreCase(e.getEmissor())) {
            switch (e.getStatus()) {
                case 0:
                    return "(Esta sendo enviada)\n\n";
                case 1:
                    return "(Enviado)\n\n";
                case 2:
                    return "(Recebido)\n\n";
                default:
                    return "(Lido)\n\n";
            }
        } else {
            return "\n";
        }
    }

    //Quando trocar de usuario aumenta os status da mensagem do outro usuario
    public void statusLido() {
        for (Mensagem texto : novo.getConversa(botaoUsuario2.getText()).getMensagens()) {

            if (novo.getTelefoneUsuario().equalsIgnoreCase(texto.getEmissor())) {
                texto.validarStatus();
            }
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaConversa;
    private javax.swing.JRadioButton botaoHistorico;
    private javax.swing.JButton botaoIniciar;
    private javax.swing.JButton botaoMensagem;
    private javax.swing.JButton botaoNome;
    private javax.swing.JRadioButton botaoPesquisa;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JRadioButton botaoUsuario1;
    private javax.swing.JRadioButton botaoUsuario2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField campoMensagem;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JTextArea campoResultados;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel contatoConexão;
    private javax.swing.JLabel contatoUltima;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> menuContatos;
    private javax.swing.JComboBox<String> menuStatus;
    private javax.swing.JLabel numeroContato;
    private javax.swing.JLabel numeroUsuario;
    private javax.swing.JLabel numerosContatos;
    // End of variables declaration//GEN-END:variables
}
