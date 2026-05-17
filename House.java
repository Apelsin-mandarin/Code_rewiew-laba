public class House {
  private final int floor;

  public int getFloor() {
    return floor;
  }

  // FIXME: отступы и использование фигурных скобок для всех блоков
  /*
  public House(int floor) {
      if(floor < 0 || floor > 164)
          this.floor = 1;
      else
          this.floor = floor;
  }
  */

  // FIXTO:
  public House(int floor) {
    if (floor < 0 || floor > 164) {
      this.floor = 1;
    } else {
      this.floor = floor;
    }
  }

  public House(House house) {
    this.floor = house.getFloor();
  }

  @Override
  public String toString() {
    if (floor % 100 >= 11 && floor % 100 <= 14) {
      return String.format("Дом с %d %s", floor, "этажами");
    }
    if (floor % 10 == 1) {
      return String.format("Дом с %d %s", floor, "этажом");
    }

    return String.format("Дом с %d %s", floor, "этажами");
  }
}