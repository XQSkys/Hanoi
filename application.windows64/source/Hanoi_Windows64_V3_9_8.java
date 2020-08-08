import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Hanoi_Windows64_V3_9_8 extends PApplet {

PImage webImg;
PImage webImg2;
public void setup() {
  
  frameRate(15);
  background(255);
webImg = loadImage("http://www.Rechenkraft.net/wiki/images/7/7f/RKNev.png");


}

int PK=1;
int bnr=0;
int bnrb=0;
int frame=0;
long iv=0;
PImage bild;   //variable für das Spielstand Bild load/save
  int xxx=0;    //variable für das ausführen der funktion die Türme neu zu zeichnen //wird im start button auf 0 gesetzt um kein kontinuirlichen durchlauf der draw schleife die funtion bei bedarf zu aktiviern
  int crunden=0;  //variable zur 2ten speicherung der anzahl der turm steine
  int activ1=0;   // gibt an ob turm links aktiv ist
  int activ2=0;// gibt an ob turm mitte aktiv ist
  int activ3=0; // gibt an ob turm rechts aktiv ist
  int click=1; //Wichtige variable die bei 1 die turm aktivirung startet oder bei 2 das Stein auf turm setzen startet
//variablen vom ziehlturm "click 2" (steinkooadinaten) 
  
  //linker turm
  int deltax1=0;   
  int deltay1=0;
  int diay1=0;
  int diax1=0;
//mittlerer turm
  int deltax2=0;
  int deltay2=0;
  int diay2=0;
  int diax2=0;
//rechter turm
  int deltax3=0;
  int deltay3=0;
  int diay3=0;
  int diax3=0;
  int score=0;  //variable vür das berechen der erforderlichen zugzahl die mindestenz erforderlich ist zum gewinnen
  int check=0;
  int seeC=color(255);    //variable für die erkennung der steine, nicht standartkonforme verwendung der get(), ist bei dem farbwert weiss anders als bei allen anderen farben
  int x=0;
//a variable vom Startturm siehe "click 1" (steinkooadinaten)
  
  //linker turm
  int adeltax1=0;  
  int adeltay1=0;
  int adiay1=0;
  int adiax1=0;
// mittlerer turm
  int adeltax2=0;
  int adeltay2=0;
  int adiay2=0;
  int adiax2=0;

   PImage imagest;
   
int i2=1;

int i=1;



//rechter turm
  int adeltax3=0;
  int adeltay3=0;
  int adiay3=0;
  int adiax3=0;
  
  
  
  
  
int runden=7; //standard turmhöhe (anzahl der turmsteine)
int rand=0;   //entscheidet ob bei der turmerzeugung zufall verendet wird 0=alles auf links 1=alles zufallig auf die basen verteilen
  
  int ascore=0;
  int acheck=0;
 int aseeC=color(255); 
  int ax=0;
  
 int ib=0;
  //H variablen zum erkennen ob turmbasis links und mitte leer sind was die Sieg routine aktiviert(sternstrahlen)
  int Hdiay1=0; 
    int Hdiay2=0; 
    int Hdiay3=0;
  int movie=0;
int choch=0;
int r=0;
  public void draw() { //
 
    float  mouseovery;  //"maus kooardinaten variablen
    float  mouseoverx;
  mouseovery = mouseY;    //maus koardinaten initialisirung
  mouseoverx = mouseX;
  
  
   if (webImg != null){                           //wenn ein bild vorhanden ist das bild.png heißt tue:
        
     
    
  image(webImg, 10, 10);
 if ((mouseoverx >= 10 && mouseoverx <= 130) && (mouseovery  >= 10 && mouseovery  <=94)) {//??
    if (mousePressed) {
  link("http://www.Rechenkraft.net");
    }}}

  
  
  //ab hier werden die button erzeugt die man auf der rechten seite sieht.
  // hier begint die erzeugung und funktionalisirung des Load button
  
stroke(0,0,0,0);  // alle folgenden rechteke ohne rand malen

 
     fill(200, 200, 0);  //setzt die Buttenrarbe auf orange
         rect(570, 50, 70, 40 );  //zeichnet den load button rechts oben 
       
          fill(0);                     // legt die beschriftungsfarbe Für die "Load" schriftzug fest 
          text("Load", 580, 80);            //schreibt load auf den button
         
          if ((mouseoverx >= 570 && mouseoverx <= 640) && (mouseovery  >= 50 && mouseovery  <=90)) {// zur erkennung ob der mausfeil über dem load button ist
       

fill(0, 200, 0);                       //malt den Load button grün über
         rect(570, 50, 70, 40 );         //koardinaten für den load butten
         
        fill(0);                             // schreibt nochmal Load auf den grün übermalen butten
       text("Load", 580, 80);
                      //wenn die maus auf den kooardinaten des Load buttons, er ist nun grün, und ein mausklick gemacht wird tue:
       if (mousePressed && (mouseButton == LEFT)){ PImage bild;   bild = loadImage("bild.png"); bnr=0;bnrb=0;         //lade in den bild speicher das bild mit dem namen bild.png aus dem haubptordner
        if (bild != null){                           //wenn ein bild vorhanden ist das bild.png heißt tue:
        
     
    image(bild, 0, 0);  // Füge das bild ein -- vollständiges ersetzen des programm fenster inhalts
         delay(200);  //warte kurz
        }else{
        
         
        fill(0);                  //schreibe in schwarz kein Soielstand auf den Button
       text("Kein", 580, 70);
     
        fill(0);
       text("Spielstand", 580, 80);
   }}
  if (mousePressed && (mouseButton == RIGHT)){
   delay(250);bnr++;if (bnr>9){bnr=0;bnrb=0;};
    
String[] lines = loadStrings("list.txt");
println("there are " + lines.length + " lines");
for (int i = 0 ; i < lines.length; i++) {
  println(lines[i]);
}
if(bnr<10){
   webImg2 = loadImage(lines[0]+"bild"+bnr+".png");
   
}
     if (webImg2 != null){
      image(webImg2, 0, 0);  
     }

   
   else while(webImg2== null||bnrb==0)
{bnr++; webImg2 = loadImage(lines[0]+"bild"+bnr+".png"); if (bnr>9){
          fill(200, 0, 0);
          rect(310, 50, 70, 50 );
          fill(0);
          text("Kein", 329, 70);
          fill(0);
          text("Spielstand", 320, 90);
          bnrb=1;;bnr=-1;
        } 
      
   

     if (webImg2 != null){
      image(webImg2, 0, 0);  
    } 
                      //malt den Load button grün über
 PK=1;
 
 
        
  }}}//
        
        
       // webImg2 = loadImage("https://xqskys.de/hanoi/bild.png");}
                                //Aktivire den bildspeicher mit dem namen bild
      
         
        // ende der wenn kein bild.png gefunden wurde bedingung
  //ende der funtion wenn auf den load butten geklickt wurde funktion
   

           //ende der wenn der mauzeiger über den kooardinaten des load buttons ist, funktion
          //hier ist die erzeugung und funktionalisirung des lod button fertig
          
          
          //hier beginnt die erzeugung des save buttons
          
          fill(200, 200, 0); //die farbe für den save button wird festgeleg oker/orange
         rect(570, 110, 70, 40 ); //das save button rechteck ein stück wird unter dem load button gemalt
         fill(0); //schriftfarbe wirt auf Schwarz gesetzt
               text("Save",580, 140); // der schriftzug Save wird auf den button geschrieben
               
             if ((mouseoverx >= 570 && mouseoverx <= 640) && (mouseovery  >= 110 && mouseovery  <=150)) {//hier beginnt die funktion wenn der mauszeiger über dem Save button kooardinaten ist
      
      
      if (mousePressed) {  //wenn inerhalb dieser koadinarten des save buttens die maus taste geklickt wirt tue:
     
      save("bild.png");  //speichert den inhalt des hanoi fensters im haubtferzeichnis des spiels unter den namen bild.png
      fill(0, 255, 255);  //setzt die farbe des buttens auf hellblau
         rect(570, 110, 70, 40 ); //übermalt den save button nun hellblau mit einem rechtecl
         delay(200);  //wartet kurz
         fill(0);  //wählt die farbe schwarz
     text("Save", 580, 140); //schreibt // save auf den button "save"
      
      
      }//ende der eigenlichen funktion des speicherns des spielstandes
      
      else//wenn das nicht klicken nicht stattfindet
      
      
      {
      
     
fill(0, 200, 0);   //male den save butten Grun
         rect(570, 110, 70, 40 );//an die save button kooardinaten
         
         fill(0); //stelle die farbe auf schwarz
     text("Save", 580, 140);// und schreibe save darauf 
          }//ende der wenn nicht geklickt wurde funktion
        
      }//ende der wenn die maus über dem save button ist funktion
      
      //jetzt ist der Save button fertig und funktioniert


// hier beginnt die erzeungung und funktionalisirung des "Höhe" button:

         fill(200, 200, 0);            //setzte die farbe auf orrange/ocker
         rect(570, 190, 70, 40 );         //male ein rechteck ein etwas größeres stück unter den save button auf der rechten seite
         fill(0);                          //setze farbe auf schwarz
               text("Höche: "+runden,580, 220);  //gebe den Text "höhe: " aus und dahinter den wert des zahlenspeichers "runden" diese ist zunächt  7 wie oben festgelegt hinter dem Int runden
            
             
             if ((mouseoverx >= 570 && mouseoverx <= 640) && (mouseovery  >= 190 && mouseovery  <=230)) {//wenn der mauszeiger über den kooardinaten des Höhe buttons ist tue:
      
      
      if (mousePressed) {  //wenn also über diesen kooardinaten die maustaste kecklich wird tue:
   fill(0, 200, 0);  //setze farbe auf grün
         rect(570, 190, 70, 40 ); //übermale den Höhe button in diesen grün mit einem rechteck
        if (mousePressed && (mouseButton == LEFT)){runden++;; if(runden>30)runden=1;}
  if (mousePressed && (mouseButton == RIGHT)){runden--;if(runden<1)runden=30;}
           //zähle zur ruhenzahl 1 dazu
     // wenn die zahl größer oder gleich 20 ist setze runden wieder auf 1 runter
     //Wichtig: hier könnnen sie die maximale turmhöhe verändern ein ändern von 20 auf 30 hätte die folge das die maximale turmöhe(also die steinanzahl) nun 29 ist
     
     
      fill(0);  //setze die farbe auf schwarz
               text("Höche: "+runden,580, 220); // schreibe "Höhe: " und die um veränderte steinzahl "runden" auf das erzeugte rechteck des buttons
       delay(100); //wartet sehr kurz damit der butten nicht zu schnell hochzählt
      }// ende der funktion wenn die maus auf den "höhe button klickt"
      
             }//ende der funktion wenn der mauszeiger über den kooardinaten des "höhe button ist" 

////////////////////////////////

fill(200, 200, 0);                       //malt den Load button grün über
         rect(400, 50, 70, 40 );         //koardinaten für den load butten
         
        fill(0);                             // schreibt nochmal Load auf den grün übermalen butten
       text("vor/zurück", 410, 75);

     
          if (mousePressed && (mouseoverx >= 400 && mouseoverx <= 470) && (mouseovery  >= 50 && mouseovery  <=90)) {// zur erkennung ob der mausfeil über dem load button ist
       

fill(0, 200, 0);                       //malt den Load button grün über
         rect(400, 50, 70, 40 );         //koardinaten für den load butten
         
        fill(0);                             // schreibt nochmal Load auf den grün übermalen butten
       text("vor/zurück", 410, 75);

 if (mousePressed && (mouseButton == LEFT)){i++;frame++; if(i>frame+ib)i=frame;}
  if (mousePressed && (mouseButton == RIGHT)){frame--;i=frame;ib++;if(frame<0)frame=0;}
      // Use nf() to number format 'i' into four digits
          
   
     if (loadImage("save/bild"+i+".png") != null){
 
       
      imagest=loadImage("save/bild"+i+".png");     
     image(imagest, 0, 0);
     }
delay(200);

imagest = null;
          }

//der Normal/Chaos button legt fest ob bei der verteilung: 0 l alles auf der linken seite landet oder die spielsteine bei dem wert 1 zufällig auf alle 3 basisteine verteilt werden

     if(rand==1){  //wenn der wert rand 1 ist führe folgende funtionen aus. beim  programmstart ist das nie der fall es sei den sie setzen in zum beispiel durch ändern von "int rand=0;" auf 1  
     
    fill(200, 200, 0);  //wähle die farbe ocker/orange
         rect(570, 250, 70, 40 ); //male ein stück unter den höhe button das rechteck
      fill(0); //setzte farbe auf schwarz
    text("Chaos",580, 280); //beschrifte den button mit "Chaos"
          delay(100); //warte kurz
     } // ende das ezeugen des button chaos
     
      if(rand==0){ //wenn der wert für rand 0 ist also wie in der voreistellung "int rand = 0" wird hier der button mit dem schriftzug "normal" erzeugt
       fill(200, 200, 0);  //wähle die farbe oker orange
         rect(570, 250, 70, 40 ); //malen ein rechtek
      fill(0); //setze farbe auf schwarz
      
               text("Normal",580, 280); //schreibe "Normal" auf den button
     delay(100); //warte kurz
      }

             if ((mouseoverx >= 570 && mouseoverx <= 640) && (mouseovery  >= 250 && mouseovery  <=290)) {//wenn der mauszeiger über dem normal/Chaos kooardinaten ist tue
     
    
      if (mousePressed) { //wenn die maustaste über diesen kooardinaten geclickt wird
   
        
        rand++; // zähle zu dem zahlenspeicher 1 dazu
     if (rand==2) rand=0; // wenn der wert 2 erreicht setze in wieder auf 0. Der wert wechselt nu nur zwischen 0 und 1 hin und her wenn geklickt wird
     
     
      if(rand==0){ //wenn der wert 0 ist wird ein button gemacht der in der farbe grün mit der beschriftung "Normal"
      fill(0, 200, 0);
         rect(570, 250, 70, 40 );
      fill(0);
      text("Normal",580, 280);
      delay(200);//wartet kurz damit der button nich zu schnell umschaltet
      }
     else if(rand==1){ //ansonsten wird bei dem wert 1 wieder der button mit der beschriftung "chaos" erzeugt
     
     fill(0, 200, 0);
         rect(570, 250, 70, 40 );
      fill(0);
      
               text("Chaos",580, 280);
      delay(200);//wartet kurz damit der button nich zu schnell umschaltet
     
     
     
      
      
             } //ende der: wenn der wert für Chaos also rand = 1 ist; malte den chaos schriftzug

      } //ende der funktion wenn auf den normal / Chaos button geklickt wird

             } //ende der funktion wenn die maus über den chaos/normal button ist tue funktion

//der normal/chaos button zum einstellen ob beim klicken des start buttons bei der verteilung der steine gewürfelt wird oder nicht


// nun beginnt die erzeugung des untersten button im rechten menue

//erzeugt den "start" button der das zeichnen der türme und der Spielsteine in gang setzt
     fill(200, 200, 0); // setzt die farbe auf ocker/orange
         rect(570, 310, 70, 40 ); //malt ein rechteck dieser farbe unter den normal/chaos button
         fill(0); //wählt die farbe für den schriftzug in schwarz aus
               text("Start",580, 340); //schreibt nun "Start" auf dieses rechteck
             
             if ((mouseoverx >= 570 && mouseoverx <= 640) && (mouseovery  >= 310 && mouseovery  <=350)) {//wenn der mauszeiger über diesen koardinaten ist tue:
      if (mousePressed) { // wenn die maus über denn koardinaten des start buttons geklickt wird tue:
        
          fill(200, 200, 0); //wähle die farbe orange ocker
         rect(570, 310, 70, 40 ); //übermale den start button in orange/oker
        
        
      fill(0); //setzte die farbe auf schwarz
               text("Start",580, 340); //schreibe in schwarz start auf den start butten
  xxx=0; // setzt mit dem wert 0 das malen des spielfeldes in gang
      
         fill( 255);
         rect(0, 0, 650, 700 ); //setst den geamten fensterinhalt auf weiss zurück
    
  

}//ende des erstellen der start button aktionen funktion
      

             }// der start button ist damit fertig

//wichtig :hier esdet der code für die erstellung der rechten menue leiste

//wichtig: hier beginnt das malen der steine

    if (xxx==0) { //hier beginnt das malen der spielsteine
    
   
          score=0; //um den speicher sicher zu löschne de für die mindestrundenzahl benötigt wird
    
    
      
      crunden=runden; //copiert die spielrundenzahl in einen 2.speicher für den restlichen programm ferlauf
      int hoch = 0; //initialisert den speicher für die spielsteinhöhe

      fill(0);//?
     


      // hier kann die turmhöhe eingestellen werden und die
      // optimale rundenzahl wird berechnet

   
      int farbe = 255/runden; //rechnet die spielsteinfarbe in abhänigkeit von der steinzahl aus

      fill(255, 200, 200);
      rect(40, 600, 170, 50 );
      fill(255, 200, 200);
      rect(240, 600, 170, 50);
      fill(255, 200, 200);
      rect(440, 600, 170, 50);//mahlt die 3 basisteine

      if (rand==0) {//ruft das berechnen auf, diemindestrunden berechnet
        for (int i=0; i<runden; i++) {// fürt die nachfolgende funktion so oft aus das sie der spielstein anzahl enspricht
          score=score+score+1;//rechnett die mindestanzahl der züge aus, dies ist identisch mit 2^n-1
        }   //ende der funktion die die spielrunden zahl berechnet
        ;
        fill(0);
        text("Gewinne im " + score + " Runden ", 200, 90);//gibt die rundenzahl aus in schwarz
      } else
      
      {
        fill(0);
        text("Gewinne!", 200, 90); //wenn zufall ferwendet wird wird der test ausgegeben
      }//

      for (int i=0; i<runden; i++){// fürt die nachfolgende funktion so oft aus das sie der spielstein anzahl enspricht, jeder durchlauf erzeugt 1 stein
      
        int block = 0; //wird für die blockfarbe gebraucht
        int breite = 0; //wird für die setinbreite gebraucht
        int size = 0;//wird für die setinbreite gebraucht
        int randpos=0; //wird für die mittlere basisteinposition gebraucht

        block = farbe * i; //legt die für den aktuellen zu malenden stein die farbe fest die wurde etwas weiter oben in abhängikeit von der steinzahl als schritt berechnet
        breite = 100 / runden * i; //teil der funktion der die breite der steine berechnet für den aktuell zu zeichnenden stein
        hoch = hoch + 60-runden*2; //berechnett die steinhöhe in abhänikeit fon der gesammtsteinzahl
        size = 150 - breite;//teil der funktion der die breite der steine berechnet für den aktuell zu zeichnenden stein

        if (rand==1) {//(ruft die funktion zum zeichnen mit chaos auf
          randpos=(int)random(0, 3); //würfelt eine ganzal zwischen 0-2 aus
          r=randpos; //copiert die zahl nach r
          
          randpos=randpos*200; // berechnet die position an die der aktuelle stein gemalt wird in ahänikeit was für eine zahl der zufall 0-2 gewürfelt hat
        }//die position des stein zum zeichnen ist nun festgelegt
         if (rand==1){// wenn zufall
        if (r==0){//wenn 0 ewürfelt wurde tue
       x=105; //das ist die kooardinate für die linke obere ecke des zum malenden rechtecks
         check=0;//endbedingung für das ende der forschleife zurücksetzten
      for (int y=130; check<1; y++) {//forschleife um von oben nach unten die auf den steinauflage kooardinate zu finden
        seeC=get(x, y);       //zählt die y kooardinate so kange hoch bis etwas nicht weisses gefunden wird
        if (seeC<color(255)) {//eigenich eine fehlerhafte funktionswe aber weiss hat einen anderen negativen wert als alle anderen farben wenn man int benutzt stat color
          check++;//wenn eine von weiß(255) abweichende farbe gefunden wird soll die schleife bendet werden
          diay2=y; //er ermittelte y wert wird an diay übergeben
              }//ender der suche nach der auflaagerfläche für den stein
      }//ende der dafür gemachten for schleife
    
  }//ende der suche nach der kooardinate der auflagerfläche für den linken basistein falls der zufall 0 war
        
   
        
       else if ((r==1)){//wenn der zufalls wert nicht 0 war sondern 1
        x=305;//wird die mitlere steinposition 305 festelegt
         check=0;
      for (int y=130; check<1; y++) {
        seeC=get(x, y);       
        if (seeC<color(255)) {
          check++;
          diay2=y;        
              }
      } 
   
        
    }//das selbe wie bei der linken seite nur das das ergebniss nach diay2 übergeben wird
     
       else    if ((r==2)){
         x=505;
         check=0;
      for (int y=130; check<1; y++) {
        seeC=get(x, y);       
        if (seeC<color(255)) {
          check++;
          diay2=y;        
        } 
      } 
        }//das selbe wie bei der linken seite nur das das ergebniss nach diay2 übergeben wird
          }//ende der bedingung für chaos(hier wurde die position der 3 unterseiten festgelegt)
          
          
          
if(rand==0){ //wenn nicht gewürfelt wurde also der button auf"Normal ist"
        fill(block);// nehme die aktuelle farbe von oben und male damit das nächste rechtek(durch das festlegen ist das ein durch 255/runden*i 
        rect((50 + breite/2) + randpos, (600 - hoch) , size, 60-runden*2);  //das ist eine schwirigefunktion die die steine in abhängiketin ddemlinkenpositionem  und den anderen höhe und breite variablen macht.)
}//beendet die normale linker turm aufbau funktion
  choch=60-runden*2;//hier wird die spielstein höhe übergeben
if(rand==1)// hier ist die funktion die die rechtecke zeichnet für den Chaos modus
{
  delay(66);// verzögert den aufbau etwas dammit bein gedrückt halten von start ein moment zeit ist die steine zu sehen
   fill(block);// farbe in abhängikeit fon der steinnummer i
  rect((50 + breite/2) + randpos,diay2-choch , size, 60-runden*2);//das ist eine schwirigefunktion die die steine in abhängiketin von position(0-2 rand und den anderen höhe und breite variablen macht.)
}//beendet die bedinung und das malen der zuffalsfunktion
  }//beendet das zeichnen der türme
      xxx++;//erhöht den zähler um die variable damit die for schleife endet die die türme zeichnet
        frame++;
         saveFrame("save/bild"+frame+".png");
  }//hier endet die for schleife zum steinmalen
  
 fill(200, 200, 0);                       //malt den Load button grün über
         rect(480, 50, 70, 40 );         //koardinaten für den load butten
         
        fill(0);                             // schreibt nochmal Load auf den grün übermalen butten
       text("Film", 490, 70);
         
        fill(0);                             // schreibt nochmal Load auf den grün übermalen butten
       text("Aufnemen", 490, 80);
    if (((mouseoverx >= 480 && mouseoverx <= 550) && (mouseovery  >= 50 && mouseovery  <=90))) {// zur erkennung ob der mausfeil über dem load button ist
       
 fill(0, 200, 0);                       //malt den Load button grün über
         rect(480, 50, 70, 40 );         //koardinaten für den load butten
         
        fill(0);                             // schreibt nochmal Load auf den grün übermalen butten
       text("Film", 490, 70);
         
        fill(0);                 
   text("Aufnemen", 490, 80);
       if (mousePressed) {                   //wenn die maus auf den kooardinaten des Load buttons, er ist nun grün, und ein mausklick gemacht wird tue:
        delay(450);
       fill(0, 150, 255);                       //malt den Load button grün über
         rect(480, 50, 70, 40 );         //koardinaten für den load butten
                     fill(0, 255, 255);                       //malt den Load button grün über
         rect(480, 50, 70, 40 );         //koardinaten für den load butten
         
        fill(0);                             // schreibt nochmal Load auf den grün übermalen butten
       text("Filme!", 490, 70);
      delay(450);
            
           
 
   
    
        
         
   
        movie++;
        
        
        if(movie==2){movie=0;}
        
        }}
   
    if(movie==1){
             fill(0, 150, 0);                       //malt den Load button grün über
         rect(480, 50, 70, 40 );         //koardinaten für den load butten
         
        fill(0);                             // schreibt nochmal Load auf den grün übermalen butten
       text("Filme!", 490, 70);
      
      if(iv>=0&&iv<=9)
  saveFrame("SavesMovie/Movie000000"+iv+".png");
        if(iv>=10&&iv<=99)
  saveFrame("SavesMovie/Movie00000"+iv+".png");
        if(iv>=100&&iv<=999)
  saveFrame("SavesMovie/Movie0000"+iv+".png");
        if(iv>=1000&&iv<=9999)
  saveFrame("SavesMovie/Movie000"+iv+".png");
        if(iv>=10000&&iv<=99999)
  saveFrame("SavesMovie/Movie"+iv+".png");
        if(iv>=100000&&iv<=999999)
  saveFrame("SavesMovie/Movie0"+iv+".png");
    if(iv>=1000000&&iv<=9999999)
  saveFrame("SavesMovie/Movie"+iv+".png");
  
  
  
iv++;

}
    
  
  //wichtig hier beginnt die funktion zum aktiviren des turms von dem ein stein genommen wird:
  
  
    if (click==1) {  //wenn nichts weite gemachtwurde ist nach dem zeichnen des fensterinnhals 1

//hier beginnt das ankliken des linken turms

      if (((mouseoverx >= 40 && mouseoverx <= 170) && (mouseovery  >= 600 && mouseovery  <=650))&&activ1==0&& activ2==0 && activ3==0) {//diese bedinung ist erfüllt wenn die maus über den linken basis stein ist
fill(0, 0, 200); // der stein wird dunkelblau wenn die maus über seinen koardinaten ist
         rect(40, 600, 170, 50 );
   fill(255, 200, 200);   
      rect(240, 600, 170, 50);
      fill(255, 200, 200);
      rect(440, 600, 170, 50);//die anderen werden orange/oker übermalt
        if (mousePressed) {//wenn die maus über diesen kooardinaten gedrückt wirt tue:
   // alle variablen hier haben ein a wie anfang vorab im gegensatz zu den sein ziel positionen
    ax=105;//die 105 ist genau die mitte des linken turms
         acheck=0; //dies ist die selbe finktion wie oben wo der unterste stein gesucht wird da nix bespeichert wird in arrys, muss immer vorher gesucht werden wo die auflager fläche ist
      for (int ay=130; acheck<1; ay++) {

        aseeC=get(ax, ay);       
        if (aseeC<color(255)) {
          acheck++;
          adiay1=ay;          
              }
      }     //hier endet das suchen der y kooardinate
      
      //hier wird die x koardinate des steins der gefunden wurde gesucht
            adeltax1=40;
      acheck=0;
      for(int ax=105;acheck<1;ax--) {//es ist die seble funktion wie für y nur das die bedingung "der pixel ist weiss" die for schleife beendet
               adeltax1++;   adeltax1++;;//hier wird die x kooardinate erhöht je for durchlauf
        aseeC=get(ax,adiay1);
        if(aseeC>=-2){
          acheck++;//stetzt das 1 für das erfüllen und beenden der for schleife
          adeltax1=adeltax1-4;//korrektur faktor
          adiax1=ax+1;        //dies ist die genaue kante 1 pixel neben dem stein
        }
        }
             
     
         acheck=0;
      for (int ay=130; acheck<1; ay++) {

        aseeC=get(adiax1-1, ay);       
        if (aseeC<color(255)) {
          acheck++;
          Hdiay1=ay;   
          
          
          
              }
              if(ay>660)
              acheck++;
         } 
         
      
      choch=Hdiay1-adiay1;
   //        fill(0);
     // text(+choch+" choch "+adiay1+" adiay1 "+Hdiay1+" Hdiay1 ",10,10);   
             
             
          fill(0,  0, 100);
          rect(40, 600, 170, 50 );
          fill(255, 200, 200);
          rect(240, 600, 170, 50);
          fill(255, 200, 200);
          rect(440, 600, 170, 50);

          activ1=1;
          activ2=0;
          activ3=0;
          click=2; 
          delay(66);
        }
      }  else if( ((mouseoverx >= 240 && mouseoverx <= 370) && (mouseovery  >= 600 && mouseovery  <=650))&&activ1==0&& activ2==0 && activ3==0) {
   fill(0, 0, 200);
      rect(240,600, 170, 50 );
        fill(255, 200, 200);
      rect(40, 600, 170, 50);
      fill(255, 200, 200);
      rect(440, 600, 170, 50);
        if (mousePressed) {
    ax=305;
         acheck=0;
      for (int ay=130; acheck<1; ay++) {

        aseeC=get(ax, ay);       
        if (aseeC<color(255)) {
          acheck++;
          adiay2=ay;          
              }
      }     
            adeltax2=40;
      acheck=0;
      for(int ax=305;acheck<1;ax--) {
               adeltax2++;   adeltax2++;;
        aseeC=get(ax,adiay2);
        if(aseeC>=-2){
          acheck++;
          adeltax2=adeltax2-4;
          adiax2=ax+1;        
        }
        }
        


         acheck=0;
      for (int ay=130; acheck<1; ay++) {

        aseeC=get(adiax2-1, ay);       
        if (aseeC<color(255)) {
          acheck++;
          Hdiay1=ay;   
          
          
          
              }
              
              if(ay>660)
              acheck++;
              
              
      }     
      
      choch=Hdiay1-adiay2;





      
           fill(0, 0, 100);
          rect(240, 600, 170, 50 );
          fill(255, 200, 200 );
          rect(40, 600, 170, 50 );
          fill(255, 200, 200);
          rect(440, 600, 170, 50); 
          activ1=0;
          activ2=1;
          activ3=0;
          click=2; 
          delay(66);
        }
      } else if( ((mouseoverx >= 440 && mouseoverx <= 570) && (mouseovery  >= 600 && mouseovery  <=650))&&activ1==0&& activ2==0 && activ3==0) {
   fill(0, 0, 200);
      rect(440,600, 170, 50 );
        fill(255, 200, 200);
      rect(40, 600, 170, 50);
      fill(255, 200, 200);
      rect(240, 600, 170, 50);
        if (mousePressed) {
    ax=505;
         acheck=0;
      for (int ay=130; acheck<1; ay++) {

        aseeC=get(ax, ay);       
        if (aseeC<color(255)) {
          acheck++;
          adiay3=ay;         
              }
      }     
            adeltax3=40;
      acheck=0;
      for(int ax=505;acheck<1;ax--) {
               adeltax3++;   adeltax3++;;
        aseeC=get(ax,adiay3);
        if(aseeC>=-2){
          acheck++;
          adeltax3=adeltax3-4;
          adiax3=ax+1;       
        }
        }
        
                 acheck=0;
      for (int ay=130; acheck<1; ay++) {

        aseeC=get(adiax3-1, ay);       
        if (aseeC<color(255)) {
          acheck++;
          Hdiay1=ay;   
          
          
          
              }
              
              if(ay>660)
              acheck++;
              
              
      }     
      
      choch=Hdiay1-adiay3;
                     
 

fill(0, 0, 100);
          rect(440, 600, 170, 50 );
          fill(255, 200, 200 );
          rect(40, 600, 170, 50 );

          fill(255, 200, 200);
          rect(240, 600, 170, 50); 
          activ1=0;
          activ2=0;
          activ3=1;
          click=2; 
          delay(66);
        }
      }
    
    } else if (click==2) {

      if (activ1==1) {
        if (((mouseoverx >= 40 && mouseoverx <= 170) && (mouseovery  >= 600 && mouseovery  <=650))&&activ1==1&&activ2==0&&activ3==0) {
    fill(0,200, 0);
          rect(40, 600, 170, 50 );
          fill(255, 200, 200 );
          rect(440, 600, 170, 50 );
          fill(255, 200, 200);
          rect(240, 600, 170, 50);
          if (mousePressed) {
 
            fill(255, 200, 200);
            rect(40, 600, 170, 50 );
            fill(255, 200, 200);
            rect(240, 600, 170, 50);
           fill(255, 200, 200);
           rect(440, 600, 170, 50);

            click=1;
            activ1=0;
            delay(66);
              frame++;
         saveFrame("save/bild"+frame+".png");
          }
        }
        
        else if (((mouseoverx >= 240 && mouseoverx <= 370) && (mouseovery  >= 600 && mouseovery  <=650))&&activ1==1&&activ2==0&&activ3==0) {
     
      x=305;
         check=0;
      for (int y=130; check<1; y++) {

        seeC=get(x, y);       
        if (seeC<color(255)) {
          check++;
          diay2=y;          
              }
      }    
            deltax2=40;
      check=0;
      for(x=305;check<1;x--) {
               deltax2++;  // adeltax2++;;
        seeC=get(x,diay2);
        if(seeC>=-2){
          check++;
          deltax2=deltax2-2;
          diax2=x+1;        
        }
        }  
        fill(0);    
        if (diax2-250<adiax1-50) {          
              fill(0, 200, 200);
              rect(240, 600, 170, 50 );             
              fill(0, 0, 100);
              rect(40, 600, 170, 50 );
              fill(255, 200, 200);
              rect(440, 600, 170, 50); 
        }       
        else {fill(200, 0, 0);
              rect(240, 600, 170, 50 );              
              fill(0, 0, 100);
              rect(40, 600, 170, 50 );
              fill(255, 200, 200);
              rect(440, 600, 170, 50);         
        }        
            if (mousePressed) {
           
   if (diax2-250<adiax1-50) {

              copy(adiax1, adiay1,  adeltax1, choch,           adiax1+200, diay2-choch, adeltax1, choch);
              
             fill(255);
              rect(adiax1, adiay1,  adeltax1, choch);
              fill(255, 200, 200);
              rect(240, 600, 170, 50 );
              fill(255, 200, 200);
              rect(40, 600, 170, 50 );
              fill(255, 200, 200);
              rect(440, 600, 170, 50);                 
       click=1;
              activ1=0;
              delay(66);
                frame++;
         saveFrame("save/bild"+frame+".png");
            }
            else {
             fill(255, 200, 200);
            rect(40, 600, 170, 50 );
            fill(255, 200, 200);
            rect(240, 600, 170, 50);
           fill(255, 200, 200);
           rect(440, 600, 170, 50);
          click=1;
            activ1=0;
            delay(66);
            }
          }                   //mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
        } else if (((mouseoverx >= 440 && mouseoverx <= 570) && (mouseovery  >= 600 && mouseovery  <=650))&&activ1==1&&activ2==0&&activ3==0) {
     x=505;
         check=0;
      for (int y=130; check<1; y++) {

        seeC=get(x, y);       
        if (seeC<color(255)) {
          check++;
          diay3=y;      
              }
      } 
            deltax3=40;
      check=0;
      for(x=505;check<1;x--) {
               deltax3++;  //adeltax3++;;
        seeC=get(x,diay3);
        if(seeC>=-2){
          check++;
          deltax3=deltax3-2;
          diax3=x+1;
        }
        }
        if (diax3-450<adiax1-50) {
            
              fill(0, 200, 200);
              rect(440, 600, 170, 50 );          
              fill(0, 0, 100);
              rect(40, 600, 170, 50 );
              fill(255, 200, 200);
              rect(240, 600, 170, 50); 
        }
        else {fill(200, 0, 0);
              rect(440, 600, 170, 50 );
              fill(0, 0, 100);
              rect(40, 600, 170, 50 );
              fill(255, 200, 200);
              rect(240, 600, 170, 50);      
        }      
            if (mousePressed) {
  
   if (diax3-450<adiax1-50) {
  
              copy(adiax1, adiay1,  adeltax1, choch,             adiax1+400, diay3-choch, adeltax1, choch);
     
             fill(255);
              rect(adiax1, adiay1,  adeltax1, choch); 
              fill(255, 200, 200);
              rect(240, 600, 170, 50 );
              fill(255, 200, 200);
              rect(40, 600, 170, 50 );

              fill(255, 200, 200);
              rect(440, 600, 170, 50); 
   
              click=1;
              activ1=0;
              delay(66);
              frame++;
         saveFrame("save/bild"+frame+".png");
            }
            else {
                fill(255, 200, 200);
            rect(40, 600, 170, 50 );
            fill(255, 200, 200);
            rect(240, 600, 170, 50);
           fill(255, 200, 200);
           rect(440, 600, 170, 50);

            click=1;
            activ1=0;
            delay(66);
            }         
          }
        }
      }
      else if (activ2==1) {

        if (((mouseoverx >= 240 && mouseoverx <= 370) && (mouseovery  >= 600 && mouseovery  <=650))&&activ1==0&&activ2==1&&activ3==0) {
    fill(0,200, 0);
          rect(240, 600, 170, 50 );
          fill(255, 200, 200 );
          rect(440, 600, 170, 50 );
          fill(255, 200, 200);
          rect(40, 600, 170, 50);

          if (mousePressed) {
            fill(255, 200, 200);
            rect(40, 600, 170, 50 );
            fill(255, 200, 200);
            rect(240, 600, 170, 50);
           fill(255, 200, 200);
           rect(440, 600, 170, 50);
     click=1;
            activ2=0;
            delay(66);
               frame++;
         saveFrame("save/bild"+frame+".png");
          }
        }
        else if (((mouseoverx >= 40 && mouseoverx <= 170) && (mouseovery  >= 600 && mouseovery  <=650))&&activ1==0&&activ2==1&&activ3==0) {    
             x=105;
         check=0;
      for (int y=130; check<1; y++) {

        seeC=get(x, y);       
        if (seeC<color(255)) {
          check++;
          diay1=y;          
              }
      }    
            deltax1=40;
      check=0;
      for(x=105;check<1;x--) {
               deltax1++;  // adeltax2++;;
        seeC=get(x,diay1);
        if(seeC>=-2){
          check++;
          deltax1=deltax1-2;
          diax1=x+1;
        }
        }     
        if (diax1-50<adiax2-250) {
              fill(0, 200, 200);
              rect(40, 600, 170, 50 );
              fill(0, 0, 100);
              rect(240, 600, 170, 50 );
              fill(255, 200, 200);
              rect(440, 600, 170, 50); 
        }       
        else {fill(200, 0, 0);
              rect(40, 600, 170, 50 );            
              fill(0, 0, 100);
              rect(240, 600, 170, 50 );
              fill(255, 200, 200);
              rect(440, 600, 170, 50);    
        }
            if (mousePressed) {

   if (diax1-50<adiax2-250) {

              copy(adiax2, adiay2,  adeltax2, choch,             adiax2-200, diay1-choch, adeltax2, choch);
             fill(255);
              rect(adiax2, adiay2,  adeltax2, choch);   
              
              fill(255, 200, 200);
              rect(240, 600, 170, 50 );
              fill(255, 200, 200);
              rect(40, 600, 170, 50 );
              fill(255, 200, 200);
              rect(440, 600, 170, 50);       
       click=1;
              activ2=0;
              delay(66);
                 frame++;          saveFrame("save/bild"+frame+".png");
            }
            else {           
                fill(255, 200, 200);
            rect(40, 600, 170, 50 );
            fill(255, 200, 200);
            rect(240, 600, 170, 50);
           fill(255, 200, 200);
           rect(440, 600, 170, 50);
            click=1;
            activ2=0;
            delay(66); 
            }
          }                   //mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
        } else if (((mouseoverx >= 440 && mouseoverx <= 570) && (mouseovery  >= 600 && mouseovery  <=650)) &&activ1==0&&activ2==1&&activ3==0){
     x=505;
         check=0;
      for (int y=130; check<1; y++) {

        seeC=get(x, y);       
        if (seeC<color(255)) {
          check++;
          diay3=y;
              }
      }
            deltax3=40;
      check=0;
      for(x=505;check<1;x--) {
               deltax3++;  //adeltax3++;;
        seeC=get(x,diay3);
        if(seeC>=-2){
          check++;
          deltax3=deltax3-2;
          diax3=x+1;
        }
        }
        if (diax3-450<adiax2-250) {   
              fill(0, 200, 200);
              rect(440, 600, 170, 50 );    
              fill(0, 0, 100);
              rect(240, 600, 170, 50 );
              fill(255, 200, 200);
              rect(40, 600, 170, 50); 
        }
        else {fill(200, 0, 0);
              rect(440, 600, 170, 50 );       
              fill(0, 0, 100);
              rect(240, 600, 170, 50 );
              fill(255, 200, 200);
              rect(40, 600, 170, 50);      
        }      
            if (mousePressed) {
       
   if (diax3-450<adiax2-250) {

              copy(adiax2, adiay2,  adeltax2, choch,              adiax2+200, diay3-choch, adeltax2, choch);
              
             fill(255);
              rect(adiax2, adiay2,  adeltax2, choch);         
              fill(255, 200, 200);
              rect(240, 600, 170, 50 );
              fill(255, 200, 200);
              rect(40, 600, 170, 50 );
              fill(255, 200, 200);
              rect(440, 600, 170, 50);     
              click=1;
              activ2=0;
              delay(66);
                 frame++;          saveFrame("save/bild"+frame+".png");
              
            }
            else {     
                fill(255, 200, 200);
            rect(40, 600, 170, 50 );
            fill(255, 200, 200);
            rect(240, 600, 170, 50);
           fill(255, 200, 200);
           rect(440, 600, 170, 50);
            click=1;
            activ2=0;
            delay(66);
            }  
          }
        }
      }
       else if (activ3==1) {

        if (((mouseoverx >= 440 && mouseoverx <= 570) && (mouseovery  >= 600 && mouseovery  <=650))&&activ1==0&&activ2==0&&activ3==1) {
    fill(0,200, 0);
          rect(440, 600, 170, 50 );
          fill(255, 200, 200 );
          rect(240, 600, 170, 50 );
          fill(255, 200, 200);
          rect(40, 600, 170, 50);
          if (mousePressed) {
            fill(255, 200, 200);
            rect(40, 600, 170, 50 );
            fill(255, 200, 200);
            rect(240, 600, 170, 50);
           fill(255, 200, 200);
           rect(440, 600, 170, 50);
            click=1;
            activ3=0;
            delay(66);   frame++;          saveFrame("save/bild"+frame+".png");
          }
        }
        else if (((mouseoverx >= 40 && mouseoverx <= 170) && (mouseovery  >= 600 && mouseovery  <=650))&&activ1==0&&activ2==0&&activ3==1) {
             x=105;
         check=0;
      for (int y=130; check<1; y++) {
        seeC=get(x, y);       
        if (seeC<color(255)) {
          check++;
          diay1=y;
              }
      }
            deltax1=40;
      check=0;
      for(x=105;check<1;x--) {
               deltax1++;  // adeltax2++;;
        seeC=get(x,diay1);
        if(seeC>=-2){
          check++;
          deltax1=deltax1-2;
          diax1=x+1;   
        }
        }
        if (diax1-50<adiax3-450) {       
              fill(0, 200, 200);
              rect(40, 600, 170, 50 );
              fill(0, 0, 100);
              rect(440, 600, 170, 50 );
              fill(255, 200, 200);
              rect(240, 600, 170, 50); 
        }
        else {fill(200, 0, 0);
              rect(40, 600, 170, 50 );
              fill(0, 0, 100);
              rect(440, 600, 170, 50 );
              fill(255, 200, 200);
              rect(240, 600, 170, 50); 
        }
        
            if (mousePressed) {
   
   if (diax1-50<adiax3-450) {
 
              copy(adiax3, adiay3,  adeltax3, choch,             adiax3-400, diay1-choch, adeltax3, choch);
              
             fill(255);
              rect(adiax3, adiay3,  adeltax3, choch);
              fill(255, 200, 200);
              rect(240, 600, 170, 50 );
              fill(255, 200, 200);
              rect(40, 600, 170, 50 );
              fill(255, 200, 200);
              rect(440, 600, 170, 50);       
       click=1;
              activ3=0;
              delay(66);
    frame++;          saveFrame("save/bild"+frame+".png");           
          }
            else {         
                fill(255, 200, 200);
            rect(40, 600, 170, 50 );
            fill(255, 200, 200);
            rect(240, 600, 170, 50);
           fill(255, 200, 200);
           rect(440, 600, 170, 50);
    click=1;
            activ3=0;
            delay(66);
            
            }
          }                   //mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
        } else if (((mouseoverx >= 240 && mouseoverx <= 370) && (mouseovery  >= 600 && mouseovery  <=650))&&activ1==0&&activ2==0&&activ3==1) {
    x=305;
         check=0;
      for (int y=130; check<1; y++) {
        seeC=get(x, y);       
        if (seeC<color(255)) {
          check++;
          diay2=y;        
              }
      }   
            deltax2=40;
      check=0;
      for(x=305;check<1;x--) {
               deltax2++;  //adeltax3++;;
        seeC=get(x,diay2);
        if(seeC>=-2){
          check++;
          deltax2=deltax2-2;
          diax2=x+1;      
      }
      }
      if (diax2-250<adiax3-450) {
          fill(0, 200, 200);
          rect(240, 600, 170, 50 );       
          fill(0, 0, 100);
          rect(440, 600, 170, 50 );
          fill(255, 200, 200);
          rect(40, 600, 170, 50); 
      }      
      else {fill(200, 0, 0);
          rect(240, 600, 170, 50 );          
          fill(0, 0, 100);
          rect(440, 600, 170, 50 );
          fill(255, 200, 200);
          rect(40, 600, 170, 50);      
      }   
        if (mousePressed) {
     if (diax2-250<adiax3-450) {
          copy(adiax3, adiay3,  adeltax3, choch,              adiax3-200, diay2-choch, adeltax3, choch);
        
         fill(255);
          rect(adiax3, adiay3,  adeltax3, choch);  
          
          fill(255, 200, 200);
          rect(240, 600, 170, 50 );
          fill(255, 200, 200);
          rect(40, 600, 170, 50 );
          fill(255, 200, 200);
          rect(440, 600, 170, 50); 

          click=1;
          activ3=0;
          delay(66);
          
             frame++;          saveFrame("save/bild"+frame+".png");
        }
        else {        
          fill(255, 200, 200);
        rect(40, 600, 170, 50 );
        fill(255, 200, 200);
        rect(240, 600, 170, 50);
         fill(255, 200, 200);
         rect(440, 600, 170, 50);

        click=1;
        activ3=0;
        delay(66);
        
        }        
        }
      }
      }
     
  }
    /////////////////////////
     ax=105;
         acheck=0;
      for (int ay=130; acheck<1; ay++) {

        aseeC=get(ax, ay);       
        if (aseeC<color(255)) {
          acheck++;
         
          
          if(ay>=598)
            Hdiay2=1;
    
          
              }
      }    
      
       ax=305;
         acheck=0;
      for (int ay=130; acheck<1; ay++) {

        aseeC=get(ax, ay);       
        if (aseeC<color(255)) {
          acheck++;
                    
          if(ay>=598)
            Hdiay3=1;
            
          }
      }    
    
 
    if((Hdiay2+Hdiay3)==2){

      // Zeichnet einen weissen Stern vor schwarzem Hintergrund
float winkel; // Winkel eines Strahls im Bogenmass
float laenge; // Laenge eines Strahls in Pixel
float dx;     // x-Koordinate des Linien-Endpunkts 
float dy;     // y-Koordinate des Linien-Endpunkts



stroke(255, 200); // Linienfarbe ist weiss und nicht ganz deckend   
strokeWeight(2);  // Linienbreite zwei Pixel
smooth();         // Anti-Aliasing einschalten

// 200 Strahlen zeichnen
for (int i = 0; i < 200; i++){ 
  // zufaelliger Winkel
  winkel = random(2*PI);  
  // zufaellige Laenge zwischen 0 und halber Laenge der kleineren Fensterdimension
  laenge = random(min(width/2, height/2)); 
  // x-Koordinate des Endpunkts berechnen
  dx = cos(winkel)*laenge;
  // y-Koordinate des Endpunkts berechnen
  dy = sin(winkel)* laenge; 
  // Linie zeichnen

  stroke(200,0,0,150);
  line (width/2, height/2,  width/2+dx, height/2-dy);  
  
  
 
fill(0);


text("Gewonnen!",50,50);
}
saveFrame("Sieg/bild####.png");
  Hdiay2=0;Hdiay3=0;
  

    }else{Hdiay2=0;Hdiay3=0;}
      
       
    
    
    }
  public void settings() {  size(650, 700); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Hanoi_Windows64_V3_9_8" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
