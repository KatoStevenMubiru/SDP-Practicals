package Facade;

class HomeTheaterFacade {
    private Projector projector;
    private DvdPlayer dvdPlayer;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade(Projector projector, DvdPlayer dvdPlayer, SoundSystem soundSystem, Lights lights){
        this.projector = projector;
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;
        this.lights = lights;
    }
    public void watchMovie(String movie){
        System.out.print("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        soundSystem.on();
        soundSystem.setVolume(5);
        dvdPlayer.play(movie);
    }
    
}