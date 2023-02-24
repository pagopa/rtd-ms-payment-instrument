package it.gov.pagopa.rtdmspaymentinstrument.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@ToString
public class WalletInfoDto {
  /**
   * The Old Id wallet.
   */
  String idWalletOld;


  /**
   * The new Payment Instrument Id.
   */
  String idPaymentInstrument;

}
