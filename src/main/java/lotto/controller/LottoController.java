package lotto.controller;

import java.util.List;
import lotto.service.LottoService;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {

  private final InputView inputView;
  private final OutputView outputView;
  private final LottoService lottoService;

  public LottoController(InputView inputView, OutputView outputView, LottoService lottoService) {
    this.inputView = inputView;
    this.outputView = outputView;
    this.lottoService = lottoService;
  }

  public void run() {

    inputView.printPurchaseMessage();
    //validator 따로 구현
    String purchaseAmount = inputView.readPurchaseAmount();
    String winningNumbers = inputView.readWinningNumbers();
    String bonusNumber = inputView.readBonusNumber();

  }

}