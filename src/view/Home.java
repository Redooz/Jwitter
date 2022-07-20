package view;

import javax.swing.*;

public class Home extends JFrame {
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editDeleteTweetBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton likeTweetBtn;
    private javax.swing.JLabel nicknameLbl;
    private javax.swing.JButton toolTweetBtn;
    private javax.swing.JButton tweetBtn;
    private javax.swing.JTextArea tweetsTxtArea;
    private javax.swing.JButton userBtn;
    private javax.swing.JTextField writeTweet;
    // End of variables declaration//GEN-END:variables

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        writeTweet = new javax.swing.JTextField();
        tweetBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tweetsTxtArea = new javax.swing.JTextArea();
        toolTweetBtn = new javax.swing.JButton();
        nicknameLbl = new javax.swing.JLabel();
        userBtn = new javax.swing.JButton();
        editDeleteTweetBtn = new javax.swing.JButton();
        likeTweetBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tweetBtn.setText("Tweet");

        tweetsTxtArea.setEditable(false);
        tweetsTxtArea.setColumns(20);
        tweetsTxtArea.setRows(5);
        jScrollPane1.setViewportView(tweetsTxtArea);

        toolTweetBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toolTweetBtn.setText("Tweet");

        nicknameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nicknameLbl.setText("Nickname");

        userBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        editDeleteTweetBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editDeleteTweetBtn.setText("Edit or Delete Tweet");

        likeTweetBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        likeTweetBtn.setText("Like a Tweet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(596, Short.MAX_VALUE)
                        .addComponent(tweetBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nicknameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(userBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(toolTweetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(likeTweetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(editDeleteTweetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                            .addComponent(writeTweet))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(writeTweet, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(tweetBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(likeTweetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editDeleteTweetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toolTweetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(userBtn)
                        .addGap(18, 18, 18)
                        .addComponent(nicknameLbl)
                        .addGap(36, 36, 36))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getEditDeleteTweetBtn() {
        return editDeleteTweetBtn;
    }

    public void setEditDeleteTweetBtn(JButton editTweetBtn) {
        this.editDeleteTweetBtn = editTweetBtn;
    }
    
    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextArea getTweetsTxtArea() {
        return tweetsTxtArea;
    }

    public void setTweetsTxtArea(JTextArea tweetsTxtArea) {
        this.tweetsTxtArea = tweetsTxtArea;
    }

    public JButton getTweetBtn() {
        return tweetBtn;
    }

    public void setTweetBtn(JButton tweetBtn) {
        this.tweetBtn = tweetBtn;
    }

    public JTextField getWriteTweet() {
        return writeTweet;
    }

    public void setWriteTweet(JTextField writeTweet) {
        this.writeTweet = writeTweet;
    }

    public JButton getToolTweetBtn() {
        return toolTweetBtn;
    }

    public void setToolTweetBtn(JButton toolTweetBtn) {
        this.toolTweetBtn = toolTweetBtn;
    }

    public JLabel getNicknameLbl() {
        return nicknameLbl;
    }

    public void setNicknameLbl(JLabel nicknameLbl) {
        this.nicknameLbl = nicknameLbl;
    }

    public JButton getUserBtn() {
        return userBtn;
    }

    public void setUserBtn(JButton userBtn) {
        this.userBtn = userBtn;
    }

    public JButton getLikeTweetBtn() {
        return likeTweetBtn;
    }

    public void setLikeTweetBtn(JButton likeTweetBtn) {
        this.likeTweetBtn = likeTweetBtn;
    }
    
}
