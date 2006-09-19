/*
 * $Id: ToolbusStatusRegister.java,v 1.2 2005/07/04 12:28:52 remus Exp $
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
package org.pereni.ctrl.vend.omron.toolbus;

import java.util.ArrayList;

import org.pereni.ctrl.comm.StatusCode;
import org.pereni.ctrl.comm.StatusCodeImp;
import org.pereni.ctrl.comm.StatusCodeUnknown;


/**
 * A register for the status codes of the toolbus protocol, to ease
 * the creation/maintenance and life cycle of the status codes.
 * 
 * @author <a href="http://remus.pereni.org">Remus Pereni</a>
 * @version $Revision: 1.2 $ $Date: 2005/07/04 12:28:52 $
 */
public final class ToolbusStatusRegister {
   
    protected static ArrayList<StatusCode> statusCodeStore = new ArrayList<StatusCode>();
    protected static ArrayList<String>           codeStore = new ArrayList<String>();
    protected static ArrayList<Integer>            idStore = new ArrayList<Integer>();
    
    /**
     * Command Completed Normally
     */
    public static final StatusCode COMPLETE_NORMALY = new StatusCodeImp(0, "00", StatusCode.INFO, "Command Completed Normally");   
    
    /**
     * Execution was not possible because the PLC is in RUN mode. Change the PC mode 
     */
    public static final StatusCode ERROR_PLC_IN_RUN_MODE = new StatusCodeImp(1, "01", StatusCode.ERROR, "Execution was not possible because the PLC is in RUN mode. Change the PC mode");
        
    /**
     * Execution was not possible because the PLC is in MONITOR mode. Change the PC mode 
     */
    public static final StatusCode ERROR_PLC_IN_MONITOR_MODE = new StatusCodeImp(2, "02", StatusCode.ERROR, "Execution was not possible because the PLC is in MONITOR mode. Change the PC mode");
        
    /**
     * Execution was not possible because the PROM is mounted, Change the unit to RAM or EEPROM 
     */
    public static final StatusCode ERROR_PROM_MOUNTED = new StatusCodeImp(3, "03", StatusCode.ERROR, "Execution was not possible because the PROM is mounted, Change the unit to RAM or EEPROM");
        
    /**
     * Address Overflow (data overflow). Check the programm. 
     */
    public static final StatusCode ERROR_ADDRESS_OVERFLOW = new StatusCodeImp(4, "04", StatusCode.ERROR, "Address Overflow (data overflow). Check the programm.");
        
    /**
     * Execution was not possible because the PLC is in PROGRAM mode. Change the PC mode 
     */
    public static final StatusCode ERROR_PLC_IN_PROGRAM_MODE = new StatusCodeImp(11, "0B", StatusCode.ERROR, "Execution was not possible because the PLC is in PROGRAM mode. Change the PC mode");
        
    /**
     * Execution was not possible because the PLC is in DEBUG mode. Change the PC mode 
     */
    public static final StatusCode ERROR_PLC_IN_DEBUG_MODE = new StatusCodeImp(12, "0C", StatusCode.ERROR, "Execution was not possible because the PLC is in DEBUG mode. Change the PC mode");    
    
    /**
     * Execution was not possible because the Host Link Unit's keyswitch is set to LOCAL mode or because the command
     * was sent to a C200H CPU that was on standby. Change the mode or send the command to the active CPU. 
     */
    public static final StatusCode ERROR_KEYSWITCH_LOCAL = new StatusCodeImp(13, "0D", StatusCode.ERROR, "Execution was not possible because the Host Link Unit's keyswitch is set to LOCAL mode or " +
            " because the command was sent to a C200H CPU that was on standby. Change the mode or send the command to the active CPU.");    

    /**
     * Parity Error
     */
    public static final StatusCode ERROR_PARITY = new StatusCodeImp(16, "10", StatusCode.ERROR , "Parity Error");

    /**
     * Framing error (stop bits not detected)
     */
    public static final StatusCode ERROR_FRAMING = new StatusCodeImp(17, "11", StatusCode.ERROR , "Framing error (stop bits not detected)");
    
    /**
     * Overrun (the next command was received too son
     */
    public static final StatusCode ERROR_OVERRUN = new StatusCodeImp(18, "12", StatusCode.ERROR , "Overrun (the next command was received too son)");
        
    /**
     * FCS Error (checksum error)
     */
    public static final StatusCode ERROR_CHECKSUM = new StatusCodeImp(19, "13", StatusCode.ERROR , "FCS Error (checksum error)");

    /**
     * Command format error
     */
    public static final StatusCode ERROR_COMMAND_FORMAT = new StatusCodeImp(20, "14", StatusCode.ERROR , "Command format error");

    /**
     * An incorect data area designation was made for Read or Write
     */
    public static final StatusCode ERROR_INCORECT_ADDRESS = new StatusCodeImp(21, "15", StatusCode.ERROR , "An incorect data area designation was made for Read or Write");

    /**
     * Instruction not found.
     */
    public static final StatusCode ERROR_INSTRUCTION_NOTFOUND = new StatusCodeImp(22, "16", StatusCode.ERROR , "Instruction not found.");

    /**
     * Frame length error (maximum length excedeed).
     */
    public static final StatusCode ERROR_LENGTH_EXCEEDED = new StatusCodeImp(24, "18", StatusCode.ERROR , "Frame length error (maximum length excedeed).");

    /**
     * Execution was not possible because of an unexpected error clear, memory error, EEPROM write disabled, etc. 
     */
    public static final StatusCode ERROR_EXEC_NOTPOSSIBLE = new StatusCodeImp(25, "19", StatusCode.ERROR , "Execution was not possible because of an unexpected error clear, memory error, EEPROM write disabled, etc.");

