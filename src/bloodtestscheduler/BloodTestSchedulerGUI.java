/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodtestscheduler;

import bloodtestscheduler.Person;
import java.util.List;
import java.util.PriorityQueue;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author Josh
 */
public class BloodTestSchedulerGUI extends javax.swing.JFrame {

    private PatientQueue pQueue;
    private NoShowTracker noShowTracker;
    private GPRegistry gpRegistry;
    private Person currentPatient;
    
    public BloodTestSchedulerGUI(PatientQueue pQueue, NoShowTracker noShowTracker, GPRegistry gpRegistry) {
        initComponents();
        this.pQueue = pQueue;
        this.noShowTracker = noShowTracker;
        this.gpRegistry = gpRegistry;
        
        displayNoShowPatients();
        refreshQueue();
        
        populateGPComboBox();
        
    }
    
    //populates the GP combo box
    private void populateGPComboBox() {
        gpDetailsCB.removeAllItems(); // clears the combo box
        for (String gp : gpRegistry.getAllGPs()) {
            gpDetailsCB.addItem(gp); // adds each gp to the combo box
        }
    }
    
    //display no show patients in NoShowTA
    private void displayNoShowPatients() {
    noShowTA.setText(""); // clears the TA
    String noShows = noShowTracker.startDisplayNoShows(); // gets the no shows as a string
    noShowTA.append(noShows); // appends the no shows to the TA
}
    
    //refresh the queue text area
    private void refreshQueue() {
        queueTA.setText(""); // clear TA
        for (Person patient : pQueue.getAllPatients()) {
            queueTA.append(patient.getName() + "\n"); // displays the patients names
        }
    }
    
