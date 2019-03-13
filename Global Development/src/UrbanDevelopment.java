//Importing teh Global Development Library
import corgis.global_development.GlobalDevelopmentLibrary;
import corgis.global_development.domain.*;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;

public class UrbanDevelopment
{
    // Get access to the library
    GlobalDevelopmentLibrary globalDevelopmentLibrary = new GlobalDevelopmentLibrary();
    // Access data inside the library
    ArrayList<Report> list_of_report = globalDevelopmentLibrary.getReports(true);

    //Class fields
    public String[] PopulationDensity = new String[1000];
    public String[] UrbanPopulationPercent = new String[1000];
    public String[] UrbanPopulationPercentGrowth = new String[1000];
    public String[] allDataUrban = new String[1000];

    /**-----------------------------------------------------------------------------------------*/

    //Class Methods

    //Get methods, these methods collect data from the library for species sub section and returns that data
    public String[] getPopulationDensity()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                PopulationDensity[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getUrbanDevelopment().getPopulationDensity().toString();
                i++;
            }
        }
        return PopulationDensity;
    }
    public String[] getUrbanPopulationPercent()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                UrbanPopulationPercent[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getUrbanDevelopment().getUrbanPopulationPercent().toString() + "%";
                i++;
            }
        }
        return UrbanPopulationPercent;
    }
    public String[] getUrbanPopulationPercentGrowth()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                UrbanPopulationPercentGrowth[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getUrbanDevelopment().getUrbanPopulationPercentGrowth().toString();
                i++;
            }
        }
        return UrbanPopulationPercentGrowth;
    }

    //This method prints teh cummilative data for all teh sub categories
    public String[] getAllDataUrban()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                allDataUrban[i] = (String) (i +") " + r.getCountry().toString() + "| " + r.getYear().toString() + "| POPULATION DENSITY: " +r.getData().getUrbanDevelopment().getPopulationDensity().toString() + "| URBAN POPULATION PERCENT: " +
                        r.getData().getUrbanDevelopment().getUrbanPopulationPercent().toString() + "| URBAN POPULATION PERCENT GROWTH: " + r.getData().getUrbanDevelopment().getUrbanPopulationPercentGrowth().toString()
                        );
                //System.out.println(allDataHealth[i]);
                i++;
            }
        }
        for (int x = 0; x < allDataUrban.length;x++)
        {
            System.out.println(allDataUrban[x]);
        }
        return allDataUrban;
    }

    /**-----------------------------------------------------------------------------------------------------------------------------------*/

    // These methods takes the data from the get methods and print them
    public String[] printPopulationDensity()
    {
        List<String> list = Arrays.asList(getPopulationDensity());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Population Density", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }
    public String[] printUrbanPopulationPercent()
    {
        List<String> list = Arrays.asList(getUrbanPopulationPercent());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Urban Population Percent", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }
    public String[] printUrbanPopulationPercentGrowth()
    {
        List<String> list = Arrays.asList(getUrbanPopulationPercentGrowth());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);
        }
        JOptionPane.showMessageDialog (null, result, "Urban Population Percent Growth", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }

    /**-----------------------------------------------------------------------------------------------*/

    //These methods take takes teh input from teh user's selection from the dialog boxes and prints teh data accordingly
    public void findPopulationDensity(String find)
    {
        String[] fPopulationDensity = getPopulationDensity();

        String findStringPopulationDensity = find;
        for (int index = 0; index < fPopulationDensity.length; index++) {
            String str = fPopulationDensity[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringPopulationDensity);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1) {
                System.out.println(fPopulationDensity[index]);
            } else {
                //Else is empty
            }
        }
    }
    public void findUrbanPopulationPercent(String find)
    {
        String[] fUrbanPopulationPercent = getUrbanPopulationPercent();

        String findStringUrbanPopulationPercent = find;
        for (int index = 0; index < fUrbanPopulationPercent.length; index++ )
        {
            String str = fUrbanPopulationPercent[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringUrbanPopulationPercent);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fUrbanPopulationPercent[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }
    public void findUrbanPopulationPercentGrowth(String find)
    {
        String[] fUrbanPopulationPercentGrowth = getUrbanPopulationPercentGrowth();

        String findStringUrbanPopulationPercentGrowth = find;
        for (int index = 0; index < fUrbanPopulationPercentGrowth.length; index++ )
        {
            String str = fUrbanPopulationPercentGrowth[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringUrbanPopulationPercentGrowth);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fUrbanPopulationPercentGrowth[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }
}//End of Class Urban Development
