package it.gov.pagopa.rtdmspaymentinstrument.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import it.gov.pagopa.rtdmspaymentinstrument.dto.WalletInfoDto;

@RequestMapping("wallet")
public interface WalletApi {

  @PutMapping("/update/{id}")
  String updateWallet(@RequestBody WalletInfoDto walletInfoDto, @PathVariable String id);

}
