/*
 * $Id: DeviceRegister.java,v 1.3 2005/06/25 02:54:51 remus Exp $
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
package org.pereni.ctrl;

import java.util.List;

/**
 * @author <a href="http://remus.pereni.org>Remus Pereni</a>
 * 
 */
public interface DeviceRegister {

    void addDevice(Device device);
    
    Device lookupById(int id);
    
    Device lookupByMnemonic(String mnemonic);
    
    List<Device> getDevices();
}
