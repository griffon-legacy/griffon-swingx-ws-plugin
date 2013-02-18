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
public class AbortEvent extends EventObject {
    public AbortEvent(BaseService source) {
        super(source);
    }
}
