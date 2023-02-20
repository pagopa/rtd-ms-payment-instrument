package it.gov.pagopa.rtdmspaymentinstrument.service;

import it.gov.pagopa.rtdmspaymentinstrument.model.MigrationPmEvent;

import java.time.LocalDateTime;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;


@SpringBootTest
@ExtendWith(OutputCaptureExtension.class)
public class PaymentManagerMigrationProcessorTest {

    @SpyBean
    private PaymentManagerMigrationProcessor paymentManagerMigrationProcessor;

    @Test
    void paymentManagerMigrationProcessing(CapturedOutput output) {
        new MigrationPmEvent();
        MigrationPmEvent migrationPmEvent = MigrationPmEvent.builder().idWalletOld("idwallettest")
                .hashPan("c3141e7c87d0bf7faac1ea3c79b2312279303b87781eedbb47ec8892f63df3e9")
                .bin("343434")
                .maskedPan("c3141e******************************************************f3e9")
                .expiryDate(LocalDateTime.of(2024, 2, 2, 10, 0, 0))
                .jiffyCellphoneNumber("+393336789987").build();
        paymentManagerMigrationProcessor.processing(migrationPmEvent);
        assertThat(output.getOut(), containsString("idwallettest"));

    }

}
