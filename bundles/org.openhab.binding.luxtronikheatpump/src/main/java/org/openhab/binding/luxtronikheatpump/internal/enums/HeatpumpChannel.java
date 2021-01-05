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

import javax.measure.Unit;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.core.items.Item;
import org.openhab.core.library.items.DateTimeItem;
import org.openhab.core.library.items.NumberItem;
import org.openhab.core.library.items.SwitchItem;
import org.openhab.core.library.unit.SIUnits;
import org.openhab.core.library.unit.Units;

/**
 * Represents all valid channels which could be processed by this binding
 *
 * @author Stefan Giehl - Initial contribution
 */
@NonNullByDefault
public enum HeatpumpChannel {

    // for possible values see https://www.loxwiki.eu/display/LOX/Java+Webinterface
    // or https://github.com/Bouni/Home-Assistant-Luxtronik/blob/master/data.txt

    // Vorlauftemperatur Heizkreis
    CHANNEL_TEMPERATUR_TVL(10, "Temperatur_TVL", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_VORLAUF),

    // Rücklauftemperatur Heizkreis
    CHANNEL_TEMPERATUR_TRL(11, "Temperatur_TRL", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_RUCKLAUF),

    // Rücklauf-Soll Heizkreis
    CHANNEL_SOLLWERT_TRL_HZ(12, "Sollwert_TRL_HZ", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_RL_SOLL),

    // Rücklauftemperatur im Trennspeicher.
    CHANNEL_TEMPERATUR_TRL_EXT(13, "Temperatur_TRL_ext", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_RUECKLEXT),

    // Heisgastemperatur
    CHANNEL_TEMPERATUR_THG(14, "Temperatur_THG", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_HEISSGAS),

    // Aussentemperatur
    CHANNEL_TEMPERATUR_TA(15, "Temperatur_TA", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_AUSSENT),

    // Durchschnittstemperatur Aussen über 24 h (Funktion Heizgrenze)
    CHANNEL_MITTELTEMPERATUR(16, "Mitteltemperatur", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_AUSSENT),

    // Warmwasser Ist-Temperatur
    CHANNEL_TEMPERATUR_TBW(17, "Temperatur_TBW", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_BW_IST),

    // Warmwasser Soll-Temperatur
    // Not needed as it duplicates writable param (2)
    // CHANNEL_EINST_BWS_AKT(18, "Einst_BWS_akt", NumberItem.class, SIUnits.CELSIUS, false, null),

    // Wärmequellen-Eintrittstemperatur
    CHANNEL_TEMPERATUR_TWE(19, "Temperatur_TWE", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_WQ_EIN),

    // Wärmequellen-Austrittstemperatur
    CHANNEL_TEMPERATUR_TWA(20, "Temperatur_TWA", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_WQ_EIN),

    // Mischkreis 1 Vorlauftemperatur
    CHANNEL_TEMPERATUR_TFB1(21, "Temperatur_TFB1", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_MK1_VORLAUF),

    // Mischkreis 1 Vorlauf-Soll-Temperatur
    CHANNEL_SOLLWERT_TVL_MK1(22, "Sollwert_TVL_MK1", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_MK1VL_SOLL),

    // Raumtemperatur Raumstation 1
    CHANNEL_TEMPERATUR_RFV(23, "Temperatur_RFV", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_RAUMSTATION),

    // Mischkreis 2 Vorlauftemperatur
    CHANNEL_TEMPERATUR_TFB2(24, "Temperatur_TFB2", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_MK2_VORLAUF),

    // Mischkreis 2 Vorlauf-Soll-Temperatur
    CHANNEL_SOLLWERT_TVL_MK2(25, "Sollwert_TVL_MK2", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_MK2VL_SOLL),

    // Fühler Solarkollektor
    CHANNEL_TEMPERATUR_TSK(26, "Temperatur_TSK", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_SOLARKOLL),

    // Fühler Solarspeicher
    CHANNEL_TEMPERATUR_TSS(27, "Temperatur_TSS", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_SOLARSP),

    // Fühler externe Energiequelle
    CHANNEL_TEMPERATUR_TEE(28, "Temperatur_TEE", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_EXT_ENERG),

    // Eingang "Abtauende, Soledruck, Durchfluss"
    CHANNEL_ASDIN(29, "ASDin", SwitchItem.class, null, false, HeatpumpVisibility.IN_ASD),

    // Eingang "Brauchwarmwasserthermostat"
    CHANNEL_BWTIN(30, "BWTin", SwitchItem.class, null, false, HeatpumpVisibility.IN_BWT),

    // Eingang "EVU Sperre"
    CHANNEL_EVUIN(31, "EVUin", SwitchItem.class, null, false, HeatpumpVisibility.IN_EVU),

    // Eingang "Hochdruck Kältekreis"
    CHANNEL_HDIN(32, "HDin", SwitchItem.class, null, false, HeatpumpVisibility.IN_HD),

    // Eingang "Motorschutz OK"
    CHANNEL_MOTIN(33, "MOTin", SwitchItem.class, null, false, HeatpumpVisibility.IN_MOT),

    // Eingang "Niederdruck"
    CHANNEL_NDIN(34, "NDin", SwitchItem.class, null, false, HeatpumpVisibility.IN_ND),

    // Eingang "Überwachungskontakt für Potentiostat"
    CHANNEL_PEXIN(35, "PEXin", SwitchItem.class, null, false, HeatpumpVisibility.IN_PEX),

    // Eingang "Schwimmbadthermostat"
    CHANNEL_SWTIN(36, "SWTin", SwitchItem.class, null, false, HeatpumpVisibility.IN_SWT),

    // Ausgang "Abtauventil"
    CHANNEL_AVOUT(37, "AVout", SwitchItem.class, null, false, HeatpumpVisibility.OUT_ABTAUVENTIL),

