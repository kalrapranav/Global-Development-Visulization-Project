//Importing teh Global Development Library
import corgis.global_development.GlobalDevelopmentLibrary;
import corgis.global_development.domain.*;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;


public class setParam
{
    // Get access to the library
    GlobalDevelopmentLibrary globalDevelopmentLibrary = new GlobalDevelopmentLibrary();
    // Access data inside the library
    ArrayList<Report> list_of_report = globalDevelopmentLibrary.getReports(true);

    //Class fields
    public String[] countries = new String[1000];
    public String[] deathRate = new String[1000];
    public String[] FertilityRate = new String[1000];
    public String[] LifeExpectancyAtBirthFemale = new String[1000];
    public String[] BirthRate = new String[1000];
    public String[] TotalPopulation = new String[1000];
    public String[] LifeExpectancyAtBirthMale = new String[1000];
    public String[] PopulationGrowth = new String[1000];
    public String[] LifeExpectancyAtBirthTotal = new String[1000];
    public String[] allDataHealth = new String[1000];

/**------------------------------------------------------------------------------*/

//Class Methods

//Get methods, these methods collect data from teh library for species sub section and returns that data
    public String[] getCountries()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                countries[i] = r.getCountry() ;
                i++;
            }
        }
        return countries;
    }
    public String[] getdeathRate()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                deathRate[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getHealth().getDeathRate().toString();
                i++;
            }
        }
        return deathRate;
    }
    public String[] getFertilityRate()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                FertilityRate[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getHealth().getFertilityRate().toString();
                i++;
            }
        }
        return FertilityRate;
    }
    public String[] getLifeExpectancyAtBirthFemale()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                LifeExpectancyAtBirthFemale[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getHealth().getLifeExpectancyAtBirthFemale().toString();
                i++;
            }
        }
        return LifeExpectancyAtBirthFemale;
    }
    public String[] getBirthRate()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                BirthRate[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getHealth().getBirthRate().toString();
                i++;
            }
        }
        return BirthRate;
    }
    public String[] getTotalPopulation()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                TotalPopulation[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getHealth().getTotalPopulation().toString();
                i++;
            }
        }
        return TotalPopulation;
    }
    public String[] getLifeExpectancyAtBirthMale()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                LifeExpectancyAtBirthMale[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getHealth().getLifeExpectancyAtBirthMale().toString();
                i++;
            }
        }
        return LifeExpectancyAtBirthMale;
    }
    public String[] getPopulationGrowth()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                PopulationGrowth[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getHealth().getPopulationGrowth().toString();
                i++;
            }
        }
        return PopulationGrowth;
    }
    public String[] getLifeExpectancyAtBirthTotal()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                LifeExpectancyAtBirthTotal[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getHealth().getLifeExpectancyAtBirthTotal().toString();
                i++;
            }
        }
        return LifeExpectancyAtBirthTotal;
    }

    //This method prints teh cummilative data for all teh sub categories
    public String[] getallDataHealth()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                allDataHealth[i] = (String) (i +") " + r.getCountry().toString() + "| " + r.getYear().toString() + "| DEATH RATE: " +r.getData().getHealth().getDeathRate().toString() + "| FERTILITY RATE: " +
                         r.getData().getHealth().getFertilityRate().toString() + "| LIFE EXPECTANCY AT BIRTH FEMALE" + r.getData().getHealth().getLifeExpectancyAtBirthFemale().toString()
                + "| TOTAL POPULATION: " + r.getData().getHealth().getTotalPopulation().toString() + "| LIFE EXPECTANCY AT BIRTH MALE: " + r.getData().getHealth().getLifeExpectancyAtBirthMale().toString()
                + "| POPULATION GROWTH: " + r.getData().getHealth().getPopulationGrowth().toString());
                //System.out.println(allDataHealth[i]);
                i++;
            }
        }
        for (int x = 0; x < allDataHealth.length;x++)
        {
            System.out.println(allDataHealth[x]);
        }
        return LifeExpectancyAtBirthTotal;
    }


    /**---------------------------------------------------------------------------------------------------------------------------------------*/


    // These methods takes the data from the get methods and print them
    public String[] printCountries()
    {
        //System.out.println("Original array         : " + Arrays.toString(getCountries()));
        List<String> list = Arrays.asList(getCountries());
        Set<String> set = new HashSet<String>(list);
        //System.out.print("Remove duplicate result: ");

        String[] result = new String[set.size()];
        set.toArray(result);

        return result;
    }
    public String[] printdeathRate()
    {
        List<String> list = Arrays.asList(getdeathRate());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "DeathRate", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }
    public String[] printFertilityRate()
    {
        List<String> list = Arrays.asList(getFertilityRate());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Fertility Rate", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }
    public String[] printLifeExpectancyAtBirthFemale()
    {
        List<String> list = Arrays.asList(getLifeExpectancyAtBirthFemale());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Life Expectancy At Birth: Female", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }
    public String[] printBirthRate()
    {
        List<String> list = Arrays.asList(getBirthRate());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Birth", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }
    public String[] printTotalPopulation()
    {
        List<String> list = Arrays.asList(getTotalPopulation());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Population", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }
    public String[] printLifeExpectancyAtBirthMale()
    {
        List<String> list = Arrays.asList(getLifeExpectancyAtBirthMale());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Life Expectancy At Birth Male", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }
    public String[] printPopulationGrowth()
    {
        List<String> list = Arrays.asList(getPopulationGrowth());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Population Growth", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }
    public String[] printLifeExpectancyAtBirthTotal()
    {
        List<String> list = Arrays.asList(getLifeExpectancyAtBirthTotal());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Life Expectancy At Birth Total", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }
    public String[] printallDataHealth()
    {
        List<String> list = Arrays.asList(getallDataHealth());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {
            System.out.println(result[i]);
        }

        return result;
    }

    /**------------------------------------------------------------------------------------------------------------------------------------*/


   //These methods take takes teh input from teh user's selection from the dialog boxes and prints teh data accordingly
    public void findCountries(String find)
    {
        String[] fcountries = getCountries();

        String findStringCountries = find;
        for (int index = 0; index < fcountries.length; index++) {
            String str = fcountries[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringCountries);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1) {
                System.out.println(fcountries[index]);
            } else {
                //Else is empty
            }
        }
    }
    public void findDeathRate(String find)
    {
        String[] fdeatthRate = getdeathRate();

        String findStringdeathRate = find;
        for (int index = 0; index < fdeatthRate.length; index++ )
        {
            String str = fdeatthRate[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringdeathRate);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fdeatthRate[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }
    public void findFertilityRate(String find)
    {
        String[] fFertilityRate = getFertilityRate();

        String findStringFertilityRate = find;
        for (int index = 0; index < fFertilityRate.length; index++ )
        {
            String str = fFertilityRate[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringFertilityRate);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fFertilityRate[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }
    public void findLifeExpectancyAtBirthFemale(String find)
    {
        String[] fLifeExpectancyAtBirthFemale = getLifeExpectancyAtBirthFemale();

        String findStringLifeExpectancyAtBirthFemale = find;
        for (int index = 0; index < fLifeExpectancyAtBirthFemale.length; index++ )
        {
            String str = fLifeExpectancyAtBirthFemale[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringLifeExpectancyAtBirthFemale);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fLifeExpectancyAtBirthFemale[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }
    public void findBirthRate(String find)
    {
        String[] fBirthrate = getBirthRate();

        String findStringBirthRate = find;
        for (int index = 0; index < fBirthrate.length; index++ )
        {
            String str = fBirthrate[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringBirthRate);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fBirthrate[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }
    public void findTotalPopulation(String find)
    {
        String[] fTotalPopulation = getTotalPopulation();

        String findStringTotalPopulation = find;
        for (int index = 0; index < fTotalPopulation.length; index++ )
        {
            String str = fTotalPopulation[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringTotalPopulation);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fTotalPopulation[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }
    public void findLifeExpectancyAtBirthMale(String find)
    {
        String[] fLifeExpectancyAtBirthMale = getLifeExpectancyAtBirthMale();

        String findStringLifeExpectancyAtBirthMale = find;
        for (int index = 0; index < fLifeExpectancyAtBirthMale.length; index++ )
        {
            String str = fLifeExpectancyAtBirthMale[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringLifeExpectancyAtBirthMale);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fLifeExpectancyAtBirthMale[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }
    public void findPopulationGrowth(String find)
    {
        String[] fPopulationGrowth = getPopulationGrowth();

        String findStringPopulationGrowth = find;
        for (int index = 0; index < fPopulationGrowth.length; index++ )
        {
            String str = fPopulationGrowth[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringPopulationGrowth);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fPopulationGrowth[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }
    public void findLifeExpectancyAtBirthTotal(String find)
    {
        String[] fLifeExpectancyAtBirthTotal = getLifeExpectancyAtBirthTotal();

        String findStringLifeExpectancyAtBirthTotal = find;
        for (int index = 0; index < fLifeExpectancyAtBirthTotal.length; index++ )
        {
            String str = fLifeExpectancyAtBirthTotal[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringLifeExpectancyAtBirthTotal);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fLifeExpectancyAtBirthTotal[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }
    //allDataHealth
    public void findallDataHealth(String find)
    {
        String[] fallDataHealth = getallDataHealth();

        String findStringallDataHealth = find;
        for (int index = 0; index < fallDataHealth.length; index++ )
        {
            String str = fallDataHealth[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringallDataHealth);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fallDataHealth[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }



}//End of Class setParam

