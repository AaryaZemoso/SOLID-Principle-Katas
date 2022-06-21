package katas.race_car_telemetry.telemetrysystem;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tddmicroexercises.refactored_telemetry_system.TelemetryClientImpl;

import static org.junit.jupiter.api.Assertions.*;

public class TelemetryDiagnosticControlsImplTest
{
    
	@Test
    public void CheckTransmission_should_send_a_diagnostic_message_and_receive_a_status_message_response()
    {
        TelemetryDiagnosticControls controls = new TelemetryDiagnosticControls();
        try {
            controls.checkTransmission();
            System.out.println(controls.getDiagnosticInfo());
            if (controls.getDiagnosticInfo().length() == 0) {
                fail("No message received");
            }
        } catch(Exception e) {
            fail("It should send diagnostic message and receive a status message");
        }
    }

    @Test
    public void CheckIfExceptionIsThrown_if_server_is_not_online() {
        // This is not possible because we cannot mock the client.
        // As the contructor will create of TelemetryDiagnosticControls will create a new TelemetryClient.

        // Hence, this fails everytime.

        TelemetryClientImpl client = Mockito.mock(TelemetryClientImpl.class);
        Mockito.when(client.getOnlineStatus()).thenReturn(false);

        try {
            TelemetryDiagnosticControls controls = new TelemetryDiagnosticControls();
            controls.checkTransmission();
            controls.getDiagnosticInfo();
            fail("This should throw error as the the client is offline");
        } catch (Exception e){

        }
    }
}
