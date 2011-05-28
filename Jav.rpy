I-Logix-RPY-Archive version 8.5.2 Java 2030848
{ IProject 
	- _id = GUID 05cdc62b-3de3-433f-b43f-2a18a57d142b;
	- _myState = 8192;
	- _name = "Jav";
	- _lastID = 3;
	- _UserColors = { IRPYRawContainer 
		- size = 16;
		- value = 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 
	}
	- _defaultSubsystem = { ISubsystemHandle 
		- _m2Class = "ISubsystem";
		- _filename = "Default.sbs";
		- _subsystem = "";
		- _class = "";
		- _name = "Default";
		- _id = GUID 1122e697-eb13-4fec-be4b-23da6bb3890d;
	}
	- _component = { IHandle 
		- _m2Class = "IComponent";
		- _filename = "przemka.cmp";
		- _subsystem = "";
		- _class = "";
		- _name = "przemka";
		- _id = GUID a20b32e6-7af9-4318-b013-27301c21bdda;
	}
	- Multiplicities = { IRPYRawContainer 
		- size = 4;
		- value = 
		{ IMultiplicityItem 
			- _name = "1";
			- _count = -1;
		}
		{ IMultiplicityItem 
			- _name = "*";
			- _count = -1;
		}
		{ IMultiplicityItem 
			- _name = "0,1";
			- _count = -1;
		}
		{ IMultiplicityItem 
			- _name = "1..*";
			- _count = -1;
		}
	}
	- Subsystems = { IRPYRawContainer 
		- size = 3;
		- value = 
		{ ISubsystem 
			- fileName = "Default";
			- _id = GUID 1122e697-eb13-4fec-be4b-23da6bb3890d;
		}
		{ IProfile 
			- fileName = "JavaDocProfile";
			- _persistAs = "$OMROOT\\Profiles\\JavaDoc\\";
			- _id = GUID 19700e28-456f-4c97-a19c-b95dcb3e9dff;
			- _isReference = 1;
		}
		{ IProfile 
			- fileName = "CGCompatibilityPre753Java";
			- _id = GUID 1a373eb2-7fe0-464e-80c5-32bbc6b2649c;
		}
	}
	- Diagrams = { IRPYRawContainer 
		- size = 1;
		- value = 
		{ IDiagram 
			- _id = GUID ee0d98c5-4da7-4bac-a54f-d5fe5bfe716b;
			- _myState = 8192;
			- _properties = { IPropertyContainer 
				- Subjects = { IRPYRawContainer 
					- size = 1;
					- value = 
					{ IPropertySubject 
						- _Name = "Format";
						- Metaclasses = { IRPYRawContainer 
							- size = 1;
							- value = 
							{ IPropertyMetaclass 
								- _Name = "Class";
								- Properties = { IRPYRawContainer 
									- size = 8;
									- value = 
									{ IProperty 
										- _Name = "DefaultSize";
										- _Value = "0,34,84,148";
										- _Type = String;
									}
									{ IProperty 
										- _Name = "Fill.FillColor";
										- _Value = "255,255,255";
										- _Type = Color;
									}
									{ IProperty 
										- _Name = "Font.Font";
										- _Value = "Arial";
										- _Type = String;
									}
									{ IProperty 
										- _Name = "Font.FontColor";
										- _Value = "0,0,0";
										- _Type = Color;
									}
									{ IProperty 
										- _Name = "Font.Size";
										- _Value = "10";
										- _Type = Int;
									}
									{ IProperty 
										- _Name = "Line.LineColor";
										- _Value = "121,122,0";
										- _Type = Color;
									}
									{ IProperty 
										- _Name = "Line.LineStyle";
										- _Value = "0";
										- _Type = Int;
									}
									{ IProperty 
										- _Name = "Line.LineWidth";
										- _Value = "1";
										- _Type = Int;
									}
								}
							}
						}
					}
				}
			}
			- _name = "przemka";
			- _lastModifiedTime = "5.28.2011::14:44:37";
			- _graphicChart = { CGIClassChart 
				- _id = GUID 27fb2ef8-fea3-484a-8a5d-e0ce17881f36;
				- m_type = 0;
				- m_pModelObject = { IHandle 
					- _m2Class = "IDiagram";
					- _id = GUID ee0d98c5-4da7-4bac-a54f-d5fe5bfe716b;
				}
				- m_pParent = ;
				- m_name = { CGIText 
					- m_str = "";
					- m_style = "Arial" 10 0 0 0 1 ;
					- m_color = { IColor 
						- m_fgColor = 0;
						- m_bgColor = 0;
						- m_bgFlag = 0;
					}
					- m_position = 1 0 0  ;
					- m_nIdent = 0;
					- m_bImplicitSetRectPoints = 0;
					- m_nOrientationCtrlPt = 8;
				}
				- m_drawBehavior = 0;
				- m_bIsPreferencesInitialized = 0;
				- elementList = 2;
				{ CGIClass 
					- _id = GUID dbf0374c-baad-46b0-ba72-e9bcea957264;
					- m_type = 78;
					- m_pModelObject = { IHandle 
						- _m2Class = "IClass";
						- _filename = "Default.sbs";
						- _subsystem = "Default";
						- _class = "";
						- _name = "TopLevel";
						- _id = GUID 52eb379e-49f6-4f3c-89f4-6cbd4c9b613b;
					}
					- m_pParent = ;
					- m_name = { CGIText 
						- m_str = "TopLevel";
						- m_style = "Arial" 10 0 0 0 1 ;
						- m_color = { IColor 
							- m_fgColor = 0;
							- m_bgColor = 0;
							- m_bgFlag = 0;
						}
						- m_position = 1 0 0  ;
						- m_nIdent = 0;
						- m_bImplicitSetRectPoints = 0;
						- m_nOrientationCtrlPt = 5;
					}
					- m_drawBehavior = 0;
					- m_bIsPreferencesInitialized = 0;
					- m_AdditionalLabel = { CGIText 
						- m_str = "";
						- m_style = "Arial" 10 0 0 0 1 ;
						- m_color = { IColor 
							- m_fgColor = 0;
							- m_bgColor = 0;
							- m_bgFlag = 0;
						}
						- m_position = 1 0 0  ;
						- m_nIdent = 0;
						- m_bImplicitSetRectPoints = 0;
						- m_nOrientationCtrlPt = 1;
					}
					- m_polygon = 0 ;
					- m_nNameFormat = 0;
					- m_nIsNameFormat = 0;
					- Attrs = { IRPYRawContainer 
						- size = 0;
					}
					- Operations = { IRPYRawContainer 
						- size = 0;
					}
				}
				{ CGIClass 
					- _id = GUID 257cb2a1-a94d-4711-9f98-bb7de73589c7;
					- _properties = { IPropertyContainer 
						- Subjects = { IRPYRawContainer 
							- size = 1;
							- value = 
							{ IPropertySubject 
								- _Name = "General";
								- Metaclasses = { IRPYRawContainer 
									- size = 1;
									- value = 
									{ IPropertyMetaclass 
										- _Name = "Graphics";
										- Properties = { IRPYRawContainer 
											- size = 1;
											- value = 
											{ IProperty 
												- _Name = "FitBoxToItsTextuals";
												- _Value = "False";
												- _Type = Bool;
											}
										}
									}
								}
							}
						}
					}
					- m_type = 87;
					- m_pModelObject = { IHandle 
						- _m2Class = "IClass";
						- _filename = "Default.sbs";
						- _subsystem = "Default";
						- _class = "";
						- _name = "Jav";
						- _id = GUID 6e9ca01c-040b-4e85-bbc9-4f7798db5ef4;
					}
					- m_pParent = GUID dbf0374c-baad-46b0-ba72-e9bcea957264;
					- m_name = { CGIText 
						- m_str = "Jav";
						- m_style = "Arial" 10 0 0 0 1 ;
						- m_color = { IColor 
							- m_fgColor = 0;
							- m_bgColor = 0;
							- m_bgFlag = 0;
						}
						- m_position = 1 0 0  ;
						- m_nIdent = 0;
						- m_bImplicitSetRectPoints = 0;
						- m_nOrientationCtrlPt = 5;
					}
					- m_drawBehavior = 2152;
					- m_transform = 0.315392 0 0 0.799463 112.368 -182.024 ;
					- m_bIsPreferencesInitialized = 1;
					- m_AdditionalLabel = { CGIText 
						- m_str = "";
						- m_style = "Arial" 10 0 0 0 1 ;
						- m_color = { IColor 
							- m_fgColor = 0;
							- m_bgColor = 0;
							- m_bgFlag = 0;
						}
						- m_position = 1 0 0  ;
						- m_nIdent = 0;
						- m_bImplicitSetRectPoints = 0;
						- m_nOrientationCtrlPt = 1;
					}
					- m_bFramesetModified = 1;
					- m_polygon = 4 2 329  2 1451  1061 1451  1061 329  ;
					- m_nNameFormat = 0;
					- m_nIsNameFormat = 0;
					- frameset = "<frameset rows=50%,50%>
<frame name=AttributeListCompartment>
<frame name=PrimitiveOperationListCompartment>";
					- Attrs = { IRPYRawContainer 
						- size = 38;
						- value = 
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "lancuch";
							- _id = GUID 25499da8-b6df-4a28-ac85-13c1ba7c7dfb;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "poziom";
							- _id = GUID eb8d368a-51f6-4336-8df6-5b3388acc9cb;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "id_product";
							- _id = GUID 6e3b3538-a68f-4032-93f9-517a90b9ae75;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "licznik";
							- _id = GUID ba40d681-e6d8-4637-a130-1ff15fcf27b5;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "lista";
							- _id = GUID 9a2c523d-c060-4eaa-9f6f-e364ca55f4cc;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "lista_asocjacyjna";
							- _id = GUID b493579a-34e6-4c34-8710-eb406e932e26;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "wybrano_produkt";
							- _id = GUID c0ef2325-8f44-4d41-8634-f117361a99b9;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "mapka";
							- _id = GUID 90574bc3-36b4-4a83-953a-5a78a35460ff;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "przyporzadkowanie";
							- _id = GUID 09dacd1c-1394-4da3-a3e3-ecb3b4d38ce2;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "nazwa_produktu";
							- _id = GUID 78a1becb-8ff5-404d-9264-5f43e335d122;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "temp_produkt";
							- _id = GUID ade0929d-533f-4d8b-89ee-4c55ef919215;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "ekran";
							- _id = GUID 0852864a-dbd6-4a7b-9e38-2c54f284d052;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "lancuch2";
							- _id = GUID f10c4d02-0e24-47cc-8079-adce6f1fbb0c;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "liczba1";
							- _id = GUID 83619973-8d70-4fba-97e6-c84f61e57ce4;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "liczba2";
							- _id = GUID 45f5d21f-3596-48a9-84b6-6e3c46201404;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "liczba5";
							- _id = GUID f0d44805-de77-483a-8c98-f6d182206b63;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "liczba5gr";
							- _id = GUID 793e8c6c-8ac3-49f6-bb3b-8368928b9cd3;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "liczba10gr";
							- _id = GUID 3a046d74-0972-4fa2-82e3-b4f21436856f;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "liczba20gr";
							- _id = GUID df1ec16d-4c82-42d3-9a94-46db82a30054;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "liczba50gr";
							- _id = GUID 676b9923-ceab-411d-a088-1abd72af0a8b;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "licznik3";
							- _id = GUID d17fbae5-eee0-4fb7-9eef-db475ff223d9;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "suma";
							- _id = GUID c9f8e128-5c93-45c2-8d3f-b074f654a86f;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "wartosc";
							- _id = GUID 4e576786-0c48-4049-84cc-a8acff997c91;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "cena_produktu";
							- _id = GUID 1100aaf1-25df-4de2-8b84-e31bbef0b18e;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "zaplacono";
							- _id = GUID da8c53dd-262b-4828-9e67-dab0e608370b;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "serwisowanie";
							- _id = GUID 57fde8f5-3f14-4d87-a159-442da96b0a41;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "wybrano_sms";
							- _id = GUID 9b7b7c8b-ce82-4a46-a9c8-058e7c6c7991;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "brak_produktu";
							- _id = GUID c267ea84-d783-424e-80f4-09a9087c42a3;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "kod_cyfry";
							- _id = GUID 0f712015-fe21-45db-9d7a-57dd95593026;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "kod_max_cyfry";
							- _id = GUID dfb11384-5732-479a-abae-7bd12dba2cb3;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "weryfikuj_sms";
							- _id = GUID a6298335-757d-4c28-bb06-72b16de44442;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "kod_sms";
							- _id = GUID 1ffbc716-1c1c-4135-a68e-0f159b3dbe32;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "produkt_1";
							- _id = GUID 1b35c40a-b086-419c-9319-f210599b0be8;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "produkt_2";
							- _id = GUID aa5e38fe-2635-4236-98ed-fda725237f56;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "produkt_3";
							- _id = GUID a50a3a25-6a5c-4f08-b5d4-a1aeba884df8;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "produkt_4";
							- _id = GUID 630b1fb4-9647-4cff-ae15-fd9d8cf2a74b;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "produkt_5";
							- _id = GUID e4570e39-7813-4f52-9171-873b470af668;
						}
						{ IHandle 
							- _m2Class = "IAttribute";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "produkt_6";
							- _id = GUID b037264a-8fbd-418b-bb00-dbbe6489d27c;
						}
					}
					- Operations = { IRPYRawContainer 
						- size = 25;
						- value = 
						{ IHandle 
							- _m2Class = "IConstructor";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "Jav()";
							- _id = GUID 51e8a250-7d1e-4faf-adc6-d924190eebb4;
						}
						{ IHandle 
							- _m2Class = "IPrimitiveOperation";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "dodaj_nominal(double)";
							- _id = GUID ec9158eb-172a-4922-8bb3-60c92a4ed4ef;
						}
						{ IHandle 
							- _m2Class = "IPrimitiveOperation";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "wyczysc()";
							- _id = GUID 8c71c919-7170-4b75-b528-cd0c22e9e58b;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "do_wyboru()";
							- _id = GUID 0a68b78c-6f81-4bdb-88e7-c47550fac3a7;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "dodaj_nominal_5()";
							- _id = GUID 65c0bc55-82c5-4c5b-ae33-b7bd48975902;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "dodaj_nominal_5gr()";
							- _id = GUID 77c5b4fd-e2e3-46e5-9797-701cea61ce7c;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "dodaj_nominal_10gr()";
							- _id = GUID 5aa9fff6-ff8c-4cfd-ad8a-dab28df4eee5;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "dodaj_nominal_20gr()";
							- _id = GUID d695d6c3-dee9-48bd-b88b-4240c1354ccc;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "dodaj_nominal_50gr()";
							- _id = GUID 0c070193-8c8b-41d5-ad69-14491d8b30ff;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "dodaj_nominal_1zl()";
							- _id = GUID bf69172e-f005-4dff-9f96-de747af62666;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "dodaj_nominal_2zl()";
							- _id = GUID ff171be1-59aa-43a6-8d05-8f9cfbc40ef9;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "zwrot()";
							- _id = GUID ae728896-df18-4ca8-a756-3da961de0ee3;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "powrot()";
							- _id = GUID dd3705d9-b063-4d0f-a707-42a74e2c06ec;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "platnoscsms()";
							- _id = GUID 3d5f6d4f-16e4-476a-a2f9-9b2ec9d37054;
						}
						{ IHandle 
							- _m2Class = "IPrimitiveOperation";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "czytaj_klawiature(int)";
							- _id = GUID 0ec6cc61-a67b-4c68-a4a8-4043c876a35f;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "key_1()";
							- _id = GUID ead44136-6615-40f0-bc6c-d37b06c9687c;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "key_2()";
							- _id = GUID d5351a3d-1390-4371-8b72-fd06fe01c0fa;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "key_3()";
							- _id = GUID fded27bb-585d-4557-98c4-7fbe5535d358;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "key_4()";
							- _id = GUID ce9e827b-77f5-4937-8679-5a1a42e7ee76;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "key_5()";
							- _id = GUID 768bf7c1-43a4-4fb1-bad5-64f0fdbd8edf;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "key_6()";
							- _id = GUID 52da7579-398f-411e-8bf0-dc9f3514adb0;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "key_7()";
							- _id = GUID f37ab89a-1d85-44d3-baa0-ec83136ebdaa;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "key_8()";
							- _id = GUID 49a9f91a-6955-44c2-8d40-bc5a0926c4be;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "key_9()";
							- _id = GUID 9001fa92-5506-482e-b71c-05403ebcc5d1;
						}
						{ IHandle 
							- _m2Class = "IReception";
							- _filename = "Default.sbs";
							- _subsystem = "Default";
							- _class = "Jav";
							- _name = "anuluj()";
							- _id = GUID eb68db38-e303-422c-848d-9927d5746719;
						}
					}
				}
				
				- m_access = 'Z';
				- m_modified = 'N';
				- m_fileVersion = "";
				- m_nModifyDate = 0;
				- m_nCreateDate = 0;
				- m_creator = "";
				- m_bScaleWithZoom = 1;
				- m_arrowStyle = 'S';
				- m_pRoot = GUID dbf0374c-baad-46b0-ba72-e9bcea957264;
				- m_currentLeftTop = 0 0 ;
				- m_currentRightBottom = 0 0 ;
			}
			- _defaultSubsystem = { IHandle 
				- _m2Class = "ISubsystem";
				- _filename = "Default.sbs";
				- _subsystem = "";
				- _class = "";
				- _name = "Default";
				- _id = GUID 1122e697-eb13-4fec-be4b-23da6bb3890d;
			}
		}
	}
	- Components = { IRPYRawContainer 
		- size = 3;
		- value = 
		{ IComponent 
			- fileName = "zoinha";
			- _id = GUID 8c57d4ca-b29f-41f1-a88a-2585b808670d;
		}
		{ IComponent 
			- fileName = "przemka";
			- _id = GUID a20b32e6-7af9-4318-b013-27301c21bdda;
		}
		{ IComponent 
			- fileName = "nowy";
			- _id = GUID c38fe376-c3e3-42d2-9d0f-891f5c5387b0;
		}
	}
}

