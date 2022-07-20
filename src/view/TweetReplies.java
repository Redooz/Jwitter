package view;

import javax.swing.JButton;
import javax.swing.JList;


/**
 *
 * @author yohan
 */
public class TweetReplies extends javax.swing.JFrame {
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton replyBtn;
    private javax.swing.JList<String> tweetsJlist;
    private javax.swing.JButton watchRepliesBtn;
    // End of variables declaration//GEN-END:variables

    public TweetReplies() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tweetsJlist = new javax.swing.JList<>();
        watchRepliesBtn = new javax.swing.JButton();
        replyBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tweetsJlist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tweetsJlist.setLayoutOrientation(javax.swing.JList.VERTICAL_WRAP);
        jScrollPane1.setViewportView(tweetsJlist);

        watchRepliesBtn.setText("Watch Replies");

        replyBtn.setText("Reply");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(replyBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(watchRepliesBtn)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(watchRepliesBtn)
                    .addComponent(replyBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JList<String> getTweetsJlist() {
        return tweetsJlist;
    }

    public void setTweetsJlist(JList<String> tweetsJlist) {
        this.tweetsJlist = tweetsJlist;
    }

    public JButton getWatchRepliesBtn() {
        return watchRepliesBtn;
    }

    public void setWatchRepliesBtn(JButton watchRepliesBtn) {
        this.watchRepliesBtn = watchRepliesBtn;
    }

    public JButton getReplyBtn() {
        return replyBtn;
    }

    public void setReplyBtn(JButton replyBtn) {
        this.replyBtn = replyBtn;
    }
    
    
}
