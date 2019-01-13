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

import org.openhab.binding.heos.internal.resources.HeosGroup;

/**
 * The {@link HeosGroupList} is a result set of group discovery by the heos system.
 *
 * @author Christian Güdel - Initial contribution
 *
 */
public class HeosGroupList extends HeosThingBaseList<HeosGroup> {

    public HeosGroupList(HashMap<String, HeosGroup> currentItems, HashMap<String, HeosGroup> previousItems) {
        super(currentItems, previousItems);
    }

}
