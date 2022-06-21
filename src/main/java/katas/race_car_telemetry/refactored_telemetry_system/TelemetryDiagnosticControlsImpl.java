package katas.race_car_telemetry.refactored_telemetry_system;

public class TelemetryDiagnosticControlsImpl implements TelemetryDiagnosticControls
{
    private final String DiagnosticChannelConnectionString = "*111#";
    private final TelemetryClient telemetryClient;
    private String diagnosticInfo = "";

    public TelemetryDiagnosticControlsImpl()
    {
        telemetryClient = new TelemetryClientImpl();
    }

    public TelemetryDiagnosticControlsImpl(TelemetryClient client) {
        this.telemetryClient = client;
    }

    public String getDiagnosticInfo(){
        return diagnosticInfo;
    }

    public void setDiagnosticInfo(String diagnosticInfo){
        this.diagnosticInfo = diagnosticInfo;
    }

    public void checkTransmission() throws Exception
    {
        telemetryClient.disconnect();

        int retryLeft = 3;
        while (telemetryClient.getOnlineStatus() == false && retryLeft > 0)
        {
            telemetryClient.connect(DiagnosticChannelConnectionString);
            retryLeft -= 1;
        }

        if(telemetryClient.getOnlineStatus() == false)
        {
            throw new Exception("Unable to connect.");
        }

        telemetryClient.send(TelemetryClient.DIAGNOSTIC_MESSAGE);
        this.setDiagnosticInfo(telemetryClient.receive());
    }
}
