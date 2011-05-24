/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: virtual
	Component	: przemka
	Configuration 	: jhj
	Model Element	: serwisIn
//!	Generated Date	: Tue, 24, May 2011 
	File Path	: przemka/jhj/Default/serwisIn.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/serwisIn.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event serwisIn() 
public class serwisIn extends RiJEvent implements AnimatedEvent {
    
    public static final int serwisIn_Default_id = 18631;		//## ignore 
    
    
    // Constructors
    
    public  serwisIn() {
        lId = serwisIn_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (serwisIn_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.serwisIn");
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
          String s="serwisIn(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: przemka/jhj/Default/serwisIn.java
*********************************************************************/

