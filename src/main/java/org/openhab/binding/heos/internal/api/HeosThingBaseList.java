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

/**
 * The {@link HeosThingBaseList} is the base class for discovery results for players and groups.
 *
 * @author Christian Güdel - Initial contribution
 *
 */
public abstract class HeosThingBaseList<T> {

    private final HashMap<String, T> currentItems;
    private final HashMap<String, T> previousItems;

    protected HeosThingBaseList(HashMap<String, T> currentItems, HashMap<String, T> previousItems) {
        this.currentItems = currentItems;

        HashMap<String, T> previousItemsSanitized = previousItems;
        if (previousItemsSanitized == null) {
            previousItemsSanitized = new HashMap<String, T>();
        }

        this.previousItems = previousItemsSanitized;
    }

    public HashMap<String, T> getCurrent() {
        return this.currentItems;
    }

    public HashMap<String, T> getRemovedItems() {
        HashMap<String, T> removedItems = new HashMap<>();

        for (String key : previousItems.keySet()) {
            if (!currentItems.containsKey(key)) {
                removedItems.put(key, previousItems.get(key));
            }
        }

        return removedItems;
    }
}
