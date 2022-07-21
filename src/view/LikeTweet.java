package view;

import javax.swing.*;

/**
 *
 * @author yohan
 */
public class LikeTweet extends javax.swing.JFrame {
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel font;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton likeBtn;
    private javax.swing.JList<String> tweetsJlist;
    // End of variables declaration//GEN-END:variables

    public LikeTweet() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        font = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tweetsJlist = new javax.swing.JList<>();
        likeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        font.setBackground(new java.awt.Color(21, 32, 43));

        tweetsJlist.setBackground(new java.awt.Color(21, 32, 43));
        tweetsJlist.setForeground(new java.awt.Color(255, 255, 255));
        tweetsJlist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tweetsJlist.setLayoutOrientation(javax.swing.JList.VERTICAL_WRAP);
        jScrollPane1.setViewportView(tweetsJlist);

        likeBtn.setBackground(new java.awt.Color(43, 141, 215));
        likeBtn.setForeground(new java.awt.Color(255, 255, 255));
        likeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/like16.png"))); // NOI18N
        likeBtn.setText("Like");
        likeBtn.setBorderPainted(false);

        javax.swing.GroupLayout fontLayout = new javax.swing.GroupLayout(font);
        font.setLayout(fontLayout);
        fontLayout.setHorizontalGroup(
            fontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fontLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(likeBtn)
                .addContainerGap(164, Short.MAX_VALUE))
            .addGroup(fontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fontLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        fontLayout.setVerticalGroup(
            fontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fontLayout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(likeBtn)
                .addContainerGap())
            .addGroup(fontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fontLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(46, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(font, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(font, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getLikeBtn() {
        return likeBtn;
    }

    public void setLikeBtn(JButton likeBtn) {
        this.likeBtn = likeBtn;
    }

    public JList<String> getTweetsJlist() {
        return tweetsJlist;
    }

    public void setTweetsJlist(JList<String> tweetsJlist) {
        this.tweetsJlist = tweetsJlist;
    }
}
