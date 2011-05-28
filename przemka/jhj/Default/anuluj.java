/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: virtual
	Component	: przemka
	Configuration 	: jhj
	Model Element	: anuluj
//!	Generated Date	: Sat, 28, May 2011 
	File Path	: przemka/jhj/Default/anuluj.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/anuluj.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event anuluj() 
public class anuluj extends RiJEvent implements AnimatedEvent {
    
    public static final int anuluj_Default_id = 18643;		//## ignore 
    
    
    // Constructors
    
    public  anuluj() {
        lId = anuluj_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (anuluj_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.anuluj");
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
          String s="anuluj(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: przemka/jhj/Default/anuluj.java
*********************************************************************/

