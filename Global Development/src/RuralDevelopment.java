//Importing teh Global Development Library
import corgis.global_development.GlobalDevelopmentLibrary;
import corgis.global_development.domain.*;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;


public class RuralDevelopment
{
    // Get access to the library
    GlobalDevelopmentLibrary globalDevelopmentLibrary = new GlobalDevelopmentLibrary();
    // Access data inside the library
    ArrayList<Report> list_of_report = globalDevelopmentLibrary.getReports(true);

    //Class fields
    public String[] AgriculturalLand = new String[1000];
    public String[] AgriculturalLandPercent = new String[1000];
    public String[] ArableLand = new String[1000];
    public String[] ArableLandPercent = new String[1000];
    public String[] LandArea = new String[1000];
    public String[] RuralPopulation = new String[1000];
    public String[] RuralPopulationGrowth = new String[1000];
    public String[] SurfaceArea = new String[1000];
    public String[] allDataRural = new String[1000];

    /**-----------------------------------------------------------------------------------------*/

    //Class Methods

    //Get methods, these methods collect data from the library for species sub section and returns that data
    public String[] getAgriculturalLand()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                AgriculturalLand[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getRuralDevelopment().getAgriculturalLand().toString();
                i++;
            }
        }
        return AgriculturalLand;
    }
    public String[] getAgriculturalLandPercent()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                AgriculturalLandPercent[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getRuralDevelopment().getAgriculturalLandPercent().toString() + "%";
                i++;
            }
        }
        return AgriculturalLandPercent;
    }
    public String[] getArableLand()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                ArableLand[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getRuralDevelopment().getArableLand().toString();
                i++;
            }
        }
        return ArableLand;
    }
    public String[] getArableLandPercent()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                ArableLandPercent[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getRuralDevelopment().getArableLandPercent().toString() + "%";
                i++;
            }
        }
        return ArableLandPercent;
    }

    public String[] getLandArea()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                LandArea[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getRuralDevelopment().getLandArea().toString();
                i++;
            }
        }
        return LandArea;
    }
    public String[] getRuralPopulationGrowth()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                RuralPopulationGrowth[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getRuralDevelopment().getRuralPopulationGrowth().toString() + "%";
                i++;
            }
        }
        return RuralPopulationGrowth;
    }
    public String[] getSurfaceArea()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                SurfaceArea[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getRuralDevelopment().getSurfaceArea().toString();
                i++;
            }
        }
        return SurfaceArea;
    }
    public String[] getRuralPopulation()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                RuralPopulation[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getRuralDevelopment().getRuralPopulation().toString() + "%";
                i++;
            }
        }
        return RuralPopulation;
    }

    //This method prints teh cummilative data for all teh sub categories
    public String[] getAllDataRural()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                allDataRural[i] = (String) (i +") " + r.getCountry().toString() + "| " + r.getYear().toString() + "| AGRICULTURAL LAND: " +r.getData().getRuralDevelopment().getAgriculturalLand().toString() + "| AGRICULTURE LAND PERCENT " +
                        r.getData().getRuralDevelopment().getAgriculturalLandPercent().toString() + "| ARABLE LAND" + r.getData().getRuralDevelopment().getArableLand().toString()
                        + "| ARABLE LAND PERCENT" + r.getData().getRuralDevelopment().getArableLandPercent().toString() + "| LAND AREA" + r.getData().getRuralDevelopment().getLandArea().toString() +
                        "| RURAL POPULATION" + r.getData().getRuralDevelopment().getRuralPopulation().toString() + "| RURAL POPULATION GROWTH" + r.getData().getRuralDevelopment().getRuralPopulationGrowth().toString()
                        + "| SURFACE AREA" + r.getData().getRuralDevelopment().getSurfaceArea().toString()
                );
                //System.out.println(allDataHealth[i]);
                i++;
            }
        }
        for (int x = 0; x < allDataRural.length;x++)
        {
            System.out.println(allDataRural[x]);
        }
        return allDataRural;
    }

    /**-----------------------------------------------------------------------------------------------------------------------------------*/

    // These methods takes the data from the get methods and print them
    public String[] printAgriculturalLand()
  {
    List<String> list = Arrays.asList(getAgriculturalLand());
    Set<String> set = new HashSet<String>(list);

    String[] result = new String[set.size()];
    set.toArray(result);
    Arrays.sort(result);
    for (int i = 0; i < result.length; i++)
    {

        System.out.println(result[i]);

        //System.out.println(s );
    }
    JOptionPane.showMessageDialog (null, result, "Agricultural Land", JOptionPane.INFORMATION_MESSAGE);

    return result;
}
    public String[] printAgriculturalLandPercent()
    {
        List<String> list = Arrays.asList(getAgriculturalLandPercent());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Agricultural Land Percent%", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }
    public String[] printArableLand()
    {
        List<String> list = Arrays.asList(getArableLand());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Arabl eLand", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }
    public String[] printArableLandPercent()
    {
        List<String> list = Arrays.asList(getArableLandPercent());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Arable Land Percent%", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }
    /**---------*/
    public String[] printLandArea()
    {
        List<String> list = Arrays.asList(getLandArea());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Land Area", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }
    public String[] printRuralPopulation()
    {
        List<String> list = Arrays.asList(getRuralPopulation());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Rural Population", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }
    public String[] printRuralPopulationGrowth()
    {
        List<String> list = Arrays.asList(getRuralPopulationGrowth());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Rural Population Growth", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }
    public String[] printSurfaceArea()
    {
        List<String> list = Arrays.asList(getSurfaceArea());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Surface Area", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }


    /**-----------------------------------------------------------------------------------------------------------------------------*/

    //These methods take takes teh input from teh user's selection from the dialog boxes and prints teh data accordingly
    public void findAgriculturalLand(String find)
    {
        String[] fAgriculturalLand = getAgriculturalLand();

        String findStringAgriculturalLand = find;
        for (int index = 0; index < fAgriculturalLand.length; index++) {
            String str = fAgriculturalLand[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringAgriculturalLand);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1) {
                System.out.println(fAgriculturalLand[index]);
            } else {
                //Else is empty
            }
        }
    }
    public void findAgriculturalLandPercent(String find)
    {
        String[] fAgriculturalLandPercent = getAgriculturalLandPercent();

        String findStringAgriculturalLandPercent = find;
        for (int index = 0; index < fAgriculturalLandPercent.length; index++ )
        {
            String str = fAgriculturalLandPercent[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringAgriculturalLandPercent);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fAgriculturalLandPercent[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }
    public void findArableLand(String find)
    {
        String[] fArableLand = getArableLand();

        String findStringArableLand = find;
        for (int index = 0; index < fArableLand.length; index++ )
        {
            String str = fArableLand[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringArableLand);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fArableLand[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }
    public void findArableLandPercent(String find)
    {
        String[] fArableLandPercent = getArableLandPercent();

        String findStringArableLandPercent = find;
        for (int index = 0; index < fArableLandPercent.length; index++ )
        {
            String str = fArableLandPercent[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringArableLandPercent);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fArableLandPercent[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }
    /**----------------------*/
    public void findLandArea(String find)
    {
        String[] fLandArea = getLandArea();

        String findStringLandArea = find;
        for (int index = 0; index < fLandArea.length; index++) {
            String str = fLandArea[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringLandArea);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1) {
                System.out.println(fLandArea[index]);
            } else {
                //Else is empty
            }
        }
    }
    public void findRuralPopulation(String find)
    {
        String[] fRuralPopulation = getRuralPopulation();

        String findStringRuralPopulation = find;
        for (int index = 0; index < fRuralPopulation.length; index++ )
        {
            String str = fRuralPopulation[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringRuralPopulation);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fRuralPopulation[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }
    public void findRuralPopulationGrowth(String find)
    {
        String[] fRuralPopulationGrowth = getRuralPopulationGrowth();

        String findStringRuralPopulationGrowth = find;
        for (int index = 0; index < fRuralPopulationGrowth.length; index++ )
        {
            String str = fRuralPopulationGrowth[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringRuralPopulationGrowth);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fRuralPopulationGrowth[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }
    public void findSurfaceArea(String find)
    {
        String[] fSurfaceArea = getSurfaceArea();

        String findStringSurfaceArea = find;
        for (int index = 0; index < fSurfaceArea.length; index++ )
        {
            String str = fSurfaceArea[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringSurfaceArea);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fSurfaceArea[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }

}//End of class Rural Developmentz
