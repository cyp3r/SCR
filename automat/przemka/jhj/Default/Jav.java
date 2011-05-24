/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: virtual
	Component	: przemka
	Configuration 	: jhj
	Model Element	: Jav
//!	Generated Date	: Tue, 24, May 2011 
	File Path	: przemka/jhj/Default/Jav.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/Jav.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Jav 
public class Jav implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassJav = new AnimClass("Default.Jav",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected int cena_produktu;		//## attribute cena_produktu 
    
    protected String ekran = "start";		//## attribute ekran 
    
    protected int id_product;		//## attribute id_product 
    
    protected String lancuch;		//## attribute lancuch 
    
    protected String lancuch2 = "start";		//## attribute lancuch2 
    
    protected double liczba1;		//## attribute liczba1 
    
    protected double liczba10gr;		//## attribute liczba10gr 
    
    protected double liczba2;		//## attribute liczba2 
    
    protected double liczba20gr;		//## attribute liczba20gr 
    
    protected double liczba5;		//## attribute liczba5 
    
    protected double liczba50gr;		//## attribute liczba50gr 
    
    protected double liczba5gr;		//## attribute liczba5gr 
    
    protected double licznik = 0;		//## attribute licznik 
    
    protected int licznik3;		//## attribute licznik3 
    
    protected java.util.Vector lista;		//## attribute lista 
    
    protected java.util.Hashtable lista_asocjacyjna;		//## attribute lista_asocjacyjna 
    
    protected java.util.HashMap mapka;		//## attribute mapka 
    
    protected String nazwa_produktu;		//## attribute nazwa_produktu 
    
    protected int poziom;		//## attribute poziom 
    
    /**
     * public class Produkt {
     * 	public punkt(RHPString x, int y) {
     * 	nazwa = x;
     * 	cena = y;
     * }
    */
    protected Produkt przyporzadkowanie;		//## attribute przyporzadkowanie 
    
    protected boolean serwisowanie = false;		//## attribute serwisowanie 
    
    protected double suma;		//## attribute suma 
    
    protected Produkt temp_produkt;		//## attribute temp_produkt 
    
    protected double wartosc;		//## attribute wartosc 
    
    protected boolean wybrano_produkt;		//## attribute wybrano_produkt 
    
    protected boolean zaplacono = false;		//## attribute zaplacono 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int znaleziono=1;
    public static final int wydawanie=2;
    public static final int wydano=3;
    public static final int wybor_produktu=4;
    public static final int Ustalanie=5;
    public static final int state_3=6;
    public static final int start_maszyny=7;
    public static final int Start=8;
    public static final int serwis=9;
    public static final int nie_znaleziono=10;
    public static final int napisy_poczatkowe=11;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int Jav_Timeout_znaleziono_id = 1;		//## ignore 
    
    public static final int Jav_Timeout_wydawanie_id = 2;		//## ignore 
    
    public static final int Jav_Timeout_wydano_id = 3;		//## ignore 
    
    public static final int Jav_Timeout_wybor_produktu_id = 4;		//## ignore 
    
    public static final int Jav_Timeout_start_maszyny_id = 5;		//## ignore 
    
    public static final int Jav_Timeout_Start_id = 6;		//## ignore 
    
    public static final int Jav_Timeout_nie_znaleziono_id = 7;		//## ignore 
    
    
    //## statechart_method 
    public RiJThread getThread() {
        return reactive.getThread();
    }
    
    //## statechart_method 
    public void schedTimeout(long delay, long tmID, RiJStateReactive reactive) {
        getThread().schedTimeout(delay, tmID, reactive);
    }
    
    //## statechart_method 
    public void unschedTimeout(long tmID, RiJStateReactive reactive) {
        getThread().unschedTimeout(tmID, reactive);
    }
    
    //## statechart_method 
    public boolean isIn(int state) {
        return reactive.isIn(state);
    }
    
    //## statechart_method 
    public boolean isCompleted(int state) {
        return reactive.isCompleted(state);
    }
    
    //## statechart_method 
    public RiJEventConsumer getEventConsumer() {
        return (RiJEventConsumer)reactive;
    }
    
    //## statechart_method 
    public void gen(RiJEvent event) {
        reactive._gen(event);
    }
    
    //## statechart_method 
    public void queueEvent(RiJEvent event) {
        reactive.queueEvent(event);
    }
    
    //## statechart_method 
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    // Constructors
    
    //## operation Jav() 
    public  Jav(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassJav.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        //#[ operation Jav() 
         wartosc = 0;    
         suma =0 ;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    /**
     * @param wartosc
    */
    //## operation dodaj_nominal(double) 
    public void dodaj_nominal(double wartosc) {
        try {
            animInstance().notifyMethodEntered("dodaj_nominal",
               new ArgData[] {
                   new ArgData(double.class, "wartosc", AnimInstance.animToString(wartosc))
               });
        
        //#[ operation dodaj_nominal(double) 
        suma=wartosc+suma;
        wartosc=0;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation wyczysc() 
    public void wyczysc() {
        try {
            animInstance().notifyMethodEntered("wyczysc",
               new ArgData[] {
               });
        
        //#[ operation wyczysc() 
        suma=0;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getCena_produktu() {
        return cena_produktu;
    }
    
    //## auto_generated 
    public void setCena_produktu(int p_cena_produktu) {
        cena_produktu = p_cena_produktu;
    }
    
    //## auto_generated 
    public String getEkran() {
        return ekran;
    }
    
    //## auto_generated 
    public void setEkran(String p_ekran) {
        ekran = p_ekran;
    }
    
    //## auto_generated 
    public int getId_product() {
        return id_product;
    }
    
    //## auto_generated 
    public void setId_product(int p_id_product) {
        id_product = p_id_product;
    }
    
    //## auto_generated 
    public String getLancuch() {
        return lancuch;
    }
    
    //## auto_generated 
    public void setLancuch(String p_lancuch) {
        lancuch = p_lancuch;
    }
    
    //## auto_generated 
    public String getLancuch2() {
        return lancuch2;
    }
    
    //## auto_generated 
    public void setLancuch2(String p_lancuch2) {
        lancuch2 = p_lancuch2;
    }
    
    //## auto_generated 
    public double getLiczba1() {
        return liczba1;
    }
    
    //## auto_generated 
    public void setLiczba1(double p_liczba1) {
        liczba1 = p_liczba1;
    }
    
    //## auto_generated 
    public double getLiczba10gr() {
        return liczba10gr;
    }
    
    //## auto_generated 
    public void setLiczba10gr(double p_liczba10gr) {
        liczba10gr = p_liczba10gr;
    }
    
    //## auto_generated 
    public double getLiczba2() {
        return liczba2;
    }
    
    //## auto_generated 
    public void setLiczba2(double p_liczba2) {
        liczba2 = p_liczba2;
    }
    
    //## auto_generated 
    public double getLiczba20gr() {
        return liczba20gr;
    }
    
    //## auto_generated 
    public void setLiczba20gr(double p_liczba20gr) {
        liczba20gr = p_liczba20gr;
    }
    
    //## auto_generated 
    public double getLiczba5() {
        return liczba5;
    }
    
    //## auto_generated 
    public void setLiczba5(double p_liczba5) {
        liczba5 = p_liczba5;
    }
    
    //## auto_generated 
    public double getLiczba50gr() {
        return liczba50gr;
    }
    
    //## auto_generated 
    public void setLiczba50gr(double p_liczba50gr) {
        liczba50gr = p_liczba50gr;
    }
    
    //## auto_generated 
    public double getLiczba5gr() {
        return liczba5gr;
    }
    
    //## auto_generated 
    public void setLiczba5gr(double p_liczba5gr) {
        liczba5gr = p_liczba5gr;
    }
    
    //## auto_generated 
    public double getLicznik() {
        return licznik;
    }
    
    //## auto_generated 
    public void setLicznik(double p_licznik) {
        licznik = p_licznik;
    }
    
    //## auto_generated 
    public int getLicznik3() {
        return licznik3;
    }
    
    //## auto_generated 
    public void setLicznik3(int p_licznik3) {
        licznik3 = p_licznik3;
    }
    
    //## auto_generated 
    public java.util.Vector getLista() {
        return lista;
    }
    
    //## auto_generated 
    public void setLista(java.util.Vector p_lista) {
        lista = p_lista;
    }
    
    //## auto_generated 
    public java.util.Hashtable getLista_asocjacyjna() {
        return lista_asocjacyjna;
    }
    
    //## auto_generated 
    public void setLista_asocjacyjna(java.util.Hashtable p_lista_asocjacyjna) {
        lista_asocjacyjna = p_lista_asocjacyjna;
    }
    
    //## auto_generated 
    public java.util.HashMap getMapka() {
        return mapka;
    }
    
    //## auto_generated 
    public void setMapka(java.util.HashMap p_mapka) {
        mapka = p_mapka;
    }
    
    //## auto_generated 
    public String getNazwa_produktu() {
        return nazwa_produktu;
    }
    
    //## auto_generated 
    public void setNazwa_produktu(String p_nazwa_produktu) {
        nazwa_produktu = p_nazwa_produktu;
    }
    
    //## auto_generated 
    public int getPoziom() {
        return poziom;
    }
    
    //## auto_generated 
    public void setPoziom(int p_poziom) {
        try {
        poziom = p_poziom;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
    }
    
    /**
     * public class Produkt {
     * 	public punkt(RHPString x, int y) {
     * 	nazwa = x;
     * 	cena = y;
     * }
    */
    //## auto_generated 
    public Produkt getPrzyporzadkowanie() {
        return przyporzadkowanie;
    }
    
    //## auto_generated 
    public void setPrzyporzadkowanie(Produkt p_przyporzadkowanie) {
        przyporzadkowanie = p_przyporzadkowanie;
    }
    
    //## auto_generated 
    public boolean getSerwisowanie() {
        return serwisowanie;
    }
    
    //## auto_generated 
    public void setSerwisowanie(boolean p_serwisowanie) {
        try {
        serwisowanie = p_serwisowanie;
        }
        finally {
            animInstance().notifyUpdatedAttr();
        }
    }
    
    //## auto_generated 
    public double getSuma() {
        return suma;
    }
    
    //## auto_generated 
    public void setSuma(double p_suma) {
        suma = p_suma;
    }
    
    //## auto_generated 
    public Produkt getTemp_produkt() {
        return temp_produkt;
    }
    
    //## auto_generated 
    public void setTemp_produkt(Produkt p_temp_produkt) {
        temp_produkt = p_temp_produkt;
    }
    
    //## auto_generated 
    public double getWartosc() {
        return wartosc;
    }
    
    //## auto_generated 
    public void setWartosc(double p_wartosc) {
        wartosc = p_wartosc;
    }
    
    //## auto_generated 
    public boolean getWybrano_produkt() {
        return wybrano_produkt;
    }
    
    //## auto_generated 
    public void setWybrano_produkt(boolean p_wybrano_produkt) {
        wybrano_produkt = p_wybrano_produkt;
    }
    
    //## auto_generated 
    public boolean getZaplacono() {
        return zaplacono;
    }
    
    //## auto_generated 
    public void setZaplacono(boolean p_zaplacono) {
        zaplacono = p_zaplacono;
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = false;
        done = reactive.startBehavior();
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive implements AnimatedReactive {
        
        // Default constructor 
        public Reactive() {
            this(RiJMainThread.instance());
        }
        
        
        // Constructors
        
        public  Reactive(RiJThread p_thread) {
            super(p_thread);
            initStatechart();
        }
        
        //## statechart_method 
        public boolean isIn(int state) {
            if(rootState_subState == state)
                {
                    return true;
                }
            return false;
        }
        
        //## statechart_method 
        public boolean isCompleted(int state) {
            return true;
        }
        
        //## statechart_method 
        public void rootState_add(AnimStates animStates) {
            animStates.add("ROOT");
            switch (rootState_subState) {
                case start_maszyny:
                {
                    start_maszyny_add(animStates);
                }
                break;
                case Ustalanie:
                {
                    Ustalanie_add(animStates);
                }
                break;
                case wybor_produktu:
                {
                    wybor_produktu_add(animStates);
                }
                break;
                case znaleziono:
                {
                    znaleziono_add(animStates);
                }
                break;
                case nie_znaleziono:
                {
                    nie_znaleziono_add(animStates);
                }
                break;
                case napisy_poczatkowe:
                {
                    napisy_poczatkowe_add(animStates);
                }
                break;
                case wydawanie:
                {
                    wydawanie_add(animStates);
                }
                break;
                case wydano:
                {
                    wydano_add(animStates);
                }
                break;
                case Start:
                {
                    Start_add(animStates);
                }
                break;
                case state_3:
                {
                    state_3_add(animStates);
                }
                break;
                case serwis:
                {
                    serwis_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public void rootState_entDef() {
            {
                rootState_enter();
                rootStateEntDef();
            }
        }
        
        //## statechart_method 
        public int rootState_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            switch (rootState_active) {
                case start_maszyny:
                {
                    res = start_maszyny_takeEvent(id);
                }
                break;
                case Ustalanie:
                {
                    res = Ustalanie_takeEvent(id);
                }
                break;
                case wybor_produktu:
                {
                    res = wybor_produktu_takeEvent(id);
                }
                break;
                case znaleziono:
                {
                    res = znaleziono_takeEvent(id);
                }
                break;
                case nie_znaleziono:
                {
                    res = nie_znaleziono_takeEvent(id);
                }
                break;
                case napisy_poczatkowe:
                {
                    res = napisy_poczatkowe_takeEvent(id);
                }
                break;
                case wydawanie:
                {
                    res = wydawanie_takeEvent(id);
                }
                break;
                case wydano:
                {
                    res = wydano_takeEvent(id);
                }
                break;
                case Start:
                {
                    res = Start_takeEvent(id);
                }
                break;
                case state_3:
                {
                    res = state_3_takeEvent(id);
                }
                break;
                case serwis:
                {
                    res = serwis_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void znaleziono_add(AnimStates animStates) {
            animStates.add("ROOT.znaleziono");
        }
        
        //## statechart_method 
        public void wydawanie_add(AnimStates animStates) {
            animStates.add("ROOT.wydawanie");
        }
        
        //## statechart_method 
        public void wydano_add(AnimStates animStates) {
            animStates.add("ROOT.wydano");
        }
        
        //## statechart_method 
        public void wybor_produktu_add(AnimStates animStates) {
            animStates.add("ROOT.wybor_produktu");
        }
        
        //## statechart_method 
        public void Ustalanie_add(AnimStates animStates) {
            animStates.add("ROOT.Ustalanie");
        }
        
        //## statechart_method 
        public void state_3_add(AnimStates animStates) {
            animStates.add("ROOT.state_3");
        }
        
        //## statechart_method 
        public void start_maszyny_add(AnimStates animStates) {
            animStates.add("ROOT.start_maszyny");
        }
        
        //## statechart_method 
        public void Start_add(AnimStates animStates) {
            animStates.add("ROOT.Start");
        }
        
        //## statechart_method 
        public void serwis_add(AnimStates animStates) {
            animStates.add("ROOT.serwis");
        }
        
        //## statechart_method 
        public void nie_znaleziono_add(AnimStates animStates) {
            animStates.add("ROOT.nie_znaleziono");
        }
        
        //## statechart_method 
        public void napisy_poczatkowe_add(AnimStates animStates) {
            animStates.add("ROOT.napisy_poczatkowe");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_50gr() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("16");
            Start_exit();
            //#[ transition 16 
            dodaj_nominal(50);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("16");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_3_entDef() {
            state_3_enter();
        }
        
        //## statechart_method 
        public int wydanoTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Jav_Timeout_wydano_id)
                {
                    animInstance().notifyTransitionStarted("21");
                    wydano_exit();
                    napisy_poczatkowe_entDef();
                    animInstance().notifyTransitionEnded("21");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void wydano_entDef() {
            wydano_enter();
        }
        
        //## statechart_method 
        public void wydawanie_entDef() {
            wydawanie_enter();
        }
        
        //## statechart_method 
        public void serwisExit() {
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_5gr() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("13");
            Start_exit();
            //#[ transition 13 
            dodaj_nominal(5);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("13");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_3_exit() {
            popNullConfig();
            state_3Exit();
            animInstance().notifyStateExited("ROOT.state_3");
        }
        
        //## statechart_method 
        public int wydano_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = wydanoTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void nie_znaleziono_exit() {
            nie_znalezionoExit();
            animInstance().notifyStateExited("ROOT.nie_znaleziono");
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_5() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("11");
            Start_exit();
            //#[ transition 11 
            dodaj_nominal(500);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("11");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int state_3_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = state_3TakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_20gr() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("15");
            Start_exit();
            //#[ transition 15 
            dodaj_nominal(20);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("15");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Start_entDef() {
            Start_enter();
        }
        
        //## statechart_method 
        public void nie_znaleziono_entDef() {
            nie_znaleziono_enter();
        }
        
        //## statechart_method 
        public int StartTakezwrot() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("19");
            Start_exit();
            //#[ transition 19 
            wyczysc();
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("19");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_10gr() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("14");
            Start_exit();
            //#[ transition 14 
            dodaj_nominal(10);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("14");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int start_maszynyTakedo_wyboru() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            start_maszyny_exit();
            wybor_produktu_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void start_maszyny_entDef() {
            start_maszyny_enter();
        }
        
        //## statechart_method 
        public void wybor_produktu_entDef() {
            wybor_produktu_enter();
        }
        
        //## statechart_method 
        public int wydawanie_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = wydawanieTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void StartExit() {
            itsRiJThread.unschedTimeout(Jav_Timeout_Start_id, this);
        }
        
        //## statechart_method 
        public void Start_enter() {
            animInstance().notifyStateEntered("ROOT.Start");
            rootState_subState = Start;
            rootState_active = Start;
            StartEnter();
        }
        
        //## statechart_method 
        public int wybor_produktu_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = wybor_produktuTakeNull();
                }
            else if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = wybor_produktuTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void wydano_enter() {
            animInstance().notifyStateEntered("ROOT.wydano");
            rootState_subState = wydano;
            rootState_active = wydano;
            wydanoEnter();
        }
        
        //## statechart_method 
        public void wydanoEnter() {
            //#[ state ROOT.wydano.(Entry) 
            lancuch = "WYDANO";
            
            //#]
            itsRiJThread.schedTimeout(1000, Jav_Timeout_wydano_id, this, "ROOT.wydano");
        }
        
        //## statechart_method 
        public int znaleziono_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = znalezionoTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void znalezionoExit() {
            itsRiJThread.unschedTimeout(Jav_Timeout_znaleziono_id, this);
        }
        
        //## statechart_method 
        public void serwisEnter() {
            //#[ state ROOT.serwis.(Entry) 
            lancuch = "Tryb serwowy aktywny...";
            ekran = "Podaj ilosc produktow o ktore poprosi automat...";
            //#]
        }
        
        //## statechart_method 
        public void serwis_entDef() {
            serwis_enter();
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_1zl() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("17");
            Start_exit();
            //#[ transition 17 
            dodaj_nominal(100);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("17");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void start_maszynyExit() {
            itsRiJThread.unschedTimeout(Jav_Timeout_start_maszyny_id, this);
        }
        
        //## statechart_method 
        public int UstalanieTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            Ustalanie_exit();
            napisy_poczatkowe_entDef();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void UstalanieExit() {
        }
        
        //## statechart_method 
        public int wybor_produktuTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Jav_Timeout_wybor_produktu_id)
                {
                    animInstance().notifyTransitionStarted("4");
                    wybor_produktu_exit();
                    start_maszyny_entDef();
                    animInstance().notifyTransitionEnded("4");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void napisy_poczatkoweExit() {
        }
        
        //## statechart_method 
        public int nie_znaleziono_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = nie_znalezionoTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int nie_znalezionoTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Jav_Timeout_nie_znaleziono_id)
                {
                    animInstance().notifyTransitionStarted("7");
                    nie_znaleziono_exit();
                    napisy_poczatkowe_entDef();
                    animInstance().notifyTransitionEnded("7");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int StartTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Jav_Timeout_Start_id)
                {
                    //## transition 20 
                    if(zaplacono==true)
                        {
                            animInstance().notifyTransitionStarted("20");
                            Start_exit();
                            wydawanie_entDef();
                            animInstance().notifyTransitionEnded("20");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_2zl() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("18");
            Start_exit();
            //#[ transition 18 
            dodaj_nominal(200);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("18");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int start_maszynyTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Jav_Timeout_start_maszyny_id)
                {
                    //## transition 22 
                    if(serwisowanie==true)
                        {
                            animInstance().notifyTransitionStarted("22");
                            start_maszyny_exit();
                            serwis_entDef();
                            animInstance().notifyTransitionEnded("22");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public void Ustalanie_enter() {
            animInstance().notifyStateEntered("ROOT.Ustalanie");
            pushNullConfig();
            rootState_subState = Ustalanie;
            rootState_active = Ustalanie;
            UstalanieEnter();
        }
        
        //## statechart_method 
        public void wydawanieExit() {
            itsRiJThread.unschedTimeout(Jav_Timeout_wydawanie_id, this);
        }
        
        //## statechart_method 
        public void napisy_poczatkowe_entDef() {
            napisy_poczatkowe_enter();
        }
        
        //## statechart_method 
        public void StartEnter() {
            //#[ state ROOT.Start.(Entry) 
            temp_produkt = (Produkt)lista_asocjacyjna.get(id_product); 
            nazwa_produktu = temp_produkt.nazwa;
            int cena_produktu = temp_produkt.cena;               
            ekran=nazwa_produktu+" cena: "+(double)cena_produktu/100+" zl "; 
            
            			
            
            licznik=suma-cena_produktu;
            ekran+="Aktualny stan="+(double)licznik/100+" zl     "; 	
            //ekran+=" ====== licznik wynosi"+licznik+"=========";
            if (licznik==0) {
            ekran+="\r Nie bedzie reszty";
            
            }
            else if (licznik<0) ekran+="Za malo pieniazkow";
            else ekran+= "\r   Wydawanie reszty: "+licznik/100+" zl			";
            if (licznik>=0) zaplacono=true;
            if (licznik>0){
            ekran += "Reszta zostanie wydana w: ";  
            licznik3=(int)licznik;
            if (licznik3 >= 0) 
            {liczba5 = licznik3/500; 
            if (liczba5>0) {
            	ekran = ekran + (int)liczba5 + "x5 zl " ;
            	licznik3=licznik3-(int)liczba5*500;
            }
              liczba2 = licznik3/200; 
            if (liczba2>0) {
            	ekran = ekran + (int)liczba2 + "x2 zl " ;
            	licznik3=licznik3-(int)liczba2*200;
            }
            liczba1 = licznik3/100;   
            if (liczba1>0) {
            	ekran= ekran + (int)liczba1 + "x1 zl " ;
            	licznik3=licznik3-(int)liczba1*100;
            }  
              
            liczba50gr = licznik3/50;   
            if (liczba50gr>0) {
            	ekran = ekran + (int)liczba50gr + "x50 gr " ;
            	licznik3=licznik3-(int)liczba50gr*50;
            }    
            liczba20gr = licznik3/20;   
            if (liczba20gr>0) {
            	ekran = ekran + (int)liczba20gr + "x20 gr " ;
            	licznik3=licznik3-(int)liczba20gr*20;
            }
            liczba10gr = licznik3/10;   
            if (liczba10gr>0) {
            	ekran = ekran + (int)liczba10gr + "x10 gr " ;
            	licznik3=licznik3-(int)liczba10gr*10;
            }
            liczba5gr = licznik3/5;   
            if (liczba5gr>0) {
            	ekran = ekran + (int)liczba5gr + "x5 gr " ;
            	licznik3=licznik3-(int)liczba5gr*5;
            }        
            } 
            }
            //#]
            itsRiJThread.schedTimeout(1000, Jav_Timeout_Start_id, this, "ROOT.Start");
        }
        
        //## statechart_method 
        public void start_maszynyEnter() {
            //#[ state ROOT.start_maszyny.(Entry) 
            if(id_product == 0)
            	id_product = poziom;
            else if(id_product < 10)
                id_product = id_product*10 + poziom;
            else 
                id_product = poziom;
            
            lancuch = "Wybrano numer: " + id_product;
            //#]
            itsRiJThread.schedTimeout(1000, Jav_Timeout_start_maszyny_id, this, "ROOT.start_maszyny");
        }
        
        //## statechart_method 
        public void UstalanieEnter() {
            //#[ state ROOT.Ustalanie.(Entry) 
            lista_asocjacyjna = new java.util.Hashtable<Integer, Produkt>(); 
            
            przyporzadkowanie = new Produkt("soczek Kubuœ",new Integer(200));
            lista_asocjacyjna.put(new Integer(1),przyporzadkowanie);
            
            //soki // spróbuj delete przyporzdkowanie
            przyporzadkowanie = new Produkt("sok Mateuszek", new Integer(200)); 
            lista_asocjacyjna.put(new Integer(2),przyporzadkowanie);
            przyporzadkowanie = new Produkt("sok Lukaszek", new Integer(300));
            lista_asocjacyjna.put(new Integer(3),przyporzadkowanie);
            przyporzadkowanie = new Produkt("sok Wojtus", new Integer(400));
            lista_asocjacyjna.put(new Integer(4),przyporzadkowanie);
            przyporzadkowanie = new Produkt("sok Dariuszek", new Integer(500));
            lista_asocjacyjna.put(new Integer(5),przyporzadkowanie);
            przyporzadkowanie = new Produkt("sok Madzia", new Integer(200));
            lista_asocjacyjna.put(new Integer(6),przyporzadkowanie);
            przyporzadkowanie = new Produkt("sok Jaromis", new Integer(200));
            lista_asocjacyjna.put(new Integer(7),przyporzadkowanie);
            przyporzadkowanie = new Produkt("sok Przemka", new Integer(200));
            lista_asocjacyjna.put(new Integer(8),przyporzadkowanie);
            //batony
            przyporzadkowanie = new Produkt("baton Uberweiss", new Integer(110));
            lista_asocjacyjna.put(new Integer(11),przyporzadkowanie);
            przyporzadkowanie = new Produkt("baton Lange Schlange", new Integer(120)); 
            lista_asocjacyjna.put(new Integer(12),przyporzadkowanie);
            przyporzadkowanie = new Produkt("baton Auf Wiedersehen", new Integer(130));
            lista_asocjacyjna.put(new Integer(13),przyporzadkowanie);
            przyporzadkowanie = new Produkt("baton Verboten", new Integer(140));
            lista_asocjacyjna.put(new Integer(14),przyporzadkowanie);
            przyporzadkowanie = new Produkt("baton Klar", new Integer(150));
            lista_asocjacyjna.put(new Integer(15),przyporzadkowanie);
            przyporzadkowanie = new Produkt("baton Balaton", new Integer(160));
            lista_asocjacyjna.put(new Integer(16),przyporzadkowanie);
            
            //mozna szukac tak: lista_asocjacyjna.containsKey(int);
            //#]
        }
        
        //## statechart_method 
        public void wybor_produktu_enter() {
            animInstance().notifyStateEntered("ROOT.wybor_produktu");
            pushNullConfig();
            rootState_subState = wybor_produktu;
            rootState_active = wybor_produktu;
            wybor_produktuEnter();
        }
        
        //## statechart_method 
        public void wydano_exit() {
            wydanoExit();
            animInstance().notifyStateExited("ROOT.wydano");
        }
        
        //## statechart_method 
        public void wydawanie_enter() {
            animInstance().notifyStateEntered("ROOT.wydawanie");
            rootState_subState = wydawanie;
            rootState_active = wydawanie;
            wydawanieEnter();
        }
        
        //## statechart_method 
        public void znalezionoEnter() {
            //#[ state ROOT.znaleziono.(Entry) 
            temp_produkt = (Produkt)lista_asocjacyjna.get(id_product); 
            nazwa_produktu = temp_produkt.nazwa;   
            lancuch = "znaleziono produkt " + nazwa_produktu;
            
            //#]
            itsRiJThread.schedTimeout(1000, Jav_Timeout_znaleziono_id, this, "ROOT.znaleziono");
        }
        
        //## statechart_method 
        public void rootState_enter() {
            animInstance().notifyStateEntered("ROOT");
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public int serwis_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = serwisTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void serwis_exit() {
            popNullConfig();
            serwisExit();
            animInstance().notifyStateExited("ROOT.serwis");
        }
        
        //## statechart_method 
        public int start_maszyny_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(do_wyboru.do_wyboru_Default_id))
                {
                    res = start_maszynyTakedo_wyboru();
                }
            else if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = start_maszynyTakeRiJTimeout();
                }
            else if(event.isTypeOf(starcik.starcik_Default_id))
                {
                    res = start_maszynyTakestarcik();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void znaleziono_enter() {
            animInstance().notifyStateEntered("ROOT.znaleziono");
            rootState_subState = znaleziono;
            rootState_active = znaleziono;
            znalezionoEnter();
        }
        
        //## statechart_method 
        public void state_3Exit() {
        }
        
        //## statechart_method 
        public void wybor_produktuEnter() {
            //#[ state ROOT.wybor_produktu.(Entry) 
            if (lista_asocjacyjna.containsKey(id_product)){
            	wybrano_produkt = true;                  
            }
            else{
                    wybrano_produkt = false;
            }
                                           
                
            
            //#]
            itsRiJThread.schedTimeout(100, Jav_Timeout_wybor_produktu_id, this, "ROOT.wybor_produktu");
        }
        
        //## statechart_method 
        public int znalezionoTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Jav_Timeout_znaleziono_id)
                {
                    animInstance().notifyTransitionStarted("9");
                    znaleziono_exit();
                    Start_entDef();
                    animInstance().notifyTransitionEnded("9");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int napisy_poczatkoweTakestarcik() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            napisy_poczatkowe_exit();
            start_maszyny_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void napisy_poczatkoweEnter() {
            //#[ state ROOT.napisy_poczatkowe.(Entry) 
            lancuch = "Wybierz cyfre i zatwierdz ja klawiszem \"OK\".";
            ekran = "Witaj drogi kliencie!";
            serwisowanie = false;
            //#]
        }
        
        //## statechart_method 
        public void Start_exit() {
            StartExit();
            animInstance().notifyStateExited("ROOT.Start");
        }
        
        //## statechart_method 
        public void start_maszyny_exit() {
            start_maszynyExit();
            animInstance().notifyStateExited("ROOT.start_maszyny");
        }
        
        //## statechart_method 
        public void Ustalanie_exit() {
            popNullConfig();
            UstalanieExit();
            animInstance().notifyStateExited("ROOT.Ustalanie");
        }
        
        //## statechart_method 
        public void znaleziono_exit() {
            znalezionoExit();
            animInstance().notifyStateExited("ROOT.znaleziono");
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("1");
            Ustalanie_entDef();
            animInstance().notifyTransitionEnded("1");
        }
        
        //## statechart_method 
        public void serwis_enter() {
            animInstance().notifyStateEntered("ROOT.serwis");
            pushNullConfig();
            rootState_subState = serwis;
            rootState_active = serwis;
            serwisEnter();
        }
        
        //## statechart_method 
        public int state_3TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("12");
            state_3_exit();
            Start_entDef();
            animInstance().notifyTransitionEnded("12");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void wydanoExit() {
            itsRiJThread.unschedTimeout(Jav_Timeout_wydano_id, this);
        }
        
        //## statechart_method 
        public void wydawanieEnter() {
            //#[ state ROOT.wydawanie.(Entry) 
            lancuch = "wydawanie " + nazwa_produktu;
            
            //#]
            itsRiJThread.schedTimeout(1000, Jav_Timeout_wydawanie_id, this, "ROOT.wydawanie");
        }
        
        //## statechart_method 
        public void state_3_enter() {
            animInstance().notifyStateEntered("ROOT.state_3");
            pushNullConfig();
            rootState_subState = state_3;
            rootState_active = state_3;
            state_3Enter();
        }
        
        //## statechart_method 
        public void Ustalanie_entDef() {
            Ustalanie_enter();
        }
        
        //## statechart_method 
        public int wybor_produktuTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 5 
            if(wybrano_produkt==true)
                {
                    animInstance().notifyTransitionStarted("5");
                    wybor_produktu_exit();
                    znaleziono_entDef();
                    animInstance().notifyTransitionEnded("5");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 6 
                    if(wybrano_produkt==false)
                        {
                            animInstance().notifyTransitionStarted("6");
                            wybor_produktu_exit();
                            nie_znaleziono_entDef();
                            animInstance().notifyTransitionEnded("6");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public void wybor_produktu_exit() {
            popNullConfig();
            wybor_produktuExit();
            animInstance().notifyStateExited("ROOT.wybor_produktu");
        }
        
        //## statechart_method 
        public void napisy_poczatkowe_exit() {
            napisy_poczatkoweExit();
            animInstance().notifyStateExited("ROOT.napisy_poczatkowe");
        }
        
        //## statechart_method 
        public void napisy_poczatkowe_enter() {
            animInstance().notifyStateEntered("ROOT.napisy_poczatkowe");
            rootState_subState = napisy_poczatkowe;
            rootState_active = napisy_poczatkowe;
            napisy_poczatkoweEnter();
        }
        
        //## statechart_method 
        public void nie_znaleziono_enter() {
            animInstance().notifyStateEntered("ROOT.nie_znaleziono");
            rootState_subState = nie_znaleziono;
            rootState_active = nie_znaleziono;
            nie_znalezionoEnter();
        }
        
        //## statechart_method 
        public void start_maszyny_enter() {
            animInstance().notifyStateEntered("ROOT.start_maszyny");
            rootState_subState = start_maszyny;
            rootState_active = start_maszyny;
            start_maszynyEnter();
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public int napisy_poczatkowe_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(starcik.starcik_Default_id))
                {
                    res = napisy_poczatkoweTakestarcik();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int Start_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(dodaj_nominal_10gr.dodaj_nominal_10gr_Default_id))
                {
                    res = StartTakedodaj_nominal_10gr();
                }
            else if(event.isTypeOf(zwrot.zwrot_Default_id))
                {
                    res = StartTakezwrot();
                }
            else if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = StartTakeRiJTimeout();
                }
            else if(event.isTypeOf(dodaj_nominal_5gr.dodaj_nominal_5gr_Default_id))
                {
                    res = StartTakedodaj_nominal_5gr();
                }
            else if(event.isTypeOf(dodaj_nominal_1zl.dodaj_nominal_1zl_Default_id))
                {
                    res = StartTakedodaj_nominal_1zl();
                }
            else if(event.isTypeOf(dodaj_nominal_50gr.dodaj_nominal_50gr_Default_id))
                {
                    res = StartTakedodaj_nominal_50gr();
                }
            else if(event.isTypeOf(dodaj_nominal_2zl.dodaj_nominal_2zl_Default_id))
                {
                    res = StartTakedodaj_nominal_2zl();
                }
            else if(event.isTypeOf(dodaj_nominal_5.dodaj_nominal_5_Default_id))
                {
                    res = StartTakedodaj_nominal_5();
                }
            else if(event.isTypeOf(dodaj_nominal_20gr.dodaj_nominal_20gr_Default_id))
                {
                    res = StartTakedodaj_nominal_20gr();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int Ustalanie_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = UstalanieTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void wydawanie_exit() {
            wydawanieExit();
            animInstance().notifyStateExited("ROOT.wydawanie");
        }
        
        //## statechart_method 
        public void znaleziono_entDef() {
            znaleziono_enter();
        }
        
        //## statechart_method 
        public void nie_znalezionoExit() {
            itsRiJThread.unschedTimeout(Jav_Timeout_nie_znaleziono_id, this);
        }
        
        //## statechart_method 
        public void nie_znalezionoEnter() {
            //#[ state ROOT.nie_znaleziono.(Entry) 
            lancuch = "Produktu " + id_product + " nie znaleziono. Czekaj...";
            //#]
            itsRiJThread.schedTimeout(2000, Jav_Timeout_nie_znaleziono_id, this, "ROOT.nie_znaleziono");
        }
        
        //## statechart_method 
        public int serwisTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 23 
            if(serwisowanie==false)
                {
                    animInstance().notifyTransitionStarted("23");
                    serwis_exit();
                    start_maszyny_entDef();
                    animInstance().notifyTransitionEnded("23");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int start_maszynyTakestarcik() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("0");
            start_maszyny_exit();
            start_maszyny_entDef();
            animInstance().notifyTransitionEnded("0");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void state_3Enter() {
        }
        
        //## statechart_method 
        public void wybor_produktuExit() {
            itsRiJThread.unschedTimeout(Jav_Timeout_wybor_produktu_id, this);
        }
        
        //## statechart_method 
        public int wydawanieTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Jav_Timeout_wydawanie_id)
                {
                    animInstance().notifyTransitionStarted("10");
                    wydawanie_exit();
                    wydano_entDef();
                    animInstance().notifyTransitionEnded("10");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        /**  methods added just for design level debugging instrumentation */
        public boolean startBehavior() {
            try {
              animInstance().notifyBehavioralMethodEntered("startBehavior",
                  new ArgData[] {
                   });
              return super.startBehavior();
            }
            finally {
              animInstance().notifyMethodExit();
            }
        }
        public int takeEvent(RiJEvent event) { 
            try { 
              //animInstance().notifyTakeEvent(new AnimEvent(event));
              animInstance().notifyBehavioralMethodEntered("takeEvent",
                  new ArgData[] { new ArgData(RiJEvent.class, "event", event.toString())
                   });
              return super.takeEvent(event); 
            }
            finally { 
              animInstance().notifyMethodExit();
            }
        }
        /**  see com.ibm.rational.rhapsody.animation.AnimatedReactive interface */
        public AnimInstance animInstance() { 
            return Jav.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassJav; 
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
        
        msg.add("lancuch", lancuch);
        msg.add("poziom", poziom);
        msg.add("id_product", id_product);
        msg.add("licznik", licznik);
        msg.add("lista", lista);
        msg.add("lista_asocjacyjna", lista_asocjacyjna);
        msg.add("wybrano_produkt", wybrano_produkt);
        msg.add("mapka", mapka);
        msg.add("przyporzadkowanie", przyporzadkowanie);
        msg.add("nazwa_produktu", nazwa_produktu);
        msg.add("temp_produkt", temp_produkt);
        msg.add("ekran", ekran);
        msg.add("lancuch2", lancuch2);
        msg.add("liczba1", liczba1);
        msg.add("liczba2", liczba2);
        msg.add("liczba5", liczba5);
        msg.add("liczba5gr", liczba5gr);
        msg.add("liczba10gr", liczba10gr);
        msg.add("liczba20gr", liczba20gr);
        msg.add("liczba50gr", liczba50gr);
        msg.add("licznik3", licznik3);
        msg.add("suma", suma);
        msg.add("wartosc", wartosc);
        msg.add("cena_produktu", cena_produktu);
        msg.add("zaplacono", zaplacono);
        msg.add("serwisowanie", serwisowanie);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Jav.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Jav.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Jav.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: przemka/jhj/Default/Jav.java
*********************************************************************/

