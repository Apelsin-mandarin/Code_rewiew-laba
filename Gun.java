
public class Gun {

  private int ammo;

  // FIXME: отступ 2 пробела
  /*
  public int getAmmo() {
      return ammo;
  }
  */

  // FIXTO: 
  public int getAmmo() {
    return ammo;
  }

  // FIXME:  отступ 2 пробела
  /*
  public void setAmmo(int ammo) {
      if(ammo < 0){
          this.ammo = 5;
      } else if (ammo > 12) {
          this.ammo = 12;
      }
      this.ammo = ammo;
  }
  */

  // FIXTO:
  public void setAmmo(int ammo) {
    if (ammo < 0) {
      this.ammo = 5;
    } else if (ammo > 12) {
      this.ammo = 12;
    }
    this.ammo = ammo;
  }

  public Gun() {
    this.ammo = 5;
  }

  public Gun(int ammo) {
    setAmmo(ammo);
  }

  public Gun(Gun copyGun) {
    if (copyGun != null) {
      this.ammo = copyGun.getAmmo();
    }
  }
//FIXME: название метода в прошедшем времени (может ввести в заблуждение)
//   public void shot() {
//     if (this.ammo > 0) {
//       System.out.println("БАХ!");
//       this.ammo--;
//     } else {
//       System.out.println("Клац...");
//     }
//   }
//FIXTO:
public void shoot() {
    if (this.ammo > 0) {
      System.out.println("БАХ!");
      this.ammo--;
    } else {
      System.out.println("Клац...");
    }
  }
  @Override
  public String toString() {
    return String.format("Пистолет с %d патронами", ammo);
  }
}