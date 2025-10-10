
package edu.tiagols.padaria;

import java.util.List;
import javax.swing.DefaultListModel;


public class Principal extends javax.swing.JFrame {
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());
    List<Produto> produtos;
    DefaultListModel<ProdutoVenda> listaCarrinho;
    

    public Principal() {
       initComponents();
       
       produtos = ProdutoService.inicializarProdutos();
        
       
        produtos.forEach( item -> paraCada(item));
        for( Produto item : produtos){
            selecaoProduto.addItem(item);
        }

        
        listaCarrinho = new DefaultListModel<>();
        jList1.setModel(listaCarrinho);
        
        atualizaSaldo();
        }
    
    public void paraCada(Produto p){
        
    }
    
    public void atualizaSaldo() {
    Object itemSelecionado = selecaoProduto.getSelectedItem();

    if (itemSelecionado != null && itemSelecionado instanceof Produto) {
        Produto produto = (Produto) itemSelecionado;
        tSaldo.setText(Integer.toString(produto.getSaldoEstoque()));
    } else {
        tSaldo.setText("—"); // mostra um traço caso não haja produto selecionado
    }
}
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton = new javax.swing.JButton();
        selecaoProduto = new javax.swing.JComboBox();
        spnQuant = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        bRemove = new javax.swing.JButton();
        tTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tSaldo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton.setText("adicionar");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        selecaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecaoProdutoActionPerformed(evt);
            }
        });

        spnQuant.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spnQuant.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spnQuantPropertyChange(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        bRemove.setText("remove");
        bRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoveActionPerformed(evt);
            }
        });

        tTotal.setText("total");

        jLabel1.setText("Saldo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selecaoProduto, 0, 238, Short.MAX_VALUE)
                            .addComponent(spnQuant))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton)
                        .addGap(18, 18, 18)
                        .addComponent(bRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(394, 394, 394))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton)
                        .addComponent(bRemove)
                        .addComponent(tTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(selecaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spnQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(322, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
       // TODO add your handling code here:
    Produto produtoSelecionado = (Produto) selecaoProduto.getSelectedItem();
    int quantidade = Integer.parseInt(spnQuant.getValue().toString());

    if (produtoSelecionado == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione um produto!");
        return;
    }

    // Verifica se há estoque suficiente
    if (produtoSelecionado.getSaldoEstoque() >= quantidade) {
        // Diminui o estoque
        produtoSelecionado.diminuirEstoque(quantidade);

        // Cria a venda e adiciona ao carrinho
        ProdutoVenda venda = new ProdutoVenda();
        venda.setProduto(produtoSelecionado);
        venda.setQuantidade(quantidade);
        venda.setTotal();

        listaCarrinho.addElement(venda);

        // Atualiza o texto do combo box (pra mostrar o estoque atualizado)
        selecaoProduto.repaint();
        atualizaSaldo();

    } else {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Estoque insuficiente!\nDisponível: " + produtoSelecionado.getSaldoEstoque());
    }
    }//GEN-LAST:event_jButtonActionPerformed

    private void selecaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecaoProdutoActionPerformed
        // TODO add your handling code here:
        atualizaSaldo();
        
    }//GEN-LAST:event_selecaoProdutoActionPerformed

    private void spnQuantPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spnQuantPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_spnQuantPropertyChange

    private void bRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoveActionPerformed
        int indice = jList1.getSelectedIndex();

    if (indice != -1) {
        ProdutoVenda venda = listaCarrinho.getElementAt(indice);

        // Devolve o estoque
        venda.getProduto().aumentarEstoque(venda.getQuantidade());

        // Remove do carrinho
        listaCarrinho.remove(indice);

        // Atualiza o combo box
        selecaoProduto.repaint();
        atualizaSaldo();
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione um item para remover!");
    }
    }//GEN-LAST:event_bRemoveActionPerformed
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and dislay the form */
       
        java.awt.EventQueue.invokeLater(() -> new Principal().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRemove;
    private javax.swing.JButton jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<ProdutoVenda> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox selecaoProduto;
    private javax.swing.JSpinner spnQuant;
    private javax.swing.JTextField tSaldo;
    private javax.swing.JTextField tTotal;
    // End of variables declaration//GEN-END:variables
}