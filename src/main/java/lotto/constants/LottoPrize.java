package lotto.constants;

public enum LottoPrize {
  FIFTH(3, 5000),
  FOURTH(4, 50000),
  THIRD(5, 1500000),
  SECOND(5, 30000000),
  FIRST(6, 2000000000);

  private final int matchCount;
  private final int prizeAmount;

  LottoPrize(int matchCount, int prizeAmount) {
    this.matchCount = matchCount;
    this.prizeAmount = prizeAmount;
  }

  public int getPrizeAmount() {
    return prizeAmount;
  }

  public int getMatchCount() {
    return matchCount;
  }


}