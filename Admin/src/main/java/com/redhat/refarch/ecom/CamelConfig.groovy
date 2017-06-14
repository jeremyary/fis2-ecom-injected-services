/*
 * Copyright 2005-2017 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License") you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.redhat.refarch.ecom

import org.apache.camel.CamelContext
import org.apache.camel.spring.boot.CamelContextConfiguration
import org.apache.camel.spring.javaconfig.CamelConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

/***
 * @author jary@redhat.com
 */
@Configuration
@ComponentScan("com.redhat.refarch.ecom.admin")
class CamelConfig extends CamelConfiguration {

    @Bean
    CamelContextConfiguration contextConfiguration() {
        return new CamelContextConfiguration() {

            @Override
            void beforeApplicationStart(CamelContext context) {
                context.setTracing(true)
            }

            @Override
            void afterApplicationStart(CamelContext context) {}
        }
    }
}
