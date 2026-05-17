public class Time {
  private int totalSeconds;

  public int getTotalSeconds() {
    return totalSeconds;
  }

  // FIXME: пробел после if и отступы 2 пробела
  /*
  public void setTotalSeconds(int totalSeconds) {
      if(totalSeconds < 0) {
          this.totalSeconds = 0;
      } else {
          this.totalSeconds = totalSeconds;
      }
  }
  */

  // FIXTO:
  public void setTotalSeconds(int totalSeconds) {
    if (totalSeconds < 0) {
      this.totalSeconds = 0;
    } else {
      this.totalSeconds = totalSeconds;
    }
  }

  public Time() {
    this.totalSeconds = 0;
  }

  public Time(int totalSeconds) {
    this.setTotalSeconds(totalSeconds);
  }

  public Time(Time time) {
    this.setTotalSeconds(time.getTotalSeconds());
  }

  @Override
  public String toString() {
    return String.format("%d:%02d:%02d", 
        totalSeconds % 86400 / 3600, 
        totalSeconds % 3600 / 60, 
        totalSeconds % 60);
  }
}