    // Ausgang "Brauchwasserpumpe/Umstellventil"
    CHANNEL_BUPOUT(38, "BUPout", SwitchItem.class, null, false, HeatpumpVisibility.OUT_BUP),

    // Ausgang "Heizungsumwälzpumpe"
    CHANNEL_HUPOUT(39, "HUPout", SwitchItem.class, null, false, HeatpumpVisibility.OUT_HUP),

    // Ausgang "Mischkreis 1 Auf"
    CHANNEL_MA1OUT(40, "MA1out", SwitchItem.class, null, false, HeatpumpVisibility.OUT_MISCHER1AUF),

    // Ausgang "Mischkreis 1 Zu"
    CHANNEL_MZ1OUT(41, "MZ1out", SwitchItem.class, null, false, HeatpumpVisibility.OUT_MISCHER1ZU),

    // Ausgang "Ventilation (Lüftung)"
    CHANNEL_VENOUT(42, "VENout", SwitchItem.class, null, false, HeatpumpVisibility.OUT_VENTILATION),

    // Ausgang "Solepumpe/Ventilator"
    CHANNEL_VBOOUT(43, "VBOout", SwitchItem.class, null, false, null),

    // Ausgang "Verdichter 1"
    CHANNEL_VD1OUT(44, "VD1out", SwitchItem.class, null, false, HeatpumpVisibility.OUT_VERDICHTER1),

    // Ausgang "Verdichter 2"
    CHANNEL_VD2OUT(45, "VD2out", SwitchItem.class, null, false, HeatpumpVisibility.OUT_VERDICHTER2),

    // Ausgang "Zirkulationspumpe"
    CHANNEL_ZIPOUT(46, "ZIPout", SwitchItem.class, null, false, HeatpumpVisibility.OUT_ZIP),

    // Ausgang "Zusatzumwälzpumpe"
    CHANNEL_ZUPOUT(47, "ZUPout", SwitchItem.class, null, false, HeatpumpVisibility.OUT_ZUP),

    // Ausgang "Steuersignal Zusatzheizung v. Heizung"
    CHANNEL_ZW1OUT(48, "ZW1out", SwitchItem.class, null, false, HeatpumpVisibility.OUT_ZWE1),

    // Ausgang "Steuersignal Zusatzheizung/Störsignal"
    CHANNEL_ZW2SSTOUT(49, "ZW2SSTout", SwitchItem.class, null, false, HeatpumpVisibility.OUT_ZWE2_SST),

    // Ausgang "Zusatzheizung 3"
    CHANNEL_ZW3SSTOUT(50, "ZW3SSTout", SwitchItem.class, null, false, HeatpumpVisibility.OUT_ZWE3),

    // Ausgang "Pumpe Mischkreis 2"
    CHANNEL_FP2OUT(51, "FP2out", SwitchItem.class, null, false, HeatpumpVisibility.OUT_FUP2),

    // Ausgang "Solarladepumpe"
    CHANNEL_SLPOUT(52, "SLPout", SwitchItem.class, null, false, HeatpumpVisibility.OUT_SLP),

    // Ausgang "Schwimmbadpumpe"
    CHANNEL_OUTPUT_SUP(53, "output_sup", SwitchItem.class, null, false, HeatpumpVisibility.OUT_SUP),

    // Ausgang "Mischkreis 2 Zu"
    CHANNEL_MZ2OUT(54, "MZ2out", SwitchItem.class, null, false, HeatpumpVisibility.OUT_MISCHER2ZU),

    // Ausgang "Mischkreis 2 Auf"
    CHANNEL_MA2OUT(55, "MA2out", SwitchItem.class, null, false, HeatpumpVisibility.OUT_MISCHER2AUF),

    // Betriebsstunden Verdichter 1
    CHANNEL_ZAEHLER_BETRZEITVD1(56, "Zaehler_BetrZeitVD1", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.BST_BSTDVD1),

    // Impulse Verdichter 1
    CHANNEL_ZAEHLER_BETRZEITIMPVD1(57, "Zaehler_BetrZeitImpVD1", NumberItem.class, null, false,
            HeatpumpVisibility.BST_IMPVD1),

    // Betriebsstunden Verdichter 2
    CHANNEL_ZAEHLER_BETRZEITVD2(58, "Zaehler_BetrZeitVD2", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.BST_BSTDVD2),

    // Impulse Verdichter 2
    CHANNEL_ZAEHLER_BETRZEITIMPVD2(59, "Zaehler_BetrZeitImpVD2", NumberItem.class, null, false,
            HeatpumpVisibility.BST_IMPVD2),

    // Betriebsstunden Zweiter Wärmeerzeuger 1
    CHANNEL_ZAEHLER_BETRZEITZWE1(60, "Zaehler_BetrZeitZWE1", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.BST_BSTDZWE1),

    // Betriebsstunden Zweiter Wärmeerzeuger 2
    CHANNEL_ZAEHLER_BETRZEITZWE2(61, "Zaehler_BetrZeitZWE2", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.BST_BSTDZWE2),

    // Betriebsstunden Zweiter Wärmeerzeuger 3
    CHANNEL_ZAEHLER_BETRZEITZWE3(62, "Zaehler_BetrZeitZWE3", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.BST_BSTDZWE3),

    // Betriebsstunden Wärmepumpe
    CHANNEL_ZAEHLER_BETRZEITWP(63, "Zaehler_BetrZeitWP", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.BST_BSTDWP),

    // Betriebsstunden Heizung
    CHANNEL_ZAEHLER_BETRZEITHZ(64, "Zaehler_BetrZeitHz", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.BST_BSTDHZ),

