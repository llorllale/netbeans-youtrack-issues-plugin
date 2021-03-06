/*
 * Copyright 2017 George Aristy.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.llorllale.netbeans.youtrack.issues;

import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 * A {@link RepoConfig} that exposes the repository's configuration to the user as a swing panel.
 * 
 * <p>For testing purposes, some components can be referenced with these names:
 * 
 * <ul>
 *    <li><strong>Project ID</strong> text box: "projectIdTxtBox"</li>
 *    <li><strong>API URL</strong> text box: "apiUrlTxtBox"</li>
 *    <li><strong>Token</strong> text box: "tokenTxtBox"</li>
 *    <li><strong>Test</strong> button: "testBtn"</li>
 * </ul>
 *
 * @author George Aristy (george.aristy@gmail.com)
 * @since 0.2.0
 */
final class DefaultRepoConfig extends JPanel implements RepoConfig {
  private static final long serialVersionUID = 7591105472682819639L;

  /**
   * Ctor.
   * 
   * @since 0.2.0
   */
  DefaultRepoConfig() {
    this.initComponents();
  }

  @Override
  public String apiUrl() {
    return this.apiUrlTxtBox.getText();
  }

  @Override
  public String projectId() {
    return this.projectIdTxtBox.getText();
  }

  @Override
  public String userToken() {
    return this.permTokenTxtBox.getText();
  }

  @Override
  public JComponent view() {
    return this;
  }

  @Override
  public RepoConfig onTestBtn(final ActionListener listener) {
    this.testBtn.addActionListener(listener);
    return this;
  }

  //@checkstyle.OFF: GENERATED CODE
  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    apiUrlLabel = new javax.swing.JLabel();
    apiUrlTxtBox = new javax.swing.JTextField();
    tokenLabel = new javax.swing.JLabel();
    permTokenTxtBox = new javax.swing.JTextField();
    projectIdLabel = new javax.swing.JLabel();
    projectIdTxtBox = new javax.swing.JTextField();
    testBtn = new javax.swing.JButton();

    org.openide.awt.Mnemonics.setLocalizedText(apiUrlLabel, org.openide.util.NbBundle.getMessage(DefaultRepoConfig.class, "DefaultRepoConfig.apiUrlLabel.text")); // NOI18N

    apiUrlTxtBox.setText(org.openide.util.NbBundle.getMessage(DefaultRepoConfig.class, "DefaultRepoConfig.apiUrlTxtBox.text")); // NOI18N
    apiUrlTxtBox.setName("apiUrlTxtBox"); // NOI18N

    org.openide.awt.Mnemonics.setLocalizedText(tokenLabel, org.openide.util.NbBundle.getMessage(DefaultRepoConfig.class, "DefaultRepoConfig.tokenLabel.text")); // NOI18N

    permTokenTxtBox.setText(org.openide.util.NbBundle.getMessage(DefaultRepoConfig.class, "YtRepoConfigView.tokenTxtBox.text")); // NOI18N
    permTokenTxtBox.setName("tokenTxtBox"); // NOI18N

    org.openide.awt.Mnemonics.setLocalizedText(projectIdLabel, org.openide.util.NbBundle.getMessage(DefaultRepoConfig.class, "DefaultRepoConfig.projectIdLabel.text")); // NOI18N

    projectIdTxtBox.setText(org.openide.util.NbBundle.getMessage(DefaultRepoConfig.class, "DefaultRepoConfig.projectIdTxtBox.text")); // NOI18N
    projectIdTxtBox.setName("projectIdTxtBox"); // NOI18N

    org.openide.awt.Mnemonics.setLocalizedText(testBtn, org.openide.util.NbBundle.getMessage(DefaultRepoConfig.class, "DefaultRepoConfig.testBtn.text")); // NOI18N
    testBtn.setName("testBtn"); // NOI18N

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(apiUrlLabel)
          .addComponent(projectIdLabel)
          .addComponent(tokenLabel))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(apiUrlTxtBox, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
          .addComponent(projectIdTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(permTokenTxtBox))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(testBtn)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(projectIdLabel)
          .addComponent(projectIdTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(apiUrlLabel)
          .addComponent(apiUrlTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(tokenLabel)
          .addComponent(permTokenTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(testBtn)
        .addContainerGap(17, Short.MAX_VALUE))
    );
  }// </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel apiUrlLabel;
  private javax.swing.JTextField apiUrlTxtBox;
  private javax.swing.JTextField permTokenTxtBox;
  private javax.swing.JLabel projectIdLabel;
  private javax.swing.JTextField projectIdTxtBox;
  private javax.swing.JButton testBtn;
  private javax.swing.JLabel tokenLabel;
  // End of variables declaration//GEN-END:variables
  //@checkstyle.ON: GENERATED CODE
}
