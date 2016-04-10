/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Controllers.AdicionarExemplarControl;
import Controllers.ProcurarLivroControl;
import Dao.BibliotecaDAO;
import Entidades.Aluno;
import Entidades.Emprestimo;
import Entidades.Exemplares;
import Entidades.Funcionario;
import Entidades.Livro;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Wensttay
 */
public class ProcurarLivroFrame extends javax.swing.JFrame {
    
    BibliotecaDAO bibliotecaDAO;
    ProcurarLivroControl procurarLivroControl;
    Exemplares exemplares;
    int numeroEmprestados;
    List<Emprestimo> listaTotal;
    boolean quantidadesIguais;
    
    private AdicionarExemplarControl adicionarExemplarControl;
    /**
     * Creates new form ProcurarLivroFrame
     */
    /**
     * 
     * @throws IOException error de arquivos
     * @throws ClassNotFoundException error de classe
     */
    public ProcurarLivroFrame() throws IOException, ClassNotFoundException {
        initComponents();
        bibliotecaDAO = new BibliotecaDAO();
        this.procurarLivroControl = new ProcurarLivroControl();
        this.adicionarExemplarControl = new AdicionarExemplarControl();
        this.listaTotal = pegarTodosEmprestimos();
        if(this.listaTotal.size() > 0){
            this.exibir_Lista_EmprestadosjButton.setEnabled(true);
        }
    }
    
