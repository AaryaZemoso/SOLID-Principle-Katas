package katas.race_car_telemetry.refactored_telemetry_system;

public interface TelemetryClient {

    String DIAGNOSTIC_MESSAGE = "AT#UD";
    boolean getOnlineStatus();
    void connect(String conn);
    void disconnect();
    void send(String message);
    String receive();
}
