package org.example.USBDevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
