/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: PL
	Component	: zoinha
	Configuration 	: idarka
	Model Element	: idarka
//!	Generated Date	: Tue, 24, May 2011 
	File Path	: zoinha/idarka/Mainzoinha.java
*********************************************************************/


//## auto_generated
import Default.*;
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
    
    protected static Jav.wrzutnia p_wrzutnia = null;
    
    //## configuration zoinha::idarka 
    public static void main(String[] args) {
        RiJOXF.Init(null, 0, 0, true, args);
        Mainzoinha initializer_zoinha = new Mainzoinha();
        p_wrzutnia = new Default.Jav.wrzutnia(RiJMainThread.instance());
        p_wrzutnia.startBehavior();
        //#[ configuration zoinha::idarka 
        //#]
        RiJOXF.Start();
        p_wrzutnia=null;
    }
    
}
/*********************************************************************
	File Path	: zoinha/idarka/Mainzoinha.java
*********************************************************************/

