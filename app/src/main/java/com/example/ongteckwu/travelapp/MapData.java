package com.example.ongteckwu.travelapp;

/**
 * Created by architdate on 2/11/2016.
 */


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Joshua on 20/11/2016.
 */
public class MapData {
    public static final Map<Character, String> alphaToLocMap;
    public static HashMap<String, double[]> data = new HashMap<> ();
    static {
        Map<Character, String> aMap = new HashMap<>();
        aMap.put('a', "SUTD");
        aMap.put('b', "Singapore Flyer");
        aMap.put('c', "Vivo City");
        aMap.put('d', "Resorts World Sentosa");
        aMap.put('e', "Buddha Tooth Relic Temple");
        aMap.put('f', "Singapore Zoo");
        aMap.put('g', "Singapore Botanic Gardens");
        aMap.put('h', "Peranakan Museum");
        aMap.put('i', "ION Orchard");
        alphaToLocMap = Collections.unmodifiableMap(aMap);
    }
    // create a hashmap of the time and cost of all transport modes of all possible routes
    public static HashMap<String, double[]> generateCostTimeMap() {
        if (!data.isEmpty()) return data;
        /**
         * FOR REFERENCE:
         * a --> SUTD (Changed from MBS)
         * b --> Singapore Flyer
         * c --> Vivo City
         * d --> Resorts World Sentosa
         * e --> Buddha Tooth Relic Temple
         * f --> Singapore Zoo/ Zoo
         * g --> Singapore Botanic Gardens/ Botanic Gardens
         * h --> Peranakan Museum
         * i --> ION Orchard
         * j --> Art Science Museum
         * k --> Bukit Timah Nature Reserve
         * l --> Esplanade
         * m --> Gardens By The Bay
         * n --> Kranji War Memorial
         * o --> National Museum of Singapore
         * p --> Science Center Singapore
         * q --> Universal Studios Singapore
         * r --> Marina Barrage
         * e.g. from A to B = {publicCost, publicTime, taxiCost, taxiTime, walkCost, walkTime}
         *
         * These travel times and costs are referenced from gothere.sg and Google Maps Directions tool.
         * Data taken @ 10:00 am 16/11/2016 & 23/11/2016 (because travel costs may vary depending on time)
         * Format is {Bus cost, Bus Time, Taxi Cost, Taxi Time, Walking Cost, Walking Time}**/
        //MBS
//        double[] listAB = {0.83, 17, 3.22, 3, 0, 14};
//        double[] listAC = {1.18, 26, 6.96, 14, 0, 69};
//        double[] listAD = {4.03, 35, 8.50, 19, 0, 76};
//        double[] listAE = {0.88, 19, 4.98, 8, 0, 28};
//        double[] listAF = {1.96, 84, 18.4, 30, 0, 269};
//        double[] listAG = {1.38, 36, 15.80, 13, 0, 97};
//        double[] listAH = {0.92, 24, 4.32, 7, 0, 31};
//        double[] listAI = {1.13, 25, 13.05, 10, 0, 60};
//        double[] listAJ = {0.00, 16, 2.45, 4, 0, 16};
//        double[] listAK = {1.75, 50, 17.88, 18, 0, 136};
//        double[] listAL = {0.78, 14, 4.04, 5, 0, 18};
//        double[] listAM = {0.78, 33, 4.04, 4, 0, 18};
//        double[] listAN = {1.84, 59, 23.40, 27, 0, 272};
//        double[] listAO = {0.78, 13, 4.70, 6, 0, 26};
//        double[] listAP = {1.70, 48, 16.58, 19, 0, 187};
//        double[] listAQ = {4.10, 33, 9.10, 16, 0, 86};
//        double[] listAR = {0.78, 33, 4.48, 6, 0, 23};

        //SUTD
        double[] listAB = {1.61, 47, 15.48, 20, 0, 173};
        double[] listAC = {1.88, 52, 20.32, 26, 233};
        double[] listAD = {1.88, 60, 24.42, 32, 0, 248};
        double[] listAE = {1.77, 52, 17.90, 23, 0, 204};
        double[] listAF = {1.93, 96, 26.92, 34, 0, 318};
        double[] listAG = {1.76, 73, 18.34, 25, 206};
        double[] listAH = {1.54, 51, 17.90, 24, 0, 204};
        double[] listAI = {1.62, 46, 17.68, 24, 0, 199};
        double[] listAJ = {1.69, 49, 15.70, 20, 0, 175};
        double[] listAK = {1.86, 81, 24.94, 30, 0, 294};
        double[] listAL = {1.50, 43, 16.58, 22, 0, 186};
        double[] listAM = {1.58, 60, 16.80, 22, 0, 188};
        double[] listAN = {1.96, 81, 26.48, 32, 0, 312};
        double[] listAO = {1.54, 47,15.92, 22, 0, 176};
        double[] listAP = {1.93, 76, 26.70, 31, 0, 315};
        double[] listAQ = {1.88, 61, 24.20, 31, 0, 246};
        double[] listAR = {1.73, 79, 17.24, 23, 0, 194};

        //Singapore Flyer
//        double[] listBA = {0.83, 17, 4.32, 6, 0, 14};
        double[] listBA = {1.61, 47, 15.48, 20, 0, 173};
        double[] listBC = {1.26, 31, 7.84, 13, 0, 81};
        double[] listBD = {4.03, 38, 9.38, 18, 0, 88};
        double[] listBE = {0.98, 24, 4.76, 8, 0, 39};
        double[] listBF = {1.89, 85, 18.18, 29, 0, 264};
        double[] listBG = {1.18, 36, 12.25, 13, 0, 61};
        double[] listBH = {0.87, 20, 3.66, 5, 0, 23};
        double[] listBI = {1.02, 25, 9.22, 8, 0, 53};
        double[] listBJ = {0.00, 13, 3.47, 3, 0, 13};
        double[] listBK = {1.71, 53, 17.22, 18, 0, 131};
        double[] listBL = {0.78, 13, 3.82, 3, 0, 11};
        double[] listBM = {0.78, 22, 4.92, 6, 0, 27};
        double[] listBN = {1.82, 50, 19.44, 27, 0, 221};
        double[] listBO = {0.78, 17, 4.26, 4, 0, 19};
        double[] listBP = {1.73, 53, 15.92, 20, 0, 176};
        double[] listBQ = {4.17, 38, 8.44, 18, 0, 79};
        double[] listBR = {1.14, 51, 5.14, 8, 0, 33};

        //Vivocity
//        double[] listCA = {1.18, 24, 8.30, 12, 0, 69};
        double[] listCA = {1.88, 52, 20.32, 26, 233};
        double[] listCB = {1.26, 29, 7.96, 14, 0, 81};
        double[] listCD = {2.00, 10, 4.54, 9, 0, 12};
        double[] listCE = {0.98, 18, 6.42, 11, 0, 47};
        double[] listCF = {1.99, 85, 22.58, 31, 0, 270};
        double[] listCG = {1.66, 29, 11.17, 19, 0, 107};
        double[] listCH = {1.13, 22, 7.40, 13, 0, 69};
        double[] listCI = {1.31, 24, 8.70, 15, 0, 72};
        double[] listCJ = {1.25, 27, 7.63, 12, 0, 73};
        double[] listCK = {1.83, 39, 13.72, 19, 0, 146};
        double[] listCL = {0.99, 24, 7.34, 13, 0, 64};
        double[] listCM = {1.10, 38, 7.56, 11, 0, 67};
        double[] listCN = {2.03, 69, 23.62, 29, 0, 278};
        double[] listCO = {1.14, 21, 8.44, 14, 0, 82};
        double[] listCP = {1.50, 39, 13.94, 17, 0, 149};
        double[] listCQ = {3.00, 10, 5.14, 12, 0, 31};
        double[] listCR = {1.17, 53, 8.00, 12, 0, 72};

        //RWS
//        double[] listDA = {1.18, 33, 8.74, 13, 0, 76};
        double[] listDA = {1.88, 60, 24.42, 32, 0, 248};
        double[] listDB = {1.26, 38, 8.40, 14, 0, 88};
        double[] listDC = {0.00, 10, 3.22, 4, 0, 12};
        double[] listDE = {0.98, 27, 6.64, 12, 0, 55};
        double[] listDF = {1.99, 92, 22.80, 32, 0, 285};
        double[] listDG = {1.66, 38, 11.45, 20, 0, 131};
        double[] listDH = {0.98, 36, 7.62, 13, 0, 93};
        double[] listDI = {3.31, 39, 9.25, 15, 0, 95};
        double[] listDJ = {1.25, 36, 9.79, 12, 0, 77};
        double[] listDK = {1.83, 47, 17.82, 25, 0, 161};
        double[] listDL = {0.99, 32, 11.44, 20, 0, 80};
        double[] listDM = {1.10, 46, 11.44, 17, 0, 82};
        double[] listDN = {2.03, 70, 27.94, 35, 0, 293};
        double[] listDO = {1.14, 29, 12.54, 20, 0, 97};
        double[] listDP = {1.50, 47, 18.04, 23, 0, 164};
        double[] listDQ = {0.00, 9999, 0.00, 9999, 0, 2};//there is no cab/public transport within sentosa
        double[] listDR = {1.39, 62, 12.10, 18, 0, 88};

        //Buddha Tooth Relic Temple
//        double[] listEA = {0.88, 18, 5.32, 7, 0, 28};
        double[] listEA = {1.77, 52, 17.90, 23, 0, 204};
        double[] listEB = {0.98, 23, 4.76, 8, 0, 39};
        double[] listEC = {0.98, 19, 4.98, 9, 0, 47};
        double[] listED = {3.98, 28, 6.52, 14, 0, 55};
        double[] listEF = {1.91, 83, 18.4, 30, 0, 264};
        double[] listEG = {1.31, 36, 12.80, 14, 0, 87};
        double[] listEH = {0.92, 25, 3.88, 6, 0, 23};
        double[] listEI = {0.97, 22, 9.78, 9, 0, 46};
        double[] listEJ = {0.93, 21, 5.36, 7, 0, 30};
        double[] listEK = {1.79, 37, 13.72, 19, 0, 148};
        double[] listEL = {0.88, 27, 5.14, 7, 0, 32};
        double[] listEM = {0.88, 36, 5.36, 7, 0, 38};
        double[] listEN = {1.82, 60, 21.42, 27, 0, 247};
        double[] listEO = {0.78, 20, 5.14, 7, 0, 32};
        double[] listEP = {1.54, 45, 13.94, 17, 0, 151};
        double[] listEQ = {4.03, 28, 6.90, 15, 0, 55};
        double[] listER = {0.98, 48, 6.02, 9, 0, 44};

        //Zoo
//        double[] listFA = {1.88, 86, 22.48, 32, 0, 269};
        double[] listFA = {1.93, 96, 26.92, 34, 0, 318};
        double[] listFB = {1.96, 87, 19.40, 29, 0, 264};
        double[] listFC = {2.11, 86, 21.48, 32, 0, 270};
        double[] listFD = {4.99, 96, 23.68, 36, 0, 285};
        double[] listFE = {1.91, 84, 21.60, 30, 0, 264};
        double[] listFG = {1.96, 70, 18.05, 20, 0, 214};
        double[] listFH = {1.90, 81, 18.90, 29, 0, 254};
        double[] listFI = {1.78, 66, 20.80, 26, 0, 245};
        double[] listFJ = {2.03, 83, 21.72, 31, 0, 229};
        double[] listFK = {1.50, 56, 11.96, 17, 0, 127};
        double[] listFL = {1.86, 79, 19.00, 28, 0, 216};
        double[] listFM = {1.84, 90, 22.52, 34, 0, 262};
        double[] listFN = {1.10, 44, 6.90, 11, 0, 56};
        double[] listFO = {1.84, 75, 18.56, 28, 0, 208};
        double[] listFP = {1.62, 68, 17.24, 22, 0, 191};
        double[] listFQ = {5.06, 96, 24.28, 40, 0, 285};
        double[] listFR = {1.91, 111, 23.18, 35, 0, 268};

        //Singapore Botanic Gardens
//        double[] listGA = {1.38, 43, 10.62, 15, 0, 97};
        double[] listGA = {1.76, 73, 18.34, 25, 206};
        double[] listGB = {1.18, 43, 9.53, 14, 0, 92};
        double[] listGC = {1.66, 29, 12.28, 17, 0, 107};
        double[] listGD = {3.66, 48, 14.47, 21, 0, 132};
        double[] listGE = {1.31, 38, 10.62, 16, 0, 87};
        double[] listGF = {1.93, 70, 16.40, 18, 0, 217};
        double[] listGH = {1.21, 39, 8.50, 16, 0, 73};
        double[] listGI = {0.98, 43, 6.22, 10, 0, 43};
        double[] listGJ = {1.49, 26, 8.10, 18, 0, 91};
        double[] listGK = {0.99, 35, 7.56, 13, 0, 70};
        double[] listGL = {0.99, 46, 6.90, 14, 0, 56};
        double[] listGM = {1.24, 48, 8.66, 20, 0, 85};
        double[] listGN = {1.54, 55, 15.48, 21, 0, 170};
        double[] listGO = {0.99, 33, 6.24, 13, 0, 50};
        double[] listGP = {1.43, 55, 12.18, 19, 0, 130};
        double[] listGQ = {4.30, 54, 9.54, 27, 0, 98};
        double[] listGR = {1.39, 83, 9.32, 21, 0, 91};

        //Peranakan Museum
//        double[] listHA = {0.92, 24, 4.54, 7, 0, 30};
        double[] listHA = {1.54, 51, 17.90, 24, 0, 204};
        double[] listHB = {0.87, 20, 4.32, 6, 0, 23};
        double[] listHC = {1.13, 24, 7.62, 15, 0, 68};
        double[] listHD = {4.13, 33, 9.16, 19, 0, 93};
        double[] listHE = {0.82, 21, 4.54, 8, 0, 22};
        double[] listHF = {1.90, 80, 17.30, 27, 0, 256};
        double[] listHG = {1.39, 38, 6.74, 13, 0, 72};
        double[] listHI = {0.77, 17, 8.40, 6, 0, 34};
        double[] listHJ = {0.93, 26, 4.19, 8, 0, 38};
        double[] listHK = {1.43, 40, 12.18, 19, 0, 129};
        double[] listHL = {0.83, 17, 4.26, 5, 0, 20};
        double[] listHM = {0.78, 33, 6.46, 11, 0, 51};
        double[] listHN = {1.76, 49, 18.56, 25, 0, 210};
        double[] listHO = {0.00, 6, 3.60, 2, 0, 6};
        double[] listHP = {1.58, 50, 15.92, 20, 0, 175};
        double[] listHQ = {4.14, 33, 9.32, 20, 0, 94};
        double[] listHR = {1.04, 56, 6.90, 13, 0, 57};

        //ION Orchard
//        double[] listIA = {1.13, 25, 10.05, 11, 0, 59};
        double[] listIA = {1.62, 46, 17.68, 24, 0, 199};
        double[] listIB = {1.02, 25, 9.78, 10, 0, 53};
        double[] listIC = {1.31, 25, 10.88, 13, 0, 71};
        double[] listID = {5.37, 45, 12.53, 18, 0, 96};
        double[] listIE = {0.97, 22, 9.50, 9, 0, 45};
        double[] listIF = {1.78, 65, 22.43, 23, 0, 246};
        double[] listIG = {0.98, 40, 8.68, 8, 0, 42};
        double[] listIH = {0.82, 19, 8.95, 9, 0, 34};
        double[] listIJ = {1.15, 27, 6.35, 12, 0, 57};
        double[] listIK = {1.55, 26, 10.42, 15, 0, 107};
        double[] listIL = {0.78, 17, 5.58, 8, 0, 38};
        double[] listIM = {0.99, 31, 7.12, 13, 0, 61};
        double[] listIN = {1.70, 47, 16.80, 21, 0, 188};
        double[] listIO = {0.78, 13, 5.14, 8, 0, 32};
        double[] listIP = {1.54, 49, 15.04, 19, 0, 164};
        double[] listIQ = {4.32, 34, 8.22, 21, 0, 76};
        double[] listIR = {1.17, 49, 7.56, 15, 0, 67};

        //Art Science Museum
//        double[] listJA = {0.00, 16, 2.45, 4, 0.00, 16};
        double[] listJA = {1.69, 49, 15.70, 20, 0, 175};
        double[] listJB = {0.00, 13, 3.47, 3, 0.00, 13};
        double[] listJC = {1.25, 27, 7.63, 12, 0, 73};
        double[] listJD = {1.25, 36, 9.79, 12, 0, 77};
        double[] listJE = {0.93, 21, 5.36, 7, 0, 30};
        double[] listJF = {2.03, 83, 21.72, 31, 0, 229};
        double[] listJG = {1.49, 26, 8.10, 18, 0, 91};
        double[] listJH = {0.93, 26, 4.19, 8, 0, 38};
        double[] listJI = {1.15, 27, 6.35, 12, 0, 57};
        double[] listJK = {1.71, 35, 13.28, 21, 0, 143};
        double[] listJL = {0.78, 12, 3.82, 4, 0, 13};
        double[] listJM = {0.78, 22, 5.14, 8, 0, 34};
        double[] listJN = {1.82, 53, 19.66, 27, 0, 223};
        double[] listJO = {0.78, 16, 4.26, 5, 0, 21};
        double[] listJP = {1.70, 52, 16.14, 20, 0, 178};
        double[] listJQ = {4.10, 37, 8.44, 19, 0, 81};
        double[] listJR = {0.93, 49, 5.58, 9, 0, 39};

        //Bukit Timah Nature Reserve
//        double[] listKA = {1.75, 50, 17.88, 18, 0, 136};
        double[] listKA = {1.86, 81, 24.94, 30, 0, 294};
        double[] listKB = {1.71, 53, 17.22, 18, 0, 131};
        double[] listKC = {1.83, 39, 13.72, 19, 0, 146};
        double[] listKD = {1.83, 47, 17.82, 25, 0, 161};
        double[] listKE = {1.79, 37, 13.72, 19, 0, 148};
        double[] listKF = {1.50, 56, 11.96, 17, 0, 127};
        double[] listKG = {0.99, 35, 7.56, 13, 0, 70};
        double[] listKH = {1.43, 40, 12.18, 19, 0, 129};
        double[] listKI = {1.55, 26, 10.42, 15, 0, 107};
        double[] listKJ = {1.71, 35, 13.28, 21, 0, 143};
        double[] listKL = {1.50, 56, 16.58, 23, 0, 187};
        double[] listKM = {1.58, 70, 19.44, 28, 0, 221};
        double[] listKN = {1.30, 39, 9.32, 9, 0, 91};
        double[] listKO = {1.46, 50, 16.36, 23, 0, 183};
        double[] listKP = {1.17, 41, 10.42, 16, 0, 108};
        double[] listKQ = {4.91, 71, 17.90, 34, 0, 203};
        double[] listKR = {1.91, 88, 19.88, 29, 0, 226};

        //Esplanade
//        double[] listLA = {0.78, 14, 4.04, 5, 0, 18};
        double[] listLA = {1.50, 43, 16.58, 22, 0, 186};
        double[] listLB = {0.78, 13, 3.82, 3, 0, 11};
        double[] listLC = {0.99, 24, 7.34, 13, 0, 64};
        double[] listLD = {0.99, 32, 11.44, 20, 0, 80};
        double[] listLE = {0.88, 27, 5.14, 7, 0, 32};
        double[] listLF = {1.86, 79, 19.00, 28, 0, 216};
        double[] listLG = {0.99, 46, 6.90, 14, 0, 56};
        double[] listLH = {0.83, 17, 4.26, 5, 0, 20};
        double[] listLI = {0.78, 17, 5.58, 8, 0, 38};
        double[] listLJ = {0.78, 12, 3.82, 4, 0, 13};
        double[] listLK = {1.50, 56, 16.58, 23, 0, 187};
        double[] listLM = {0.78, 27, 4.92, 6, 0, 28};
        double[] listLN = {1.79, 50, 19.66, 27, 0, 224};
        double[] listLO = {0.78, 14, 4.26, 4, 0, 19};
        double[] listLP = {1.62, 50, 15.70, 19, 0, 173};
        double[] listLQ = {3.99, 34, 7.56, 16, 0, 67};
        double[] listLR = {0.88, 50, 5.14, 8, 0, 33};

        //Gardens By The Bay
//        double[] listMA = {0.78, 33, 4.04, 4, 0, 18};
        double[] listMA = {1.58, 60, 16.80, 22, 0, 188};
        double[] listMB = {0.78, 22, 4.92, 6, 0, 27};
        double[] listMC = {1.10, 38, 7.56, 11, 0, 67};
        double[] listMD = {1.10, 46, 11.44, 17, 0, 82};
        double[] listME = {0.88, 36, 5.36, 7, 0, 38};
        double[] listMF = {1.84, 90, 22.52, 34, 0, 262};
        double[] listMG = {1.24, 48, 8.66, 20, 0, 85};
        double[] listMH = {0.78, 33, 6.46, 11, 0, 51};
        double[] listMI = {0.99, 31, 7.12, 13, 0, 61};
        double[] listMJ = {0.78, 22, 5.14, 8, 0, 34};
        double[] listMK = {1.58, 70, 19.44, 28, 0, 221};
        double[] listML = {0.78, 27, 4.92, 6, 0, 28};
        double[] listMN = {1.84, 68, 24.50, 28, 0, 286};
        double[] listMO = {0.78, 26, 6.02, 10, 0, 46};
        double[] listMP = {1.70, 57, 16.58, 19, 0, 184};
        double[] listMQ = {4.10, 42, 8.44, 20, 0, 79};
        double[] listMR = {0.78, 29, 3.60, 2, 0, 5};

        //Kranji War Memorial
//        double[] listNA = {1.84, 59, 23.40, 27, 0, 272};
        double[] listNA = {1.96, 81, 26.48, 32, 0, 312};
        double[] listNB = {1.82, 50, 19.44, 27, 0, 221};
        double[] listNC = {2.03, 69, 23.62, 29, 0, 278};
        double[] listND = {2.03, 70, 27.94, 35, 0, 293};
        double[] listNE = {1.82, 60, 21.42, 27, 0, 247};
        double[] listNF = {1.10, 44, 6.90, 11, 0, 56};
        double[] listNG = {1.54, 55, 15.48, 21, 0, 170};
        double[] listNH = {1.76, 49, 18.56, 25, 0, 210};
        double[] listNI = {1.70, 47, 16.80, 21, 0, 188};
        double[] listNJ = {1.82, 53, 19.66, 27, 0, 223};
        double[] listNK = {1.30, 39, 9.32, 9, 0, 91};
        double[] listNL = {1.79, 50, 19.66, 27, 0, 224};
        double[] listNM = {1.84, 68, 24.50, 28, 0, 286};
        double[] listNO = {1.82, 53, 19.00, 28, 0, 216};
        double[] listNP = {1.50, 46, 11.52, 21, 0, 119};
        double[] listNQ = {5.05, 73, 24.94, 39, 0, 293};
        double[] listNR = {1.93, 100, 27.14, 35, 0, 322};

        //National Museum of Singapore
//        double[] listOA = {0.78, 13, 4.70, 6, 0, 26};
        double[] listOA = {1.54, 47,15.92, 22, 0, 176};
        double[] listOB = {0.78, 17, 4.26, 4, 0, 19};
        double[] listOC = {1.14, 21, 8.44, 14, 0, 82};
        double[] listOD = {1.14, 29, 12.54, 20, 0, 97};
        double[] listOE = {0.78, 20, 5.14, 7, 0, 32};
        double[] listOF = {1.84, 75, 18.56, 28, 0, 208};
        double[] listOG = {0.99, 33, 6.24, 13, 0, 50};
        double[] listOH = {0.00, 6, 3.60, 2, 0, 6};
        double[] listOI = {0.78, 13, 5.14, 8, 0, 32};
        double[] listOJ = {0.78, 16, 4.26, 5, 0, 21};
        double[] listOK = {1.46, 50, 16.36, 23, 0, 183};
        double[] listOL = {0.78, 14, 4.26, 4, 0, 19};
        double[] listOM = {0.78, 26, 6.02, 10, 0, 46};
        double[] listON = {1.82, 53, 19.00, 28, 0, 216};
        double[] listOP = {1.62, 53, 15.48, 19, 0, 170};
        double[] listOQ = {4.14, 31, 9.32, 22, 0, 94};
        double[] listOR = {0.99, 50, 6.46, 12, 0, 53};

        //Science Center Singapore
//        double[] listPA = {1.70, 48, 16.58, 19, 0, 187};
        double[] listPA = {1.93, 76, 26.70, 31, 0, 315};
        double[] listPB = {1.73, 53, 15.92, 20, 0, 176};
        double[] listPC = {1.50, 39, 13.94, 17, 0, 149};
        double[] listPD = {1.50, 47, 18.04, 23, 0, 164};
        double[] listPE = {1.54, 45, 13.94, 17, 0, 151};
        double[] listPF = {1.62, 68, 17.24, 22, 0, 191};
        double[] listPG = {1.43, 55, 12.18, 19, 0, 130};
        double[] listPH = {1.58, 50, 15.92, 20, 0, 175};
        double[] listPI = {1.54, 49, 15.04, 19, 0, 164};
        double[] listPJ = {1.70, 52, 16.14, 20, 0, 178};
        double[] listPK = {1.17, 41, 10.42, 16, 0, 108};
        double[] listPL = {1.62, 50, 15.70, 19, 0, 173};
        double[] listPM = {1.70, 57, 16.58, 19, 0, 184};
        double[] listPN = {1.50, 46, 11.52, 21, 0, 119};
        double[] listPO = {1.62, 53, 15.48, 19, 0, 170};
        double[] listPQ = {4.46, 53, 15.48, 27, 0, 171};
        double[] listPR = {1.70, 78, 17.46, 22, 0, 194};

        //Universal Studios Singapore
//        double[] listQA = {4.10, 33, 9.10, 16, 0, 86};
        double[] listQA = {1.88, 61, 24.20, 31, 0, 246};
        double[] listQB = {4.17, 38, 8.44, 18, 0, 79};
        double[] listQC = {3.00, 10, 5.14, 12, 0, 31};
        double[] listQD = {0.00, 9999, 0.00, 9999, 0, 2};//there is no cab/public transport within sentosa
        double[] listQE = {4.03, 28, 6.90, 15, 0, 55};
        double[] listQF = {5.06, 96, 24.28, 40, 0, 285};
        double[] listQG = {4.30, 54, 9.54, 27, 0, 98};
        double[] listQH = {4.14, 33, 9.32, 20, 0, 94};
        double[] listQI = {4.32, 34, 8.22, 21, 0, 76};
        double[] listQJ = {4.10, 37, 8.44, 19, 0, 81};
        double[] listQK = {4.91, 71, 17.90, 34, 0, 203};
        double[] listQL = {3.99, 34, 7.56, 16, 0, 67};
        double[] listQM = {4.10, 42, 8.44, 20, 0, 79};
        double[] listQN = {5.05, 73, 24.94, 39, 0, 293};
        double[] listQO = {4.14, 31, 9.32, 22, 0, 94};
        double[] listQP = {4.46, 53, 15.48, 27, 0, 171};
        double[] listQR = {1.39, 63, 11.88, 17, 0, 85};

        //Marina Barrage
//        double[] listRA = {0.78, 33, 4.48, 6, 0, 23};
        double[] listRA = {1.73, 79, 17.24, 23, 0, 194};
        double[] listRB = {1.14, 51, 5.14, 8, 0, 33};
        double[] listRC = {1.17, 53, 8.00, 12, 0, 72};
        double[] listRD = {1.39, 62, 12.10, 18, 0, 88};
        double[] listRE = {0.98, 48, 6.02, 9, 0, 44};
        double[] listRF = {1.91, 111, 23.18, 35, 0, 268};
        double[] listRG = {1.39, 83, 9.32, 21, 0, 91};
        double[] listRH = {1.04, 56, 6.90, 13, 0, 57};
        double[] listRI = {1.17, 49, 7.56, 15, 0, 67};
        double[] listRJ = {0.93, 49, 5.58, 9, 0, 39};
        double[] listRK = {1.91, 88, 19.88, 29, 0, 226};
        double[] listRL = {0.88, 50, 5.14, 8, 0, 33};
        double[] listRM = {0.78, 29, 3.60, 2, 0, 5};
        double[] listRN = {1.93, 100, 27.14, 35, 0, 322};
        double[] listRO = {0.99, 50, 6.46, 12, 0, 53};
        double[] listRP = {1.70, 78, 17.46, 22, 0, 194};
        double[] listRQ = {1.39, 63, 11.88, 17, 0, 85};

        // Short-form keyword used here for neater coding.

        data.put("ab", listAB);
        data.put("ac", listAC);
        data.put("ad", listAD);
        data.put("ae", listAE);
        data.put("af", listAF);
        data.put("ag", listAG);
        data.put("ah", listAH);
        data.put("ai", listAI);
        data.put("aj", listAJ);
        data.put("ak", listAK);
        data.put("al", listAL);
        data.put("am", listAM);
        data.put("an", listAN);
        data.put("ao", listAO);
        data.put("ap", listAP);
        data.put("aq", listAQ);
        data.put("ar", listAR);

        data.put("ba", listBA);
        data.put("bc", listBC);
        data.put("bd", listBD);
        data.put("be", listBE);
        data.put("bf", listBF);
        data.put("bg", listBG);
        data.put("bh", listBH);
        data.put("bi", listBI);
        data.put("bj", listBJ);
        data.put("bk", listBK);
        data.put("bl", listBL);
        data.put("bm", listBM);
        data.put("bn", listBN);
        data.put("bo", listBO);
        data.put("bp", listBP);
        data.put("bq", listBQ);
        data.put("br", listBR);

        data.put("ca", listCA);
        data.put("cb", listCB);
        data.put("cd", listCD);
        data.put("ce", listCE);
        data.put("cf", listCF);
        data.put("cg", listCG);
        data.put("ch", listCH);
        data.put("ci", listCI);
        data.put("cj", listCJ);
        data.put("ck", listCK);
        data.put("cl", listCL);
        data.put("cm", listCM);
        data.put("cn", listCN);
        data.put("co", listCO);
        data.put("cp", listCP);
        data.put("cq", listCQ);
        data.put("cr", listCR);

        data.put("da", listDA);
        data.put("db", listDB);
        data.put("dc", listDC);
        data.put("de", listDE);
        data.put("df", listDF);
        data.put("dg", listDG);
        data.put("dh", listDH);
        data.put("di", listDI);
        data.put("dj", listDJ);
        data.put("dk", listDK);
        data.put("dl", listDL);
        data.put("dm", listDM);
        data.put("dn", listDN);
        data.put("do", listDO);
        data.put("dp", listDP);
        data.put("dq", listDQ);
        data.put("dr", listDR);

        data.put("ea", listEA);
        data.put("eb", listEB);
        data.put("ec", listEC);
        data.put("ed", listED);
        data.put("ef", listEF);
        data.put("eg", listEG);
        data.put("eh", listEH);
        data.put("ei", listEI);
        data.put("ej", listEJ);
        data.put("ek", listEK);
        data.put("el", listEL);
        data.put("em", listEM);
        data.put("en", listEN);
        data.put("eo", listEO);
        data.put("ep", listEP);
        data.put("eq", listEQ);
        data.put("er", listER);

        data.put("fa", listFA);
        data.put("fb", listFB);
        data.put("fc", listFC);
        data.put("fd", listFD);
        data.put("fe", listFE);
        data.put("fg", listFG);
        data.put("fh", listFH);
        data.put("fi", listFI);
        data.put("fj", listFJ);
        data.put("fk", listFK);
        data.put("fl", listFL);
        data.put("fm", listFM);
        data.put("fn", listFN);
        data.put("fo", listFO);
        data.put("fp", listFP);
        data.put("fq", listFQ);
        data.put("fr", listFR);

        data.put("ga", listGA);
        data.put("gb", listGB);
        data.put("gc", listGC);
        data.put("gd", listGD);
        data.put("ge", listGE);
        data.put("gf", listGF);
        data.put("gh", listGH);
        data.put("gi", listGI);
        data.put("gj", listGJ);
        data.put("gk", listGK);
        data.put("gl", listGL);
        data.put("gm", listGM);
        data.put("gn", listGN);
        data.put("go", listGO);
        data.put("gp", listGP);
        data.put("gq", listGQ);
        data.put("gr", listGR);

        data.put("ha", listHA);
        data.put("hb", listHB);
        data.put("hc", listHC);
        data.put("hd", listHD);
        data.put("he", listHE);
        data.put("hf", listHF);
        data.put("hg", listHG);
        data.put("hi", listHI);
        data.put("hj", listHJ);
        data.put("hk", listHK);
        data.put("hl", listHL);
        data.put("hm", listHM);
        data.put("hn", listHN);
        data.put("ho", listHO);
        data.put("hp", listHP);
        data.put("hq", listHQ);
        data.put("hr", listHR);

        data.put("ia", listIA);
        data.put("ib", listIB);
        data.put("ic", listIC);
        data.put("id", listID);
        data.put("ie", listIE);
        data.put("if", listIF);
        data.put("ig", listIG);
        data.put("ih", listIH);
        data.put("ij", listIJ);
        data.put("ik", listIK);
        data.put("il", listIL);
        data.put("im", listIM);
        data.put("in", listIN);
        data.put("io", listIO);
        data.put("ip", listIP);
        data.put("iq", listIQ);
        data.put("ir", listIR);

        data.put("ja", listJA);
        data.put("jb", listJB);
        data.put("jc", listJC);
        data.put("jd", listJD);
        data.put("je", listJE);
        data.put("jf", listJF);
        data.put("jg", listJG);
        data.put("jh", listJH);
        data.put("ji", listJI);
        data.put("jk", listJK);
        data.put("jl", listJL);
        data.put("jm", listJM);
        data.put("jn", listJN);
        data.put("jo", listJO);
        data.put("jp", listJP);
        data.put("jq", listJQ);
        data.put("jr", listJR);

        data.put("ka", listKA);
        data.put("kb", listKB);
        data.put("kc", listKC);
        data.put("kd", listKD);
        data.put("ke", listKE);
        data.put("kf", listKF);
        data.put("kg", listKG);
        data.put("kh", listKH);
        data.put("ki", listKI);
        data.put("kj", listKJ);
        data.put("kl", listKL);
        data.put("km", listKM);
        data.put("kn", listKN);
        data.put("ko", listKO);
        data.put("kp", listKP);
        data.put("kq", listKQ);
        data.put("kr", listKR);

        data.put("la", listLA);
        data.put("lb", listLB);
        data.put("lc", listLC);
        data.put("ld", listLD);
        data.put("le", listLE);
        data.put("lf", listLF);
        data.put("lg", listLG);
        data.put("lh", listLH);
        data.put("li", listLI);
        data.put("lj", listLJ);
        data.put("lk", listLK);
        data.put("lm", listLM);
        data.put("ln", listLN);
        data.put("lo", listLO);
        data.put("lp", listLP);
        data.put("lq", listLQ);
        data.put("lr", listLR);

        data.put("ma", listMA);
        data.put("mb", listMB);
        data.put("mc", listMC);
        data.put("md", listMD);
        data.put("me", listME);
        data.put("mf", listMF);
        data.put("mg", listMG);
        data.put("mh", listMH);
        data.put("mi", listMI);
        data.put("mj", listMJ);
        data.put("mk", listMK);
        data.put("ml", listML);
        data.put("mn", listMN);
        data.put("mo", listMO);
        data.put("mp", listMP);
        data.put("mq", listMQ);
        data.put("mr", listMR);

        data.put("na", listNA);
        data.put("nb", listNB);
        data.put("nc", listNC);
        data.put("nd", listND);
        data.put("ne", listNE);
        data.put("nf", listNF);
        data.put("ng", listNG);
        data.put("nh", listNH);
        data.put("ni", listNI);
        data.put("nj", listNJ);
        data.put("nk", listNK);
        data.put("nl", listNL);
        data.put("nm", listNM);
        data.put("no", listNO);
        data.put("np", listNP);
        data.put("nq", listNQ);
        data.put("nr", listNR);

        data.put("oa", listOA);
        data.put("ob", listOB);
        data.put("oc", listOC);
        data.put("od", listOD);
        data.put("oe", listOE);
        data.put("of", listOF);
        data.put("og", listOG);
        data.put("oh", listOH);
        data.put("oi", listOI);
        data.put("oj", listOJ);
        data.put("ok", listOK);
        data.put("ol", listOL);
        data.put("om", listOM);
        data.put("on", listON);
        data.put("op", listOP);
        data.put("oq", listOQ);
        data.put("or", listOR);

        data.put("pa", listPA);
        data.put("pb", listPB);
        data.put("pc", listPC);
        data.put("pd", listPD);
        data.put("pe", listPE);
        data.put("pf", listPF);
        data.put("pg", listPG);
        data.put("ph", listPH);
        data.put("pi", listPI);
        data.put("pj", listPJ);
        data.put("pk", listPK);
        data.put("pl", listPL);
        data.put("pm", listPM);
        data.put("pn", listPN);
        data.put("po", listPO);
        data.put("pq", listPQ);
        data.put("pr", listPR);

        data.put("qa", listQA);
        data.put("qb", listQB);
        data.put("qc", listQC);
        data.put("qd", listQD);
        data.put("qe", listQE);
        data.put("qf", listQF);
        data.put("qg", listQG);
        data.put("qh", listQH);
        data.put("qi", listQI);
        data.put("qj", listQJ);
        data.put("qk", listQK);
        data.put("ql", listQL);
        data.put("qm", listQM);
        data.put("qn", listQN);
        data.put("qo", listQO);
        data.put("qp", listQP);
        data.put("qr", listQR);

        data.put("ra", listRA);
        data.put("rb", listRB);
        data.put("rc", listRC);
        data.put("rd", listRD);
        data.put("re", listRE);
        data.put("rf", listRF);
        data.put("rg", listRG);
        data.put("rh", listRH);
        data.put("ri", listRI);
        data.put("rj", listRJ);
        data.put("rk", listRK);
        data.put("rl", listRL);
        data.put("rm", listRM);
        data.put("rn", listRN);
        data.put("ro", listRO);
        data.put("rp", listRP);
        data.put("rq", listRQ);

        return data;
    }
}
