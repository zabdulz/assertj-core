/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2018 the original author or authors.
 */
package org.assertj.core.error;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.error.ShouldEndWithPath.PATH_SHOULD_END_WITH;
import static org.assertj.core.error.ShouldEndWithPath.shouldEndWith;
import static org.mockito.Mockito.mock;

import java.nio.file.Path;

import org.assertj.core.internal.TestDescription;
import org.assertj.core.presentation.StandardRepresentation;
import org.junit.jupiter.api.Test;

public final class ShouldEndWithPath_create_Test {

  @Test
  public void should_create_error_message() {
	final Path actual = mock(Path.class);
	final Path other = mock(Path.class);
	String actualMessage = shouldEndWith(actual, other).create(new TestDescription("Test"),
	                                                           new StandardRepresentation());
	assertThat(actualMessage).isEqualTo(String.format("[Test] " + PATH_SHOULD_END_WITH, actual, other));
  }

}
