
void setup() {
  size(650, 700);
  frameRate(15);
  background(255);
}
PImage bild;
  int xxx=0;
  int crunden=0;
  int activ1=0;
  int activ2=0;
  int activ3=0;
  int click=1;

  int deltax1=0;
  int deltay1=0;
  int diay1=0;
  int diax1=0;

  int deltax2=0;
  int deltay2=0;
  int diay2=0;
  int diax2=0;

  int deltax3=0;
  int deltay3=0;
  int diay3=0;
  int diax3=0;
  int score=0;
  int check=0;
  int seeC=0;
  int x=0;

  int adeltax1=0;
  int adeltay1=0;
  int adiay1=0;
  int adiax1=0;

  int adeltax2=0;
  int adeltay2=0;
  int adiay2=0;
  int adiax2=0;

int runden=7;
int rand=0;
  int adeltax3=0;
  int adeltay3=0;
  int adiay3=0;
  int adiax3=0;
  int ascore=0;
  int acheck=0;
  int aseeC=0;
  int ax=0;
  int Hdiay1=0;
    int Hdiay2=0;
    int Hdiay3=0;
  
int choch=0;
int r=0;
  void draw() { //
  
    float  mouseovery;
    float  mouseoverx;
  mouseovery = mouseY;
  mouseoverx = mouseX;
  
stroke(0,0,0,0);

 
     fill(200, 200, 0);
         rect(570, 50, 70, 40 );
       
          fill(0);
          text("Load", 580, 80);
         
          if ((mouseoverx >= 570 && mouseoverx <= 640) && (mouseovery  >= 50 && mouseovery  <=90)) {//??
       

fill(0, 200, 0);
         rect(570, 50, 70, 40 );
         
        fill(0);
       text("Load", 580, 80);
       if (mousePressed) {
       
        PImage bild;
       
           bild = loadImage("bild.png");
        if (bild != null){
        
     
    image(bild, 0, 0);
         delay(200);
        }
        else{fill(200, 0, 0);
         rect(570, 50, 70, 40 );
         
        fill(0);
       text("Kein", 580, 70);
     
        fill(0);
       text("Spielstand", 580, 80);
   }
  }
   

          }
          
          
          
          fill(200, 200, 0);
         rect(570, 110, 70, 40 );
         fill(0);
               text("Save",580, 140);
             if ((mouseoverx >= 570 && mouseoverx <= 640) && (mouseovery  >= 110 && mouseovery  <=150)) {//??
      
      
      if (mousePressed) {
     
      save("bild.png");
      fill(0, 255, 255);
         rect(570, 110, 70, 40 );
         delay(200);
         fill(0);
     text("Save", 580, 140);
      
      
      }else{
      
     
fill(0, 200, 0);
         rect(570, 110, 70, 40 );
         
         fill(0);
     text("Save", 580, 140);
          }}







         fill(200, 200, 0);
         rect(570, 190, 70, 40 );
         fill(0);
               text("Höche: "+runden,580, 220);
             if ((mouseoverx >= 570 && mouseoverx <= 640) && (mouseovery  >= 190 && mouseovery  <=230)) {//??
      
      
      if (mousePressed) {
   fill(0, 200, 0);
         rect(570, 190, 70, 40 );
        
        runden++;
     if (runden>=20) runden=1;
     
      fill(0);
               text("Höche: "+runden,580, 220);
      
      }
      
             }

////////////////////////////////



     if(rand==1){
     
    fill(200, 200, 0);
         rect(570, 250, 70, 40 );
      fill(0);
    text("Chaos",580, 280);
          delay(100);
     }
     
      if(rand==0){
       fill(200, 200, 0);
         rect(570, 250, 70, 40 );
      fill(0);
      
               text("Normal",580, 280);
     delay(100);
      }

             if ((mouseoverx >= 570 && mouseoverx <= 640) && (mouseovery  >= 250 && mouseovery  <=290)) {//??
     
    
      if (mousePressed) {
   
        
        rand++;
     if (rand==2) rand=0;
      if(rand==0){
      fill(0, 200, 0);
         rect(570, 250, 70, 40 );
      fill(0);
     
      }
     else if(rand==1){
     
     fill(0, 200, 0);
         rect(570, 250, 70, 40 );
      fill(0);
      
               text("Chaos",580, 280);
     
     
     
     
      
      
             }

      }

             }

///////////////////////////////
     fill(200, 200, 0);
         rect(570, 310, 70, 40 );
         fill(0);
               text("Start",580, 340);
             if ((mouseoverx >= 570 && mouseoverx <= 640) && (mouseovery  >= 310 && mouseovery  <=350)) {//??
      
      
      if (mousePressed) {
        
          fill(200, 200, 0);
         rect(570, 310, 70, 40 );
        
        
      fill(0);
               text("Start",580, 340);
  xxx=0;
      
         fill( 255);
         rect(0, 0, 650, 700 );
    
  

}
      

             }


    if (xxx==0) { //
    
   
          score=0;
    
    
      
      crunden=runden;// hier kann die turmhöhe eingestellen werden         <<<<<<------------------Turmhöhe
                        //  <<<<<<------------------Würfeln
      int hoch = 0;

      fill(0);
     


      // hier kann die turmhöhe eingestellen werden und die
      // optimale rundenzahl wird berechnet

   
      int farbe = 255/runden;

      fill(255, 200, 200);
      rect(40, 600, 170, 50 );
      fill(255, 200, 200);
      rect(240, 600, 170, 50);
      fill(255, 200, 200);
      rect(440, 600, 170, 50);

      if (rand==0) {//

        for (int i=0; i<runden; i++) {
          score=score+score+1;
        }   
        ;
        fill(0);
        text("Gewinne im " + score + " Runden ", 200, 90);
      } else
      {
        fill(0);
        text("Gewinne!", 200, 90);
      }//

      for (int i=0; i<runden; i++){
      
        int block = 0;
        int breite = 0;
        int size = 0;
        int randpos=0;

        block = farbe * i;
        breite = 100 / runden * i;
        hoch = hoch + 60-runden*2;
        size = 150 - breite;

        if (rand==1) {
          randpos=(int)random(0, 3);
          r=randpos;
          
          randpos=randpos*200;
        }
         if (rand==1){
        if (r==0){
       x=105;
         check=0;
      for (int y=130; check<1; y++) {
        seeC=get(x, y);       
        if (seeC<=-2) {
          check++;
          diay2=y;        
              }
      } }
        
   
        
       else if ((r==1)){
        x=305;
         check=0;
      for (int y=130; check<1; y++) {
        seeC=get(x, y);       
        if (seeC<=-2) {
          check++;
          diay2=y;        
              }
      } 
   
        
    }
     
       else    if ((r==2)){
         x=505;
         check=0;
      for (int y=130; check<1; y++) {
        seeC=get(x, y);       
        if (seeC<=-2) {
          check++;
          diay2=y;        
        } 
      } 
        }
          }
if(rand==0){
        fill(block);
        rect((50 + breite/2) + randpos, (600 - hoch) , size, 60-runden*2); 
}
  choch=60-runden*2;
if(rand==1)
{
  delay(66);
   fill(block);
  rect((50 + breite/2) + randpos,diay2-choch , size, 60-runden*2);}
  }
      xxx++;
    }
  
  
    
  
  
  
  
    if (click==1) {  //error

      if (((mouseoverx >= 40 && mouseoverx <= 170) && (mouseovery  >= 600 && mouseovery  <=650))&&activ1==0&& activ2==0 && activ3==0) {//??
fill(0, 0, 200);
         rect(40, 600, 170, 50 );
   fill(255, 200, 200);   
      rect(240, 600, 170, 50);
      fill(255, 200, 200);
      rect(440, 600, 170, 50);
        if (mousePressed) {
    ax=105;
         acheck=0;
      for (int ay=130; acheck<1; ay++) {

        aseeC=get(ax, ay);       
        if (aseeC<=-2) {
          acheck++;
          adiay1=ay;          
              }
      }     
            adeltax1=40;
      acheck=0;
      for(int ax=105;acheck<1;ax--) {
               adeltax1++;   adeltax1++;;
        aseeC=get(ax,adiay1);
        if(aseeC>=-2){
          acheck++;
          adeltax1=adeltax1-4;
          adiax1=ax+1;        
        }
        }
             
                 
         acheck=0;
      for (int ay=130; acheck<1; ay++) {

        aseeC=get(adiax1-1, ay);       
        if (aseeC<=-2) {
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
        if (aseeC<=-2) {
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
        if (aseeC<=-2) {
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
        if (aseeC<=-2) {
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
        if (aseeC<=-2) {
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
          }
        }
        
        else if (((mouseoverx >= 240 && mouseoverx <= 370) && (mouseovery  >= 600 && mouseovery  <=650))&&activ1==1&&activ2==0&&activ3==0) {
     
      x=305;
         check=0;
      for (int y=130; check<1; y++) {

        seeC=get(x, y);       
        if (seeC<=-2) {
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
        if (seeC<=-2) {
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
          }
        }
        else if (((mouseoverx >= 40 && mouseoverx <= 170) && (mouseovery  >= 600 && mouseovery  <=650))&&activ1==0&&activ2==1&&activ3==0) {    
             x=105;
         check=0;
      for (int y=130; check<1; y++) {

        seeC=get(x, y);       
        if (seeC<=-2) {
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
        if (seeC<=-2) {
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
            delay(66);
          }
        }
        else if (((mouseoverx >= 40 && mouseoverx <= 170) && (mouseovery  >= 600 && mouseovery  <=650))&&activ1==0&&activ2==0&&activ3==1) {
             x=105;
         check=0;
      for (int y=130; check<1; y++) {
        seeC=get(x, y);       
        if (seeC<=-2) {
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
        if (seeC<=-2) {
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
        if (aseeC<=-2) {
          acheck++;
         
          
          if(ay>=598)
            Hdiay2=1;
    
          
              }
      }    
      
       ax=305;
         acheck=0;
      for (int ay=130; acheck<1; ay++) {

        aseeC=get(ax, ay);       
        if (aseeC<=-2) {
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

  Hdiay2=0;Hdiay3=0;
  

    }else{Hdiay2=0;Hdiay3=0;}
      
       
    
    
    }
