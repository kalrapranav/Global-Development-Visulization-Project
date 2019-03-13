//Importing teh Global Development Library
import corgis.global_development.GlobalDevelopmentLibrary;
import corgis.global_development.domain.*;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;


public class Infrastructure
{
    // Get access to the library
    GlobalDevelopmentLibrary globalDevelopmentLibrary = new GlobalDevelopmentLibrary();
    // Access data inside the library
    ArrayList<Report> list_of_report = globalDevelopmentLibrary.getReports(true);

    //Class fields
    public String[] TelephoneLinesPerOnezerozeroPeople = new String[1000];
    public String[] MobileCellularSubscriptions = new String[1000];
    public String[] MobileCellularSubscriptionsPerOnezerozeroPeople = new String[1000];
    public String[] TelephoneLines = new String[1000];
    public String[] allDataInfrastucture = new String[1000];


//Class Methods

    //Get methods, these methods collect data from the library for species sub section and returns that data
    public String[] getTelephoneLinesPerOnezerozeroPeople()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                TelephoneLinesPerOnezerozeroPeople[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getInfrastructure().getTelephoneLinesPerOnezerozeroPeople().toString();
                i++;
            }
        }
        return TelephoneLinesPerOnezerozeroPeople;
    }
    public String[] getMobileCellularSubscriptions()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                MobileCellularSubscriptions[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getInfrastructure().getMobileCellularSubscriptions().toString();
                i++;
            }
        }
        return MobileCellularSubscriptions;
    }
    public String[] getMobileCellularSubscriptionsPerOnezerozeroPeople()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                MobileCellularSubscriptionsPerOnezerozeroPeople[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getInfrastructure().getMobileCellularSubscriptionsPerOnezerozeroPeople().toString();
                i++;
            }
        }
        return MobileCellularSubscriptionsPerOnezerozeroPeople;
    }
    public String[] getTelephoneLines()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                TelephoneLines[i] = r.getCountry() + "| " + r.getYear() + "| " +r.getData().getInfrastructure().getTelephoneLines().toString();
                i++;
            }
        }
        return TelephoneLines;
    }

    //This method prints teh cummilative data for all teh sub categories
    public String[] getAllDataInfrastucture()
    {
        int i = 0;
        for (Report r : list_of_report)
        {
            {
                allDataInfrastucture[i] = (String) (i +") " + r.getCountry().toString() + "| " + r.getYear().toString() + "| TELEPHONE LINES PER ONE ZERO ZERO PEOPLE: " +r.getData().getInfrastructure().getTelephoneLinesPerOnezerozeroPeople().toString() + "| MOBILE CELLULAR SUBSCRIPTIONS: " +
                        r.getData().getInfrastructure().getMobileCellularSubscriptions().toString() + "| MOBILE CELLULAR SUBSCRIPTIONS PER ZERO ZERO PEOPLE: " + r.getData().getInfrastructure().getMobileCellularSubscriptionsPerOnezerozeroPeople().toString()
                );
                //System.out.println(allDataHealth[i]);
                i++;
            }
        }
        for (int x = 0; x < allDataInfrastucture.length;x++)
        {
            System.out.println(allDataInfrastucture[x]);
        }
        return allDataInfrastucture;
    }

    /**--------------------------------------------------------------------------------------------------*/

    // These methods takes the data from the get methods and print them
    public String[] TelephoneLinesPerOnezerozeroPeople()
    {
        List<String> list = Arrays.asList(TelephoneLinesPerOnezerozeroPeople());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Telephone Lines Per One zero zero People", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }
    public String[] MobileCellularSubscriptions()
    {
        List<String> list = Arrays.asList(MobileCellularSubscriptions());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Mobile Cellula rSubscriptions", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }
    public String[] MobileCellularSubscriptionsPerOnezerozeroPeople()
    {
        List<String> list = Arrays.asList(MobileCellularSubscriptionsPerOnezerozeroPeople());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Mobile Cellular Subscriptions Per One zero zero People", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }
    public String[] printTelephoneLines()
    {
        List<String> list = Arrays.asList(getTelephoneLines());
        Set<String> set = new HashSet<String>(list);

        String[] result = new String[set.size()];
        set.toArray(result);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++)
        {

            System.out.println(result[i]);

            //System.out.println(s );
        }
        JOptionPane.showMessageDialog (null, result, "Telephone Lines", JOptionPane.INFORMATION_MESSAGE);

        return result;
    }


    /**----------------------------------------------------------------------------------------------------------------*/

    //These methods take takes teh input from teh user's selection from the dialog boxes and prints teh data accordingly
    public void findTelephoneLinesPerOnezerozeroPeople(String find)
    {
        String[] fTelephoneLinesPerOnezerozeroPeople = getTelephoneLinesPerOnezerozeroPeople();

        String findStringTelephoneLinesPerOnezerozeroPeople = find;
        for (int index = 0; index < fTelephoneLinesPerOnezerozeroPeople.length; index++) {
            String str = fTelephoneLinesPerOnezerozeroPeople[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringTelephoneLinesPerOnezerozeroPeople);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1) {
                System.out.println(fTelephoneLinesPerOnezerozeroPeople[index]);
            } else {
                //Else is empty
            }
        }
    }
    public void findMobileCellularSubscriptions(String find)
    {
        String[] fMobileCellularSubscriptions = getMobileCellularSubscriptions();

        String findStringMobileCellularSubscriptions = find;
        for (int index = 0; index < fMobileCellularSubscriptions.length; index++ )
        {
            String str = fMobileCellularSubscriptions[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringMobileCellularSubscriptions);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fMobileCellularSubscriptions[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }
    public void findMobileCellularSubscriptionsPerOnezerozeroPeople(String find)
    {
        String[] fMobileCellularSubscriptionsPerOnezerozeroPeople = getMobileCellularSubscriptionsPerOnezerozeroPeople();

        String findStringMobileCellularSubscriptionsPerOnezerozeroPeople = find;
        for (int index = 0; index < fMobileCellularSubscriptionsPerOnezerozeroPeople.length; index++ )
        {
            String str = fMobileCellularSubscriptionsPerOnezerozeroPeople[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringMobileCellularSubscriptionsPerOnezerozeroPeople);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fMobileCellularSubscriptionsPerOnezerozeroPeople[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }
    public void findTelephoneLines(String find)
    {
        String[] fTelephoneLines = getTelephoneLines();

        String findStringTelephoneLines = find;
        for (int index = 0; index < fTelephoneLines.length; index++ )
        {
            String str = fTelephoneLines[index];
            //Thus statement returns the index of the string we are finding
            int firstIndex = str.indexOf(findStringTelephoneLines);
            //It returns -1 if the string we are finding is not there
            if (firstIndex != -1)
            {
                System.out.println(fTelephoneLines[index]);
            }
            else
            {
                //Else is empty
            }
        }
    }

}// End of class Infrastructure