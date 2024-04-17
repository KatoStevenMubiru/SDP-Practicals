package Facade;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    Projector projector = new Projector();
    DvdPlayer dvdPlayer = new DvdPlayer();
    SoundSystem soundSystem = new SoundSystem();
    Lights lights = new Lights();

    HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(projector, dvdPlayer, soundSystem, lights);
    homeTheaterFacade.watchMovie("Inception");
    homeTheaterFacade.endMovie();

  }
    
}