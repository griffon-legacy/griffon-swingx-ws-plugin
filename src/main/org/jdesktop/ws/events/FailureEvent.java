/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jdesktop.ws.events;

import org.jdesktop.ws.BaseService;

import java.util.EventObject;

/**
 *
 * @author Richard
 */
public class FailureEvent extends EventObject {
    private Throwable th;
    public FailureEvent(BaseService source, Throwable th) {
        super(source);
        this.th = th;
    }
    
    public final Throwable getThrowable() { return th; }
}
