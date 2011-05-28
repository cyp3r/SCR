/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: virtual
	Component	: zoinha
	Configuration 	: idarka
	Model Element	: idarka
//!	Generated Date	: Sat, 28, May 2011 
	File Path	: zoinha/idarka/Mainzoinha.java
*********************************************************************/


//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.*;

//----------------------------------------------------------------------------
// Mainzoinha.java                                                                  
//----------------------------------------------------------------------------


//## ignore 
public class Mainzoinha {
    
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
            Class.forName("Default.key_1");
            Class.forName("Default.key_2");
            Class.forName("Default.key_3");
            Class.forName("Default.key_4");
            Class.forName("Default.key_5");
            Class.forName("Default.key_6");
            Class.forName("Default.key_7");
            Class.forName("Default.key_8");
            Class.forName("Default.key_9");
            Class.forName("Default.platnoscsms");
            Class.forName("Default.powrot");
            Class.forName("Default.serwisIn");
            Class.forName("Default.serwisOut");
            Class.forName("Default.starcik");
            Class.forName("Default.wlaczSerwisowanie");
            Class.forName("Default.wylaczSerwisowanie");
            Class.forName("Default.zwrot");
    
        // Registering Static Classes 
        
      }
      catch(Exception e) { 
         System.err.println(e.toString());
         e.printStackTrace(System.err);
      }
    }
    //#]
    
    
    //## configuration zoinha::idarka 
    public static void main(String[] args) {
        RiJOXF.Init(null, 0, 0, true, args);
        Mainzoinha initializer_zoinha = new Mainzoinha();
        //#[ configuration zoinha::idarka 
        //#]
        RiJOXF.Start();
    }
    
}
/*********************************************************************
	File Path	: zoinha/idarka/Mainzoinha.java
*********************************************************************/