    // Betriebsstunden Warmwasser
    CHANNEL_ZAEHLER_BETRZEITBW(65, "Zaehler_BetrZeitBW", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.BST_BSTDBW),

    // Betriebsstunden Kühlung
    CHANNEL_ZAEHLER_BETRZEITKUE(66, "Zaehler_BetrZeitKue", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.BST_BSTDKUE),

    // Wärmepumpe läuft seit
    CHANNEL_TIME_WPEIN_AKT(67, "Time_WPein_akt", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.ABLAUFZ_WP_SEIT),

    // Zweiter Wärmeerzeuger 1 läuft seit
    CHANNEL_TIME_ZWE1_AKT(68, "Time_ZWE1_akt", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.ABLAUFZ_ZWE1_SEIT),

    // Zweiter Wärmeerzeuger 2 läuft seit
    CHANNEL_TIME_ZWE2_AKT(69, "Time_ZWE2_akt", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.ABLAUFZ_ZWE2_SEIT),

    // Netzeinschaltverzögerung
    CHANNEL_TIMER_EINSCHVERZ(70, "Timer_EinschVerz", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.ABLAUFZ_NETZEINV),

    // Schaltspielsperre Aus
    CHANNEL_TIME_SSPAUS_AKT(71, "Time_SSPAUS_akt", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.ABLAUFZ_SSP_ZEIT1),

    // Schaltspielsperre Ein
    CHANNEL_TIME_SSPEIN_AKT(72, "Time_SSPEIN_akt", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.ABLAUFZ_SSP_ZEIT1),

    // Verdichter-Standzeit
    CHANNEL_TIME_VDSTD_AKT(73, "Time_VDStd_akt", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.ABLAUFZ_VD_STAND),

    // Heizungsregler Mehr-Zeit
    CHANNEL_TIME_HRM_AKT(74, "Time_HRM_akt", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.ABLAUFZ_HRM_ZEIT),

    // Heizungsregler Weniger-Zeit
    CHANNEL_TIME_HRW_AKT(75, "Time_HRW_akt", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.ABLAUFZ_HRW_ZEIT),

    // Thermische Desinfektion läuft seit
    CHANNEL_TIME_LGS_AKT(76, "Time_LGS_akt", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.ABLAUFZ_TDI_SEIT),

    // Sperre Warmwasser
    CHANNEL_TIME_SBW_AKT(77, "Time_SBW_akt", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.ABLAUFZ_SPERRE_BW),

    // Channel 78 (Code_WP_akt_2) represents the heatpump type, will be handeled as property

    // Bivalenzstufe
    CHANNEL_BIV_STUFE_AKT(79, "BIV_Stufe_akt", NumberItem.class, null, false, null),

    // Betriebszustand
    CHANNEL_WP_BZ_AKT(80, "WP_BZ_akt", NumberItem.class, null, false, null),

    // channel 81 - 90 represents the firmware version, will be handeled as property
    // channel 91 represents the IP address, will be handeled as property
    // channel 92 represents the Subnet mask, will be handeled as property
    // channel 93 represents the Broadcast address, will be handeled as property
    // channel 94 represents the Gateway, will be handeled as property

    // Zeitstempel Fehler X im Speicher
    CHANNEL_HEATPUMP_ERROR_TIME0(95, "ERROR_Time0", DateTimeItem.class, Units.SECOND, false, null),
    CHANNEL_HEATPUMP_ERROR_TIME1(96, "ERROR_Time1", DateTimeItem.class, Units.SECOND, false, null),
    CHANNEL_HEATPUMP_ERROR_TIME2(97, "ERROR_Time2", DateTimeItem.class, Units.SECOND, false, null),
    CHANNEL_HEATPUMP_ERROR_TIME3(98, "ERROR_Time3", DateTimeItem.class, Units.SECOND, false, null),
    CHANNEL_HEATPUMP_ERROR_TIME4(99, "ERROR_Time4", DateTimeItem.class, Units.SECOND, false, null),

    // Fehlercode Fehler X im Speicher
    CHANNEL_HEATPUMP_ERROR_NR0(100, "ERROR_Nr0", NumberItem.class, null, false, null),
    CHANNEL_HEATPUMP_ERROR_NR1(101, "ERROR_Nr1", NumberItem.class, null, false, null),
    CHANNEL_HEATPUMP_ERROR_NR2(102, "ERROR_Nr2", NumberItem.class, null, false, null),
    CHANNEL_HEATPUMP_ERROR_NR3(103, "ERROR_Nr3", NumberItem.class, null, false, null),
    CHANNEL_HEATPUMP_ERROR_NR4(104, "ERROR_Nr4", NumberItem.class, null, false, null),

    // Anzahl der Fehler im Speicher
    CHANNEL_ANZAHLFEHLERINSPEICHER(105, "AnzahlFehlerInSpeicher", NumberItem.class, null, false, null),

    // Grund Abschaltung X im Speicher
    CHANNEL_HEATPUMP_SWITCHOFF_FILE_NR0(106, "Switchoff_file_Nr0", NumberItem.class, null, false, null),
    CHANNEL_HEATPUMP_SWITCHOFF_FILE_NR1(107, "Switchoff_file_Nr1", NumberItem.class, null, false, null),
    CHANNEL_HEATPUMP_SWITCHOFF_FILE_NR2(108, "Switchoff_file_Nr2", NumberItem.class, null, false, null),
    CHANNEL_HEATPUMP_SWITCHOFF_FILE_NR3(109, "Switchoff_file_Nr3", NumberItem.class, null, false, null),
    CHANNEL_HEATPUMP_SWITCHOFF_FILE_NR4(110, "Switchoff_file_Nr4", NumberItem.class, null, false, null),

