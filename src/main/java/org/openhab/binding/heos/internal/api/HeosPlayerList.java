/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.heos.internal.api;

import java.util.HashMap;

import org.openhab.binding.heos.internal.resources.HeosPlayer;

/**
 * The {@link HeosPlayerList} is a result set of player discovery by the heos system.
 *
 * @author Christian Güdel - Initial contribution
 *
 */
public class HeosPlayerList extends HeosThingBaseList<HeosPlayer> {

    public HeosPlayerList(HashMap<String, HeosPlayer> currentItems, HashMap<String, HeosPlayer> previousItems) {
        super(currentItems, previousItems);
    }

}
