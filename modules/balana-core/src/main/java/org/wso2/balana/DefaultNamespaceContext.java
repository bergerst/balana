/*
*  Copyright (c) WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.wso2.balana;

import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * implementation of <code>NamespaceContext</code>
 */
public class DefaultNamespaceContext implements NamespaceContext {

    Map<String, String> nsMap = new HashMap<String, String>();

    public DefaultNamespaceContext(Map<String, String> nsMap) {
        this.nsMap = nsMap;
    }

    @Override
    public String getNamespaceURI(String prefix) {

        if(prefix != null){
            return nsMap.get(prefix);
        }
        return XMLConstants.NULL_NS_URI;

    }

    @Override
    public String getPrefix(String namespaceURI) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<?> getPrefixes(String namespaceURI) {
        throw new UnsupportedOperationException();
    }

}
