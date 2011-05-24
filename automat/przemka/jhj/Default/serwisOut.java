/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: virtual
	Component	: przemka
	Configuration 	: jhj
	Model Element	: serwisOut
//!	Generated Date	: Tue, 24, May 2011 
	File Path	: przemka/jhj/Default/serwisOut.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/serwisOut.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event serwisOut() 
public class serwisOut extends RiJEvent implements AnimatedEvent {
    
    public static final int serwisOut_Default_id = 18632;		//## ignore 
    
    
    // Constructors
    
    public  serwisOut() {
        lId = serwisOut_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (serwisOut_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.serwisOut");
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
          String s="serwisOut(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: przemka/jhj/Default/serwisOut.java
*********************************************************************/

