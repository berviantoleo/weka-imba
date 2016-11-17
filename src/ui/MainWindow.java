/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import imba.classifier.FFNN;
import imba.classifier.NBTubes;
import java.io.File;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

/**
 *
 * @author Bervianto Leo P
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        horizontalFillLeft = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(50, 0));
        allPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        openButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        datasetStatusPanel = new javax.swing.JPanel();
        relationLabel = new javax.swing.JLabel();
        relationValue = new javax.swing.JLabel();
        attributesLabel = new javax.swing.JLabel();
        attributesValue = new javax.swing.JLabel();
        instancesLabel = new javax.swing.JLabel();
        instancesValue = new javax.swing.JLabel();
        sumofweightsLabel = new javax.swing.JLabel();
        sumofweightsValue = new javax.swing.JLabel();
        selectMethodePanel = new javax.swing.JPanel();
        selectClassifierBox = new javax.swing.JComboBox<>();
        selectEvaluationBox = new javax.swing.JComboBox<>();
        selectEvaluationPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        runningPane = new javax.swing.JPanel();
        resultLabel = new javax.swing.JLabel();
        resultPane = new javax.swing.JScrollPane();
        resultTextArea = new javax.swing.JTextArea();
        executeButton = new javax.swing.JButton();
        statusPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        isiStatus = new javax.swing.JLabel();
        horizontalFillRight = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(50, 0));
        mainMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitFileMenuItem = new javax.swing.JMenuItem();
        aboutMenu = new javax.swing.JMenu();
        aboutHelpMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weka Imba");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.X_AXIS));
        getContentPane().add(horizontalFillLeft);

        allPanel.setLayout(new javax.swing.BoxLayout(allPanel, javax.swing.BoxLayout.Y_AXIS));

        openButton.setText("Open Dataset File");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });
        mainPanel.add(openButton);

        saveButton.setText("Save Dataset");
        saveButton.setEnabled(false);
        mainPanel.add(saveButton);

        allPanel.add(mainPanel);

        datasetStatusPanel.setLayout(new java.awt.GridLayout(2, 2));

        relationLabel.setText("Relation :");
        datasetStatusPanel.add(relationLabel);
        datasetStatusPanel.add(relationValue);

        attributesLabel.setText("Attributes :");
        datasetStatusPanel.add(attributesLabel);
        datasetStatusPanel.add(attributesValue);

        instancesLabel.setText("Instances :");
        datasetStatusPanel.add(instancesLabel);
        datasetStatusPanel.add(instancesValue);

        sumofweightsLabel.setText("Sum of Weights :");
        datasetStatusPanel.add(sumofweightsLabel);
        datasetStatusPanel.add(sumofweightsValue);

        allPanel.add(datasetStatusPanel);

        selectClassifierLabel.setText("Select Classifier : ");
        selectMethodePanel.add(selectClassifierLabel);

        selectClassifierBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FFNN", "Naive Bayes" }));
        selectClassifierBox.setEnabled(false);
        selectMethodePanel.add(selectClassifierBox);

        selectEvaluationLabel.setText("Select Evaluation :");
        selectMethodePanel.add(selectEvaluationLabel);

        selectEvaluationBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cross Validation", "Split Test" }));
        selectEvaluationBox.setEnabled(false);
        selectMethodePanel.add(selectEvaluationBox);

        allPanel.add(selectMethodePanel);

        jLabel1.setText("Jumlah Iterasi :");
        selectEvaluationPanel.add(jLabel1);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setPreferredSize(new java.awt.Dimension(40, 20));
        selectEvaluationPanel.add(jTextField1);

        allPanel.add(selectEvaluationPanel);

        runningPane.setLayout(new javax.swing.BoxLayout(runningPane, javax.swing.BoxLayout.LINE_AXIS));

        resultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultLabel.setText("Result :");
        runningPane.add(resultLabel);

        resultTextArea.setEditable(false);
        resultTextArea.setColumns(20);
        resultTextArea.setRows(5);
        resultPane.setViewportView(resultTextArea);

        runningPane.add(resultPane);

        executeButton.setText("Execute");
        executeButton.setEnabled(false);
        executeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeButtonActionPerformed(evt);
            }
        });
        runningPane.add(executeButton);

        allPanel.add(runningPane);

        statusLabel.setText("Working Status :");
        statusPanel.add(statusLabel);
        statusPanel.add(isiStatus);

        allPanel.add(statusPanel);

        getContentPane().add(allPanel);
        getContentPane().add(horizontalFillRight);

        fileMenu.setText("File");

        exitFileMenuItem.setText("Exit");
        exitFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitFileMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitFileMenuItem);

        mainMenuBar.add(fileMenu);

        aboutMenu.setText("Help");

        aboutHelpMenuItem.setText("About");
        aboutMenu.add(aboutHelpMenuItem);

        mainMenuBar.add(aboutMenu);

        setJMenuBar(mainMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitFileMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitFileMenuItemActionPerformed

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        if(evt.getSource() == this.openButton) {
            this.filechooser.setAcceptAllFileFilterUsed(false);
            this.filechooser.removeChoosableFileFilter(modelformat);
            this.filechooser.setFileFilter(arffformat);
            int returnVal = this.filechooser.showOpenDialog(MainWindow.this);
            
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                try {
                    File file = this.filechooser.getSelectedFile();
                    this.isiStatus.setText("Membuka: " + file.getName() + ".\n");
                    this.data = ConverterUtils.DataSource.read(file.getAbsolutePath());
                    if (this.data.classIndex() == -1) {
                        this.data.setClassIndex(this.data.numAttributes() - 1);
                    }
                    this.instancesValue.setText(String.valueOf(this.data.numInstances()));
                    this.attributesValue.setText(String.valueOf(this.data.numAttributes()));
                    this.relationValue.setText(String.valueOf(this.data.relationName()));
                    this.sumofweightsValue.setText(String.valueOf(this.data.sumOfWeights()));
                    this.saveButton.setEnabled(true);
                    this.executeButton.setEnabled(true);
                    this.selectEvaluationBox.setEnabled(true);
                    this.selectClassifierBox.setEnabled(true);
                    //this.addInstanceButton.setEnabled(true);
                    //this.loadModelButton.setEnabled(true);
                    this.isiStatus.setText("Membuka berkas "+file.getName()+" berhasil!");
                } catch (Exception ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                this.isiStatus.setText("Open command cancelled by user.\n");
            }
        }
    }//GEN-LAST:event_openButtonActionPerformed

    private void executeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeButtonActionPerformed
        if(evt.getSource()==this.executeButton) {
            if (selectClassifierBox.getSelectedIndex() == 0) {
                // FFNN 
                Classifier fn = new FFNN();
                
                //kalau mau rubah nilai hidden dan jumlah neuron lakukan disini
                //fn.setHiddenLayer(1);
                //fn.setNeuronNum(5);
                try {
                    fn.buildClassifier(this.data);
                } catch (Exception ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (selectClassifierBox.getSelectedIndex() == 1) {
                try {
                    Evaluation evaluation = new Evaluation(this.data);
                    // Naive Bayes
                    NBTubes nb = new NBTubes();
                    nb.buildClassifier(data);
                    // Cuman buat perbandingan
                    NaiveBayes ntest = new NaiveBayes();
                    ntest.buildClassifier(data);

                    // Evaluate
                    evaluation.crossValidateModel(nb, this.data, 10, new Random(1));
                    this.resultTextArea.setText(evaluation.toSummaryString("\n== Summary ==\n",false));
                    this.resultTextArea.append(evaluation.toClassDetailsString("\n== Detailed Accuracy By Class ==\n"));
                    this.resultTextArea.append(evaluation.toMatrixString("\n== Confusion Matrix ==\n"));
                    this.isiStatus.setText("Running Cross Validation Completed");
                    //this.saveModelButton.setEnabled(true);
                    // Evaluate Comparing
                    /*
                    evaluation.crossValidateModel(ntest, this.data, 10, new Random(1));
                    this.resultTextArea.append(evaluation.toSummaryString("\n== Summary ==\n",true));
                    this.resultTextArea.append(evaluation.toClassDetailsString("\n== Detailed Accuracy By Class ==\n"));
                    this.resultTextArea.append(evaluation.toMatrixString("\n== Confusion Matrix ==\n"));
                    this.isiStatus.setText("Running Cross Validation Completed");*/
                    //this.saveModelButton.setEnabled(true);

                } catch (Exception ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_executeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Metal look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    MetalLookAndFeel.setCurrentTheme(new OceanTheme());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables Data
    private Instances data;
    private final JFileChooser filechooser = new JFileChooser();
    private final ArffFile arffformat = new ArffFile();
    private final ModelFile modelformat = new ModelFile();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutHelpMenuItem;
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JPanel allPanel;
    private javax.swing.JLabel attributesLabel;
    private javax.swing.JLabel attributesValue;
    private javax.swing.JPanel datasetStatusPanel;
    private javax.swing.JButton executeButton;
    private javax.swing.JMenuItem exitFileMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.Box.Filler horizontalFillLeft;
    private javax.swing.Box.Filler horizontalFillRight;
    private javax.swing.JLabel instancesLabel;
    private javax.swing.JLabel instancesValue;
    private javax.swing.JLabel isiStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton openButton;
    private javax.swing.JLabel relationLabel;
    private javax.swing.JLabel relationValue;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JScrollPane resultPane;
    private javax.swing.JTextArea resultTextArea;
    private javax.swing.JPanel runningPane;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> selectClassifierBox;
    private final javax.swing.JLabel selectClassifierLabel = new javax.swing.JLabel();
    private javax.swing.JComboBox<String> selectEvaluationBox;
    private final javax.swing.JLabel selectEvaluationLabel = new javax.swing.JLabel();
    private javax.swing.JPanel selectEvaluationPanel;
    private javax.swing.JPanel selectMethodePanel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JLabel sumofweightsLabel;
    private javax.swing.JLabel sumofweightsValue;
    // End of variables declaration//GEN-END:variables
}
