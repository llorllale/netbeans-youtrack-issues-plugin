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

package org.llorllale.netbeans.youtrack.issues.queries;

import java.time.Instant;
import java.util.function.Predicate;
import org.llorllale.youtrack.api.Issue;

/**
 *
 * @author George Aristy (george.aristy@gmail.com)
 * @since 0.1.0
 */
public class CreatedBefore implements Predicate<Issue> {
  private final Instant time;
  private final Predicate<Issue> next;

  /**
   * 
   * @param time
   * @param next 
   * @since 0.1.0
   */
  public CreatedBefore(Instant time, Predicate<Issue> next) {
    this.time = time;
    this.next = next;
  }

  @Override
  public boolean test(Issue issue) {
    if (issue.creationDate().isAfter(this.time)) {
      return false;
    }

    return this.next.test(issue);
  }
}
