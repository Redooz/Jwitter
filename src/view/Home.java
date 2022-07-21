package view;

import javax.swing.*;

public class Home extends JFrame {
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editDeleteTweetBtn;
    private javax.swing.JPanel font;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHome;
    private javax.swing.JButton likeTweetBtn;
    private javax.swing.JLabel nicknameLbl;
    private javax.swing.JButton toolTweetBtn;
    private javax.swing.JButton tweetBtn;
    private javax.swing.JButton tweetRepliesBtn;
    private javax.swing.JTextArea tweetsTxtArea;
    private javax.swing.JLabel twitterIcon;
    private javax.swing.JButton userBtn;
    private javax.swing.JTextField writeTweet;
    // End of variables declaration//GEN-END:variables

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        font = new javax.swing.JPanel();
        writeTweet = new javax.swing.JTextField();
        tweetBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tweetsTxtArea = new javax.swing.JTextArea();
        tweetRepliesBtn = new javax.swing.JButton();
        likeTweetBtn = new javax.swing.JButton();
        editDeleteTweetBtn = new javax.swing.JButton();
        toolTweetBtn = new javax.swing.JButton();
        userBtn = new javax.swing.JButton();
        nicknameLbl = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        twitterIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(21, 32, 43));
        setForeground(new java.awt.Color(21, 32, 43));
        setResizable(false);

        font.setBackground(new java.awt.Color(21, 32, 43));

        writeTweet.setBackground(new java.awt.Color(21, 32, 43));
        writeTweet.setForeground(new java.awt.Color(255, 255, 255));
        writeTweet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        writeTweet.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        tweetBtn.setBackground(new java.awt.Color(43, 141, 215));
        tweetBtn.setForeground(new java.awt.Color(255, 255, 255));
        tweetBtn.setText("Tweet");
        tweetBtn.setBorderPainted(false);

        tweetsTxtArea.setEditable(false);
        tweetsTxtArea.setBackground(new java.awt.Color(21, 32, 43));
        tweetsTxtArea.setColumns(20);
        tweetsTxtArea.setForeground(new java.awt.Color(255, 255, 255));
        tweetsTxtArea.setRows(5);
        tweetsTxtArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tweetsTxtArea.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tweetsTxtArea);

        tweetRepliesBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tweetRepliesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reply.png"))); // NOI18N
        tweetRepliesBtn.setText("Tweet Replies");
        tweetRepliesBtn.setBorderPainted(false);

        likeTweetBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        likeTweetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/like.png"))); // NOI18N
        likeTweetBtn.setText("Like a Tweet");
        likeTweetBtn.setBorderPainted(false);

        editDeleteTweetBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editDeleteTweetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        editDeleteTweetBtn.setText("Edit or Delete Tweet");
        editDeleteTweetBtn.setBorderPainted(false);

        toolTweetBtn.setBackground(new java.awt.Color(43, 141, 215));
        toolTweetBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toolTweetBtn.setForeground(new java.awt.Color(255, 255, 255));
        toolTweetBtn.setText("Tweet");
        toolTweetBtn.setBorderPainted(false);

        userBtn.setBackground(new java.awt.Color(21, 32, 43));
        userBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        userBtn.setBorderPainted(false);

        nicknameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nicknameLbl.setForeground(new java.awt.Color(255, 255, 255));
        nicknameLbl.setText("Nickname");

        lblHome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHome.setForeground(new java.awt.Color(255, 255, 255));
        lblHome.setText("Home");

        twitterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/twitter.png"))); // NOI18N

        javax.swing.GroupLayout fontLayout = new javax.swing.GroupLayout(font);
        font.setLayout(fontLayout);
        fontLayout.setHorizontalGroup(
            fontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fontLayout.createSequentialGroup()
                .addGroup(fontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fontLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(fontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fontLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nicknameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addComponent(userBtn))
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fontLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(fontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toolTweetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(likeTweetBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editDeleteTweetBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tweetRepliesBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(fontLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(twitterIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(fontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fontLayout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(tweetBtn)
                        .addGap(49, 49, 49))
                    .addGroup(fontLayout.createSequentialGroup()
                        .addGroup(fontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(writeTweet, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))))
            .addGroup(fontLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(lblHome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fontLayout.setVerticalGroup(
            fontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fontLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(writeTweet, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twitterIcon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tweetBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fontLayout.createSequentialGroup()
                        .addComponent(tweetRepliesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(likeTweetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editDeleteTweetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toolTweetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(userBtn)
                        .addGap(18, 18, 18)
                        .addComponent(nicknameLbl))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
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

    public JButton getTweetRepliesBtn() {
        return tweetRepliesBtn;
    }

    public void setTweetRepliesBtn(JButton tweetRepliesBtn) {
        this.tweetRepliesBtn = tweetRepliesBtn;
    }
    
}
