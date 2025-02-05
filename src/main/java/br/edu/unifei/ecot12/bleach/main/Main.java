package br.edu.unifei.ecot12.bleach.main;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifei.ecot12.bleach.*;

public class Main {
    public static void main(String[] args) {
        Hollow h = new Hollow();
        Shinigami s = new Shinigami();
        Zanpakutou z = new Zanpakutou();

        System.out.println("=======Hollow======");
        for (int i = 0; i < 3; i++) {
            System.out.println("Current MenosGrande:  " + h.getMenosGrande().getClass());
            h.evolve();
        }

        System.out.println("=======Shinigami======");
        for (int i = 0; i < 4; i++) {
            System.out.println("Current Ranking:  " + s.getRanking().getClass());
            s.promotion();
        }

        System.out.println("=======Zanpakutou======");
        System.out.println("Release:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Current Release State:  " + z.getReleaseState().getClass());
            z.release();
        }

        System.out.println("Restrain:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Current Release State:  " + z.getReleaseState().getClass());
            z.restrain();
        }

        System.out.println("=================================");

        z.setName("Zangetsu");
        s.setName("Ichigo");
        s.setZanpakutou(z);
        z.setShinigami(s);

        System.out.println(s.getName() + " has: " + s.getZanpakutou().getName());
        System.out.println(z.getName() + " belongs to: " + z.getShinigami().getName());

        System.out.println("=================================");
        Espada grim = new Espada();
        grim.setName("Grimmjow");
        grim.setEssence(true);

        System.out.println("Is " + grim.getName() + " alive? : " + grim.isEssence());
        s.killHollow(grim);
        System.out.println("Is " + grim.getName() + " alive? : " + grim.isEssence());

        Fullbringer chad = new Fullbringer();
        chad.setName("Chad");
        chad.killEssence(h);

        Quincy ishida = new Quincy();
        ishida.setName("Ishida");
        ishida.killEssence(chad);

        Human karin = new Human();
        karin.setName("Karin");
        karin.setCanSeeSpirits(true);

        Arrancar a = new Arrancar();
        a.setName("Mila Rose");
        h.killShinigami(s);

        Fraccion f = new Fraccion();
        f.setName("Lilynette");
        h.setName("h");

        List<Fraccion> frac = new ArrayList<>();
        frac.add(f);
        f.setLord(grim);
        grim.setServants(frac);

        // Usando a fábrica para criar SoulSociety corretamente
        SoulSocietyFactory sFactory = new SoulSocietyFactory();
        SoulSociety soulSociety = sFactory.buildRealm();
        List<Soul> ssHabitants = new ArrayList<>();
        ssHabitants.add(s);
        soulSociety.setSouls(ssHabitants);

        System.out.println("=================================");
        for (Soul soul : soulSociety.getSouls()) {
            System.out.println("SoulSociety Habitant: " + soul.getName());
        }

        // Usando a fábrica para criar LivingWorld corretamente
        LivingWorldFactory lFactory = new LivingWorldFactory();
        LivingWorld lWorld = lFactory.buildRealm();
        List<Soul> livingWorldHabitants = new ArrayList<>();
        livingWorldHabitants.add(karin);
        livingWorldHabitants.add(ishida);
        livingWorldHabitants.add(chad);
        lWorld.setSouls(livingWorldHabitants);

        System.out.println("=================================");
        for (Soul soul : lWorld.getSouls()) {
            System.out.println("Living World Habitant: " + soul.getName());
        }

        System.out.println("=================================");
        // Usando a fábrica para criar HuecoMundo corretamente
        HuecoMundoFactory hFactory = new HuecoMundoFactory();
        HuecoMundo hMundo = hFactory.buildRealm();
        List<Soul> hMundoHabitants = new ArrayList<>();
        hMundoHabitants.add(h);
        hMundoHabitants.add(grim);
        hMundoHabitants.add(a);
        hMundo.setSouls(hMundoHabitants);

        for (Soul soul : hMundo.getSouls()) {
            System.out.println("Hueco Mundo Habitant: " + soul.getName());
        }
        System.out.println("=================================");

        // Usando o singleton Hogyoku para criar Vizard
        Hogyoku hogyoku = Hogyoku.getInstace();
        Vizard viz = hogyoku.createVizard();
        viz.getInnerHollow().setMaskIntegrity(false);
        viz.getInnerHollow().evolve();
        viz.getInnerHollow().evolve();
        System.out.println("Vizard Inner Hollow: " + viz.getInnerHollow().getClass());

        System.out.println("=================================");
        Zanpakutou zanp = new Zanpakutou();
        viz.setZanpakutou(zanp);
        zanp.setName("zanp");
        System.out.println("Vizard has Zanpakutou: " + viz.getZanpakutou().getName());

        System.out.println("=================================");
        Division division = new Division();
        division.setNumber(11);

        Shinigami zaraki = new Shinigami();
        zaraki.setRanking(new Captain());
        zaraki.setName("Zaraki");

        division.setCaptain(zaraki);
        System.out.println();
        System.out.println(division.getCaptain().getClass() + " " + division.getCaptain().getName() + " is the "
                + division.getCaptain().getRanking().getClass() + " of division " + division.getNumber());
    }
}
