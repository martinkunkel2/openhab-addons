/**
 * Copyright (c) 2010-2021 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.luxtronikheatpump.internal.enums;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * Represents all heatpump visibily settings
 *
 * @author Stefan Giehl - Initial contribution
 */
@NonNullByDefault
public enum HeatpumpVisibility {
    HEIZUNG(0, "Heizung"),
    BRAUWASSER(1, "Brauwasser"),
    SCHWIMMBAD(2, "Schwimmbad"),
    KUHLUNG(3, "Kuhlung"),
    LUEFTUNG(4, "Lueftung"),
    MK1(5, "MK1"),
    MK2(6, "MK2"),
    THERMDESINFEKT(7, "ThermDesinfekt"),
    ZIRKULATION(8, "Zirkulation"),
    KUHLTEMP_SOLLTEMPMK1(9, "KuhlTemp_SolltempMK1"),
    KUHLTEMP_SOLLTEMPMK2(10, "KuhlTemp_SolltempMK2"),
    KUHLTEMP_ATDIFFMK1(11, "KuhlTemp_ATDiffMK1"),
    KUHLTEMP_ATDIFFMK2(12, "KuhlTemp_ATDiffMK2"),
    SERVICE_INFORMATION(13, "Service_Information"),
    SERVICE_EINSTELLUNG(14, "Service_Einstellung"),
    SERVICE_SPRACHE(15, "Service_Sprache"),
    SERVICE_DATUMUHRZEIT(16, "Service_DatumUhrzeit"),
    SERVICE_AUSHEIZ(17, "Service_Ausheiz"),
    SERVICE_ANLAGENKONFIGURATION(18, "Service_Anlagenkonfiguration"),
    SERVICE_IBNASSISTANT(19, "Service_IBNAssistant"),
    SERVICE_PARAMETERIBNZURUCK(20, "Service_ParameterIBNZuruck"),
    TEMP_VORLAUF(21, "Temp_Vorlauf"),
    TEMP_RUCKLAUF(22, "Temp_Rucklauf"),
    TEMP_RL_SOLL(23, "Temp_RL_Soll"),
    TEMP_RUECKLEXT(24, "Temp_Ruecklext"),
    TEMP_HEISSGAS(25, "Temp_Heissgas"),
    TEMP_AUSSENT(26, "Temp_Aussent"),
    TEMP_BW_IST(27, "Temp_BW_Ist"),
    TEMP_BW_SOLL(28, "Temp_BW_Soll"),
    TEMP_WQ_EIN(29, "Temp_WQ_Ein"),
    TEMP_KALTEKREIS(30, "Temp_Kaltekreis"),
    TEMP_MK1_VORLAUF(31, "Temp_MK1_Vorlauf"),
    TEMP_MK1VL_SOLL(32, "Temp_MK1VL_Soll"),
    TEMP_RAUMSTATION(33, "Temp_Raumstation"),
    TEMP_MK2_VORLAUF(34, "Temp_MK2_Vorlauf"),
    TEMP_MK2VL_SOLL(35, "Temp_MK2VL_Soll"),
    TEMP_SOLARKOLL(36, "Temp_Solarkoll"),
    TEMP_SOLARSP(37, "Temp_Solarsp"),
    TEMP_EXT_ENERG(38, "Temp_Ext_Energ"),
    IN_ASD(39, "IN_ASD"),
    IN_BWT(40, "IN_BWT"),
    IN_EVU(41, "IN_EVU"),
    IN_HD(42, "IN_HD"),
    IN_MOT(43, "IN_MOT"),
    IN_ND(44, "IN_ND"),
    IN_PEX(45, "IN_PEX"),
    IN_SWT(46, "IN_SWT"),
    OUT_ABTAUVENTIL(47, "OUT_Abtauventil"),
    OUT_BUP(48, "OUT_BUP"),
    OUT_FUP1(49, "OUT_FUP1"),
    OUT_HUP(50, "OUT_HUP"),
    OUT_MISCHER1AUF(51, "OUT_Mischer1Auf"),
    OUT_MISCHER1ZU(52, "OUT_Mischer1Zu"),
    OUT_VENTILATION(53, "OUT_Ventilation"),
    OUT_VENTIL_BOSUP(54, "OUT_Ventil_BOSUP"),
    OUT_VERDICHTER1(55, "OUT_Verdichter1"),
    OUT_VERDICHTER2(56, "OUT_Verdichter2"),
    OUT_ZIP(57, "OUT_ZIP"),
    OUT_ZUP(58, "OUT_ZUP"),
    OUT_ZWE1(59, "OUT_ZWE1"),
    OUT_ZWE2_SST(60, "OUT_ZWE2_SST"),
    OUT_ZWE3(61, "OUT_ZWE3"),
    OUT_FUP2(62, "OUT_FUP2"),
    OUT_SLP(63, "OUT_SLP"),
    OUT_SUP(64, "OUT_SUP"),
    OUT_MISCHER2AUF(65, "OUT_Mischer2Auf"),
    OUT_MISCHER2ZU(66, "OUT_Mischer2Zu"),
    ABLAUFZ_WP_SEIT(67, "AblaufZ_WP_Seit"),
    ABLAUFZ_ZWE1_SEIT(68, "AblaufZ_ZWE1_seit"),
    ABLAUFZ_ZWE2_SEIT(69, "AblaufZ_ZWE2_seit"),
    ABLAUFZ_ZWE3_SEIT(70, "AblaufZ_ZWE3_seit"),
    ABLAUFZ_NETZEINV(71, "AblaufZ_Netzeinv"),
    ABLAUFZ_SSP_ZEIT1(72, "AblaufZ_SSP_Zeit1"),
    ABLAUFZ_VD_STAND(73, "AblaufZ_VD_Stand"),
    ABLAUFZ_HRM_ZEIT(74, "AblaufZ_HRM_Zeit"),
    ABLAUFZ_HRW_ZEIT(75, "AblaufZ_HRW_Zeit"),
    ABLAUFZ_TDI_SEIT(76, "AblaufZ_TDI_seit"),
    ABLAUFZ_SPERRE_BW(77, "AblaufZ_Sperre_BW"),
    BST_BSTDVD1(78, "Bst_BStdVD1"),
    BST_IMPVD1(79, "Bst_ImpVD1"),
    BST_DEZVD1(80, "Bst_dEZVD1"),
    BST_BSTDVD2(81, "Bst_BStdVD2"),
    BST_IMPVD2(82, "Bst_ImpVD2"),
    BST_DEZVD2(83, "Bst_dEZVD2"),
    BST_BSTDZWE1(84, "Bst_BStdZWE1"),
    BST_BSTDZWE2(85, "Bst_BStdZWE2"),
    BST_BSTDZWE3(86, "Bst_BStdZWE3"),
    BST_BSTDWP(87, "Bst_BStdWP"),
    TEXT_KURZPROGRAMME(88, "Text_Kurzprogramme"),
    TEXT_ZWANGSHEIZUNG(89, "Text_Zwangsheizung"),
    TEXT_ZWANGSBRAUCHWASSER(90, "Text_Zwangsbrauchwasser"),
    TEXT_ABTAUEN(91, "Text_Abtauen"),
    EINSTTEMP_RUCKLBEGR(92, "EinstTemp_RucklBegr"),
    EINSTTEMP_HYSTERESEHR(93, "EinstTemp_HystereseHR"),
    EINSTTEMP_TRERHMAX(94, "EinstTemp_TRErhmax"),
    EINSTTEMP_FREIG2VD(95, "EinstTemp_Freig2VD"),
    EINSTTEMP_FREIGZWE(96, "EinstTemp_FreigZWE"),
    EINSTTEMP_TLUFTABT(97, "EinstTemp_Tluftabt"),
    EINSTTEMP_TDISOLLTEMP(98, "EinstTemp_TDISolltemp"),
    EINSTTEMP_HYSTERESEBW(99, "EinstTemp_HystereseBW"),
    EINSTTEMP_VORL2VDBW(100, "EinstTemp_Vorl2VDBW"),
    EINSTTEMP_TAUSSENMAX(101, "EinstTemp_TAussenmax"),
    EINSTTEMP_TAUSSENMIN(102, "EinstTemp_TAussenmin"),
    EINSTTEMP_TWQMIN(103, "EinstTemp_TWQmin"),
    EINSTTEMP_THGMAX(104, "EinstTemp_THGmax"),
    EINSTTEMP_TLABTENDE(105, "EinstTemp_TLABTEnde"),
    EINSTTEMP_ABSENKBIS(106, "EinstTemp_Absenkbis"),
    EINSTTEMP_VORLAUFMAX(107, "EinstTemp_Vorlaufmax"),
    EINSTTEMP_TDIFFEIN(108, "EinstTemp_TDiffEin"),
    EINSTTEMP_TDIFFAUS(109, "EinstTemp_TDiffAus"),
    EINSTTEMP_TDIFFMAX(110, "EinstTemp_TDiffmax"),
    EINSTTEMP_TEEHEIZUNG(111, "EinstTemp_TEEHeizung"),
    EINSTTEMP_TEEBRAUCHW(112, "EinstTemp_TEEBrauchw"),
    EINSTTEMP_VORL2VDSW(113, "EinstTemp_Vorl2VDSW"),
    EINSTTEMP_VLMAXMK1(114, "EinstTemp_VLMaxMk1"),
    EINSTTEMP_VLMAXMK2(115, "EinstTemp_VLMaxMk2"),
    PRIORI_BRAUCHWASSER(116, "Priori_Brauchwasser"),
    PRIORI_HEIZUNG(117, "Priori_Heizung"),
    PRIORI_SCHWIMMBAD(118, "Priori_Schwimmbad"),
    SYSEIN_EVUSPERRE(119, "SysEin_EVUSperre"),
    SYSEIN_RAUMSTATION(120, "SysEin_Raumstation"),
    SYSEIN_EINBINDUNG(121, "SysEin_Einbindung"),
    SYSEIN_MISCHKREIS1(122, "SysEin_Mischkreis1"),
    SYSEIN_MISCHKREIS2(123, "SysEin_Mischkreis2"),
    SYSEIN_ZWE1ART(124, "SysEin_ZWE1Art"),
    SYSEIN_ZWE1FKT(125, "SysEin_ZWE1Fkt"),
    SYSEIN_ZWE2ART(126, "SysEin_ZWE2Art"),
    SYSEIN_ZWE2FKT(127, "SysEin_ZWE2Fkt"),
    SYSEIN_ZWE3ART(128, "SysEin_ZWE3Art"),
    SYSEIN_ZWE3FKT(129, "SysEin_ZWE3Fkt"),
    SYSEIN_STOERUNG(130, "SysEin_Stoerung"),
    SYSEIN_BRAUCHWASSER1(131, "SysEin_Brauchwasser1"),
    SYSEIN_BRAUCHWASSER2(132, "SysEin_Brauchwasser2"),
    SYSEIN_BRAUCHWASSER3(133, "SysEin_Brauchwasser3"),
    SYSEIN_BRAUCHWASSER4(134, "SysEin_Brauchwasser4"),
    SYSEIN_BRAUCHWASSER5(135, "SysEin_Brauchwasser5"),
    SYSEIN_BWWPMAX(136, "SysEin_BWWPmax"),
    SYSEIN_ABTZYKMAX(137, "SysEin_Abtzykmax"),
    SYSEIN_LUFTABT(138, "SysEin_Luftabt"),
    SYSEIN_LUFTABTMAX(139, "SysEin_LuftAbtmax"),
    SYSEIN_ABTAUEN1(140, "SysEin_Abtauen1"),
    SYSEIN_ABTAUEN2(141, "SysEin_Abtauen2"),
    SYSEIN_PUMPENOPTIM(142, "SysEin_Pumpenoptim"),
    SYSEIN_ZUSATZPUMPE(143, "SysEin_Zusatzpumpe"),
    SYSEIN_ZUGANG(144, "SysEin_Zugang"),
    SYSEIN_SOLEDRDURCHF(145, "SysEin_SoledrDurchf"),
    SYSEIN_UBERWACHUNGVD(146, "SysEin_UberwachungVD"),
    SYSEIN_REGELUNGHK(147, "SysEin_RegelungHK"),
    SYSEIN_REGELUNGMK1(148, "SysEin_RegelungMK1"),
    SYSEIN_REGELUNGMK2(149, "SysEin_RegelungMK2"),
    SYSEIN_KUHLUNG(150, "SysEin_Kuhlung"),
    SYSEIN_AUSHEIZEN(151, "SysEin_Ausheizen"),
    SYSEIN_ELEKTRANODE(152, "SysEin_ElektrAnode"),
    SYSEIN_SWBBER(153, "SysEin_SWBBer"),
    SYSEIN_SWBMIN(154, "SysEin_SWBMin"),
    SYSEIN_HEIZUNG(155, "SysEin_Heizung"),
    SYSEIN_PERIODEMK1(156, "SysEin_PeriodeMk1"),
    SYSEIN_LAUFZEITMK1(157, "SysEin_LaufzeitMk1"),
    SYSEIN_PERIODEMK2(158, "SysEin_PeriodeMk2"),
    SYSEIN_LAUFZEITMK2(159, "SysEin_LaufzeitMk2"),
    SYSEIN_HEIZGRENZE(160, "SysEin_Heizgrenze"),
    ENLT_HUP(161, "Enlt_HUP"),
    ENLT_ZUP(162, "Enlt_ZUP"),
    ENLT_BUP(163, "Enlt_BUP"),
    ENLT_VENTILATOR_BOSUP(164, "Enlt_Ventilator_BOSUP"),
    ENLT_MA1(165, "Enlt_MA1"),
    ENLT_MZ1(166, "Enlt_MZ1"),
    ENLT_ZIP(167, "Enlt_ZIP"),
    ENLT_MA2(168, "Enlt_MA2"),
    ENLT_MZ2(169, "Enlt_MZ2"),
    ENLT_SUP(170, "Enlt_SUP"),
    ENLT_SLP(171, "Enlt_SLP"),
    ENLT_FP2(172, "Enlt_FP2"),
    ENLT_LAUFZEIT(173, "Enlt_Laufzeit"),
    ANLGKONF_HEIZUNG(174, "Anlgkonf_Heizung"),
    ANLGKONF_BRAUCHWARMWASSER(175, "Anlgkonf_Brauchwarmwasser"),
    ANLGKONF_SCHWIMMBAD(176, "Anlgkonf_Schwimmbad"),
    HEIZUNG_BETRIEBSART(177, "Heizung_Betriebsart"),
    HEIZUNG_TEMPERATURPLUSMINUS(178, "Heizung_TemperaturPlusMinus"),
    HEIZUNG_HEIZKURVEN(179, "Heizung_Heizkurven"),
    HEIZUNG_ZEITSCHLALTPROGRAMM(180, "Heizung_Zeitschlaltprogramm"),
    HEIZUNG_HEIZGRENZE(181, "Heizung_Heizgrenze"),
    MITTELTEMPERATUR(182, "Mitteltemperatur"),
    DATAENLOGGER(183, "Dataenlogger"),
    SPRACHEN_DEUTSCH(184, "Sprachen_DEUTSCH"),
    SPRACHEN_ENGLISH(185, "Sprachen_ENGLISH"),
    SPRACHEN_FRANCAIS(186, "Sprachen_FRANCAIS"),
    SPRACHEN_NORWAY(187, "Sprachen_NORWAY"),
    SPRACHEN_TCHECH(188, "Sprachen_TCHECH"),
    SPRACHEN_ITALIANO(189, "Sprachen_ITALIANO"),
    SPRACHEN_NEDERLANDS(190, "Sprachen_NEDERLANDS"),
    SPRACHEN_SVENSKA(191, "Sprachen_SVENSKA"),
    SPRACHEN_POLSKI(192, "Sprachen_POLSKI"),
    SPRACHEN_MAGYARUL(193, "Sprachen_MAGYARUL"),
    ERRORUSBSPEICHERN(194, "ErrorUSBspeichern"),
    BST_BSTDHZ(195, "Bst_BStdHz"),
    BST_BSTDBW(196, "Bst_BStdBW"),
    BST_BSTDKUE(197, "Bst_BStdKue"),
    SERVICE_SYSTEMSTEUERUNG(198, "Service_Systemsteuerung"),
    SERVICE_SYSTEMSTEUERUNG_CONTRAST(199, "Service_Systemsteuerung_Contrast"),
    SERVICE_SYSTEMSTEUERUNG_WEBSERVER(200, "Service_Systemsteuerung_Webserver"),
    SERVICE_SYSTEMSTEUERUNG_IPADRESSE(201, "Service_Systemsteuerung_IPAdresse"),
    SERVICE_SYSTEMSTEUERUNG_FERNWARTUNG(202, "Service_Systemsteuerung_Fernwartung"),
    PARALLELESCHALTUNG(203, "Paralleleschaltung"),
    SYSEIN_PARALLELESCHALTUNG(204, "SysEin_Paralleleschaltung"),
    SPRACHEN_DANSK(205, "Sprachen_DANSK"),
    SPRACHEN_PORTUGES(206, "Sprachen_PORTUGES"),
    HEIZKURVE_HEIZUNG(207, "Heizkurve_Heizung"),
    SYSEIN_MISCHKREIS3(208, "SysEin_Mischkreis3"),
    MK3(209, "MK3"),
    TEMP_MK3_VORLAUF(210, "Temp_MK3_Vorlauf"),
    TEMP_MK3VL_SOLL(211, "Temp_MK3VL_Soll"),
    OUT_MISCHER3AUF(212, "OUT_Mischer3Auf"),
    OUT_MISCHER3ZU(213, "OUT_Mischer3Zu"),
    SYSEIN_REGELUNGMK3(214, "SysEin_RegelungMK3"),
    SYSEIN_PERIODEMK3(215, "SysEin_PeriodeMk3"),
    SYSEIN_LAUFZEITMK3(216, "SysEin_LaufzeitMk3"),
    SYSEIN_KUHL_ZEIT_EIN(217, "SysEin_Kuhl_Zeit_Ein"),
    SYSEIN_KUHL_ZEIT_AUS(218, "SysEin_Kuhl_Zeit_Aus"),
    ABLAUFZ_ABTAUIN(219, "AblaufZ_AbtauIn"),
    WAERMEMENGE_WS(220, "Waermemenge_WS"),
    WAERMEMENGE_WQ(221, "Waermemenge_WQ"),
    ENLT_MA3(222, "Enlt_MA3"),
    ENLT_MZ3(223, "Enlt_MZ3"),
    ENLT_FP3(224, "Enlt_FP3"),
    OUT_FUP3(225, "OUT_FUP3"),
    TEMP_RAUMSTATION2(226, "Temp_Raumstation2"),
    TEMP_RAUMSTATION3(227, "Temp_Raumstation3"),
    BST_BSTDSW(228, "Bst_BStdSW"),
    SPRACHEN_LITAUISCH(229, "Sprachen_LITAUISCH"),
    SPRACHEN_ESTNICH(230, "Sprachen_ESTNICH"),
    SYSEIN_FERNWARTUNG(231, "SysEin_Fernwartung"),
    SPRACHEN_SLOVENISCH(232, "Sprachen_SLOVENISCH"),
    EINSTTEMP_TA_EG(233, "EinstTemp_TA_EG"),
    EINST_TVLMAX_EG(234, "Einst_TVLmax_EG"),
    SYSEIN_POPTNACHLAUF(235, "SysEin_PoptNachlauf"),
    RFV_K_KUEHLIN(236, "RFV_K_Kuehlin"),
    SYSEIN_EFFIZIENZPUMPENOM(237, "SysEin_EffizienzpumpeNom"),
    SYSEIN_EFFIZIENZPUMPEMIN(238, "SysEin_EffizienzpumpeMin"),
    SYSEIN_EFFIZIENZPUMPE(239, "SysEin_Effizienzpumpe"),
    SYSEIN_WAERMEMENGE(240, "SysEin_Waermemenge"),
    SERVICE_WMZ_EFFIZIENZ(241, "Service_WMZ_Effizienz"),
    SYSEIN_WM_VERSORGUNG_KORREKTUR(242, "SysEin_Wm_Versorgung_Korrektur"),
    SYSEIN_WM_AUSWERTUNG_KORREKTUR(243, "SysEin_Wm_Auswertung_Korrektur"),
    IN_ANALOGIN(244, "IN_AnalogIn"),
    EINS_SN_EINGABE(245, "Eins_SN_Eingabe"),
    OUT_ANALOG_1(246, "OUT_Analog_1"),
    OUT_ANALOG_2(247, "OUT_Analog_2"),
    SOLAR(248, "Solar"),
    SYSEIN_SOLAR(249, "SysEin_Solar"),
    EINSTTEMP_TDIFFKOLLMAX(250, "EinstTemp_TDiffKollmax"),
    ABLAUFZ_HG_SPERRE(251, "AblaufZ_HG_Sperre"),
    SYSEIN_AKT_KUEHLUNG(252, "SysEin_Akt_Kuehlung"),
    SYSEIN_VORLAUF_VBO(253, "SysEin_Vorlauf_VBO"),
    EINST_KRHYST(254, "Einst_KRHyst"),
    EINST_AKT_KUEHL_SPEICHER_MIN(255, "Einst_Akt_Kuehl_Speicher_min"),
    EINST_AKT_KUEHL_FREIG_WQE(256, "Einst_Akt_Kuehl_Freig_WQE"),
    SYSEIN_ABTZYKMIN(257, "SysEin_AbtZykMin"),
    SYSEIN_VD2_ZEIT_MIN(258, "SysEin_VD2_Zeit_Min"),
    EINSTTEMP_HYSTERESE_HR_VERKUERZT(259, "EinstTemp_Hysterese_HR_verkuerzt"),
    EINST_LUF_FEUCHTESCHUTZ_AKT(260, "Einst_Luf_Feuchteschutz_akt"),
    EINST_LUF_REDUZIERT_AKT(261, "Einst_Luf_Reduziert_akt"),
    EINST_LUF_NENNLUEFTUNG_AKT(262, "Einst_Luf_Nennlueftung_akt"),
    EINST_LUF_INTENSIVLUEFTUNG_AKT(263, "Einst_Luf_Intensivlueftung_akt"),
    TEMPERATUR_LUEFTUNG_ZULUFT(264, "Temperatur_Lueftung_Zuluft"),
    TEMPERATUR_LUEFTUNG_ABLUFT(265, "Temperatur_Lueftung_Abluft"),
    OUT_ANALOG_3(266, "OUT_Analog_3"),
    OUT_ANALOG_4(267, "OUT_Analog_4"),
    IN_ANALOG_2(268, "IN_Analog_2"),
    IN_ANALOG_3(269, "IN_Analog_3"),
    IN_SAX(270, "IN_SAX"),
    OUT_VZU(271, "OUT_VZU"),
    OUT_VAB(272, "OUT_VAB"),
    OUT_VSK(273, "OUT_VSK"),
    OUT_FRH(274, "OUT_FRH"),
    KUHLTEMP_SOLLTEMPMK3(275, "KuhlTemp_SolltempMK3"),
    KUHLTEMP_ATDIFFMK3(276, "KuhlTemp_ATDiffMK3"),
    IN_SPL(277, "IN_SPL"),
    SYSEIN_LUEFTUNGSSTUFEN(278, "SysEin_Lueftungsstufen"),
    SYSEIN_MELDUNG_TDI(279, "SysEin_Meldung_TDI"),
    SYSEIN_TYP_WZW(280, "SysEin_Typ_WZW"),
    BACNET(281, "BACnet"),
    SPRACHEN_SLOWAKISCH(282, "Sprachen_SLOWAKISCH"),
    SPRACHEN_LETTISCH(283, "Sprachen_LETTISCH"),
    SPRACHEN_FINNISCH(284, "Sprachen_FINNISCH"),
    KALIBRIERUNG_LWD(285, "Kalibrierung_LWD"),
    IN_DURCHFLUSS(286, "IN_Durchfluss"),
    LIN_ANSAUG_VERDICHTER(287, "LIN_ANSAUG_VERDICHTER"),
    LIN_VDH(288, "LIN_VDH"),
    LIN_UH(289, "LIN_UH"),
    LIN_DRUCK(290, "LIN_Druck"),
    EINST_SOLLWERT_TRL_KUEHLEN(291, "Einst_Sollwert_TRL_Kuehlen"),
    ENTL_EXVENTIL(292, "Entl_ExVentil"),
    EINST_MEDIUM_WAERMEQUELLE(293, "Einst_Medium_Waermequelle"),
    EINST_MULTISPEICHER(294, "Einst_Multispeicher"),
    EINST_MINIMALE_RUECKLAUFSOLLTEMPERATUR(295, "Einst_Minimale_Ruecklaufsolltemperatur"),
    EINST_PKUEHLTIME(296, "Einst_PKuehlTime"),
    SPRACHEN_TUERKISCH(297, "Sprachen_TUERKISCH"),
    RBE(298, "RBE"),
    EINST_LUF_STUFEN_FAKTOR(299, "Einst_Luf_Stufen_Faktor"),
    FREIGABE_ZEIT_ZWE(300, "Freigabe_Zeit_ZWE"),
    EINST_MIN_VL_KUEHL(301, "Einst_min_VL_Kuehl"),
    ZWE1(302, "ZWE1"),
    ZWE2(303, "ZWE2"),
    ZWE3(304, "ZWE3"),
    SEC(305, "SEC"),
    HZIO(306, "HZIO"),
    WPIO(307, "WPIO"),
    LIN_ANSAUG_VERDAMPFER(308, "LIN_ANSAUG_VERDAMPFER"),
    LIN_MULTI1(309, "LIN_MULTI1"),
    LIN_MULTI2(310, "LIN_MULTI2"),
    EINST_LEISTUNG_ZWE(311, "Einst_Leistung_ZWE"),
    SPRACHEN_ESPANOL(312, "Sprachen_ESPANOL"),
    TEMP_BW_OBEN(313, "Temp_BW_oben"),
    MAXIO(314, "MAXIO"),
    OUT_ABTAUWUNSCH(315, "OUT_Abtauwunsch"),
    SMARTGRID(316, "SmartGrid"),
    DREHZAHLGEREGELT(317, "Drehzahlgeregelt"),
    P155_INVERTER(318, "P155_Inverter"),
    LEISTUNGSFREIGABE(319, "Leistungsfreigabe"),
    EINST_VORL_AKT_KUEHL(320, "Einst_Vorl_akt_Kuehl"),
    EINST_ABTAUEN_IM_WARMWASSER(321, "Einst_Abtauen_im_Warmwasser"),
    WAERMEMENGE_ZWE(32, "Waermemenge_ZWE");

    private final String name;
    private final Integer code;

    private HeatpumpVisibility(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static final HeatpumpVisibility fromCode(Integer code) throws IllegalArgumentException {
        for (HeatpumpVisibility error : HeatpumpVisibility.values()) {
            if (error.code.equals(code)) {
                return error;
            }
        }

        throw new IllegalArgumentException("Invalid heat pump visibility code: '" + code + "'");
    }

    public String getName() {
        return name;
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code + ": " + name;
    }
}
