/*
 * Copyright © 2022 Cask Data, Inc.
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
package io.cdap.plugin.sfmc.source;

import org.apache.hadoop.conf.Configuration;
import org.junit.Assert;
import org.junit.Test;

public class MarketingCloudJobConfigurationTest {

  @Test
  public void testServiceNowJobConfiguration() {
    Configuration configuration = new Configuration();
    Assert.assertSame(configuration, (new MarketingCloudJobConfiguration(configuration)).getConf());
  }

  @Test
  public void testPluginConf() {
    Configuration configuration = new Configuration();
    MarketingCloudJobConfiguration marketingCloudJobConfiguration = new MarketingCloudJobConfiguration(configuration);
    marketingCloudJobConfiguration.getPluginConf();
  }

  @Test
  public void testPluginInfo() {
    Configuration configuration = new Configuration();
    MarketingCloudJobConfiguration marketingCloudJobConfiguration = new MarketingCloudJobConfiguration(configuration);
    marketingCloudJobConfiguration.getTableInfos();
  }


}