    // Zeitstempel Abschaltung X im Speicher
    CHANNEL_HEATPUMP_SWITCHOFF_FILE_TIME0(111, "Switchoff_file_Time0", DateTimeItem.class, Units.SECOND, false, null),
    CHANNEL_HEATPUMP_SWITCHOFF_FILE_TIME1(112, "Switchoff_file_Time1", DateTimeItem.class, Units.SECOND, false, null),
    CHANNEL_HEATPUMP_SWITCHOFF_FILE_TIME2(113, "Switchoff_file_Time2", DateTimeItem.class, Units.SECOND, false, null),
    CHANNEL_HEATPUMP_SWITCHOFF_FILE_TIME3(114, "Switchoff_file_Time3", DateTimeItem.class, Units.SECOND, false, null),
    CHANNEL_HEATPUMP_SWITCHOFF_FILE_TIME4(115, "Switchoff_file_Time4", DateTimeItem.class, Units.SECOND, false, null),

    // Comfort Platine installiert
    CHANNEL_HEATPUMP_COMFORT_EXISTS(116, "Comfort_exists", SwitchItem.class, null, false, null),

    // Status
    CHANNEL_HEATPUMP_HAUPTMENUSTATUS_ZEILE1(117, "HauptMenuStatus_Zeile1", NumberItem.class, null, false, null),
    CHANNEL_HEATPUMP_HAUPTMENUSTATUS_ZEILE2(118, "HauptMenuStatus_Zeile2", NumberItem.class, null, false, null),
    CHANNEL_HEATPUMP_HAUPTMENUSTATUS_ZEILE3(119, "HauptMenuStatus_Zeile3", NumberItem.class, null, false, null),
    CHANNEL_HEATPUMP_HAUPTMENUSTATUS_ZEIT(120, "HauptMenuStatus_Zeit", NumberItem.class, Units.SECOND, false, null),

    // Stufe Ausheizprogramm
    CHANNEL_HAUPTMENUAHP_STUFE(121, "HauptMenuAHP_Stufe", NumberItem.class, null, false,
            HeatpumpVisibility.SERVICE_AUSHEIZ),

    // Temperatur Ausheizprogramm
    CHANNEL_HAUPTMENUAHP_TEMP(122, "HauptMenuAHP_Temp", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.SERVICE_AUSHEIZ),

    // Laufzeit Ausheizprogramm
    CHANNEL_HAUPTMENUAHP_ZEIT(123, "HauptMenuAHP_Zeit", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.SERVICE_AUSHEIZ),

    // Brauchwasser aktiv/inaktiv Symbol
    CHANNEL_SH_BWW(124, "SH_BWW", SwitchItem.class, null, false, HeatpumpVisibility.BRAUWASSER),

    // Heizung Symbol
    CHANNEL_SH_HZ(125, "SH_HZ", NumberItem.class, null, false, HeatpumpVisibility.HEIZUNG),

    // Mischkreis 1 Symbol
    CHANNEL_SH_MK1(126, "SH_MK1", NumberItem.class, null, false, HeatpumpVisibility.MK1),

    // Mischkreis 2 Symbol
    CHANNEL_SH_MK2(127, "SH_MK2", NumberItem.class, null, false, HeatpumpVisibility.MK2),

    // Einstellung Kurzprogramm
    CHANNEL_EINST_KURZPROGRAMM(128, "Einst_Kurzrpgramm", NumberItem.class, null, false, null),

    // Status Slave X
    CHANNEL_STATUSSLAVE1(129, "StatusSlave1", NumberItem.class, null, false, null),
    CHANNEL_STATUSSLAVE2(130, "StatusSlave2", NumberItem.class, null, false, null),
    CHANNEL_STATUSSLAVE3(131, "StatusSlave3", NumberItem.class, null, false, null),
    CHANNEL_STATUSSLAVE4(132, "StatusSlave4", NumberItem.class, null, false, null),
    CHANNEL_STATUSSLAVE5(133, "StatusSlave5", NumberItem.class, null, false, null),

    // Aktuelle Zeit der Wärmepumpe
    CHANNEL_AKTUELLETIMESTAMP(134, "AktuelleTimeStamp", DateTimeItem.class, Units.SECOND, false,
            HeatpumpVisibility.SERVICE_DATUMUHRZEIT),

    // Mischkreis 3 Symbol
    CHANNEL_SH_MK3(135, "SH_MK3", NumberItem.class, null, false, HeatpumpVisibility.MK3),

    // Mischkreis 3 Vorlauf-Soll-Temperatur
    CHANNEL_SOLLWERT_TVL_MK3(136, "Sollwert_TVL_MK3", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_MK3VL_SOLL),

    // Mischkreis 3 Vorlauftemperatur
    CHANNEL_TEMPERATUR_TFB3(137, "Temperatur_TFB3", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_MK3_VORLAUF),

    // Ausgang "Mischkreis 3 Zu"
    CHANNEL_MZ3OUT(138, "MZ3out", SwitchItem.class, null, false, HeatpumpVisibility.OUT_MISCHER3ZU),

    // Ausgang "Mischkreis 3 Auf"
    CHANNEL_MA3OUT(139, "MA3out", SwitchItem.class, null, false, HeatpumpVisibility.OUT_MISCHER3AUF),

    // Pumpe Mischkreis 3
    CHANNEL_FP3OUT(140, "FP3out", SwitchItem.class, null, false, HeatpumpVisibility.OUT_FUP3),

    // Zeit bis Abtauen
    CHANNEL_TIME_ABTIN(141, "Time_AbtIn", NumberItem.class, Units.SECOND, false, HeatpumpVisibility.ABLAUFZ_ABTAUIN),

    // Raumtemperatur Raumstation 2
    CHANNEL_TEMPERATUR_RFV2(142, "Temperatur_RFV2", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_RAUMSTATION2),

