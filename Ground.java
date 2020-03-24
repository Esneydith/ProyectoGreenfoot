import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * A background with a path drawn on it. Two different backgrounds are available.
 * 
 * @author Fr@nk y otros... ;)
 * @version 1.1
 */
public class Ground  extends World
{

    GreenfootSound musicaFondo = new GreenfootSound ("halo.mp3");

    /**
     * Create the field.
     */
    public Ground()
    {     
        super(1100, 600, 1);
        //JOptionPane.showMessageDialog(null, "Agarrese a su asiento por que acontinuación estara \nante el mejor juego de todos. ;V");
        addObject( new Playerone(), 180, 540);
        addObject( new Playertwo(), 900, 540);
        addObject( new limite(), 530,40);
        addObject( new BarraSaludDerecha(), 850, 35);
        addObject( new BarraSaludIzquierda(), 250, 35);
        addObject( new BaseD(), 1040,540);
        addObject( new BaseI(), 65,540);


        prepare();
    }

    public void act()
    {
        musicaFondo.playLoop();
        musicaFondo.setVolume(50);  
    }

    public void showMap1()
    {
        setBackground("ground.png");
    }

   
    private void prepare()
    {

        Arbol1 arbol1 = new Arbol1();
        addObject(arbol1,54,129);
        Arbol1 arbol12 = new Arbol1();
        addObject(arbol12,318,163);
        Arbol1 arbol13 = new Arbol1();
        addObject(arbol13,1012,126);
        arbol1.setLocation(121,143);
        Arbol2 arbol2 = new Arbol2();
        addObject(arbol2,121,143);
        Arbol2 arbol22 = new Arbol2();
        addObject(arbol22,922,126);
        Arbol4 arbol4 = new Arbol4();
        addObject(arbol4,203,136);
        Arbol4 arbol42 = new Arbol4();
        addObject(arbol42,388,141);
        arbol22.setLocation(856,136);
        Arbol4 arbol43 = new Arbol4();
        addObject(arbol43,856,136);
        Arbol4 arbol44 = new Arbol4();
        addObject(arbol44,776,145);
        arbol43.setLocation(638,154);
        arbol43.setLocation(789,140);
        Arbol3 arbol3 = new Arbol3();
        addObject(arbol3,789,140);
        Arbol3 arbol32 = new Arbol3();
        addObject(arbol32,753,172);
        arbol3.setLocation(292,183);
        Arbol3 arbol33 = new Arbol3();
        addObject(arbol33,493,132);
        Arbol4 arbol45 = new Arbol4();
        addObject(arbol45,426,191);
        arbol44.setLocation(675,195);
        Arbol4 arbol46 = new Arbol4();
        addObject(arbol46,675,195);
        Arbol1 arbol14 = new Arbol1();
        addObject(arbol14,521,196);
        Arbol1 arbol15 = new Arbol1();
        addObject(arbol15,596,235);
        arbol43.setLocation(821,183);
        Arbol1 arbol16 = new Arbol1();
        addObject(arbol16,821,183);
        arbol33.setLocation(508,124);
        arbol42.setLocation(399,106);
        arbol4.setLocation(242,106);
        arbol1.setLocation(65,104);
        arbol22.setLocation(771,190);
        arbol44.setLocation(659,152);
        arbol13.setLocation(1050,144);
        Arbol2 arbol23 = new Arbol2();
        addObject(arbol23,950,135);
        arbol12.setLocation(346,207);
        arbol2.setLocation(185,155);
        arbol1.setLocation(57,156);
        arbol42.setLocation(408,215);
        arbol12.setLocation(333,222);
        arbol42.setLocation(390,173);
        arbol33.setLocation(533,152);
        arbol44.setLocation(635,162);
        arbol44.setLocation(678,130);
        arbol22.setLocation(869,161);
        arbol22.setLocation(751,234);
        arbol43.setLocation(793,109);
        arbol22.setLocation(747,93);
        arbol44.setLocation(656,273);
        arbol44.setLocation(648,175);
        arbol43.setLocation(723,233);
        arbol32.setLocation(813,206);
        arbol22.setLocation(911,203);
        arbol22.setLocation(775,143);
        arbol4.setLocation(129,168);
        arbol2.setLocation(127,137);
        arbol1.setLocation(108,159);
        arbol33.setLocation(526,129);
        arbol33.setLocation(536,137);
        arbol33.setLocation(563,132);
        arbol1.setLocation(205,179);
        arbol22.setLocation(872,173);
        arbol42.setLocation(459,135);
        arbol42.setLocation(365,130);
        arbol33.setLocation(564,158);
        arbol42.setLocation(384,113);
        arbol42.setLocation(352,160);
        Roca1 roca1 = new Roca1();
        addObject(roca1,330,578);
        Roca1 roca12 = new Roca1();
        addObject(roca12,335,540);
        Roca1 roca13 = new Roca1();
        addObject(roca13,321,503);
        Roca1 roca14 = new Roca1();
        addObject(roca14,322,471);
        Roca1 roca15 = new Roca1();
        addObject(roca15,344,441);
        Roca1 roca16 = new Roca1();
        addObject(roca16,334,400);
        Roca1 roca17 = new Roca1();
        addObject(roca17,341,367);
        Roca1 roca18 = new Roca1();
        addObject(roca18,764,579);
        Roca1 roca19 = new Roca1();
        addObject(roca19,731,538);
        Roca1 roca110 = new Roca1();
        addObject(roca110,742,505);
        Roca1 roca111 = new Roca1();
        addObject(roca111,746,465);
        Roca1 roca112 = new Roca1();
        addObject(roca112,750,423);
        Roca1 roca113 = new Roca1();
        addObject(roca113,747,384);
        Roca1 roca114 = new Roca1();
        addObject(roca114,757,352);
        roca18.setLocation(736,571);
        MinaI minaI = new MinaI();
        addObject(minaI,60,297);
        minaI.setLocation(58,244);
        arbol4.setLocation(41,123);
        arbol1.setLocation(290,131);
        arbol2.setLocation(239,153);
        arbol4.setLocation(220,149);
        minaI.setLocation(50,136);
        minaI.setLocation(43,151);
        arbol13.setLocation(849,152);
        arbol23.setLocation(771,132);
        MinaD minaD = new MinaD();
        addObject(minaD,1020,159);
    }
}
