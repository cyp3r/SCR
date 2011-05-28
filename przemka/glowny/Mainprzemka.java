/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: PL
	Component	: przemka
	Configuration 	: glowny
	Model Element	: glowny
//!	Generated Date	: Tue, 24, May 2011 
	File Path	: przemka/glowny/Mainprzemka.java
*********************************************************************/


//## auto_generated
import Default.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.*;

//----------------------------------------------------------------------------
// Mainprzemka.java                                                                  
//----------------------------------------------------------------------------


//## ignore 
public class Mainprzemka {
    
    //#[ ignore
    // link with events in order to register them in the animation browser
    static {
      // Setting Animation Default Port 
      AnimTcpIpConnection.setDefaultPort(6423);
      // Registering Events 
      try {
        
            Class.forName("Default.do_wyboru");
            Class.forName("Default.dodaj_nominal_10gr");
            Class.forName("Default.dodaj_nominal_1zl");
            Class.forName("Default.dodaj_nominal_20gr");
            Class.forName("Default.dodaj_nominal_2zl");
            Class.forName("Default.dodaj_nominal_5");
            Class.forName("Default.dodaj_nominal_50gr");
            Class.forName("Default.dodaj_nominal_5gr");
            Class.forName("Default.event_4");
            Class.forName("Default.event_6");
            Class.forName("Default.powrot");
            Class.forName("Default.starcik");
            Class.forName("Default.zwrot");
    
        // Registering Static Classes 
        
      }
      catch(Exception e) { 
         System.err.println(e.toString());
         e.printStackTrace(System.err);
      }
    }
    //#]
    
    protected static Jav p_Jav = null;
    
    //## configuration przemka::glowny 
    public static void main(String[] args) {
        RiJOXF.Init(null, 0, 0, true, args);
        Mainprzemka initializer_przemka = new Mainprzemka();
        p_Jav = new Jav(RiJMainThread.instance());
        p_Jav.startBehavior();
        //#[ configuration przemka::glowny 
        //#]
        RiJOXF.Start();
        p_Jav=null;
    }
    
}
/*********************************************************************
	File Path	: przemka/glowny/Mainprzemka.java
*********************************************************************/

