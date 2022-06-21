package katas.race_car_telemetry.refactored_telemetry_system;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TelemetryDiagnosticControlsImplTest
{
    
	@Test
    public void CheckTransmission_should_send_a_diagnostic_message_and_receive_a_status_message_response()
    {
        TelemetryClientImpl client = new TelemetryClientImpl();
        TelemetryDiagnosticControlsImpl controls = new TelemetryDiagnosticControlsImpl(client);
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

        TelemetryClientImpl client = Mockito.mock(TelemetryClientImpl.class);
        Mockito.doNothing().when(client).connect(Mockito.anyString());

        try {
            TelemetryDiagnosticControls controls = new TelemetryDiagnosticControlsImpl(client);
            controls.checkTransmission();
            fail("This should throw error as the the client is offline");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Unable to connect.");
        }
    }
}
