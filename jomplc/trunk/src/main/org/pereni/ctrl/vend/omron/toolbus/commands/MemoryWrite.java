/*
 *
 *  Copyright [2006] [Remus Pereni http://remus.pereni.org]
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

import java.text.DecimalFormat;

import org.pereni.ctrl.DataImp;
import org.pereni.ctrl.utils.OmronUtils;


/**
 *
 * @author JanCarel
 * @version 1.0
 */
public abstract class MemoryWrite extends ToolbusCommand {
  
  protected int address = 0;
  protected int[] value;
  public static final int HEX = 1;
  public static final int BCD = 2;
  private int mode = HEX;
  public static final DecimalFormat FORMAT = new DecimalFormat("0000");
  
  
  
  /**
   * @return Returns the start address.
   */
  public int getAddress() {
    return address;
  }
  
  
  /**
   * @return Returns the length.
   */
  public int getLength() {
    if(value != null){
      return value.length;
    }
    return 0;
  }
  
  /**
   * @param address the start address to be set
   * @param val The values to be set.
   * Default is HEX values
   */
  public void setValue(int address, int[] val) {
    setValue(address, val, HEX);
  }
  
  /**
   * @param address the start address to be set
   * @param val The values to be set.
   * @param valueMode whether values are in HEX or BCD
   */
  public void setValue(int address, int[] val, int valueMode) {
    setMode(valueMode);
    OmronUtils utils = new OmronUtils();
    this.address = address;
    this.value = val;
    StringBuffer b = new StringBuffer();
    for(int i=0; i< val.length ; i++){
      if(mode == BCD){
        b.append(FORMAT.format(val[i]));
      }else{
        b.append(utils.getFormatedHex(val[i]));
      }
    }
    ((DataImp)getData()).set(utils.getFormatedHex(address)+ b.toString());
  }
  
  /**
   *@param m the mode (BCD or HEX) to be set for the values
   */
  public void setMode(int m){
    if(m == HEX || m == BCD){
      this.mode = m;
    }
  }
  
  /**
   * returns the mode BCD or HEX for the values
   */
  public int getMode(){
    return mode;
  }
  
}
