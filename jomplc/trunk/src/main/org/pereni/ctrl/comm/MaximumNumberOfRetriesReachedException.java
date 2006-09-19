/*
 * $Id: MaximumNumberOfRetriesReachedException.java,v 1.1 2005/07/05 19:15:45 remus Exp $
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
package org.pereni.ctrl.comm;

/**
 *
 * @author <a href="http://remus.pereni.org">Remus Pereni</a>
 * @version $Revision: 1.1 $ $Date: 2005/07/05 19:15:45 $
 */
public class MaximumNumberOfRetriesReachedException extends ComException {

    /**
     * 
     */
    private static final long serialVersionUID = -2319643300345404534L;
    
    protected Message comMessage;

    /**
     * 
     */
    public MaximumNumberOfRetriesReachedException() {
        super();
    }

    /**
     * @param message
     */
    public MaximumNumberOfRetriesReachedException(String message) {
        super(message);
    }

    
    /**
     * @param message
     */
    public MaximumNumberOfRetriesReachedException(String message, Message comMessage) {
        super(message);
        setComMessage(comMessage);
    }

    
    /**
     * @param message
     * @param cause
     */
    public MaximumNumberOfRetriesReachedException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param cause
     */
    public MaximumNumberOfRetriesReachedException(Throwable cause) {
        super(cause);
    }

    
    /**
     * @return Returns the comMessage.
     */
    public Message getComMessage() {
        return comMessage;
    }

    /**
     * @param comMessage The comMessage to set.
     */
    public void setComMessage(Message comMessage) {
        this.comMessage = comMessage;
    }


    
}