    /**
     * I/O Table generation was not possible (Unrecognized Remote I/O Unit, word overflow, duplicated word allocation). 
     */
    public static final StatusCode ERROR_IO_PROBLEM = new StatusCodeImp(32, "20", StatusCode.ERROR , "I/O Table generation was not possible (Unrecognized Remote I/O Unit, word overflow, duplicated word allocation).");
    
    /**
     * An error occured in the PC's CPU 
     */
    public static final StatusCode ERROR_PC_CPU = new StatusCodeImp(33, "21", StatusCode.ERROR , "An error occured in the PC's CPU");
    
    /**
     * The specified Memory Unit does not exists 
     */
    public static final StatusCode ERROR_MEMMORY_NOTEXIST = new StatusCodeImp(34, "22", StatusCode.ERROR , "The specified Memory Unit does not exists");

    /**
     * The specified Memory Unit is write protected 
     */
    public static final StatusCode ERROR_MEMMORY_PROTECTED = new StatusCodeImp(35, "23", StatusCode.ERROR , "The specified Memory Unit is write protected");

    /**
     * Aborted due to parity error in transmit data 
     */
    public static final StatusCode ERROR_ABORT_PARITY = new StatusCodeImp(160, "A0", StatusCode.ERROR , "Aborted due to parity error in transmit data ");

    /**
     * Aborted due to framing error in transmit data 
     */
    public static final StatusCode ERROR_ABORT_FRAMING = new StatusCodeImp(161, "A1", StatusCode.ERROR , "Aborted due to framing error in transmit data ");

    /**
     * Aborted due to overrun error in transmit data 
     */
    public static final StatusCode ERROR_ABORT_OVERRUN = new StatusCodeImp(162, "A2", StatusCode.ERROR , "Aborted due to overrun error in transmit data ");

    /**
     * Aborted due to FCS (checksum) error in transmit data 
     */
    public static final StatusCode ERROR_ABORT_CHECKSUM = new StatusCodeImp(163, "A3", StatusCode.ERROR , "Aborted due to FCS (checksum) error in transmit data");
    
    /**
     * Aborted due to format error in transmit data 
     */
    public static final StatusCode ERROR_ABORT_FORMAT = new StatusCodeImp(164, "A4", StatusCode.ERROR , "Aborted due to format error in transmit data");
    
    /**
     * Aborted due to entry number data error in transmit data 
     */
    public static final StatusCode ERROR_ABORT_ENTRY_NUMBER = new StatusCodeImp(165, "A5", StatusCode.ERROR , "Aborted due to entry number data error in transmit data");
    
    /**
     * Aborted due to frame length error in transmit data 
     */
    public static final StatusCode ERROR_ABORT_FRAME_LENGTH = new StatusCodeImp(168, "A8", StatusCode.ERROR , "Aborted due to frame length error in transmit data ");
    
    /**
     * Not Executable because the program area is not 16Kbytes. 
     */
    public static final StatusCode ERROR_ABORT_NOTEXECUTABLE = new StatusCodeImp(176, "B0", StatusCode.ERROR , "Not Executable because the program area is not 16Kbytes.");

    static {
        add(COMPLETE_NORMALY);
        add(ERROR_PLC_IN_RUN_MODE);
        add(ERROR_PLC_IN_MONITOR_MODE);
        add(ERROR_PROM_MOUNTED);
        add(ERROR_ADDRESS_OVERFLOW);
        add(ERROR_PLC_IN_PROGRAM_MODE);
        add(ERROR_PLC_IN_DEBUG_MODE);
        add(ERROR_KEYSWITCH_LOCAL);
        add(ERROR_PARITY);
        add(ERROR_FRAMING);
        add(ERROR_OVERRUN);                        
        add(ERROR_CHECKSUM);
        add(ERROR_COMMAND_FORMAT);
        add(ERROR_INCORECT_ADDRESS);
        add(ERROR_INSTRUCTION_NOTFOUND);
        add(ERROR_LENGTH_EXCEEDED);
        add(ERROR_EXEC_NOTPOSSIBLE);
        add(ERROR_IO_PROBLEM);
        add(ERROR_PC_CPU);
        add(ERROR_MEMMORY_NOTEXIST);
        add(ERROR_MEMMORY_PROTECTED);
        add(ERROR_ABORT_PARITY);
        add(ERROR_ABORT_FRAMING);
        add(ERROR_ABORT_OVERRUN);
        add(ERROR_ABORT_CHECKSUM);
        add(ERROR_ABORT_FORMAT);
        add(ERROR_ABORT_ENTRY_NUMBER);
        add(ERROR_ABORT_FRAME_LENGTH);
        add(ERROR_ABORT_NOTEXECUTABLE);
    }
    
    
    /**
     * Adds an status code to the register;
     * @param code The status code to be added;
     */
    protected static void add(StatusCode code) {
        if( code == null || code.getCode() == null ) throw new IllegalStateException("Can not add null status code to the register");
        
        idStore.add(code.getId());
        codeStore.add(code.getCode());
        statusCodeStore.add(code);
    }
    
    
    public static StatusCode get(int id) {
        int idx = idStore.indexOf(id); 
        if( idx != -1 ) return statusCodeStore.get(idx);
        
        return StatusCodeUnknown.getInstance();
    }
    
    
    public static StatusCode get(String code) {
        int idx = codeStore.indexOf(code); 
        if( idx != -1 ) return statusCodeStore.get(idx);
        
        return StatusCodeUnknown.getInstance();
    }       

}
