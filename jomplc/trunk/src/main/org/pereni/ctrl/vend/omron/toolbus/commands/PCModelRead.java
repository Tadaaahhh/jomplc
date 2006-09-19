/*
 * $Id: PCModelRead.java,v 1.2 2005/07/27 09:52:28 remus Exp $
 *
 *  Copyright [2005] [Remus Pereni http://remus.pereni.org]
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
package org.pereni.ctrl.vend.omron.toolbus.commands;

import org.pereni.ctrl.DataImp;
import org.pereni.ctrl.Device;

/**
 *
 * @author <a href="http://remus.pereni.org">Remus Pereni</a>
 * @version $Revision: 1.2 $ $Date: 2005/07/27 09:52:28 $
 */
public class PCModelRead extends ToolbusCommand {

    public static final String        NAME = "MM";
    public static final int             id = NAME.hashCode();
    public static final String DESCRIPTION = "PC Model Read";

    protected String modelCode = "";

    /**
     * 
     */
    public PCModelRead() {
        data = new DataImp(0);
    }
    
    public PCModelRead(Device device) {
        this();
        setTarget(device);
    }

    
    /* (non-Javadoc)
     * @see org.pereni.ctrl.Command#getCommandId()
     */
    public int getCommandId() {
        return id;
    }

    /* (non-Javadoc)
     * @see org.pereni.ctrl.Command#getCommandName()
     */
    public String getCommandName() {
        return NAME;
    }

    /* (non-Javadoc)
     * @see org.pereni.ctrl.comm.AbstractMessage#getCommandDescription()
     */
    @Override
    public String getCommandDescription() {
        return DESCRIPTION;
    }

    /**
     * @return Returns the modelCode.
     */
    public String getModelCode() {
        return modelCode;
    }

    /* (non-Javadoc)
     * @see org.pereni.ctrl.vend.omron.toolbus.commands.ToolbusCommand#parseData(int[])
     */
    @Override
    public void parseData() {
        super.parseData();
        if( getReply().getLength() == 2 ) {
            modelCode = "" + (char)getReply().toIntArray()[0] + (char)getReply().toIntArray()[1];
        }
    }

    
    
    
    
}
