/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.heos.internal.handler;

import org.eclipse.smarthome.core.library.types.OnOffType;
import org.openhab.binding.heos.handler.HeosBridgeHandler;
import org.openhab.binding.heos.internal.api.HeosFacade;

/**
 * @author Johannes Einig - Initial contribution
 *
 */
public class HeosChannelHandlerReboot extends HeosChannelHandler {

    /**
     * @param bridge
     * @param api
     */
    public HeosChannelHandlerReboot(String id, HeosBridgeHandler bridge, HeosFacade api) {
        super(id, bridge, api);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.openhab.binding.heos.internal.channelHandler.HeosChannelHandler#handleCommandPlayer(org.eclipse.smarthome.
     * core.types.Command)
     */
    @Override
    protected void handleCommandPlayer() {
        // not used on player

    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.openhab.binding.heos.internal.channelHandler.HeosChannelHandler#handleCommandGroup(org.eclipse.smarthome.core
     * .types.Command)
     */
    @Override
    protected void handleCommandGroup() {
        // Not used on group

    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.openhab.binding.heos.internal.channelHandler.HeosChannelHandler#handleCommandBridge(org.eclipse.smarthome.
     * core.types.Command)
     */
    @Override
    protected void handleCommandBridge() {
        if (command.equals(OnOffType.ON)) {
            api.reboot();
        }
    }
}
