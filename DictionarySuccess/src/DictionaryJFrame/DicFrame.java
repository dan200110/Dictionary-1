/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DictionaryJFrame;

import dic.Dictionary;
import dic.Word;
import dic.DictionaryCommandline;
import dic.DictionaryManagement;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;
import dic.DictionaryManagement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import java.io.*;
import com.sun.speech.freetts.*;
/**
 *
 * @author Admin
 */
public class DicFrame extends javax.swing.JFrame {

    /**
     * Creates new form DicFrame
     */
    public DicFrame() throws FileNotFoundException {
        initComponents();
        ExportListView();
    }
     
    
    
    Dictionary dictionary=new Dictionary();
    Word word=new Word();
    DictionaryCommandline dictionaryCommandline=new DictionaryCommandline();
    DictionaryManagement dictionaryManagement=new DictionaryManagement();
    private DefaultListModel model=new DefaultListModel();
    
    
    public Dictionary insertFromFile(Dictionary dictionary) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("D:\\VN-ENDict.txt")).useDelimiter("\\s*:\\s*");

        while (sc.hasNext()) {
            String vn = sc.next();
            String en = sc.nextLine();
            en = en.substring(3);
            vn = vn.toLowerCase();
            en = en.toLowerCase();
            dictionary.dictArr.add(new Word(en, vn));
        }

        Collections.sort(dictionary.dictArr, new Word());
        return dictionary;
    }
    
    public void ExportListView() throws FileNotFoundException
    {
         dictionaryManagement.insertFromFile(dictionary);
         for(int i=0;i<dictionary.dictArr.size();i++)
         {
             model.addElement(dictionary.dictArr.get(i).getWord_target());
         }
         ListView.setModel(model);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        ListView = new javax.swing.JList<>();
        ButtonSearch = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        TextField = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Fix = new javax.swing.JButton();
        Speak = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Translate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary ");
        setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        setLocation(new java.awt.Point(500, 200));
        setPreferredSize(new java.awt.Dimension(1339, 920));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ListView.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListViewValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(ListView);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 191, 421, 669));

        ButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        ButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSearchActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 47, 94, -1));

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane3.setViewportView(TextArea);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 240, 579, 620));

        TextField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TextFieldCaretUpdate(evt);
            }
        });
        getContentPane().add(TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 47, 421, 93));

        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add.png"))); // NOI18N
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 201, 94, -1));

        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete.png"))); // NOI18N
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 375, 94, -1));

        Fix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fix.png"))); // NOI18N
        Fix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FixActionPerformed(evt);
            }
        });
        getContentPane().add(Fix, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 564, 93, -1));

        Speak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/speak.png"))); // NOI18N
        Speak.setToolTipText("");
        Speak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeakActionPerformed(evt);
            }
        });
        getContentPane().add(Speak, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 95, 95, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("English - Vietnamese");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 95, 396, 107));

        Translate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/translate.png"))); // NOI18N
        Translate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TranslateActionPerformed(evt);
            }
        });
        getContentPane().add(Translate, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 731, 93, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Secene1.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 1350, 930));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSearchActionPerformed
        // TODO add your handling code here:
        String findWord=TextField.getText();
        DictionaryManagement dM=new DictionaryManagement();
        
        TextArea.setText(dM.dictionaryLookupForFrame(dictionary.dictArr,findWord));
    }//GEN-LAST:event_ButtonSearchActionPerformed

    private void ListViewValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListViewValueChanged
        // TODO add your handling code here:
        DictionaryManagement dM=new DictionaryManagement();
        
        TextArea.setText(dM.dictionaryLookupForFrame(dictionary.dictArr,ListView.getSelectedValue()));
        word.setWord_target(ListView.getSelectedValue());
    }//GEN-LAST:event_ListViewValueChanged

    private void TextFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TextFieldCaretUpdate
        // TODO add your handling code here:
        String text=TextField.getText();
        model = new DefaultListModel();
        
        if(text.isEmpty())
        {
            
            for(Word element : dictionary.dictArr)
            {
                model.addElement(element.getWord_target());
            }
            ListView.setModel(model);
        }
        else
        {
            model.clear();
            for (Word element : dictionary.dictArr) 
            {
                if (element.getWord_target().startsWith(text)) 
                {
                    model.addElement(element.getWord_target());
                }
            }
            ListView.setModel(model);
        }
    }//GEN-LAST:event_TextFieldCaretUpdate

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        AddWord add=new AddWord();
        add.setVisible(true);
    }//GEN-LAST:event_AddActionPerformed

    private static final String voiceName="kevin16";
    private void SpeakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeakActionPerformed
        // TODO add your handling code here:
        Voice voice;
        VoiceManager vm=VoiceManager.getInstance();
        voice=vm.getVoice(voiceName);
        voice.allocate();
        try
        {
            if(ListView.getSelectedValue()==null)
            {
                voice.speak(TextField.getText());
            }
            else
            {
                voice.speak(ListView.getSelectedValue());
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_SpeakActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        DeleteWord delete=new DeleteWord();
        delete.setVisible(true);
    }//GEN-LAST:event_DeleteActionPerformed

    private void FixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FixActionPerformed
        // TODO add your handling code here:
        FixWord fix=new FixWord();
        fix.setVisible(true);
    }//GEN-LAST:event_FixActionPerformed

    private void TranslateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TranslateActionPerformed
        // TODO add your handling code here:
        Translate trans=new Translate();
        trans.setVisible(true);
    }//GEN-LAST:event_TranslateActionPerformed

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
            java.util.logging.Logger.getLogger(DicFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DicFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DicFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DicFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DicFrame().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DicFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton ButtonSearch;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Fix;
    private javax.swing.JList<String> ListView;
    private javax.swing.JButton Speak;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JTextField TextField;
    private javax.swing.JButton Translate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    
}