package menufact;

import menufact.plats.PlatChoisi;

public class Chef implements Observer {

    private String name;

    private PlatChoisi plat;

    public Chef(String name) {
        this.name = name;
    }

    @Override
    public void update(PlatChoisi platChoisi) {
        System.out.println("Chef update");
        this.plat = platChoisi;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
