/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: virtual
	Component	: przemka
	Configuration 	: jhj
	Model Element	: key_6
//!	Generated Date	: Sat, 28, May 2011 
	File Path	: przemka/jhj/Default/key_6.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/key_6.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event key_6() 
public class key_6 extends RiJEvent implements AnimatedEvent {
    
    public static final int key_6_Default_id = 18639;		//## ignore 
    
    
    // Constructors
    
    public  key_6() {
        lId = key_6_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (key_6_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.key_6");
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
          String s="key_6(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: przemka/jhj/Default/key_6.java
*********************************************************************/

