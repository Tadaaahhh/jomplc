/*
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
package org.pereni.ctrl.comm;

import org.apache.commons.logging.Log;
import org.pereni.ctrl.CommandRegister;


/**
 * @author Remus
 *
 */
public interface ProtocolHandler {

    String getProtocolName();
    
    void setLog(Log log);
    
    Log getLog();
        
    void setComControl(ComControl comControl);
    
    ComControl getComControl();
    
    Message write(Message message) throws ComException;
    
    Message read(Message originalCommand) throws ComException;
    
    CommandRegister getCommandRegister();
}
