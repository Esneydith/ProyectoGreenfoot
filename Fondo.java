import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fondo extends World
{

    /**
     * Constructor for objects of class Fondo.
     * 
     */
    public Fondo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        // addObject( new Playertwo(), 900, 540);
        addObject( new NaveDerecha(),1150,651) ;
        addObject( new NaveIzquierda(),49,651);
        addObject( new MinaDerecha(),1145,149);
        addObject( new MinaIzquierda(),53,140);
        addObject( new YacimientoDerecho(),836,151);
        addObject( new YacimientoIzquierdo(),376,141);
        addObject( new HealtDerecho(),988,629);
        addObject( new HealtIzquierdo(),228,623);
        addObject( new MinaInteriorDerecha(),823,637);
        addObject( new MinaInteriorIzquierda(),384,631);
        addObject( new YacimientoInteriorIzquierdo(),680,398);
        addObject( new YacimientoInteriorDerecho(),580,398);
        //personajes
        addObject(new MedicoTerran(),1017,641);
        addObject(new MedicoZerg(),200,620);

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        //rocas numero 2
        Roca2 roca2 = new Roca2();
        addObject(roca2,928,645);
        Roca2 roca24 = new Roca2();
        addObject(roca24,920,474);
        Roca3 roca3 = new Roca3();
        addObject(roca3,925,567);
        Roca3 roca33 = new Roca3();
        addObject(roca33,306,568);
        Roca3 roca34 = new Roca3();
        addObject(roca34,916,380);
        Roca4 roca4 = new Roca4();
        addObject(roca4,577,668);
        Roca4 roca42 = new Roca4();
        addObject(roca42,635,677);
        Roca4 roca43 = new Roca4();
        addObject(roca43,617,633);
        Roca1 roca1 = new Roca1();
        addObject(roca1,286,680);
        Roca1 roca12 = new Roca1();
        addObject(roca12,302,642);
        Roca1 roca13 = new Roca1();
        addObject(roca13,306,602);
        Roca1 roca15 = new Roca1();
        addObject(roca15,303,518);
        Roca1 roca16 = new Roca1();
        addObject(roca16,305,480);
        Roca1 roca19 = new Roca1();
        addObject(roca19,916,520);
        Roca4 roca44 = new Roca4();
        addObject(roca44,311,435);

        Roca2 roca23 = new Roca2();
        addObject(roca23,448,158);

        Roca1 roca17 = new Roca1();
        addObject(roca17,783,110);
        roca34.setLocation(739,214);
        Roca1 roca18 = new Roca1();
        addObject(roca18,739,214);

        //arboles no generaran interferencia con nada...
        Arbol1 arbol1 = new Arbol1();
        addObject(arbol1,431,209);
        Arbol1 arbol12 = new Arbol1();
        addObject(arbol12,1176,215);
        Arbol1 arbol13 = new Arbol1();
        addObject(arbol13,913,677);
        Arbol1 arbol14 = new Arbol1();
        addObject(arbol14,268,109);
        Arbol1 arbol15 = new Arbol1();
        addObject(arbol15,14,445);
        Arbol1 arbol16 = new Arbol1();
        addObject(arbol16,963,518);
        Arbol1 arbol17 = new Arbol1();
        addObject(arbol17,592,452);
        Arbol2 arbol2 = new Arbol2();
        addObject(arbol2,632,443);
        Arbol2 arbol22 = new Arbol2();
        addObject(arbol22,475,238);
        Arbol2 arbol23 = new Arbol2();
        addObject(arbol23,708,321);
        Arbol3 arbol3 = new Arbol3();
        addObject(arbol3,250,493);
        Arbol3 arbol32 = new Arbol3();
        addObject(arbol32,918,387);
        Arbol4 arbol4 = new Arbol4();
        addObject(arbol4,787,201);
        Arbol4 arbol42 = new Arbol4();
        addObject(arbol42,396,185);
        Arbol4 arbol43 = new Arbol4();
        addObject(arbol43,343,405);
        Arbol2 arbol24 = new Arbol2();
        addObject(arbol24,270,419);
        Arbol2 arbol25 = new Arbol2();
        addObject(arbol25,617,677);
        Arbol1 arbol18 = new Arbol1();
        addObject(arbol18,1085,114);
        Arbol4 arbol44 = new Arbol4();
        addObject(arbol44,1185,343);
        Arbol1 arbol19 = new Arbol1();
        addObject(arbol19,631,350);
        Arbol4 arbol45 = new Arbol4();
        addObject(arbol45,542,317);
        //limite superior que sera superior a los demas...
        LimiteSuperior limiteSuperior = new LimiteSuperior();
        addObject(limiteSuperior,600,42);

        
        
    }
}
