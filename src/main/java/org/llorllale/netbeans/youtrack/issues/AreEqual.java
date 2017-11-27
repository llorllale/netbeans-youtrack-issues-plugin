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

import org.llorllale.youtrack.api.Issues.IssueSpec;

/**
 *
 * @author George Aristy (george.aristy@gmail.com)
 * @since 0.2.0
 */
public class AreEqual  {
  private final IssueSpec first;
  private final IssueSpec second;

  public AreEqual(IssueSpec first, IssueSpec second) {
    this.first = first;
    this.second = second;
  }

  public boolean isTrue() {
    return this.first.asFields().equals(this.second.asFields())
        && this.first.asNameValuePairs().equals(this.second.asNameValuePairs());
  }
}
