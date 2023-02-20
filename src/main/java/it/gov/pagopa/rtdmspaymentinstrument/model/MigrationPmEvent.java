package it.gov.pagopa.rtdmspaymentinstrument.model;

import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * This class represents the object containing migration fileds from PM to PI.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MigrationPmEvent {

    /**
     * The Old Id wallet.
     */
    @NotNull
    @NotBlank
    String idWalletOld;

    /**
     * The pan hashed.
     */
    @NotNull
    @NotBlank
    @Pattern(regexp = "[a-zA-Z0-9]{64}",
            message = "HPAN length must be 64 alphanumeric char at max")
    String hashPan;

    /**
     * The card's Bin.
     */
    @NotNull
    @NotBlank
    @Pattern(regexp = "\\d{6}|\\d{8}", message = "BIN length must match \\d{6}|\\d{8}")
    String bin;

    /**
     * The pan masked with "*" char. Only first 6 and last 4 characters will be visible.
     */
    @NotNull
    @NotBlank
    @Pattern(regexp = "?<=.{6})*(?=.{4})",
            message = "Masked pan must match 6 characters + a masked part with * + last 4 characters")
    String maskedPan;

    /**
     * The card's expiration date.
     */
    @NotNull
    @NotBlank
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    OffsetDateTime expiryDate;

    /**
     * The phone number.
     */
    @NotNull
    @NotBlank
    String jiffyCellphoneNumber;

}
