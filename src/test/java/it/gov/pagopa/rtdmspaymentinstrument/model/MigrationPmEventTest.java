package it.gov.pagopa.rtdmspaymentinstrument.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MigrationPmEventTest {

    @Test
    void eventModelTest() {
        new MigrationPmEvent();
        MigrationPmEvent migrationPmEvent = MigrationPmEvent.builder().idWalletOld("idwallettest")
                .hashPan("c3141e7c87d0bf7faac1ea3c79b2312279303b87781eedbb47ec8892f63df3e9")
                .bin("343434")
                .maskedPan("c3141e******************************************************f3e9")
                .expiryDate(LocalDateTime.of(2024, 2, 2, 10, 0, 0))
                .jiffyCellphoneNumber("+393336789987").build();


        assertEquals("idwallettest", migrationPmEvent.getIdWalletOld());
        assertEquals("343434", migrationPmEvent.getBin());
        assertEquals(LocalDateTime.of(2024, 2, 2, 10, 0, 0), migrationPmEvent.getExpiryDate());
        assertEquals("c3141e7c87d0bf7faac1ea3c79b2312279303b87781eedbb47ec8892f63df3e9",
                migrationPmEvent.getHashPan());
        assertEquals("+393336789987", migrationPmEvent.getJiffyCellphoneNumber());
        assertEquals("c3141e******************************************************f3e9",
                migrationPmEvent.getMaskedPan());

    }

}
