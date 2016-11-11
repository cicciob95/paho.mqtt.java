/*******************************************************************************
 * Copyright (c) 2016 IBM Corp.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution. 
 *
 * The Eclipse Public License is available at 
 *    http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at 
 *   http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 * 	  Dave Locke - Original MQTTv3 implementation
 *    James Sutton - Initial MQTTv5 implementation
 */
package org.eclipse.paho.client.mqttv5.packet;

import org.eclipse.paho.client.mqttv5.util.MqttException;

public class MqttConnack extends MqttWireMessage {

	@Override
	protected byte getMessageInfo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected byte[] getVariableHeader() throws MqttException {
		// TODO Auto-generated method stub
		return null;
	}

}