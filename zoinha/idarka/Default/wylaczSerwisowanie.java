/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: virtual
	Component	: zoinha
	Configuration 	: idarka
	Model Element	: wylaczSerwisowanie
//!	Generated Date	: Sat, 28, May 2011 
	File Path	: zoinha/idarka/Default/wylaczSerwisowanie.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/wylaczSerwisowanie.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event wylaczSerwisowanie() 
public class wylaczSerwisowanie extends RiJEvent implements AnimatedEvent {
    
    public static final int wylaczSerwisowanie_Default_id = 18630;		//## ignore 
    
    
    // Constructors
    
    public  wylaczSerwisowanie() {
        lId = wylaczSerwisowanie_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (wylaczSerwisowanie_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.wylaczSerwisowanie");
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
          String s="wylaczSerwisowanie(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: zoinha/idarka/Default/wylaczSerwisowanie.java
*********************************************************************/