    // Raumtemperatur Raumstation 3
    CHANNEL_TEMPERATUR_RFV3(143, "Temperatur_RFV3", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMP_RAUMSTATION3),

    // Schaltuhr Schwimmbad Symbol
    CHANNEL_SH_SW(144, "SH_SW", NumberItem.class, null, false, HeatpumpVisibility.SCHWIMMBAD),

    // Betriebsstunden Schwimmbad
    CHANNEL_ZAEHLER_BETRZEITSW(145, "Zaehler_BetrZeitSW", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.BST_BSTDSW),

    // Freigabe Kühlung
    CHANNEL_FREIGABKUEHL(146, "FreigabKuehl", SwitchItem.class, null, false, HeatpumpVisibility.KUHLUNG),

    // Analoges Eingangssignal
    CHANNEL_ANALOGIN(147, "AnalogIn", NumberItem.class, Units.VOLT, false, HeatpumpVisibility.IN_ANALOGIN),

    // CHANNEL_SONDERZEICHEN(148, "SonderZeichen", NumberItem.class, null, false, null),

    // Zirkulationspumpen Symbol
    CHANNEL_SH_ZIP(149, "SH_ZIP", NumberItem.class, null, false, null),

    // CHANNEL_WEBSRVPROGRAMMWERTEBEOBARTEN(150, "WebsrvProgrammWerteBeobarten", NumberItem.class, null, false, null),

    // Wärmemengenzähler Heizung
    CHANNEL_WMZ_HEIZUNG(151, "WMZ_Heizung", NumberItem.class, Units.KILOWATT_HOUR, false, HeatpumpVisibility.HEIZUNG),

    // Wärmemengenzähler Brauchwasser
    CHANNEL_WMZ_BRAUCHWASSER(152, "WMZ_Brauchwasser", NumberItem.class, Units.KILOWATT_HOUR, false,
            HeatpumpVisibility.BRAUWASSER),

    // Wärmemengenzähler Schwimmbad
    CHANNEL_WMZ_SCHWIMMBAD(153, "WMZ_Schwimmbad", NumberItem.class, Units.KILOWATT_HOUR, false,
            HeatpumpVisibility.SCHWIMMBAD),

    // Wärmemengenzähler seit Reset
    CHANNEL_WMZ_SEIT(154, "WMZ_Seit", NumberItem.class, Units.KILOWATT_HOUR, false, null),

    // Wärmemengenzähler Durchfluss
    CHANNEL_WMZ_DURCHFLUSS(155, "WMZ_Durchfluss", NumberItem.class, Units.LITRE_PER_MINUTE, false, null),

    // Analog Ausgang 1
    CHANNEL_ANALOGOUT1(156, "AnalogOut1", NumberItem.class, Units.VOLT, false, HeatpumpVisibility.OUT_ANALOG_1),

    // Analog Ausgang 2
    CHANNEL_ANALOGOUT2(157, "AnalogOut2", NumberItem.class, Units.VOLT, false, HeatpumpVisibility.OUT_ANALOG_2),

    // Sperre zweiter Verdichter Heissgas
    CHANNEL_TIME_HEISSGAS(158, "Time_Heissgas", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.ABLAUFZ_HG_SPERRE),

    // Zulufttemperatur
    CHANNEL_TEMP_LUEFTUNG_ZULUFT(159, "Temp_Lueftung_Zuluft", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMPERATUR_LUEFTUNG_ZULUFT),

    // Ablufttemperatur
    CHANNEL_TEMP_LUEFTUNG_ABLUFT(160, "Temp_Lueftung_Abluft", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.TEMPERATUR_LUEFTUNG_ABLUFT),

    // Betriebstundenzähler Solar
    CHANNEL_ZAEHLER_BETRZEITSOLAR(161, "Zaehler_BetrZeitSolar", NumberItem.class, Units.SECOND, false,
            HeatpumpVisibility.SOLAR),

    // Analog Ausgang 3
    CHANNEL_ANALOGOUT3(162, "AnalogOut3", NumberItem.class, Units.VOLT, false, HeatpumpVisibility.OUT_ANALOG_3),

    // Analog Ausgang 4
    CHANNEL_ANALOGOUT4(163, "AnalogOut4", NumberItem.class, Units.VOLT, false, HeatpumpVisibility.OUT_ANALOG_4),

    // Zuluft Ventilator (Abtaufunktion)
    CHANNEL_OUT_VZU(164, "Out_VZU", NumberItem.class, Units.VOLT, false, HeatpumpVisibility.OUT_VZU),

    // Abluft Ventilator
    CHANNEL_OUT_VAB(165, "Out_VAB", NumberItem.class, Units.VOLT, false, HeatpumpVisibility.OUT_VAB),

    // Ausgang VSK
    CHANNEL_OUT_VSK(166, "Out_VSK", SwitchItem.class, null, false, HeatpumpVisibility.OUT_VSK),

    // Ausgang FRH
    CHANNEL_OUT_FRH(167, "OUT_FRH", SwitchItem.class, null, false, HeatpumpVisibility.OUT_FRH),

    // Analog Eingang 2
    CHANNEL_ANALOGIN2(168, "AnalogIn2", NumberItem.class, Units.VOLT, false, HeatpumpVisibility.IN_ANALOG_2),

    // Analog Eingang 3
    CHANNEL_ANALOGIN3(169, "AnalogIn3", NumberItem.class, Units.VOLT, false, HeatpumpVisibility.IN_ANALOG_3),

    // Eingang SAX
    CHANNEL_SAXIN(170, "SAXin", SwitchItem.class, null, false, HeatpumpVisibility.IN_SAX),

    // Eingang SPL
    CHANNEL_SPLIN(171, "SPLin", SwitchItem.class, null, false, HeatpumpVisibility.IN_SPL),

