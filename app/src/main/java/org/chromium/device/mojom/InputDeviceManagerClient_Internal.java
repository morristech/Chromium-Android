
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/interfaces/input_service.mojom
//

package org.chromium.device.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class InputDeviceManagerClient_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<InputDeviceManagerClient, InputDeviceManagerClient.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<InputDeviceManagerClient, InputDeviceManagerClient.Proxy>() {
    
        @Override
        public String getName() {
            return "device::mojom::InputDeviceManagerClient";
        }
    
        @Override
        public int getVersion() {
          return 0;
        }
    
        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }
    
        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, InputDeviceManagerClient impl) {
            return new Stub(core, impl);
        }
    
        @Override
        public InputDeviceManagerClient[] buildArray(int size) {
          return new InputDeviceManagerClient[size];
        }
    };


    private static final int INPUT_DEVICE_ADDED_ORDINAL = 0;

    private static final int INPUT_DEVICE_REMOVED_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements InputDeviceManagerClient.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void inputDeviceAdded(
InputDeviceInfo deviceInfo) {

            InputDeviceManagerClientInputDeviceAddedParams _message = new InputDeviceManagerClientInputDeviceAddedParams();

            _message.deviceInfo = deviceInfo;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(INPUT_DEVICE_ADDED_ORDINAL)));

        }


        @Override
        public void inputDeviceRemoved(
String id) {

            InputDeviceManagerClientInputDeviceRemovedParams _message = new InputDeviceManagerClientInputDeviceRemovedParams();

            _message.id = id;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(INPUT_DEVICE_REMOVED_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<InputDeviceManagerClient> {

        Stub(org.chromium.mojo.system.Core core, InputDeviceManagerClient impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {
            
                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                InputDeviceManagerClient_Internal.MANAGER, messageWithHeader);
            
            
            
            
            
                    case INPUT_DEVICE_ADDED_ORDINAL: {
            
                        InputDeviceManagerClientInputDeviceAddedParams data =
                                InputDeviceManagerClientInputDeviceAddedParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().inputDeviceAdded(data.deviceInfo);
                        return true;
                    }
            
            
            
            
            
                    case INPUT_DEVICE_REMOVED_ORDINAL: {
            
                        InputDeviceManagerClientInputDeviceRemovedParams data =
                                InputDeviceManagerClientInputDeviceRemovedParams.deserialize(messageWithHeader.getPayload());
            
                        getImpl().inputDeviceRemoved(data.id);
                        return true;
                    }
            
            
                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {
            
                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), InputDeviceManagerClient_Internal.MANAGER, messageWithHeader, receiver);
            
            
            
            
            
            
                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class InputDeviceManagerClientInputDeviceAddedParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public InputDeviceInfo deviceInfo;
    
        private InputDeviceManagerClientInputDeviceAddedParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public InputDeviceManagerClientInputDeviceAddedParams() {
            this(0);
        }
    
        public static InputDeviceManagerClientInputDeviceAddedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static InputDeviceManagerClientInputDeviceAddedParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static InputDeviceManagerClientInputDeviceAddedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            InputDeviceManagerClientInputDeviceAddedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new InputDeviceManagerClientInputDeviceAddedParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.deviceInfo = InputDeviceInfo.decode(decoder1);
                }
            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }
    
        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.deviceInfo, 8, false);
        }
    
        /**
         * @see Object#equals(Object)
         */
        @Override
        public boolean equals(Object object) {
            if (object == this)
                return true;
            if (object == null)
                return false;
            if (getClass() != object.getClass())
                return false;
            InputDeviceManagerClientInputDeviceAddedParams other = (InputDeviceManagerClientInputDeviceAddedParams) object;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.deviceInfo, other.deviceInfo))
                return false;
            return true;
        }
    
        /**
         * @see Object#hashCode()
         */
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = prime + getClass().hashCode();
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.deviceInfo);
            return result;
        }
    }



    
    static final class InputDeviceManagerClientInputDeviceRemovedParams extends org.chromium.mojo.bindings.Struct {
    
        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public String id;
    
        private InputDeviceManagerClientInputDeviceRemovedParams(int version) {
            super(STRUCT_SIZE, version);
        }
    
        public InputDeviceManagerClientInputDeviceRemovedParams() {
            this(0);
        }
    
        public static InputDeviceManagerClientInputDeviceRemovedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }
    
        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static InputDeviceManagerClientInputDeviceRemovedParams deserialize(java.nio.ByteBuffer data) {
            if (data == null)
                return null;
    
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }
    
        @SuppressWarnings("unchecked")
        public static InputDeviceManagerClientInputDeviceRemovedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            InputDeviceManagerClientInputDeviceRemovedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                result = new InputDeviceManagerClientInputDeviceRemovedParams(mainDataHeader.elementsOrVersion);
                if (mainDataHeader.elementsOrVersion >= 0) {
                    
                    result.id = decoder0.readString(8, false);
                }
            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }
    
        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.id, 8, false);
        }
    
        /**
         * @see Object#equals(Object)
         */
        @Override
        public boolean equals(Object object) {
            if (object == this)
                return true;
            if (object == null)
                return false;
            if (getClass() != object.getClass())
                return false;
            InputDeviceManagerClientInputDeviceRemovedParams other = (InputDeviceManagerClientInputDeviceRemovedParams) object;
            if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.id, other.id))
                return false;
            return true;
        }
    
        /**
         * @see Object#hashCode()
         */
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = prime + getClass().hashCode();
            result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.id);
            return result;
        }
    }



}