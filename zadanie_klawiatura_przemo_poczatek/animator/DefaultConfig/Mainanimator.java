/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: PL
	Component	: animator
	Configuration 	: DefaultConfig
	Model Element	: DefaultConfig
//!	Generated Date	: Thu, 12, May 2011 
	File Path	: animator/DefaultConfig/Mainanimator.java
*********************************************************************/


//## auto_generated
import Default.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.*;

//----------------------------------------------------------------------------
// Mainanimator.java                                                                  
//----------------------------------------------------------------------------


//## ignore 
public class Mainanimator {
    
    //#[ ignore
    // link with events in order to register them in the animation browser
    static {
      // Setting Animation Default Port 
      AnimTcpIpConnection.setDefaultPort(6423);
      // Registering Events 
      try {
        
            Class.forName("Default.akcja_gui1");
            Class.forName("Default.akcja_gui2");
    
        // Registering Static Classes 
        
      }
      catch(Exception e) { 
         System.err.println(e.toString());
         e.printStackTrace(System.err);
      }
    }
    //#]
    
    protected static Jav p_Jav = null;
    
    //## configuration animator::DefaultConfig 
    public static void main(String[] args) {
        RiJOXF.Init(null, 0, 0, true, args);
        Mainanimator initializer_animator = new Mainanimator();
        p_Jav = new Jav(RiJMainThread.instance());
        p_Jav.startBehavior();
        //#[ configuration animator::DefaultConfig 
        //#]
        RiJOXF.Start();
        p_Jav=null;
    }
    
}
/*********************************************************************
	File Path	: animator/DefaultConfig/Mainanimator.java
*********************************************************************/

