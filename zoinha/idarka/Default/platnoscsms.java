/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: virtual
	Component	: zoinha
	Configuration 	: idarka
	Model Element	: platnoscsms
//!	Generated Date	: Sat, 28, May 2011 
	File Path	: zoinha/idarka/Default/platnoscsms.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/platnoscsms.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event platnoscsms() 
public class platnoscsms extends RiJEvent implements AnimatedEvent {
    
    public static final int platnoscsms_Default_id = 18633;		//## ignore 
    
    
    // Constructors
    
    public  platnoscsms() {
        lId = platnoscsms_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (platnoscsms_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.platnoscsms");
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
          String s="platnoscsms(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: zoinha/idarka/Default/platnoscsms.java
*********************************************************************/

