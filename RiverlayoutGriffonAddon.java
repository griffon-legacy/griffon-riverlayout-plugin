/*
 * griffon-riverlayout: RiverLayout Griffon  plugin
 * Copyright 2010-2012 and beyond, Andres Almiray
 *
 * griffon-riverlayout is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation. griffon-riverlayout is also
 * available under typical commercial license terms - see
 * smartclient.com/license.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

import griffon.util.ApplicationHolder;
import groovy.swing.factory.LayoutFactory;
import se.datadosen.component.RiverLayout;
import org.codehaus.griffon.runtime.core.AbstractGriffonAddon;

/**
 * @author Andres Almiray
 */
public class RiverlayoutGriffonAddon extends AbstractGriffonAddon {
    public RiverlayoutGriffonAddon() {
        super(ApplicationHolder.getApplication());
        factories.put("riverLayout", new LayoutFactory(RiverLayout.class));
    }
}
