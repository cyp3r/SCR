/*********************************************************************
	Rhapsody	: 7.5.3
	Login		: virtual
	Component	: przemka
	Configuration 	: jhj
	Model Element	: Jav
//!	Generated Date	: Sat, 28, May 2011 
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
    
    protected boolean brak_produktu;		//## attribute brak_produktu 
    
    protected int cena_produktu;		//## attribute cena_produktu 
    
    protected String ekran = "start";		//## attribute ekran 
    
    protected int id_product;		//## attribute id_product 
    
    /**
     * Liczba cyfr ktore podano przy wpisywaniu kodu sms
    */
    protected int kod_cyfry = 0;		//## attribute kod_cyfry 
    
    /**
     * Maksymalna liczba cyfr, ktore moze miec kod sms
    */
    protected int kod_max_cyfry = 5;		//## attribute kod_max_cyfry 
    
    protected int kod_sms;		//## attribute kod_sms 
    
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
    
    protected int produkt_1;		//## attribute produkt_1 
    
    protected int produkt_2;		//## attribute produkt_2 
    
    protected int produkt_3;		//## attribute produkt_3 
    
    protected int produkt_4;		//## attribute produkt_4 
    
    protected int produkt_5;		//## attribute produkt_5 
    
    protected int produkt_6;		//## attribute produkt_6 
    
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
    
    protected boolean weryfikuj_sms = false;		//## attribute weryfikuj_sms 
    
    protected boolean wybrano_produkt;		//## attribute wybrano_produkt 
    
    protected boolean wybrano_sms = false;		//## attribute wybrano_sms 
    
    protected boolean zaplacono = false;		//## attribute zaplacono 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int znaleziono_produkt_sms=1;
    public static final int znaleziono=2;
    public static final int wydawanie=3;
    public static final int wydano=4;
    public static final int wybor_produktu=5;
    public static final int Ustalanie=6;
    public static final int state_3=7;
    public static final int start_maszyny=8;
    public static final int Start=9;
    public static final int przelicz_sms=10;
    public static final int platnosc_sms=11;
    public static final int nie_znaleziono=12;
    public static final int napisy_poczatkowe=13;
    public static final int blad_sms=14;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int Jav_Timeout_znaleziono_id = 1;		//## ignore 
    
    public static final int Jav_Timeout_wydawanie_id = 2;		//## ignore 
    
    public static final int Jav_Timeout_wydano_id = 3;		//## ignore 
    
    public static final int Jav_Timeout_wybor_produktu_id = 4;		//## ignore 
    
    public static final int Jav_Timeout_Start_id = 5;		//## ignore 
    
    public static final int Jav_Timeout_platnosc_sms_id = 6;		//## ignore 
    
    public static final int Jav_Timeout_nie_znaleziono_id = 7;		//## ignore 
    
    public static final int Jav_Timeout_blad_sms_id = 8;		//## ignore 
    
    
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
     * @param digit
    */
    //## operation czytaj_klawiature(int) 
    public void czytaj_klawiature(int digit) {
        try {
            animInstance().notifyMethodEntered("czytaj_klawiature",
               new ArgData[] {
                   new ArgData(int.class, "digit", AnimInstance.animToString(digit))
               });
        
        //#[ operation czytaj_klawiature(int) 
        if(serwisowanie){
         //obsluga klawiatury dla modulu serwisowego
        }
        else if(wybrano_sms) {
         // obsluga klawiawiatury dla platnosci sms
         if(kod_cyfry < kod_max_cyfry) {
            if(kod_cyfry == 0) kod_sms = digit;
            else kod_sms = kod_sms*10 + digit;
         }
         kod_cyfry = kod_cyfry + 1;
         	
         if(kod_cyfry == kod_max_cyfry) weryfikuj_sms = true;
        }
        else {      
         //obsluga klawiatury dla wybierania produktow
         	if(id_product < 10) {
        		if(id_product > 0)
        		    id_product = id_product*10 + digit;
        		else 
        		    id_product = digit;   
        	}
        }
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
    public boolean getBrak_produktu() {
        return brak_produktu;
    }
    
    //## auto_generated 
    public void setBrak_produktu(boolean p_brak_produktu) {
        brak_produktu = p_brak_produktu;
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
    public int getKod_cyfry() {
        return kod_cyfry;
    }
    
    //## auto_generated 
    public void setKod_cyfry(int p_kod_cyfry) {
        kod_cyfry = p_kod_cyfry;
    }
    
    //## auto_generated 
    public int getKod_max_cyfry() {
        return kod_max_cyfry;
    }
    
    //## auto_generated 
    public void setKod_max_cyfry(int p_kod_max_cyfry) {
        kod_max_cyfry = p_kod_max_cyfry;
    }
    
    //## auto_generated 
    public int getKod_sms() {
        return kod_sms;
    }
    
    //## auto_generated 
    public void setKod_sms(int p_kod_sms) {
        kod_sms = p_kod_sms;
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
        poziom = p_poziom;
    }
    
    //## auto_generated 
    public int getProdukt_1() {
        return produkt_1;
    }
    
    //## auto_generated 
    public void setProdukt_1(int p_produkt_1) {
        produkt_1 = p_produkt_1;
    }
    
    //## auto_generated 
    public int getProdukt_2() {
        return produkt_2;
    }
    
    //## auto_generated 
    public void setProdukt_2(int p_produkt_2) {
        produkt_2 = p_produkt_2;
    }
    
    //## auto_generated 
    public int getProdukt_3() {
        return produkt_3;
    }
    
    //## auto_generated 
    public void setProdukt_3(int p_produkt_3) {
        produkt_3 = p_produkt_3;
    }
    
    //## auto_generated 
    public int getProdukt_4() {
        return produkt_4;
    }
    
    //## auto_generated 
    public void setProdukt_4(int p_produkt_4) {
        produkt_4 = p_produkt_4;
    }
    
    //## auto_generated 
    public int getProdukt_5() {
        return produkt_5;
    }
    
    //## auto_generated 
    public void setProdukt_5(int p_produkt_5) {
        produkt_5 = p_produkt_5;
    }
    
    //## auto_generated 
    public int getProdukt_6() {
        return produkt_6;
    }
    
    //## auto_generated 
    public void setProdukt_6(int p_produkt_6) {
        produkt_6 = p_produkt_6;
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
    public boolean getWeryfikuj_sms() {
        return weryfikuj_sms;
    }
    
    //## auto_generated 
    public void setWeryfikuj_sms(boolean p_weryfikuj_sms) {
        weryfikuj_sms = p_weryfikuj_sms;
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
    public boolean getWybrano_sms() {
        return wybrano_sms;
    }
    
    //## auto_generated 
    public void setWybrano_sms(boolean p_wybrano_sms) {
        wybrano_sms = p_wybrano_sms;
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
                case platnosc_sms:
                {
                    platnosc_sms_add(animStates);
                }
                break;
                case znaleziono_produkt_sms:
                {
                    znaleziono_produkt_sms_add(animStates);
                }
                break;
                case przelicz_sms:
                {
                    przelicz_sms_add(animStates);
                }
                break;
                case blad_sms:
                {
                    blad_sms_add(animStates);
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
                case platnosc_sms:
                {
                    res = platnosc_sms_takeEvent(id);
                }
                break;
                case znaleziono_produkt_sms:
                {
                    res = znaleziono_produkt_sms_takeEvent(id);
                }
                break;
                case przelicz_sms:
                {
                    res = przelicz_sms_takeEvent(id);
                }
                break;
                case blad_sms:
                {
                    res = blad_sms_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void znaleziono_produkt_sms_add(AnimStates animStates) {
            animStates.add("ROOT.znaleziono_produkt_sms");
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
        public void przelicz_sms_add(AnimStates animStates) {
            animStates.add("ROOT.przelicz_sms");
        }
        
        //## statechart_method 
        public void platnosc_sms_add(AnimStates animStates) {
            animStates.add("ROOT.platnosc_sms");
        }
        
        //## statechart_method 
        public void nie_znaleziono_add(AnimStates animStates) {
            animStates.add("ROOT.nie_znaleziono");
        }
        
        //## statechart_method 
        public void napisy_poczatkowe_add(AnimStates animStates) {
            animStates.add("ROOT.napisy_poczatkowe");
        }
        
        //## statechart_method 
        public void blad_sms_add(AnimStates animStates) {
            animStates.add("ROOT.blad_sms");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void blad_sms_exit() {
            blad_smsExit();
            animInstance().notifyStateExited("ROOT.blad_sms");
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_50gr() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("14");
            Start_exit();
            //#[ transition 14 
            dodaj_nominal(50);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("14");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int start_maszynyTakekey_3() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("25");
            start_maszyny_exit();
            //#[ transition 25 
            czytaj_klawiature(3);
            //#]
            start_maszyny_entDef();
            animInstance().notifyTransitionEnded("25");
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
                    animInstance().notifyTransitionStarted("19");
                    wydano_exit();
                    napisy_poczatkowe_entDef();
                    animInstance().notifyTransitionEnded("19");
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
        public void platnosc_sms_exit() {
            popNullConfig();
            platnosc_smsExit();
            animInstance().notifyStateExited("ROOT.platnosc_sms");
        }
        
        //## statechart_method 
        public int przelicz_sms_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = przelicz_smsTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_5gr() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("11");
            Start_exit();
            //#[ transition 11 
            dodaj_nominal(5);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("11");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int start_maszynyTakekey_4() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("26");
            start_maszyny_exit();
            //#[ transition 26 
            czytaj_klawiature(4);
            //#]
            start_maszyny_entDef();
            animInstance().notifyTransitionEnded("26");
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
        public int blad_sms_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = blad_smsTakeRiJTimeout();
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
            animInstance().notifyTransitionStarted("9");
            Start_exit();
            //#[ transition 9 
            dodaj_nominal(500);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("9");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int start_maszynyTakekey_5() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("27");
            start_maszyny_exit();
            //#[ transition 27 
            czytaj_klawiature(5);
            //#]
            start_maszyny_entDef();
            animInstance().notifyTransitionEnded("27");
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
        public void znaleziono_produkt_smsEnter() {
            //#[ state ROOT.znaleziono_produkt_sms.(Entry) 
            temp_produkt = (Produkt)lista_asocjacyjna.get(id_product); 
            nazwa_produktu = temp_produkt.nazwa;
            int cena_produktu = temp_produkt.cena;               
            ekran="Podaj 5 cyfrowy kod SMS z klawiatury..."; 
            lancuch="Kod SMS:";
            //#]
        }
        
        //## statechart_method 
        public void blad_sms_enter() {
            animInstance().notifyStateEntered("ROOT.blad_sms");
            rootState_subState = blad_sms;
            rootState_active = blad_sms;
            blad_smsEnter();
        }
        
        //## statechart_method 
        public int przelicz_smsTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 37 
            if(suma>0)
                {
                    animInstance().notifyTransitionStarted("37");
                    przelicz_sms_exit();
                    Start_entDef();
                    animInstance().notifyTransitionEnded("37");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 38 
                    if(suma<0)
                        {
                            animInstance().notifyTransitionStarted("38");
                            przelicz_sms_exit();
                            blad_sms_entDef();
                            animInstance().notifyTransitionEnded("38");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_20gr() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("13");
            Start_exit();
            //#[ transition 13 
            dodaj_nominal(20);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("13");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Start_entDef() {
            Start_enter();
        }
        
        //## statechart_method 
        public int start_maszynyTakeplatnoscsms() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("33");
            start_maszyny_exit();
            platnosc_sms_entDef();
            animInstance().notifyTransitionEnded("33");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int start_maszynyTakekey_6() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("28");
            start_maszyny_exit();
            //#[ transition 28 
            czytaj_klawiature(6);
            //#]
            start_maszyny_entDef();
            animInstance().notifyTransitionEnded("28");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void nie_znaleziono_entDef() {
            nie_znaleziono_enter();
        }
        
        //## statechart_method 
        public void platnosc_sms_entDef() {
            platnosc_sms_enter();
        }
        
        //## statechart_method 
        public int StartTakezwrot() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("17");
            Start_exit();
            //#[ transition 17 
            wyczysc();
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("17");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_10gr() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("12");
            Start_exit();
            //#[ transition 12 
            dodaj_nominal(10);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("12");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int start_maszynyTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 35 
            if(weryfikuj_sms==true)
                {
                    animInstance().notifyTransitionStarted("35");
                    start_maszyny_exit();
                    przelicz_sms_entDef();
                    animInstance().notifyTransitionEnded("35");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int start_maszynyTakekey_7() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("29");
            start_maszyny_exit();
            //#[ transition 29 
            czytaj_klawiature(7);
            //#]
            start_maszyny_entDef();
            animInstance().notifyTransitionEnded("29");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int start_maszynyTakedo_wyboru() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("1");
            start_maszyny_exit();
            wybor_produktu_entDef();
            animInstance().notifyTransitionEnded("1");
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
        public int znaleziono_produkt_sms_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = znaleziono_produkt_smsTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void blad_sms_entDef() {
            blad_sms_enter();
        }
        
        //## statechart_method 
        public int platnosc_sms_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = platnosc_smsTakeNull();
                }
            else if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = platnosc_smsTakeRiJTimeout();
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
        public int start_maszynyTakekey_8() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("30");
            start_maszyny_exit();
            //#[ transition 30 
            czytaj_klawiature(8);
            //#]
            start_maszyny_entDef();
            animInstance().notifyTransitionEnded("30");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
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
            lancuch = "Prosimy odebrac produkt";
            
            temp_produkt = (Produkt)lista_asocjacyjna.get(id_product);  
            temp_produkt.ilosc = temp_produkt.ilosc - 1;
            lista_asocjacyjna.remove(id_product);
            lista_asocjacyjna.put(id_product, temp_produkt);
            
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
        public void znaleziono_produkt_sms_exit() {
            popNullConfig();
            znaleziono_produkt_smsExit();
            animInstance().notifyStateExited("ROOT.znaleziono_produkt_sms");
        }
        
        //## statechart_method 
        public int napisy_poczatkoweTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("32");
            napisy_poczatkowe_exit();
            start_maszyny_entDef();
            animInstance().notifyTransitionEnded("32");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_1zl() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("15");
            Start_exit();
            //#[ transition 15 
            dodaj_nominal(100);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("15");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int start_maszynyTakekey_9() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("31");
            start_maszyny_exit();
            //#[ transition 31 
            czytaj_klawiature(9);
            //#]
            start_maszyny_entDef();
            animInstance().notifyTransitionEnded("31");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void start_maszynyExit() {
        }
        
        //## statechart_method 
        public int UstalanieTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            Ustalanie_exit();
            napisy_poczatkowe_entDef();
            animInstance().notifyTransitionEnded("6");
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
                    animInstance().notifyTransitionStarted("2");
                    wybor_produktu_exit();
                    start_maszyny_entDef();
                    animInstance().notifyTransitionEnded("2");
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
        public void blad_smsExit() {
            itsRiJThread.unschedTimeout(Jav_Timeout_blad_sms_id, this);
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
                    animInstance().notifyTransitionStarted("5");
                    nie_znaleziono_exit();
                    napisy_poczatkowe_entDef();
                    animInstance().notifyTransitionEnded("5");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int StartTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Jav_Timeout_Start_id)
                {
                    //## transition 18 
                    if(zaplacono==true)
                        {
                            animInstance().notifyTransitionStarted("18");
                            Start_exit();
                            wydawanie_entDef();
                            animInstance().notifyTransitionEnded("18");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public int StartTakedodaj_nominal_2zl() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("16");
            Start_exit();
            //#[ transition 16 
            dodaj_nominal(200);
            //#]
            state_3_entDef();
            animInstance().notifyTransitionEnded("16");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
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
        public int platnosc_smsTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 21 
            if(wybrano_sms==true && wybrano_produkt==true)
                {
                    animInstance().notifyTransitionStarted("21");
                    platnosc_sms_exit();
                    znaleziono_produkt_sms_entDef();
                    animInstance().notifyTransitionEnded("21");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 22 
                    if(wybrano_produkt==false || brak_produktu==true)
                        {
                            animInstance().notifyTransitionStarted("22");
                            platnosc_sms_exit();
                            nie_znaleziono_entDef();
                            animInstance().notifyTransitionEnded("22");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public int platnosc_smsTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Jav_Timeout_platnosc_sms_id)
                {
                    animInstance().notifyTransitionStarted("20");
                    platnosc_sms_exit();
                    start_maszyny_entDef();
                    animInstance().notifyTransitionEnded("20");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void przelicz_smsEnter() {
            //#[ state ROOT.przelicz_sms.(Entry) 
            weryfikuj_sms = false;
            
            if(((kod_sms % 5) == 0) && ((kod_sms % 2) != 0)) suma = 500;
            else if(((kod_sms % 2) == 0) && ((kod_sms % 5) != 0)) suma = 200;
            else suma = -1;
            
            
            //#]
        }
        
        //## statechart_method 
        public void StartEnter() {
            //#[ state ROOT.Start.(Entry) 
            temp_produkt = (Produkt)lista_asocjacyjna.get(id_product); 
            nazwa_produktu = temp_produkt.nazwa;
            int cena_produktu = temp_produkt.cena;               
            ekran=nazwa_produktu+" cena: "+(double)cena_produktu/100+" zl \n"; 
            
            			
            
            licznik=suma-cena_produktu;
            ekran+="Aktualny stan="+(double)licznik/100+" zl     "; 	
            //ekran+=" ====== licznik wynosi"+licznik+"=========";
            if (licznik==0) {
            ekran+="\n Nie bedzie reszty";
            
            }
            else if (licznik<0) ekran+="Za malo pieniazkow";
            else ekran+= "\n   Wydawanie reszty: "+licznik/100+" zl			";
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
            /*if(id_product == 0)
            	id_product = poziom;
            else if(id_product < 10)
                id_product = id_product*10 + poziom;
            else 
                id_product = poziom;
              */
            if(serwisowanie) {}
            else if(wybrano_sms) lancuch = "Kod SMS: " + kod_sms;
            else lancuch = "Wybrano produkt: " + id_product;
            //#]
        }
        
        //## statechart_method 
        public void UstalanieEnter() {
            //#[ state ROOT.Ustalanie.(Entry) 
            lista_asocjacyjna = new java.util.Hashtable<Integer, Produkt>(); 
            
            przyporzadkowanie = new Produkt("Produkt 1",new Integer(200), new Integer(1));
            lista_asocjacyjna.put(new Integer(1),przyporzadkowanie);
            
            //soki // spróbuj delete przyporzdkowanie
            przyporzadkowanie = new Produkt("Produkt 2", new Integer(200), new Integer(1)); 
            lista_asocjacyjna.put(new Integer(2),przyporzadkowanie);
            przyporzadkowanie = new Produkt("Produkt 3", new Integer(300), new Integer(1));
            lista_asocjacyjna.put(new Integer(3),przyporzadkowanie);
            przyporzadkowanie = new Produkt("Produkt 4", new Integer(400), new Integer(1));
            lista_asocjacyjna.put(new Integer(4),przyporzadkowanie);
            przyporzadkowanie = new Produkt("Produkt 5", new Integer(500), new Integer(1));
            lista_asocjacyjna.put(new Integer(5),przyporzadkowanie);
            przyporzadkowanie = new Produkt("Produkt 6", new Integer(200), new Integer(1));
            lista_asocjacyjna.put(new Integer(6),przyporzadkowanie); 
            
            //Reszta zakomentowana bo na konsultacjach ustalilismy ze robimy wskazniki tylko
            //dla 6 produktow
            
            //przyporzadkowanie = new Produkt("sok Jaromis", new Integer(200));  
            //lista_asocjacyjna.put(new Integer(7),przyporzadkowanie);
            //przyporzadkowanie = new Produkt("sok Przemka", new Integer(200));
            //lista_asocjacyjna.put(new Integer(8),przyporzadkowanie);
            //batony
            /*przyporzadkowanie = new Produkt("baton Uberweiss", new Integer(110));
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
            lista_asocjacyjna.put(new Integer(16),przyporzadkowanie);*/
            
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
        public void znaleziono_produkt_smsExit() {
        }
        
        //## statechart_method 
        public void znaleziono_produkt_sms_enter() {
            animInstance().notifyStateEntered("ROOT.znaleziono_produkt_sms");
            pushNullConfig();
            rootState_subState = znaleziono_produkt_sms;
            rootState_active = znaleziono_produkt_sms;
            znaleziono_produkt_smsEnter();
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
        public void platnosc_sms_enter() {
            animInstance().notifyStateEntered("ROOT.platnosc_sms");
            pushNullConfig();
            rootState_subState = platnosc_sms;
            rootState_active = platnosc_sms;
            platnosc_smsEnter();
        }
        
        //## statechart_method 
        public void przelicz_sms_entDef() {
            przelicz_sms_enter();
        }
        
        //## statechart_method 
        public int start_maszyny_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(key_5.key_5_Default_id))
                {
                    res = start_maszynyTakekey_5();
                }
            else if(event.isTypeOf(platnoscsms.platnoscsms_Default_id))
                {
                    res = start_maszynyTakeplatnoscsms();
                }
            else if(event.isTypeOf(key_6.key_6_Default_id))
                {
                    res = start_maszynyTakekey_6();
                }
            else if(event.isTypeOf(key_7.key_7_Default_id))
                {
                    res = start_maszynyTakekey_7();
                }
            else if(event.isTypeOf(key_8.key_8_Default_id))
                {
                    res = start_maszynyTakekey_8();
                }
            else if(event.isTypeOf(key_9.key_9_Default_id))
                {
                    res = start_maszynyTakekey_9();
                }
            else if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = start_maszynyTakeNull();
                }
            else if(event.isTypeOf(do_wyboru.do_wyboru_Default_id))
                {
                    res = start_maszynyTakedo_wyboru();
                }
            else if(event.isTypeOf(anuluj.anuluj_Default_id))
                {
                    res = start_maszynyTakeanuluj();
                }
            else if(event.isTypeOf(key_1.key_1_Default_id))
                {
                    res = start_maszynyTakekey_1();
                }
            else if(event.isTypeOf(key_2.key_2_Default_id))
                {
                    res = start_maszynyTakekey_2();
                }
            else if(event.isTypeOf(key_3.key_3_Default_id))
                {
                    res = start_maszynyTakekey_3();
                }
            else if(event.isTypeOf(key_4.key_4_Default_id))
                {
                    res = start_maszynyTakekey_4();
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
            temp_produkt = (Produkt)lista_asocjacyjna.get(id_product); 
            
            if (lista_asocjacyjna.containsKey(id_product)){  
            	wybrano_produkt = true;
                if(temp_produkt.ilosc > 0) brak_produktu = false;
                else {
            		brak_produktu = true;  
            		wybrano_produkt = false;
            	}              
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
                    animInstance().notifyTransitionStarted("7");
                    znaleziono_exit();
                    Start_entDef();
                    animInstance().notifyTransitionEnded("7");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void napisy_poczatkoweEnter() {
            //#[ state ROOT.napisy_poczatkowe.(Entry) 
            ekran = "Witaj drogi kliencie! \r Prosimy wybrac produkt...";
            serwisowanie = false;
            wybrano_sms = false;
            brak_produktu = false;
            kod_sms = 0;
            id_product = 0;
            weryfikuj_sms = false;
            suma = 0;
            licznik = 0;
            kod_cyfry = 0;
            wybrano_produkt = false;
            zaplacono = false;  
            
            
            //Pobranie ilosci produktow na potrzeby licznikow
            temp_produkt = (Produkt)lista_asocjacyjna.get(1);  
            produkt_1 = temp_produkt.ilosc; 
            
            temp_produkt = (Produkt)lista_asocjacyjna.get(2);  
            produkt_2 = temp_produkt.ilosc;
            
            temp_produkt = (Produkt)lista_asocjacyjna.get(3);  
            produkt_3 = temp_produkt.ilosc;
            
            temp_produkt = (Produkt)lista_asocjacyjna.get(4);  
            produkt_4 = temp_produkt.ilosc;
            
            temp_produkt = (Produkt)lista_asocjacyjna.get(5);  
            produkt_5 = temp_produkt.ilosc;
            
            temp_produkt = (Produkt)lista_asocjacyjna.get(6);  
            produkt_6 = temp_produkt.ilosc; 
            
            //#]
        }
        
        //## statechart_method 
        public void przelicz_sms_exit() {
            popNullConfig();
            przelicz_smsExit();
            animInstance().notifyStateExited("ROOT.przelicz_sms");
        }
        
        //## statechart_method 
        public void Start_exit() {
            StartExit();
            animInstance().notifyStateExited("ROOT.Start");
        }
        
        //## statechart_method 
        public int start_maszynyTakeanuluj() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("36");
            start_maszyny_exit();
            napisy_poczatkowe_entDef();
            animInstance().notifyTransitionEnded("36");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void start_maszyny_exit() {
            popNullConfig();
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
            animInstance().notifyTransitionStarted("0");
            Ustalanie_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int blad_smsTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == Jav_Timeout_blad_sms_id)
                {
                    animInstance().notifyTransitionStarted("39");
                    blad_sms_exit();
                    start_maszyny_entDef();
                    animInstance().notifyTransitionEnded("39");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void platnosc_smsExit() {
            itsRiJThread.unschedTimeout(Jav_Timeout_platnosc_sms_id, this);
        }
        
        //## statechart_method 
        public int state_3TakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("10");
            state_3_exit();
            Start_entDef();
            animInstance().notifyTransitionEnded("10");
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
        public void przelicz_smsExit() {
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
            //## transition 3 
            if(wybrano_produkt==true)
                {
                    animInstance().notifyTransitionStarted("3");
                    wybor_produktu_exit();
                    znaleziono_entDef();
                    animInstance().notifyTransitionEnded("3");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 4 
                    if(wybrano_produkt==false || brak_produktu==true)
                        {
                            animInstance().notifyTransitionStarted("4");
                            wybor_produktu_exit();
                            nie_znaleziono_entDef();
                            animInstance().notifyTransitionEnded("4");
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
        public void blad_smsEnter() {
            //#[ state ROOT.blad_sms.(Entry) 
            suma = 0;
            wybrano_sms = false;
            wybrano_produkt = false;
            kod_cyfry = 0;
            ekran = "Bledny kod SMS, prosimy sprobowaæ ponownie...";
            lancuch = " ";
            //#]
            itsRiJThread.schedTimeout(2000, Jav_Timeout_blad_sms_id, this, "ROOT.blad_sms");
        }
        
        //## statechart_method 
        public void napisy_poczatkowe_exit() {
            popNullConfig();
            napisy_poczatkoweExit();
            animInstance().notifyStateExited("ROOT.napisy_poczatkowe");
        }
        
        //## statechart_method 
        public void napisy_poczatkowe_enter() {
            animInstance().notifyStateEntered("ROOT.napisy_poczatkowe");
            pushNullConfig();
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
            pushNullConfig();
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
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = napisy_poczatkoweTakeNull();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void platnosc_smsEnter() {
            //#[ state ROOT.platnosc_sms.(Entry) 
            temp_produkt = (Produkt)lista_asocjacyjna.get(id_product); 
            
            if (lista_asocjacyjna.containsKey(id_product)){
            	wybrano_produkt = true;   
                wybrano_sms = true;     
                if(temp_produkt.ilosc > 0) {
                	brak_produktu = false;
                }
                else  {
                	brak_produktu = true; 
            		wybrano_produkt = false;   
            	    wybrano_sms = false;
                }
            }
            else{
                    wybrano_produkt = false;
            }
            //#]
            itsRiJThread.schedTimeout(100, Jav_Timeout_platnosc_sms_id, this, "ROOT.platnosc_sms");
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
        public int start_maszynyTakekey_1() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("23");
            start_maszyny_exit();
            //#[ transition 23 
            czytaj_klawiature(1);
            //#]
            start_maszyny_entDef();
            animInstance().notifyTransitionEnded("23");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
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
        public void przelicz_sms_enter() {
            animInstance().notifyStateEntered("ROOT.przelicz_sms");
            pushNullConfig();
            rootState_subState = przelicz_sms;
            rootState_active = przelicz_sms;
            przelicz_smsEnter();
        }
        
        //## statechart_method 
        public int start_maszynyTakekey_2() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("24");
            start_maszyny_exit();
            //#[ transition 24 
            czytaj_klawiature(2);
            //#]
            start_maszyny_entDef();
            animInstance().notifyTransitionEnded("24");
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
                    animInstance().notifyTransitionStarted("8");
                    wydawanie_exit();
                    wydano_entDef();
                    animInstance().notifyTransitionEnded("8");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public int znaleziono_produkt_smsTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("34");
            znaleziono_produkt_sms_exit();
            start_maszyny_entDef();
            animInstance().notifyTransitionEnded("34");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void znaleziono_produkt_sms_entDef() {
            znaleziono_produkt_sms_enter();
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
        msg.add("wybrano_sms", wybrano_sms);
        msg.add("brak_produktu", brak_produktu);
        msg.add("kod_cyfry", kod_cyfry);
        msg.add("kod_max_cyfry", kod_max_cyfry);
        msg.add("weryfikuj_sms", weryfikuj_sms);
        msg.add("kod_sms", kod_sms);
        msg.add("produkt_1", produkt_1);
        msg.add("produkt_2", produkt_2);
        msg.add("produkt_3", produkt_3);
        msg.add("produkt_4", produkt_4);
        msg.add("produkt_5", produkt_5);
        msg.add("produkt_6", produkt_6);
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