    // Lüftungsplatine verbaut
    CHANNEL_COMPACT_EXISTS(172, "Compact_exists", SwitchItem.class, null, false, null),

    // Durchfluss Wärmequelle
    CHANNEL_DURCHFLUSS_WQ(173, "Durchfluss_WQ", NumberItem.class, Units.LITRE_PER_MINUTE, false, null),

    // LIN BUS verbaut
    CHANNEL_LIN_EXISTS(174, "LIN_exists", SwitchItem.class, null, false, null),

    // Temperatur Ansaug Verdampfer
    CHANNEL_LIN_ANSAUG_VERDAMPFER(175, "LIN_ANSAUG_VERDAMPFER", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.LIN_ANSAUG_VERDAMPFER),

    // Temperatur Ansaug Verdichter
    CHANNEL_LIN_ANSAUG_VERDICHTER(176, "LIN_ANSAUG_VERDICHTER", NumberItem.class, SIUnits.CELSIUS, false,
            HeatpumpVisibility.LIN_ANSAUG_VERDICHTER),

    // Temperatur Verdichter Heizung
    CHANNEL_LIN_VDH(177, "LIN_VDH", NumberItem.class, SIUnits.CELSIUS, false, HeatpumpVisibility.LIN_VDH),

    // Überhitzung
    CHANNEL_LIN_UH(178, "LIN_UH", NumberItem.class, Units.KELVIN, false, HeatpumpVisibility.LIN_UH),

    // Überhitzung Soll
    CHANNEL_LIN_UH_SOLL(179, "LIN_UH_Soll", NumberItem.class, Units.KELVIN, false, HeatpumpVisibility.LIN_UH),

    // Hochdruck
    CHANNEL_LIN_HD(180, "LIN_HD", NumberItem.class, Units.BAR, false, HeatpumpVisibility.LIN_DRUCK),

    // Niederdruck
    CHANNEL_LIN_ND(181, "LIN_ND", NumberItem.class, Units.BAR, false, HeatpumpVisibility.LIN_DRUCK),

    // Ausgang Verdichterheizung
    CHANNEL_LIN_VDH_OUT(182, "LIN_VDH_out", SwitchItem.class, null, false, null),

    // Steuersignal Umwälzpumpe
    CHANNEL_HZIO_PWM(183, "HZIO_PWM", NumberItem.class, Units.PERCENT, false, null),

    // Ventilator Drehzahl
    CHANNEL_HZIO_VEN(184, "HZIO_VEN", NumberItem.class, null, false, null),

    // EVU 2
    // CHANNEL_HZIO_EVU2(185, "HZIO_EVU2", NumberItem.class, null, false, null),

    // Sicherheits-Tempeartur-Begrenzer Fussbodenheizung
    CHANNEL_HZIO_STB(186, "HZIO_STB", SwitchItem.class, null, false, null),

    // Leistung Sollwert
    CHANNEL_SEC_QH_SOLL(187, "SEC_Qh_Soll", NumberItem.class, Units.KILOWATT_HOUR, false, null),

    // Leistung Istwert
    CHANNEL_SEC_QH_IST(188, "SEC_Qh_Ist", NumberItem.class, Units.KILOWATT_HOUR, false, null),

    // Temperatur Vorlauf Soll
    CHANNEL_SEC_TVL_SOLL(189, "SEC_TVL_Soll", NumberItem.class, SIUnits.CELSIUS, false, null),

    // Software Stand SEC Board
    // CHANNEL_SEC_SOFTWARE(190, "SEC_Software", NumberItem.class, null, false, null),

    // Betriebszustand SEC Board
    CHANNEL_SEC_BZ(191, "SEC_BZ", NumberItem.class, null, false, HeatpumpVisibility.SEC),

    // Vierwegeventil
    CHANNEL_SEC_VWV(192, "SEC_VWV", NumberItem.class, null, false, HeatpumpVisibility.SEC),

    // Verdichterdrehzahl
    CHANNEL_SEC_VD(193, "SEC_VD", NumberItem.class, null, false, HeatpumpVisibility.SEC),

    // Verdichtertemperatur EVI (Enhanced Vapour Injection)
    CHANNEL_SEC_VERDEVI(194, "SEC_VerdEVI", NumberItem.class, SIUnits.CELSIUS, false, HeatpumpVisibility.SEC),

    // Ansaugtemperatur EVI
    CHANNEL_SEC_ANSEVI(195, "SEC_AnsEVI", NumberItem.class, SIUnits.CELSIUS, false, HeatpumpVisibility.SEC),

    // Überhitzung EVI
    CHANNEL_SEC_UEH_EVI(196, "SEC_UEH_EVI", NumberItem.class, Units.KELVIN, false, HeatpumpVisibility.SEC),

    // Überhitzung EVI Sollwert
    CHANNEL_SEC_UEH_EVI_S(197, "SEC_UEH_EVI_S", NumberItem.class, Units.KELVIN, false, HeatpumpVisibility.SEC),

    // Kondensationstemperatur
    CHANNEL_SEC_KONDTEMP(198, "SEC_KondTemp", NumberItem.class, SIUnits.CELSIUS, false, HeatpumpVisibility.SEC),

    // Flüssigtemperatur EEV (elektronisches Expansionsventil)
    CHANNEL_SEC_FLUSSIGEX(199, "SEC_FlussigEx", NumberItem.class, SIUnits.CELSIUS, false, HeatpumpVisibility.SEC),

    // Unterkühlung EEV
    CHANNEL_SEC_UK_EEV(200, "SEC_UK_EEV", NumberItem.class, SIUnits.CELSIUS, false, HeatpumpVisibility.SEC),

    // Druck EVI
    CHANNEL_SEC_EVI_DRUCK(201, "SEC_EVI_Druck", NumberItem.class, Units.BAR, false, HeatpumpVisibility.SEC),

