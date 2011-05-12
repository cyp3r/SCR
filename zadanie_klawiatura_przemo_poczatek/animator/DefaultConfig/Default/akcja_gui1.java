/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: PL
	Component	: animator
	Configuration 	: DefaultConfig
	Model Element	: akcja_gui1
//!	Generated Date	: Thu, 12, May 2011 
	File Path	: animator/DefaultConfig/Default/akcja_gui1.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/akcja_gui1.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event akcja_gui1() 
public class akcja_gui1 extends RiJEvent implements AnimatedEvent {
    
    public static final int akcja_gui1_Default_id = 18616;		//## ignore 
    
    
    // Constructors
    
    public  akcja_gui1() {
        lId = akcja_gui1_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (akcja_gui1_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.akcja_gui1");
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
          String s="akcja_gui1(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: animator/DefaultConfig/Default/akcja_gui1.java
*********************************************************************/

