package it.gov.pagopa.rtdmspaymentinstrument.model;

import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
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
  @JsonProperty(value = "idWalletOld", required = true)
  private String idWalletOld;

  /**
   * The pan hashed.
   */
  @NotNull
  @NotBlank
  @Pattern(regexp = "[a-zA-Z0-9]{64}", message = "HPAN length must be 64 alphanumeric char at max")
  @JsonProperty(value = "hashPan", required = true)
  private String hashPan;

  /**
   * The card's Bin.
   */
  @NotNull
  @NotBlank
  @Pattern(regexp = "\\d{6}|\\d{8}", message = "BIN length must match \\d{6}|\\d{8}")
  @JsonProperty(value = "bin", required = true)
  private String bin;

  /**
   * The pan masked with "*" char. Only first 6 and last 4 characters will be visible.
   */
  @NotNull
  @NotBlank
  @Pattern(regexp = "?<=.{6})*(?=.{4})",
      message = "Masked pan must match 6 characters + a masked part with * + last 4 characters")
  @JsonProperty(value = "maskedPan", required = true)
  private String maskedPan;

  /**
   * The card's expiration date.
   */
  @NotNull
  @NotBlank
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  @JsonSerialize(using = LocalDateTimeSerializer.class)
  @JsonDeserialize(using = LocalDateTimeDeserializer.class)
  @JsonProperty(value = "expiryDate", required = true)
  private LocalDateTime expiryDate;

  /**
   * The phone number.
   */
  @NotNull
  @NotBlank
  @JsonProperty(value = "jiffyCellphoneNumber", required = true)
  private String jiffyCellphoneNumber;

}