    // Spannung Inverter
    CHANNEL_SEC_U_INV(202, "SEC_U_Inv", NumberItem.class, Units.VOLT, false, HeatpumpVisibility.SEC),

    // Temperarturfühler Heissgas 2
    CHANNEL_TEMPERATUR_THG_2(203, "Temperatur_THG_2", NumberItem.class, SIUnits.CELSIUS, false, null),

    // Temperaturfühler Wärmequelleneintritt 2
    CHANNEL_TEMPERATUR_TWE_2(204, "Temperatur_TWE_2", NumberItem.class, SIUnits.CELSIUS, false, null),

    // Ansaugtemperatur Verdampfer 2
    CHANNEL_LIN_ANSAUG_VERDAMPFER_2(205, "LIN_ANSAUG_VERDAMPFER_2", NumberItem.class, SIUnits.CELSIUS, false, null),

    // Ansaugtemperatur Verdichter 2
    CHANNEL_LIN_ANSAUG_VERDICHTER_2(206, "LIN_ANSAUG_VERDICHTER_2", NumberItem.class, SIUnits.CELSIUS, false, null),

    // Temperatur Verdichter 2 Heizung
    CHANNEL_LIN_VDH_2(207, "LIN_VDH_2", NumberItem.class, SIUnits.CELSIUS, false, null),

    // Überhitzung 2
    CHANNEL_LIN_UH_2(208, "LIN_UH_2", NumberItem.class, Units.KELVIN, false, HeatpumpVisibility.LIN_UH),

    // Überhitzung Soll 2
    CHANNEL_LIN_UH_SOLL_2(209, "LIN_UH_Soll_2", NumberItem.class, Units.KELVIN, false, HeatpumpVisibility.LIN_UH),

    // Hochdruck 2
    CHANNEL_LIN_HD_2(210, "LIN_HD_2", NumberItem.class, Units.BAR, false, HeatpumpVisibility.LIN_DRUCK),

    // Niederdruck 2
    CHANNEL_LIN_ND_2(211, "LIN_ND_2", NumberItem.class, Units.BAR, false, HeatpumpVisibility.LIN_DRUCK),

    // Eingang Druckschalter Hochdruck 2
    CHANNEL_HDIN_2(212, "HDin_2", SwitchItem.class, null, false, HeatpumpVisibility.IN_HD),

    // Ausgang Abtauventil 2
    CHANNEL_AVOUT_2(213, "AVout_2", SwitchItem.class, null, false, HeatpumpVisibility.OUT_ABTAUVENTIL),

    // Ausgang Solepumpe/Ventilator 2
    CHANNEL_VBOOUT_2(214, "VBOout_2", SwitchItem.class, null, false, null),

    // Ausgang Verdichter 1 / 2
    CHANNEL_VD1OUT_2(215, "VD1out_2", SwitchItem.class, null, false, null),

    // Ausgang Verdichter Heizung 2
    CHANNEL_LIN_VDH_OUT_2(216, "LIN_VDH_out_2", SwitchItem.class, null, false, null),

    // Grund Abschaltung X im Speicher
    CHANNEL_SWITCHOFF2_FILE_NR0(217, "Switchoff2_file_Nr0", NumberItem.class, null, false, null),
    CHANNEL_SWITCHOFF2_FILE_NR1(218, "Switchoff2_file_Nr1", NumberItem.class, null, false, null),
    CHANNEL_SWITCHOFF2_FILE_NR2(219, "Switchoff2_file_Nr2", NumberItem.class, null, false, null),
    CHANNEL_SWITCHOFF2_FILE_NR3(220, "Switchoff2_file_Nr3", NumberItem.class, null, false, null),
    CHANNEL_SWITCHOFF2_FILE_NR4(221, "Switchoff2_file_Nr4", NumberItem.class, null, false, null),

    // Zeitstempel Abschaltung X im Speicher
    CHANNEL_SWITCHOFF2_FILE_TIME0(222, "Switchoff2_file_Time0", DateTimeItem.class, Units.SECOND, false, null),
    CHANNEL_SWITCHOFF2_FILE_TIME1(223, "Switchoff2_file_Time1", DateTimeItem.class, Units.SECOND, false, null),
    CHANNEL_SWITCHOFF2_FILE_TIME2(224, "Switchoff2_file_Time2", DateTimeItem.class, Units.SECOND, false, null),
    CHANNEL_SWITCHOFF2_FILE_TIME3(225, "Switchoff2_file_Time3", DateTimeItem.class, Units.SECOND, false, null),
    CHANNEL_SWITCHOFF2_FILE_TIME4(226, "Switchoff2_file_Time4", DateTimeItem.class, Units.SECOND, false, null),

    // Raumtemperatur Istwert
    CHANNEL_RBE_RT_IST(227, "RBE_RT_Ist", NumberItem.class, SIUnits.CELSIUS, false, null),

    // Raumtemperatur Sollwert
    CHANNEL_RBE_RT_SOLL(228, "RBE_RT_Soll", NumberItem.class, SIUnits.CELSIUS, false, null),

    // Temperatur Brauchwasser Oben
    CHANNEL_TEMPERATUR_BW_OBEN(229, "Temperatur_BW_oben", NumberItem.class, SIUnits.CELSIUS, false, null),

    // Channel 230 (Code_WP_akt_2) represent the heatpump type 2

    // Verdichterfrequenz
    CHANNEL_CODE_FREQ_VD(231, "Freq_VD", NumberItem.class, Units.HERTZ, false, null),

    // Changeable Parameters
    // https://www.loxwiki.eu/display/LOX/Java+Webinterface?preview=/13306044/13307658/3003.txt

