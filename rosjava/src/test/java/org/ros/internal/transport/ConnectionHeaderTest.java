/*
 * Copyright (C) 2011 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.ros.internal.transport;

import static org.junit.Assert.assertEquals;

import com.google.common.collect.Maps;

import org.jboss.netty.buffer.ChannelBuffer;
import org.junit.Test;

import java.util.Map;

/**
 * @author damonkohler@google.com (Damon Kohler)
 */
public class ConnectionHeaderTest {

  @Test
  public void testEncodeAndDecode() {
    final Map<String, String> header = Maps.newHashMap();
    header.put("foo", "bar");
    ChannelBuffer encoded = ConnectionHeader.encode(header);
    assertEquals(header, ConnectionHeader.decode(encoded));
  }

}