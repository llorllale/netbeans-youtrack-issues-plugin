/*
 * Copyright 2017 George Aristy.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.llorllale.netbeans.youtrack.issues;

import java.beans.PropertyChangeListener;
import javax.swing.JComponent;
import org.llorllale.youtrack.api.Issue;
import org.netbeans.modules.bugtracking.spi.IssueController;
import org.openide.util.HelpCtx;

/**
 *
 * @author George Aristy (george.aristy@gmail.com)
 * @since 0.2.0
 */
public class DefaultViewOfIssueController implements IssueController {
  private final Issue issue;
  private final ViewOfIssue view;

  /**
   * 
   * @param issue 
   * @since 0.2.0
   */
  public DefaultViewOfIssueController(Issue issue) {
    this.issue = issue;
    this.view = new AsView(issue);
  }

  @Override
  public JComponent getComponent() {
    return this.view.asView();
  }

  @Override
  public HelpCtx getHelpCtx() {
    throw new UnsupportedOperationException("Not supported yet."); 
  }

  @Override
  public void opened() {
    throw new UnsupportedOperationException("Not supported yet."); 
  }

  @Override
  public void closed() {
    throw new UnsupportedOperationException("Not supported yet."); 
  }

  @Override
  public boolean saveChanges() {
    throw new UnsupportedOperationException("Not supported yet."); 
  }

  @Override
  public boolean discardUnsavedChanges() {
    throw new UnsupportedOperationException("Not supported yet."); 
  }

  @Override
  public boolean isChanged() {
    throw new UnsupportedOperationException("Not supported yet."); 
  }

  @Override
  public void addPropertyChangeListener(PropertyChangeListener listener) {
    throw new UnsupportedOperationException("Not supported yet."); 
  }

  @Override
  public void removePropertyChangeListener(PropertyChangeListener listener) {
    throw new UnsupportedOperationException("Not supported yet."); 
  }
}
