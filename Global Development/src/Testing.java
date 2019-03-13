/**
 * Program # 8
 * The following application takes data from teh external library, global distrubution,
 * it asks for certain responses from teh user and accoring to those responses it prints the data
 * CS108-3
 * Date 12/10/2018
 * @author Pranav Kalra
 * Red ID: 821916362
 * */

import corgis.global_development.GlobalDevelopmentLibrary;
import corgis.global_development.domain.Report;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Testing
{
    public static void main(String[] args)
    {
        //Initializting variables and classes
        JFrame frame = new JFrame();
        String country = null, year = null, classes,sepration, subClasses = null, gender = null, subClassesI = null, subClassesR = null, subClassesU = new String(), subClassesReport = null, listSepration = null;
        setParam object = new setParam();
        Infrastructure infrastructure = new Infrastructure();
        RuralDevelopment ruralDevelopment = new RuralDevelopment();
        UrbanDevelopment urbanDevelopment = new UrbanDevelopment();

        //Initial message for user to know about application's specifications
        JOptionPane.showMessageDialog(frame,
                "GLOBAL DEVELOPMENT DATA\n" +
                        "For selected click on SELECTED\n" +
                "For Reported data click on REPORT\n",
                "GLOBAL DEVELOPMENT DATA",
                JOptionPane.PLAIN_MESSAGE);

        //Dialog Box for Sorted Selection
        sepration = (String) JOptionPane.showInputDialog(frame,"DATA TYPE SELECTION","Input",JOptionPane.QUESTION_MESSAGE,null,setListSepration(),null);
        if (sepration == "SELECTED")
        {//if starts
            //Dialog Box for Sorted Countries
            country = (String) JOptionPane.showInputDialog(frame, "SELECT COUNTRY", "Input", JOptionPane.QUESTION_MESSAGE, null, setListCountry(), null);
            //Dialog Box for Sorted Year
            year = (String) JOptionPane.showInputDialog(frame, "SELECT YEAR (1980-2013)", "Input", JOptionPane.QUESTION_MESSAGE, null, setListYear(), null);
            //Dialog Box for Sorted Classes
            classes = (String) JOptionPane.showInputDialog(frame, "SELECTED DEVELOPMENT CATEGORY", "Input", JOptionPane.QUESTION_MESSAGE, null, setListClass(), null);
            if (classes == "Health")
            {//is starts
                //Dialog Box for Health DATA
                subClasses = (String) JOptionPane.showInputDialog(frame, "Health data", "Input", JOptionPane.QUESTION_MESSAGE, null, setListSubClass(), null);
            }
            else if (classes == "Infrastructure")
            {//else if starts
                //Dialog Box for Infrastructure data
                subClassesI = (String) JOptionPane.showInputDialog(frame, "Infrastructure data", "Input", JOptionPane.QUESTION_MESSAGE, null, setListSubClassI(), null);
            }
            else if (classes == "Rural Development")
            {//else if starts
                //Dialog Box for Rural DATA
                subClassesR = (String) JOptionPane.showInputDialog(frame, "Rural data", "Input", JOptionPane.QUESTION_MESSAGE, null, setListSubClassR(), null);
            }
            else if (classes == "Urban Development")
            {//else id starts
                //Dialog Box for Urban DATA
                subClassesU = (String) JOptionPane.showInputDialog(frame, "Urban data", "Input", JOptionPane.QUESTION_MESSAGE, null, setListSubClassU(), null);
            }
            else if (classes == "Report")
            {//else if starts
                // Dialog Box for sub classes
                subClassesReport = (String) JOptionPane.showInputDialog(frame, " data", "Input", JOptionPane.QUESTION_MESSAGE, null, setListSubClassReport(), null);
            }

/**----------------------------------------------------------------------------------------------------------------------------------------------------------*/

            //Condition staremsnts for teh inputs recived from teh dialog boxes and calling specfic class methods accoring to those inputs
            if (classes == "Health") {
                if (subClasses == "Life Expectancy At Birth") {
                    if (gender == "Female") {
                        String find = country + "| " + year;
                        object.findLifeExpectancyAtBirthFemale(find);
                    } else if (gender == "Male") {
                        String find = country + "| " + year;
                        object.findLifeExpectancyAtBirthMale(find);
                    } else {
                        String find = country + "| " + year;
                        object.findLifeExpectancyAtBirthTotal(find);
                    }
                } else if (subClasses == "Death Rate") {
                    String find = country + "| " + year;
                    object.findBirthRate(find);
                } else if (subClasses == "Fertility Rate") {
                    String find = country + "| " + year;
                    object.findFertilityRate(find);
                } else if (subClasses == "Birth Rate") {
                    String find = country + "| " + year;
                    object.findBirthRate(find);
                } else if (subClasses == "Total Population") {
                    String find = country + "| " + year;
                    object.findTotalPopulation(find);
                } else if (subClasses == "Population Growth") {
                    String find = country + "| " + year;
                    object.findPopulationGrowth(find);
                }

            }//if ends
            else if (classes == "Infrastructure") {//if starts
                if (subClassesI == "Telephone Lines Per One zero zero People") {
                    String find = country + "| " + year;
                    infrastructure.findTelephoneLinesPerOnezerozeroPeople(find);
                } else if (subClassesI == "Mobile Cellular Subscriptions") {
                    String find = country + "| " + year;
                    infrastructure.findMobileCellularSubscriptions(find);
                } else if (subClassesI == "Mobile Cellular Subscriptions Per One zero zero People") {
                    String find = country + "| " + year;
                    infrastructure.findMobileCellularSubscriptionsPerOnezerozeroPeople(find);
                } else if (subClassesI == "Telephone Lines") {
                    String find = country + "| " + year;
                    infrastructure.findTelephoneLines(find);
                }
            }//end if
            else if (classes == "Rural Development") {//else if starts
                if (subClassesR == "Agricultural Land") {
                    String find = country + "| " + year;
                    ruralDevelopment.findAgriculturalLand(find);
                } else if (subClassesR == "Arable Land") {
                    String find = country + "| " + year;
                    ruralDevelopment.findArableLand(find);
                } else if (subClassesR == "Agricultural Land Percent") {
                    String find = country + "| " + year;
                    ruralDevelopment.findAgriculturalLandPercent(find);
                } else if (subClassesR == "Arable Land Percent") {
                    String find = country + "| " + year;
                    ruralDevelopment.findArableLandPercent(find);
                } else if (subClassesR == "Land Area") {
                    String find = country + "| " + year;
                    ruralDevelopment.findLandArea(find);
                } else if (subClassesR == "Rural Population") {
                    String find = country + "| " + year;
                    ruralDevelopment.findRuralPopulation(find);
                } else if (subClassesR == "Rural Population Growth") {
                    String find = country + "| " + year;
                    ruralDevelopment.findRuralPopulationGrowth(find);
                } else if (subClassesR == "Surface Area") {
                    String find = country + "| " + year;
                    ruralDevelopment.findSurfaceArea(find);
                }
            }//end else-if
            else if (classes == "Urban Development") {//else if starts
                if (subClassesU == "Population Density") {
                    String find = country + "| " + year;
                    urbanDevelopment.findPopulationDensity(find);
                } else if (subClassesU == "Urban Population Percent") {
                    String find = country + "| " + year;
                    urbanDevelopment.findUrbanPopulationPercent(find);
                } else if (subClassesU == "Urban Population Percent Growth") {
                    String find = country + "| " + year;
                    urbanDevelopment.findUrbanPopulationPercentGrowth(find);
                }
            }//end else-if

        }
        else if (sepration == "REPORT")
        {
            subClassesReport = (String) JOptionPane.showInputDialog(frame, "pick data", "Input", JOptionPane.QUESTION_MESSAGE, null, setListSubClassReport(), null);

            if (subClassesReport == "ALL HEALTH DATA")
            {
                String find = country + "| " + year;
                object.getallDataHealth();
            }
            //ALL URBAN DEVELOPMENT DATA
            else if (subClassesReport == "ALL URBAN DEVELOPMENT DATA")
            {
                String find = country + "| " + year;
                urbanDevelopment.getAllDataUrban();
            }
            else if (subClassesReport == "ALL RURAL DEVELOPMENT DATA")
            {
                String find = country + "| " + year;
                ruralDevelopment.getAllDataRural();
            }
            //ALL HEALTH INFRASTRUCTURE
            else if (subClassesReport == "ALL HEALTH INFRASTRUCTURE")
            {
                String find = country + "| " + year;
                infrastructure.getAllDataInfrastucture();
            }
        }
    }

/**--------------------------------------------------------------------------------------------------------------------------------------------------*/
    //Helper method to set year for popup window
    public static String[] setListYear()
    {
        String listYear[] = new String[34];
        int i = 0;
        int year = 1980;
        while (i != 34)
        {
            listYear[i] = Integer.toString(year);
            year = year + 1;
            i++;
        }
        return listYear;
    }

    //Helper method to set Country for popup window
    public static String[] setListCountry()
    {
        setParam a = new setParam();
        String bigList[] = new String[1000];
        bigList = a.printCountries();
        Arrays.sort(bigList);
        return bigList;
    }

    //Helper method to set Classes for popup window
    public static String[] setListClass()
    {
        String[] listClass = {"Health","Infrastructure", "Rural Development", "Urban Development"};
        return listClass;
    }

    //Helper method to set SUB Classes for popup window
    public static String[] setListSubClass()
    {
        String[] listSubClass = {"Death Rate","Fertility Rate", "Life Expectancy At Birth", "BirthRate",
                "Total Population" + "Life Expectancy At Birth" + "Population Growth", "Life Expectancy At Birth Total"};
        return listSubClass;
    }

    //Helper method to set Sub Classes for Infrastructure for popup window
    public static String[] setListSubClassI()
    {
        String[] listSubClassI = {"Telephone Lines Per One zero zero People", "Mobile Cellular Subscriptions",
        "Mobile Cellular Subscriptions Per One zero zero People", "Telephone Lines"};
        return listSubClassI;
    }

    //Helper method to set Sub Classes for Gender for popup window
    public static String[] setListGender()
    {
        String[] listGender = {"Male", "Female", "Total"};
        return listGender;
    }

    //Helper method to set Sub Classes for Rural Development for popup window
    public static String[] setListSubClassR()
    {
        String[] listSubClassR = {"Agricultural Land", "Agricultural Land Percent",
                "Arable Land", "Arable Land Percent", "Land Area", "Rural Population", "Rural Population Growth",
        "Surface Area"};
        return listSubClassR;
    }

    //Helper method to set Sub Classes for Urban Development for popup window
    public static String[] setListSubClassU()
    {
        String[] listSubClassU = {"Population Density", "Urban Population Percent", "Urban Population Percent Growth"};
        return listSubClassU;
    }

    //Helper method to set Sub Classes for Report for popup window
    public static String[] setListSubClassReport()
    {
        String[] listSubClassReport = {"ALL HEALTH DATA", "ALL URBAN DEVELOPMENT DATA", "ALL RURAL DEVELOPMENT DATA", "ALL HEALTH INFRASTRUCTURE"};
        return listSubClassReport;
    }

    //Helper method to set Sub Classes for DATA SEPERATION for popup window
    public static String[] setListSepration()
    {
        String[] listSepration = {"SELECTED","REPORT"};
        return listSepration;
    }



}
