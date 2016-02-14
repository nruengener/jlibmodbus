package com.invertor.modbus.data.events;

/**
 * Copyright (c) 2015-2016 JSC Invertor
 * [http://www.sbp-invertor.ru]
 * <p/>
 * This file is part of JLibModbus.
 * <p/>
 * JLibModbus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * <p/>
 * Authors: Vladislav Y. Kochedykov, software engineer.
 * email: vladislav.kochedykov@gmail.com
 */
public class ModbusEventSend extends ModbusEvent {
    final static private int BIT_READ_EXCEPTION_SENT = 0;
    final static private int BIT_SLAVE_ABORT_EXCEPTION_SENT = 1;
    final static private int BIT_SLAVE_BUSY_EXCEPTION_SENT = 2;
    final static private int BIT_SLAVE_PROGRAM_NAK_EXCEPTION_SENT = 3;
    final static private int BIT_WRITE_TIMEOUT_ERROR_OCCURRED = 4;
    final static private int BIT_CURRENTLY_IN_LISTEN_ONLY_MODE = 5;
    final static private int BIT_EVENT_TYPE = 6;

    private ModbusEventSend(int bit) {
        setBit(BIT_EVENT_TYPE);
        setBit(bit);
    }

    static public ModbusEventSend createExceptionSentRead() {
        return new ModbusEventSend(BIT_READ_EXCEPTION_SENT);
    }

    static public ModbusEventSend createExceptionSlaveSentAbort() {
        return new ModbusEventSend(BIT_SLAVE_ABORT_EXCEPTION_SENT);
    }

    static public ModbusEventSend createExceptionSlaveSentBusy() {
        return new ModbusEventSend(BIT_SLAVE_BUSY_EXCEPTION_SENT);
    }

    static public ModbusEventSend createExceptionSentSlaveProgramNAK() {
        return new ModbusEventSend(BIT_SLAVE_PROGRAM_NAK_EXCEPTION_SENT);
    }

    static public ModbusEventSend createWriteTimeoutErrorOccurred() {
        return new ModbusEventSend(BIT_WRITE_TIMEOUT_ERROR_OCCURRED);
    }

    static public ModbusEventSend createCurrentlyInListenOnlyMode() {
        return new ModbusEventSend(BIT_CURRENTLY_IN_LISTEN_ONLY_MODE);
    }

    public boolean isCurrentlyInListenOnlyMode() {
        return isBitSet(BIT_CURRENTLY_IN_LISTEN_ONLY_MODE);
    }

    public boolean isExceptionSentRead() {
        return isBitSet(BIT_READ_EXCEPTION_SENT);
    }

    public boolean isExceptionSlaveSentAbort() {
        return isBitSet(BIT_SLAVE_ABORT_EXCEPTION_SENT);
    }

    public boolean isExceptionSlaveSentBusy() {
        return isBitSet(BIT_SLAVE_BUSY_EXCEPTION_SENT);
    }

    public boolean isExceptionSentSlaveProgramNAK() {
        return isBitSet(BIT_SLAVE_PROGRAM_NAK_EXCEPTION_SENT);
    }

    public boolean isWriteTimeoutErrorOccurred() {
        return isBitSet(BIT_WRITE_TIMEOUT_ERROR_OCCURRED);
    }
}