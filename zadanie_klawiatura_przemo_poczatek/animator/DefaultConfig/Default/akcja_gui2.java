/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: PL
	Component	: animator
	Configuration 	: DefaultConfig
	Model Element	: akcja_gui2
//!	Generated Date	: Thu, 12, May 2011 
	File Path	: animator/DefaultConfig/Default/akcja_gui2.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/akcja_gui2.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event akcja_gui2() 
public class akcja_gui2 extends RiJEvent implements AnimatedEvent {
    
    public static final int akcja_gui2_Default_id = 18617;		//## ignore 
    
    
    // Constructors
    
    public  akcja_gui2() {
        lId = akcja_gui2_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (akcja_gui2_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.akcja_gui2");
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
          String s="akcja_gui2(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: animator/DefaultConfig/Default/akcja_gui2.java
*********************************************************************/

