//$Header$
/*
 * Copyright 2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package org.apache.jorphan.gui;

import javax.swing.table.TableModel;

/**
 * @author Peter Lin
 *
 * This is a basic interface for TreeTableModel that extends TableModel.
 * It's pretty minimal and isn't as full featured at other implementations.
 */
public interface TreeTableModel extends TableModel {

    /**
     * The method is similar to getValueAt(int,int). Instead of int,
     * the row is an object.
     * @param node
     * @param col
     * @return
     */
    public Object getValueAt(Object node, int col);

    /**
     * the method is similar to isCellEditable(int,int). Instead of int,
     * the row is an object.
     * @param node
     * @param col
     * @return
     */
    public boolean isCellEditable(Object node, int col);

    /**
     * the method is similar to isCellEditable(int,int). Instead of int,
     * the row is an object.
     * @param val
     * @param node
     * @param column
     */
    public void setValueAt(Object val, Object node, int column);
}