    // Heizung Temperatur (Parallelverschiebung)
    CHANNEL_EINST_WK_AKT(1, "Einst_WK_akt", NumberItem.class, SIUnits.CELSIUS, true, HeatpumpVisibility.HEIZUNG),

    // Warmwasser Soll Temperatur
    CHANNEL_EINST_BWS_AKT(2, "Einst_BWS_akt", NumberItem.class, SIUnits.CELSIUS, true, HeatpumpVisibility.BRAUWASSER),

    // Heizung Betriebsart
    CHANNEL_BA_HZ_AKT(3, "Ba_Hz_akt", NumberItem.class, null, true, HeatpumpVisibility.HEIZUNG),

    // Warmwasser Betriebsart
    CHANNEL_BA_BW_AKT(4, "Ba_Bw_akt", NumberItem.class, null, true, HeatpumpVisibility.BRAUWASSER),

    // Thermische Desinfektion (Montag - Freitag + Dauerbetrieb)
    CHANNEL_EINST_BWTDI_AKT_MO(20, "Einst_BwTDI_akt_MO", SwitchItem.class, null, true,
            HeatpumpVisibility.THERMDESINFEKT),
    CHANNEL_EINST_BWTDI_AKT_DI(21, "Einst_BwTDI_akt_DI", SwitchItem.class, null, true,
            HeatpumpVisibility.THERMDESINFEKT),
    CHANNEL_EINST_BWTDI_AKT_MI(22, "Einst_BwTDI_akt_MI", SwitchItem.class, null, true,
            HeatpumpVisibility.THERMDESINFEKT),
    CHANNEL_EINST_BWTDI_AKT_DO(23, "Einst_BwTDI_akt_DO", SwitchItem.class, null, true,
            HeatpumpVisibility.THERMDESINFEKT),
    CHANNEL_EINST_BWTDI_AKT_FR(24, "Einst_BwTDI_akt_FR", SwitchItem.class, null, true,
            HeatpumpVisibility.THERMDESINFEKT),
    CHANNEL_EINST_BWTDI_AKT_SA(25, "Einst_BwTDI_akt_SA", SwitchItem.class, null, true,
            HeatpumpVisibility.THERMDESINFEKT),
    CHANNEL_EINST_BWTDI_AKT_SO(26, "Einst_BwTDI_akt_SO", SwitchItem.class, null, true,
            HeatpumpVisibility.THERMDESINFEKT),
    CHANNEL_EINST_BWTDI_AKT_AL(27, "Einst_BwTDI_akt_AL", SwitchItem.class, null, true,
            HeatpumpVisibility.THERMDESINFEKT),

    // Comfort Kühlung Betriebsart
    CHANNEL_EINST_BWSTYP_AKT(100, "Einst_BWStyp_akt", NumberItem.class, null, true, HeatpumpVisibility.KUHLUNG),

    // Comfort Kühlung AT-Freigabe
    CHANNEL_EINST_KUCFTL_AKT(110, "Einst_KuCft1_akt", NumberItem.class, SIUnits.CELSIUS, true,
            HeatpumpVisibility.KUHLUNG),

    // Comfort Kühlung AT-Freigabe Sollwert
    CHANNEL_SOLLWERT_KUCFTL_AKT(132, "Sollwert_KuCft1_akt", NumberItem.class, SIUnits.CELSIUS, true,
            HeatpumpVisibility.KUHLUNG),

    // AT-Überschreitung
    CHANNEL_EINST_KUHL_ZEIT_EIN_AKT(850, "Einst_Kuhl_Zeit_Ein_akt", NumberItem.class, null, true,
            HeatpumpVisibility.SYSEIN_KUHL_ZEIT_EIN),

    // AT-Unterschreitung
    CHANNEL_EINST_KUHL_ZEIT_AUS_AKT(851, "Einst_Kuhl_Zeit_Aus_akt", NumberItem.class, null, true,
            HeatpumpVisibility.SYSEIN_KUHL_ZEIT_AUS);

    private @Nullable Integer channelId;
    private String command;
    private Class<? extends Item> itemClass;
    private @Nullable Unit<?> unit;
    private Boolean isParameter;
    private @Nullable HeatpumpVisibility requiredVisibility;

    private HeatpumpChannel(@Nullable Integer channelId, String command, Class<? extends Item> itemClass,
            @Nullable Unit<?> unit, Boolean isParameter, @Nullable HeatpumpVisibility requiredVisibility) {
        this.channelId = channelId;
        this.command = command;
        this.itemClass = itemClass;
        this.unit = unit;
        this.isParameter = isParameter;
        this.requiredVisibility = requiredVisibility;
    }

    public @Nullable Integer getChannelId() {
        return channelId;
    }

    public String getCommand() {
        return command;
    }

    public Class<? extends Item> getItemClass() {
        return itemClass;
    }

    public @Nullable Unit<?> getUnit() {
        return unit;
    }

    public Boolean isWritable() {
        return isParameter == Boolean.TRUE;
    }

    protected @Nullable HeatpumpVisibility getVisibility() {
        return requiredVisibility;
    }

    public Boolean isVisible(Integer[] visibilityValues) {
        HeatpumpVisibility visiblity = getVisibility();

        if (visiblity == null) {
            return Boolean.TRUE;
        }

        int code = visiblity.getCode();

        if (visibilityValues.length < code || visibilityValues[code].equals(1)) {
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }

    public static HeatpumpChannel fromString(String heatpumpCommand) throws IllegalArgumentException {

        for (HeatpumpChannel c : HeatpumpChannel.values()) {

            if (c.getCommand().equals(heatpumpCommand)) {
                return c;
            }
        }

        throw new IllegalArgumentException("cannot find LuxtronikHeatpump channel for '" + heatpumpCommand + "'");
    }

    @Override
    public String toString() {
        return getCommand();
    }
}