    public List<Emprestimo> pegarTodosEmprestimos() throws IOException, ClassNotFoundException{
        List<Aluno> alunos = bibliotecaDAO.getAnulos();
        List<Funcionario> funcionarios = bibliotecaDAO.getFuncionarios();
        List<Emprestimo> emprestimos = new ArrayList<>();
        
        for(Aluno i : alunos){
            emprestimos.addAll(i.getEmprestimo());
        }
        for(Funcionario i : funcionarios){
            emprestimos.addAll(i.getEmprestimo());
        }
        return emprestimos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        numero_De_ExemplaresjLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        altoresjTextArea = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        titulojTextField = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        descricaojTextArea = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        editorajTextField = new javax.swing.JTextField();
        cancelarjButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        procurarjButton = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        editarjButton = new javax.swing.JButton();
        salvarjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ISBNjTextField = new javax.swing.JTextField();
        exibir_Lista_EmprestadosjButton = new javax.swing.JButton();
        pesquisajTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        excluirjButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        numero_De_PagjFormattedTextField = new javax.swing.JFormattedTextField();
        numero_De_Exemplares_DispjFormattedTextFiel = new javax.swing.JFormattedTextField();
        numero_De_ExempjFormattedTextField1 = new javax.swing.JFormattedTextField();

        jButton1.setText("Todos");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Procurar Livro");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setText("Número de Páginas");

        numero_De_ExemplaresjLabel.setText("Número de Exemplares Disponiveis");

        altoresjTextArea.setEditable(false);
        altoresjTextArea.setColumns(20);
        altoresjTextArea.setRows(5);
        jScrollPane5.setViewportView(altoresjTextArea);

        jLabel20.setText("Autores");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Titulo");

        jLabel21.setText("Descrição");

        titulojTextField.setEditable(false);
        titulojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titulojTextFieldActionPerformed(evt);
            }
        });

        descricaojTextArea.setEditable(false);
        descricaojTextArea.setColumns(20);
        descricaojTextArea.setRows(5);
        jScrollPane6.setViewportView(descricaojTextArea);

        jLabel16.setText("Editora");

        editorajTextField.setEditable(false);
        editorajTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editorajTextFieldjTextField5ActionPerformed(evt);
            }
        });

        cancelarjButton.setText("Cancelar");
        cancelarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarjButtonActionPerformed(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("ISBN");

        procurarjButton.setText("Procurar");
        procurarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarjButtonActionPerformed(evt);
            }
        });

        jPanel19.setBackground(new java.awt.Color(153, 153, 153));
        jPanel19.setPreferredSize(new java.awt.Dimension(111, 111));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );

        editarjButton.setText("Editar");
        editarjButton.setEnabled(false);
        editarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarjButtonActionPerformed(evt);
            }
        });

        salvarjButton.setText("Salvar");
        salvarjButton.setEnabled(false);
        salvarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarjButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Número de Exemplares");

        ISBNjTextField.setEditable(false);

        exibir_Lista_EmprestadosjButton.setText("Exibir Lista de Emprestados ");
        exibir_Lista_EmprestadosjButton.setEnabled(false);
        exibir_Lista_EmprestadosjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibir_Lista_EmprestadosjButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Digite um Titulo ou ISBN");

        excluirjButton.setText("Excluir");
        excluirjButton.setEnabled(false);
        excluirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirjButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Todos");

        numero_De_PagjFormattedTextField.setEditable(false);
        try {
            numero_De_PagjFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        numero_De_Exemplares_DispjFormattedTextFiel.setEditable(false);
        try {
            numero_De_Exemplares_DispjFormattedTextFiel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        numero_De_ExempjFormattedTextField1.setEditable(false);
        try {
            numero_De_ExempjFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numero_De_ExempjFormattedTextField1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(numero_De_ExemplaresjLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numero_De_Exemplares_DispjFormattedTextFiel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numero_De_PagjFormattedTextField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(ISBNjTextField)
                                    .addComponent(editorajTextField)
                                    .addComponent(titulojTextField))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel21)
                                .addComponent(jLabel20)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(exibir_Lista_EmprestadosjButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salvarjButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editarjButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(excluirjButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(pesquisajTextField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(procurarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(titulojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editorajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(ISBNjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(numero_De_PagjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numero_De_ExemplaresjLabel)
                            .addComponent(numero_De_Exemplares_DispjFormattedTextFiel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(numero_De_ExempjFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pesquisajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(procurarjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarjButton)
                    .addComponent(salvarjButton)
                    .addComponent(exibir_Lista_EmprestadosjButton)
                    .addComponent(cancelarjButton)
                    .addComponent(excluirjButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarjButtonActionPerformed
        this.procurarjButton.setEnabled(false);
        this.salvarjButton.setEnabled(true);
        this.excluirjButton.setEnabled(false);
        this.editarjButton.setEnabled(false);
        
        this.pesquisajTextField.setEditable(false);
        this.titulojTextField.setEditable(true);
        this.editorajTextField.setEditable(true);
        
        this.numero_De_PagjFormattedTextField.setEditable(true);
        this.descricaojTextArea.setEditable(true);
        this.altoresjTextArea.setEditable(true);
        numero_De_ExempjFormattedTextField1.setEditable(true);
        
    }//GEN-LAST:event_editarjButtonActionPerformed

    private void procurarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarjButtonActionPerformed
        if (this.pesquisajTextField.getText() == null || this.pesquisajTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite um Titulo ou ISBN para Pesquisar");
        }else{
            try {
                this.exemplares = this.procurarLivroControl.procurarLivro(this.pesquisajTextField.getText());
                if (this.exemplares != null){
                    
                    this.titulojTextField.setText(this.exemplares.getLivro().getTitulo());
                    this.editorajTextField.setText(this.exemplares.getLivro().getEditora());
                    this.ISBNjTextField.setText(this.exemplares.getLivro().getISBN());
                    this.numero_De_PagjFormattedTextField.setText(""+this.exemplares.getLivro().getNumero_Paginas());
                    this.numero_De_ExempjFormattedTextField1.setText(""+this.exemplares.getQuantidade());
                    this.numero_De_Exemplares_DispjFormattedTextFiel.setText(""+this.exemplares.getQuantidade_Disponivel());
                    this.descricaojTextArea.setText(this.exemplares.getLivro().getDescricao());
                    String autoria = "";
                    for (String i : this.exemplares.getLivro().getAutores()){
                        autoria += i +";";
                    }
                    this.altoresjTextArea.setText(autoria);
                    
                    quantidadesIguais = false;
                    numeroEmprestados = Integer.parseInt(this.numero_De_ExempjFormattedTextField1.getText()) - Integer.parseInt(this.numero_De_Exemplares_DispjFormattedTextFiel.getText());
                    
                    this.editarjButton.setEnabled(true);
                    if(this.exemplares.getQuantidade() == this.exemplares.getQuantidade_Disponivel()){
                        this.quantidadesIguais = true;
                        this.excluirjButton.setEnabled(true);
                    }
                    if(!(this.exemplares.getQuantidade() == this.exemplares.getQuantidade_Disponivel())){
                        this.exibir_Lista_EmprestadosjButton.setEnabled(true);
                    }
                }else{
                    this.pesquisajTextField.setText("");
                }
                
            } catch (IOException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "File Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_procurarjButtonActionPerformed

    private void cancelarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarjButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarjButtonActionPerformed

    private void editorajTextFieldjTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editorajTextFieldjTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editorajTextFieldjTextField5ActionPerformed

    private void excluirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirjButtonActionPerformed
        
        int respota = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esses Exemplares? ", "Excluir Confirm", JOptionPane.YES_NO_OPTION , JOptionPane.WARNING_MESSAGE );
        if(respota == 0){
            try {
                this.bibliotecaDAO.removeExemplares(this.exemplares);
                this.titulojTextField.setEditable(false);                           this.titulojTextField.setText("");
                this.ISBNjTextField.setEditable(false);                             this.ISBNjTextField.setText("");
                this.editorajTextField.setEditable(false);                          this.editorajTextField.setText("");
                this.numero_De_PagjFormattedTextField.setEditable(false);                this.numero_De_PagjFormattedTextField.setText("");
                this.numero_De_ExempjFormattedTextField1.setEditable(false);                this.numero_De_ExempjFormattedTextField1.setText("");
                this.numero_De_Exemplares_DispjFormattedTextFiel.setEditable(false);    this.numero_De_Exemplares_DispjFormattedTextFiel.setText(""); 
                this.descricaojTextArea.setEditable(false);                         this.descricaojTextArea.setText("");
                this.pesquisajTextField.setEditable(true);                          this.pesquisajTextField.setText("");
                this.altoresjTextArea.setEditable(false);                           this.altoresjTextArea.setText("");
        
                this.salvarjButton.setEnabled(false);
                this.editarjButton.setEnabled(false);
                this.procurarjButton.setEnabled(true);
                this.exibir_Lista_EmprestadosjButton.setEnabled(false);
                this.excluirjButton.setEnabled(false);
            
            } catch (IOException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "File Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada");
        }
    }//GEN-LAST:event_excluirjButtonActionPerformed

    private void salvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarjButtonActionPerformed
        try {
            if( (!quantidadesIguais) && 
(!(Integer.parseInt(this.numero_De_ExempjFormattedTextField1.getText()) > this.exemplares.getQuantidade())) &&
(this.exemplares.getQuantidade_Disponivel() - Integer.parseInt(this.numero_De_ExempjFormattedTextField1.getText())) <= this.numeroEmprestados){
                    JOptionPane.showMessageDialog(null, "Não é possivel setar uma quantidade de livros menor que a quantidade Disponivel");
            }else{  
                Livro livroEditado = new Livro(this.ISBNjTextField.getText(),
                this.titulojTextField.getText(),
                this.adicionarExemplarControl.separar_Altores(this.altoresjTextArea.getText()), 
                this.editorajTextField.getText(),
                this.descricaojTextArea.getText(), 
                Integer.parseInt(this.numero_De_PagjFormattedTextField.getText()));
                
                Exemplares ex = new Exemplares(livroEditado, Integer.parseInt(this.numero_De_ExempjFormattedTextField1.getText()));
                
                if(quantidadesIguais){
                    ex.setQuantidade(Integer.parseInt(this.numero_De_ExempjFormattedTextField1.getText()));
                }else{
                    ex.setQuantidade_Disponivel( Integer.parseInt(this.numero_De_ExempjFormattedTextField1.getText()) - numeroEmprestados);    
                }
                bibliotecaDAO.editExemplares(ex);
            }
        } catch (IOException | ClassNotFoundException | NumberFormatException ex1) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "File Error", JOptionPane.ERROR_MESSAGE);
        }
        
        this.titulojTextField.setEditable(false);                           this.titulojTextField.setText("");
        this.ISBNjTextField.setEditable(false);                             this.ISBNjTextField.setText("");
        this.editorajTextField.setEditable(false);                          this.editorajTextField.setText("");
        this.numero_De_PagjFormattedTextField.setEditable(false);                this.numero_De_PagjFormattedTextField.setText("");
        this.numero_De_ExempjFormattedTextField1.setEditable(false);                this.numero_De_ExempjFormattedTextField1.setText("");
        this.numero_De_Exemplares_DispjFormattedTextFiel.setEditable(false);    this.numero_De_Exemplares_DispjFormattedTextFiel.setText(""); 
        this.descricaojTextArea.setEditable(false);                         this.descricaojTextArea.setText("");
        this.pesquisajTextField.setEditable(true);                          this.pesquisajTextField.setText("");
        this.altoresjTextArea.setEditable(false);                           this.altoresjTextArea.setText("");
        
        this.salvarjButton.setEnabled(false);
        this.editarjButton.setEnabled(false);
        this.procurarjButton.setEnabled(true);
        this.excluirjButton.setEnabled(false);
    }//GEN-LAST:event_salvarjButtonActionPerformed

    private void exibir_Lista_EmprestadosjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibir_Lista_EmprestadosjButtonActionPerformed
        TodosLivrosEmprestados todosLivrosEmprestados;
        try {
            todosLivrosEmprestados = new TodosLivrosEmprestados(this.listaTotal);
            todosLivrosEmprestados.setVisible(true);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "File Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "File Error", JOptionPane.ERROR_MESSAGE);
        }
         
    }//GEN-LAST:event_exibir_Lista_EmprestadosjButtonActionPerformed

    private void titulojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titulojTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titulojTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ProcurarLivroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcurarLivroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcurarLivroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcurarLivroFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ProcurarLivroFrame().setVisible(true);
                } catch (IOException | ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "File Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ISBNjTextField;
    private javax.swing.JTextArea altoresjTextArea;
    private javax.swing.JButton cancelarjButton;
    private javax.swing.JTextArea descricaojTextArea;
    private javax.swing.JButton editarjButton;
    private javax.swing.JTextField editorajTextField;
    private javax.swing.JButton excluirjButton;
    private javax.swing.JButton exibir_Lista_EmprestadosjButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JFormattedTextField numero_De_ExempjFormattedTextField1;
    private javax.swing.JFormattedTextField numero_De_Exemplares_DispjFormattedTextFiel;
    private javax.swing.JLabel numero_De_ExemplaresjLabel;
    private javax.swing.JFormattedTextField numero_De_PagjFormattedTextField;
    private javax.swing.JTextField pesquisajTextField;
    private javax.swing.JButton procurarjButton;
    private javax.swing.JButton salvarjButton;
    private javax.swing.JTextField titulojTextField;
    // End of variables declaration//GEN-END:variables
}
