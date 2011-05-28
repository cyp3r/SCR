/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: virtual
	Component	: zoinha
	Configuration 	: idarka
	Model Element	: Produkt
//!	Generated Date	: Sat, 28, May 2011 
	File Path	: zoinha/idarka/Default/Produkt.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/Produkt.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Produkt 
public class Produkt implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassProdukt = new AnimClass("Default.Produkt",false);
    //#]
    
    protected int cena;		//## attribute cena 
    
    protected int ilosc;		//## attribute ilosc 
    
    protected String nazwa;		//## attribute nazwa 
    
    
    // Constructors
    
    /**
     * @param n
     * @param c
     * @param count
    */
    //## operation Produkt(RhpString,int,int) 
    public  Produkt(final String n, int c, int count) {
        try {
            animInstance().notifyConstructorEntered(animClassProdukt.getUserClass(),
               new ArgData[] {
                   new ArgData(String.class, "n", AnimInstance.animToString(n)),
                   new ArgData(int.class, "c", AnimInstance.animToString(c)),
                   new ArgData(int.class, "count", AnimInstance.animToString(count))
               });
        
        //#[ operation Produkt(RhpString,int,int) 
        	nazwa = n;
        	cena = c;  
        	ilosc = count;
        
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    //## auto_generated 
    public  Produkt() {
        try {
            animInstance().notifyConstructorEntered(animClassProdukt.getUserClass(),
               new ArgData[] {
               });
        
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getCena() {
        return cena;
    }
    
    //## auto_generated 
    public void setCena(int p_cena) {
        cena = p_cena;
    }
    
    //## auto_generated 
    public int getIlosc() {
        return ilosc;
    }
    
    //## auto_generated 
    public void setIlosc(int p_ilosc) {
        ilosc = p_ilosc;
    }
    
    //## auto_generated 
    public String getNazwa() {
        return nazwa;
    }
    
    //## auto_generated 
    public void setNazwa(String p_nazwa) {
        nazwa = p_nazwa;
    }
    
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassProdukt; 
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
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
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimInstance animInstance() {
        if (animate == null) 
            animate = new Animate(); 
        return animate; 
    } 
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addAttributes(AnimAttributes msg) {
        
        msg.add("nazwa", nazwa);
        msg.add("cena", cena);
        msg.add("ilosc", ilosc);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Produkt.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Produkt.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Produkt.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: zoinha/idarka/Default/Produkt.java
*********************************************************************/

