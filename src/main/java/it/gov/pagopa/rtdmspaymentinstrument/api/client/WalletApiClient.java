package it.gov.pagopa.rtdmspaymentinstrument.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import it.gov.pagopa.rtdmspaymentinstrument.dto.WalletInfoDto;

@FeignClient(value="wallet", url="${wallet.service.url}")
public interface WalletApiClient {

  @PutMapping("/update/{id}")
  String updateWallet(@RequestBody WalletInfoDto walletInfoDto, @PathVariable(name = "id") String id);

}