    //displays the next patient in the queue
    private void showNextPatient() {
    if (pQueue.isEmpty()) {
        currQueueTA.setText("No patients in queue.");
        JOptionPane.showMessageDialog(this, "The queue is empty!", "Notice", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    
    currentPatient = pQueue.dequeue();
    currQueueTA.setText(currentPatient.toString());
    refreshQueue();
}
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fromHospitalBG = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        NewPatientPanel = new javax.swing.JPanel();
        nameLBL = new javax.swing.JLabel();
        ageLBL = new javax.swing.JLabel();
        prioLevelLBL = new javax.swing.JLabel();
        gpDetailsLBL = new javax.swing.JLabel();
        fromHosLBL = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        ageTF = new javax.swing.JTextField();
        hosYesRB = new javax.swing.JRadioButton();
        hosNoRB = new javax.swing.JRadioButton();
        prioLevelCB = new javax.swing.JComboBox<>();
        addPatientBTN = new javax.swing.JButton();
        gpDetailsCB = new javax.swing.JComboBox<>();
        PatientQueuePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        currQueueTA = new javax.swing.JTextArea();
        nextPatientBTN = new javax.swing.JButton();
        noShowBTN = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        queueTA = new javax.swing.JTextArea();
        NoShowPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        noShowTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(204, 204, 204));

        NewPatientPanel.setBackground(new java.awt.Color(204, 204, 204));
        NewPatientPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "New Patient"));

        nameLBL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameLBL.setText("Name:");

        ageLBL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ageLBL.setText("Age:");

        prioLevelLBL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        prioLevelLBL.setText("Priority Level:");

        gpDetailsLBL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gpDetailsLBL.setText("GP Details:");

        fromHosLBL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fromHosLBL.setText("From Hospital:");

        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });

        fromHospitalBG.add(hosYesRB);
        hosYesRB.setText("Yes");

        fromHospitalBG.add(hosNoRB);
        hosNoRB.setText("No");

        prioLevelCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Urgent", "Medium", "Low" }));

        addPatientBTN.setText("Add Patient");
        addPatientBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPatientBTNActionPerformed(evt);
            }
        });

        gpDetailsCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Urgent", "Medium", "Low" }));

        javax.swing.GroupLayout NewPatientPanelLayout = new javax.swing.GroupLayout(NewPatientPanel);
        NewPatientPanel.setLayout(NewPatientPanelLayout);
        NewPatientPanelLayout.setHorizontalGroup(
            NewPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewPatientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NewPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prioLevelLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gpDetailsLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromHosLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(NewPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewPatientPanelLayout.createSequentialGroup()
                        .addComponent(addPatientBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NewPatientPanelLayout.createSequentialGroup()
                        .addGroup(NewPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NewPatientPanelLayout.createSequentialGroup()
                                .addComponent(hosYesRB)
                                .addGap(18, 18, 18)
                                .addComponent(hosNoRB))
                            .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prioLevelCB, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gpDetailsCB, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        NewPatientPanelLayout.setVerticalGroup(
            NewPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewPatientPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(NewPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLBL)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLBL)
                    .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prioLevelLBL)
                    .addComponent(prioLevelCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gpDetailsLBL)
                    .addComponent(gpDetailsCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewPatientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hosYesRB)
                    .addComponent(hosNoRB)
                    .addComponent(fromHosLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(addPatientBTN))
        );

        PatientQueuePanel.setBackground(new java.awt.Color(204, 204, 204));
        PatientQueuePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Current Queue of Patients"));

        currQueueTA.setColumns(20);
        currQueueTA.setRows(5);
        jScrollPane1.setViewportView(currQueueTA);

        nextPatientBTN.setText("Next Patient");
        nextPatientBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPatientBTNActionPerformed(evt);
            }
        });

        noShowBTN.setText("Mark as No-Show");
        noShowBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noShowBTNActionPerformed(evt);
            }
        });

        queueTA.setColumns(20);
        queueTA.setRows(5);
        jScrollPane3.setViewportView(queueTA);

        javax.swing.GroupLayout PatientQueuePanelLayout = new javax.swing.GroupLayout(PatientQueuePanel);
        PatientQueuePanel.setLayout(PatientQueuePanelLayout);
        PatientQueuePanelLayout.setHorizontalGroup(
            PatientQueuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PatientQueuePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PatientQueuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PatientQueuePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PatientQueuePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(noShowBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nextPatientBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PatientQueuePanelLayout.setVerticalGroup(
            PatientQueuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PatientQueuePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PatientQueuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PatientQueuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextPatientBTN)
                    .addComponent(noShowBTN))
                .addContainerGap())
        );

        NoShowPanel.setBackground(new java.awt.Color(204, 204, 204));
        NoShowPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Recent Patient No-Shows"));

        noShowTA.setColumns(20);
        noShowTA.setRows(5);
        jScrollPane2.setViewportView(noShowTA);

        javax.swing.GroupLayout NoShowPanelLayout = new javax.swing.GroupLayout(NoShowPanel);
        NoShowPanel.setLayout(NoShowPanelLayout);
        NoShowPanelLayout.setHorizontalGroup(
            NoShowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NoShowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        NoShowPanelLayout.setVerticalGroup(
            NoShowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NoShowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NewPatientPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PatientQueuePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NoShowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(NewPatientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PatientQueuePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NoShowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void nextPatientBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPatientBTNActionPerformed
        // TODO add your handling code here:
        currentPatient = pQueue.dequeue(); //removes the first patient from the queue
            if (currentPatient != null) {
                currQueueTA.setText(currentPatient.toString()); //display the detailed info of the next patient
                refreshQueue(); // refreshes teh queue TA
            } else {
                currQueueTA.setText("No patients in queue.");
    }
    }//GEN-LAST:event_nextPatientBTNActionPerformed

    private void noShowBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noShowBTNActionPerformed
        if (currentPatient != null) {
        noShowTracker.push(currentPatient);  // Add to no-show stack
        displayNoShowPatients();  // Refresh no-show list
        currentPatient = null;  // Clear the current patient
        currQueueTA.setText("No current patient.");
        
        //refresh no show TA
        noShowTA.setText(""); //clear no show TA
        for (Person noShow : noShowTracker.getAllNoShows()) {
            noShowTA.append(noShow.toString() + "\n"); //display no show patients
        }

        //refresh queue and current queue displays
        refreshQueue();
        showNextPatient();
    } else {
        JOptionPane.showMessageDialog(this, "No patient to mark as a no-show!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_noShowBTNActionPerformed

    private void addPatientBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientBTNActionPerformed
        // TODO add your handling code here:
        try {
            //getting the inputs
            String name = nameTF.getText();
            int age = Integer.parseInt(ageTF.getText());
            String priority = (String) prioLevelCB.getSelectedItem();
            String gpDetails = (String) gpDetailsCB.getSelectedItem(); // getting the GP from the combo box
            boolean fromHospital = hosYesRB.isSelected();
            boolean noShow = false; //defaults to false for new patients

            // validation
            if (name.isEmpty() || gpDetails.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // new person obj
            Person newPatient = new Person(name, age, priority, gpDetails, fromHospital, noShow);

            //adds patient to queue
            pQueue.enqueue(newPatient);

            //clear fields
            nameTF.setText("");
            ageTF.setText("");
            fromHospitalBG.clearSelection();


            //success
            JOptionPane.showMessageDialog(this, "Patient added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

            //refresh the queue TA to show the updated queue
            refreshQueue();
            } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(this, "Please enter a valid age.", "Error", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_addPatientBTNActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel NewPatientPanel;
    private javax.swing.JPanel NoShowPanel;
    private javax.swing.JPanel PatientQueuePanel;
    private javax.swing.JButton addPatientBTN;
    private javax.swing.JLabel ageLBL;
    private javax.swing.JTextField ageTF;
    private javax.swing.JTextArea currQueueTA;
    private javax.swing.JLabel fromHosLBL;
    private javax.swing.ButtonGroup fromHospitalBG;
    private javax.swing.JComboBox<String> gpDetailsCB;
    private javax.swing.JLabel gpDetailsLBL;
    private javax.swing.JRadioButton hosNoRB;
    private javax.swing.JRadioButton hosYesRB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nameLBL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton nextPatientBTN;
    private javax.swing.JButton noShowBTN;
    private javax.swing.JTextArea noShowTA;
    private javax.swing.JComboBox<String> prioLevelCB;
    private javax.swing.JLabel prioLevelLBL;
    private javax.swing.JTextArea queueTA;
    // End of variables declaration//GEN-END:variables
}
