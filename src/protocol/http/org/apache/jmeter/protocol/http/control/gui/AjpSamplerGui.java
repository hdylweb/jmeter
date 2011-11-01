/*
 *  Copyright 2005 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.jmeter.protocol.http.control.gui;

import org.apache.jmeter.protocol.http.control.gui.HttpTestSampleGui;
import org.apache.jmeter.protocol.http.sampler.AjpSampler;
import org.apache.jmeter.testelement.TestElement;

public class AjpSamplerGui extends HttpTestSampleGui {

    public AjpSamplerGui() {
        super();
    }

    public TestElement createTestElement() {
        AjpSampler sampler = new AjpSampler();
        modifyTestElement(sampler);
        return sampler;
    }

    public String getStaticLabel() {
        return "AJP/1.3 Sampler"; //$NON-NLS-1$
    }

    public String getDocAnchor() {// reuse documentation
        return super.getStaticLabel().replace(' ', '_'); //$NON-NLS-1$ //$NON-NLS-2$
    }

}