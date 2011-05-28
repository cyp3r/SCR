/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: virtual
	Component	: przemka
	Configuration 	: jhj
	Model Element	: wlaczSerwisowanie
//!	Generated Date	: Tue, 24, May 2011 
	File Path	: przemka/jhj/Default/wlaczSerwisowanie.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/wlaczSerwisowanie.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event wlaczSerwisowanie() 
public class wlaczSerwisowanie extends RiJEvent implements AnimatedEvent {
    
    public static final int wlaczSerwisowanie_Default_id = 18629;		//## ignore 
    
    
    // Constructors
    
    public  wlaczSerwisowanie() {
        lId = wlaczSerwisowanie_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (wlaczSerwisowanie_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.wlaczSerwisowanie");
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public void addAttributes(AnimAttributes msg) {      
    }
    public String toString() {
          String s="wlaczSerwisowanie(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: przemka/jhj/Default/wlaczSerwisowanie.java
*********************************************************************/

